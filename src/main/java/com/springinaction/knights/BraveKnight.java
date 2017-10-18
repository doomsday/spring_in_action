package com.springinaction.knights;

/**
 * Created by drpsy on 18-Oct-17 (21:49).
 */
public class BraveKnight implements Knight {

  private Quest quest;

  public BraveKnight(Quest quest) { // Quest is injected.
    this.quest = quest;
  }

  public void embarkOnQuest() {
    quest.embark();
  }
}
