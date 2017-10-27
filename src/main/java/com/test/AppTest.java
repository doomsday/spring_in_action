package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.springinaction.configuration.AppConfig;
import com.springinaction.hellsystem.Dessert;
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
  private Dessert dessert;

  @Test
  public void dessertShallNotCookies() {
    assertEquals(dessert.run(), "Cookies");
  }

}
