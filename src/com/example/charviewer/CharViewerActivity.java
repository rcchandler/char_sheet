package com.example.charviewer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CharViewerActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.char_viewer);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.char_viewer, menu);
		return true;
	}

}
