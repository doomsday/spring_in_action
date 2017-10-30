package com.springinaction.soundsystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by drpsy on 28-Oct-17 (22:56).
 */
@Component
public class BlankDisc {
  private String title;
  private String artist;

  public BlankDisc(
      @Value("${disc.title}") String title,
      @Value("${disc.artist}") String artist) {
    this.setTitle(title);
    this.setArtist(artist);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }
}
