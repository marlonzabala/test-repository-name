package com.example.testpageview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MenuDrawerActivity extends Activity
{
	//test comment on git
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_drawer);
	}

	//test comment

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu;  the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_drawer, menu);
		return true;
	}

}
