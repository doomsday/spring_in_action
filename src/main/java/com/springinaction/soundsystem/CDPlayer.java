package com.springinaction.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by drpsy on 23-Oct-17 (23:16).
 */
@Component
public class CDPlayer implements MediaPlayer {
  private CompactDisc cd;

  @Autowired  // Spring will attempt to satisfy the dependency expressed in the method’s parameters.
  public CDPlayer(CompactDisc cd) {
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }
}
