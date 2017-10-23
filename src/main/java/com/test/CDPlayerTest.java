package com.test;

import static org.junit.Assert.assertNotNull;

import com.springinaction.soundsystem.CDPlayerConfig;
import com.springinaction.soundsystem.CompactDisc;
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

  @Test
  public void cdShouldNotBeNull() {
    // Check if Spring was able to discover the CompactDisc class, automatically created it as a bean in the Spring
    // application context, and injected it into the test.
    assertNotNull(cd);
  }
}
