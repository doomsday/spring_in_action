package com.springinaction.configuration;

import com.habuna.restfun.MagicBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by drpsy on 23-Oct-17 (22:06).
 */
@Configuration
@ComponentScan(basePackageClasses = {MagicBean.class})
public class AppConfig {

}

