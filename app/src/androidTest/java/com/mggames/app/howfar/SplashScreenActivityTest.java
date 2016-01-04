package com.mggames.app.howfar;

import android.test.ActivityInstrumentationTestCase2;
import android.test.AndroidTestCase;

/**
 * Created by maxgarcia on 04/01/2016.
 */
public class SplashScreenActivityTest extends ActivityInstrumentationTestCase2<SplashScreenActivity> {

    public SplashScreenActivityTest() {
        super(SplashScreenActivity.class);
    }

    public void testActivityExists() {
        SplashScreenActivity activity = getActivity();
        assertNotNull(activity);
    }

    public void testLoginButton() {
        SplashScreenActivity activity = getActivity();
        
    }
}
