package com.test;

import static org.junit.Assert.assertNotNull;

import com.springinaction.configuration.AppConfig;
import com.springinaction.configuration.DataSourceConfig;
import com.springinaction.soundsystem.SpringJdbcBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by drpsy on 23-Oct-17 (22:13).
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DataSourceConfig.class, AppConfig.class})
@ActiveProfiles("dev")
public class PersistenceTest {

  @Autowired
  private SpringJdbcBean springJdbcBean;

  @Test
  public void computerShallNotBeNull() {
    assertNotNull(springJdbcBean);
    assertNotNull(springJdbcBean.getComputerById((short)2));
  }
}
