package com.springinaction.configuration;

import com.springinaction.soundsystem.App;
import com.springinaction.soundsystem.SpringJdbcBean;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by drpsy on 23-Oct-17 (22:06).
 */
@Configuration
@ComponentScan(basePackageClasses = {App.class})
@Import(DataSourceConfig.class)
public class AppConfig {

  @Bean
  public SpringJdbcBean springJdbcBean(JdbcTemplate jdbcTemplate) {
    return new SpringJdbcBean(jdbcTemplate);
  }

  @Bean
  JdbcTemplate getJdbcTemplate(DataSource dataSource) {
    return new JdbcTemplate(dataSource);
  }
}

