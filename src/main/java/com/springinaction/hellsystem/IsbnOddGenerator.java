package com.springinaction.hellsystem;

import com.springinaction.hellsystem.qualifiers.Digits;
import com.springinaction.hellsystem.qualifiers.NumberOfDigits;
import org.springframework.stereotype.Component;

/**
 * Created by drpsy on 28-Oct-17 (00:53).
 */

@Component
@NumberOfDigits(value = Digits.THIRTEEN, odd = true)
public class IsbnOddGenerator implements NumberGenerator {

  public String generate() {
    return "IsbnOddGenerator";
  }
}
