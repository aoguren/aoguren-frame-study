package com.glxt.study.spring.springinaction.chapter1.knight;

public class BraveKnight implements Knight {

  private Quest quest;
  
  public BraveKnight(Quest quest) {
	    this.quest = quest;
  }
  

  public void embarkOnQuest() {
    quest.embark();
  }

}