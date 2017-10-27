package com.springinaction.hellsystem;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by drpsy on 28-Oct-17 (00:15).
 */

@Primary
@Component
public class Cookies implements Dessert {

  public String run() {
    return "Cookies";
  }
}
