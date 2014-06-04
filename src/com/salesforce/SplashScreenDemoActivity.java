package com.salesforce;

import android.os.Bundle;
import android.util.Log;

import com.salesforce.androidsdk.ui.sfhybrid.SalesforceDroidGapActivity;

public class SplashScreenDemoActivity extends SalesforceDroidGapActivity {
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
    	Log.i("SalesforceDroidGapActivity.onCreate", "onCreate called");
        super.onCreate(savedInstanceState);
        super.setIntegerProperty("splashscreen", R.drawable.splash);
	}
	
	@Override
	public void loadUrl(final String url) {
		super.loadUrl(url, 3000 /* time for which splash screen should be displayed */ );
	}
}
