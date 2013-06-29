package com.example.charviewer.model;

import com.example.charviewer.model.Enums.Skill;

/**
 * Model representing a single skill belonging to a character.
 *
 * The difference between this and {@link Enums.Skill} is that this is character-dependent, so it
 * includes individual bonuses, trained skills and AC penalties.
 *
 */
public class CharacterSkill {
  Skill skill;

  public CharacterSkill(Skill skill, int racialBonus) {

  }
}
