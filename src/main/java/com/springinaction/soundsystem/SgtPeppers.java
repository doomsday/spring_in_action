package com.springinaction.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by drpsy on 23-Oct-17 (21:58).
 */
@Component  // Default ID is 'sgtPeppers'
public class SgtPeppers implements CompactDisc {
  private String title = "Stg. Pepper's Lonely Hearts Club Band";
  private String artist = "The Beatles";

  public void play() {
    System.out.println("Playing " + title + " by " + artist);
  }
}
