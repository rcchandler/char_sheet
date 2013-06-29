package com.example.charviewer.model;

import com.example.charviewer.model.Enums.Attribute;

/**
 * A model representing a single character, containing a set of attributes, skills, HP, current conditions, etc.
 */
public class Character {
	private final int[] attrs = new int[6];

	private int level;

	public void setAttribute(Attribute attr, int value) {
		attrs[attr.ordinal()] = value;
	}

	public int getAttributeBonus(Attribute attr) {
		return attrs[attr.ordinal()] + level/2;
	}
}
