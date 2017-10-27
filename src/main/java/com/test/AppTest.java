package com.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.springinaction.configuration.AppConfig;
import com.springinaction.hellsystem.NotepadPrototype;
import com.springinaction.hellsystem.NotepadSingleton;
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
  private NotepadSingleton notepadSingleton1;

  @Autowired
  private NotepadSingleton notepadSingleton2;

  @Autowired
  private NotepadPrototype notepadPrototype1;

  @Autowired
  private NotepadPrototype notepadPrototype2;

  @Test
  public void notepadSingletonShallBeTheSame() {
    assertTrue(notepadSingleton1.equals(notepadSingleton2));
  }

  @Test
  public void notepadPrototypeShallNotBeTheSame() {
    assertFalse(notepadPrototype1.equals(notepadPrototype2));
  }

}
