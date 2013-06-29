package com.example.charviewer.model;


public class Enums {

  public enum Attribute {
    STR, CON, DEX, INT, WIS, CHA;
  }

  public enum Skill {
    ACROBATICS(Attribute.DEX, true),
    ARCANA(Attribute.INT, false),
    ATHLETICS(Attribute.STR, true),
    BLUFF(Attribute.CHA, false),
    DIPLOMACY(Attribute.CHA, false),
    DUNGEONEERING(Attribute.WIS, false),
    ENDURANCE(Attribute.CON, true),
    HEAL(Attribute.WIS, false),
    HISTORY(Attribute.INT, false),
    INSIGHT(Attribute.WIS, false),
    INTIMIDATE(Attribute.CHA, false),
    NATURE(Attribute.WIS, false),
    PERCEPTION(Attribute.WIS, false),
    RELIGION(Attribute.INT, false),
    STEALTH(Attribute.DEX, true),
    STREETWISE(Attribute.CHA, false),
    THIEVERY(Attribute.DEX, true),
    ;

    final Attribute primaryAttr;
    final boolean acPenalty;

    Skill(Attribute primaryAttr, boolean acPenalty) {
      this.primaryAttr = primaryAttr;
      this.acPenalty = acPenalty;
    }
  }
}
