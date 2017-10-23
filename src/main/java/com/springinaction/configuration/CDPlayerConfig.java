package com.springinaction.configuration;

import com.springinaction.soundsystem.CDPlayer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by drpsy on 23-Oct-17 (22:06).
 */
@Configuration
@ComponentScan(basePackageClasses = {CDPlayer.class}) // Whatever packages those classes are in will be used as the base
                                                      // package for component scanning
public class CDPlayerConfig {
}
