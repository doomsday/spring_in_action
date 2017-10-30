package com.springinaction.soundsystem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by drpsy on 28-Oct-17 (22:56).
 */
@Component
public class DataCollector {

  // The T() operator evaluates java.lang.System as a type so that the static
  // currentTimeMillis() method can be invoked.
  @Value("#{T(System).currentTimeMillis()}")
  private String time;

  // Refer to value of the artist property on a bean whose ID is sgtPeppers.
  // Getter in SgtPeppers is necessary.
  @Value("#{sgtPeppers.artist}")
  private String artist;

  // Refer to system properties.
  @Value("#{systemProperties['java.specification.vendor' ?: 'unknown']}")
  private String vendor;

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }
}
