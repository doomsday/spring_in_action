package com.springinaction.hellsystem;

import com.springinaction.hellsystem.qualifiers.Cold;
import com.springinaction.hellsystem.qualifiers.Creamy;
import org.springframework.stereotype.Component;

/**
 * Created by drpsy on 28-Oct-17 (00:34).
 */

@Cold
@Creamy
@Component
public class IceCream implements Dessert {

  public String run() {
    return "IceCream";
  }
}
