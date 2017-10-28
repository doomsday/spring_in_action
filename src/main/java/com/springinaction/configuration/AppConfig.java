package com.springinaction.configuration;

import com.springinaction.soundsystem.App;
import com.springinaction.soundsystem.BlankDisc;
import com.springinaction.soundsystem.Connection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by drpsy on 23-Oct-17 (22:06).
 */
@Configuration
@Profile("dev")
@ComponentScan(basePackageClasses = {App.class})
@PropertySource("classpath:app.properties")
public class AppConfig {

  @Autowired
  Environment env;

  @Bean
  public BlankDisc disc() {
    return new BlankDisc(
        env.getProperty("disc.title", "Butchered at Birth"),  // Retrieve property values.
        env.getProperty("disc.artist", "Cannibal Corpse"));
  }

  @Bean
  public Connection connection() {
    return new Connection(
        env.getProperty("db.connection.count", Integer.class, 30));
  }
}

