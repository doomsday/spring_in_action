package com.springinaction.configuration;

import com.springinaction.hellsystem.Dessert;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by drpsy on 23-Oct-17 (22:06).
 */
@Configuration
@Profile("dev")
@ComponentScan(basePackageClasses = {Dessert.class})
public class AppConfig {
}

