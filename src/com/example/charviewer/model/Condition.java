package com.example.charviewer.model;

import android.util.Log;

public abstract class Condition {

	public abstract int getBonus();

	public abstract String getConditionName();

	private boolean enabled;

	public void setEnabled(boolean enabled) {
		if (this.enabled != enabled) {
			Log.i("Condition", "Toggling condition " + getConditionName() + " to " + enabled);
			this.enabled = enabled;
			onChanged();
		}

		this.enabled = enabled;
	}

	public boolean getEnabled() {
		return enabled;
	}

	/**
	 * Callback when the enabled value of this condition gets toggled;
	 */
	public abstract void onChanged();
}
