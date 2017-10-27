package com.springinaction.hellsystem;

import com.springinaction.hellsystem.qualifiers.Digits;
import com.springinaction.hellsystem.qualifiers.NumberOfDigits;
import org.springframework.stereotype.Component;

/**
 * Created by drpsy on 28-Oct-17 (00:47).
 */

@Component
@NumberOfDigits(value = Digits.THIRTEEN, odd = false)
public class IsbnEvenGenerator implements NumberGenerator {

  public String generate() {
    return "IsbnEvenGenerator";
  }
}
