package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.springinaction.configuration.AppConfig;
import com.springinaction.soundsystem.BlankDisc;
import com.springinaction.soundsystem.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
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
  private BlankDisc blankDisc;

  @Autowired
  private Connection connection;

  @Autowired
  Environment environment;

  @Test
  public void blankDiscShallBaseOnEnvironment() {
    assertTrue(blankDisc.getTitle()
        .equals("Sgt. Peppers Lonely Hearts Club Band"));
    assertTrue(blankDisc.getArtist()
        .equals("The Beatles"));
  }

  @Test
  public void connectionShallGetDefaultIntegerFromEnvironment() {
    assertTrue(connection.getConnectionCount().equals(30));
  }

  @Test
  public void envShallContainProperty() {
    assertTrue(environment.containsProperty("prop.shall.exist"));
  }

  @Test
  public void activeProfileShallBeDev() {
    assertTrue(environment.getActiveProfiles()[0].equals("dev"));
  }

  @Test
  public void defaultProfileShallBeDefault() {
    assertTrue(environment.getDefaultProfiles()[0].equals("default"));
  }

  @Test
  public void environmentShallAcceptDevProfileOnly() {
    assertTrue(environment.acceptsProfiles("dev"));
    assertFalse(environment.acceptsProfiles("default"));
  }

}
