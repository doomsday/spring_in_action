package com.springinaction.knights;

import java.io.PrintStream;

/**
 * Created by drpsy on 18-Oct-17 (21:51).
 */
public class SlayDragonQuest implements Quest {

  private PrintStream stream;

  public SlayDragonQuest(PrintStream stream) {
    this.stream = stream;
  }

  public void embark() {
    stream.println("Embarking on quest to slay the dragon!");
  }
}
