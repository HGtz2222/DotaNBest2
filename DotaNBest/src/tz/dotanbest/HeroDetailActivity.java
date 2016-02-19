package tz.dotanbest;

import tz.dotadata.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class HeroDetailActivity extends Activity {
	TextView hero_name;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hero_detail);
		
		hero_name = (TextView)findViewById(R.id.hero_name);
		hero_name.setText(getIntent().getStringExtra("hero_name"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hero_detail, menu);
		return true;
	}

}
