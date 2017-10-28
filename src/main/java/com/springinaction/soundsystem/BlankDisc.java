package com.springinaction.soundsystem;

/**
 * Created by drpsy on 28-Oct-17 (22:56).
 */
public class BlankDisc {
  private String title;
  private String artist;

  public BlankDisc(String title, String artist) {
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
