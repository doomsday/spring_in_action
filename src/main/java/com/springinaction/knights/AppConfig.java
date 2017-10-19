package com.springinaction.knights;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

/**
 * Created by drpsy on 18-Oct-17 (21:53).
 */
@Configuration
public class AppConfig {

  @Bean
  public SpringJdbcBean springJdbcBean() {
    return new SpringJdbcBean(getJdbcTemplate());
  }

  @Bean
  public JdbcTemplate getJdbcTemplate() {
    return new JdbcTemplate(dataSource());
  }

  @Bean
  public DataSource dataSource() {
    return new EmbeddedDatabaseBuilder()
        .setName("computer")
        .setType(EmbeddedDatabaseType.HSQL)
        .addScript("classpath:computer.sql")
        .build();
  }

}
