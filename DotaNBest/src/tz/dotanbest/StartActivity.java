package tz.dotanbest;

import tz.dotadata.R;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class StartActivity extends Activity {
	private final int SPLASH_DISPLAY_LENGHT = 2500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
		new Handler().postDelayed(new Runnable() {  
            public void run() {  
                Intent mainIntent = new Intent(StartActivity.this,  
                        MainActivity.class);  
                StartActivity.this.startActivity(mainIntent);  
                StartActivity.this.finish();  
            }  
  
        }, SPLASH_DISPLAY_LENGHT);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hero_list, menu);
        return true;
    }
    
}
