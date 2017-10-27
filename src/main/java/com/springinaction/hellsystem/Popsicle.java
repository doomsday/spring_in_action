package com.springinaction.hellsystem;

import com.springinaction.hellsystem.qualifiers.Cold;
import com.springinaction.hellsystem.qualifiers.Fruity;
import org.springframework.stereotype.Component;

/**
 * Created by drpsy on 28-Oct-17 (00:37).
 */
@Cold
@Fruity
@Component
public class Popsicle implements Dessert {

  public String run() {
    return "Popsicle";
  }
}
