package com.test;

import static org.junit.Assert.*;

import com.springinaction.configuration.CDPlayerConfig;
import com.springinaction.soundsystem.CDPlayer;
import com.springinaction.soundsystem.CompactDisc;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by drpsy on 23-Oct-17 (22:13).
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

  @Autowired
  private CompactDisc cd;

  @Autowired
  private CDPlayer cdPlayer;

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }

  @After
  public void cleanUpStreams() {
    System.setOut(null);
  }

  @Test
  public void cdShouldNotBeNull() {
    // Check if Spring was able to discover the CompactDisc class, automatically created it as a bean in the Spring
    // application context, and injected it into the test.
    assertNotNull(cd);
  }

  @Test
  public void cdPlayerShouldNotBeNull() {
    assertNotNull(cdPlayer);
  }

  @Test
  public void cdPlayerShouldPlay() {
    assertNotNull(cdPlayer);
    cdPlayer.play();
    assertEquals("Playing Stg. Pepper's Lonely Hearts Club Band by The Beatles\r\n", outContent.toString());
  }
}
