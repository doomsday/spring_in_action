package com.test;

import static org.junit.Assert.assertEquals;

import com.springinaction.configuration.AppConfig;
import com.springinaction.hellsystem.NumberGenerator;
import com.springinaction.hellsystem.qualifiers.Digits;
import com.springinaction.hellsystem.qualifiers.NumberOfDigits;
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
  @NumberOfDigits(value = Digits.THIRTEEN, odd = false)
  private NumberGenerator evenNumberGenerator;

  @Autowired
  @NumberOfDigits(value = Digits.THIRTEEN, odd = true)
  private NumberGenerator oddNumberGenerator;

  @Test
  public void numberGeneratorShallBeIsbnEvenGenerator() {
    assertEquals(evenNumberGenerator.generate(), "IsbnEvenGenerator");
  }

  @Test
  public void numberGeneratorShallBeIsbnOddGenerator() {
    assertEquals(oddNumberGenerator.generate(), "IsbnOddGenerator");
  }

}
