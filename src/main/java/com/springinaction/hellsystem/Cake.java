package com.springinaction.hellsystem;

import org.springframework.stereotype.Component;

/**
 * Created by drpsy on 28-Oct-17 (00:15).
 */

@Component
public class Cake implements Dessert {

  public String run() {
    return "Cake";
  }
}
