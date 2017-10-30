package com.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.springinaction.configuration.AppConfig;
import com.springinaction.soundsystem.DataCollector;
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
@ContextConfiguration(classes = {AppConfig.class})
@ActiveProfiles("dev")
public class AppTest {

  @Autowired
  private DataCollector dataCollector;

  @Test
  public void dataCollectorShallHasTime() {
    assertNotNull(dataCollector.getTime());
  }

  @Test
  public void dataCollectorShallHasArtist() {
    assertTrue(dataCollector.getArtist().equals("The Beatles"));
  }

  @Test
  public void vendorShallBeOracle() {
    assertTrue(dataCollector.getVendor().equals("Oracle Corporation"));
  }
}
