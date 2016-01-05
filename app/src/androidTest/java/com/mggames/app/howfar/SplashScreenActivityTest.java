package com.mggames.app.howfar;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;

/**
 * Created by maxgarcia on 04/01/2016.
 */
public class SplashScreenActivityTest extends ActivityInstrumentationTestCase2<SplashScreenActivity> {

    public SplashScreenActivityTest() {
        super(SplashScreenActivity.class);
    }

     public void testLoginButton() {

        Instrumentation.ActivityMonitor activityMonitor = getInstrumentation().addMonitor(LoginActivity.class.getName(), null, false);

        SplashScreenActivity activity = getActivity();
        final Button loginButton = (Button) activity.findViewById(R.id.login_button);
        TouchUtils.clickView(this, loginButton);

        Activity nextActivity = getInstrumentation().waitForMonitorWithTimeout(activityMonitor, 5000);
        assertNotNull(nextActivity);
        Intent myIntent = nextActivity.getIntent();
        assertNotNull(myIntent);
        final boolean isLogin = myIntent.getBooleanExtra(nextActivity.getString(R.string.is_login), true);
        assertEquals(true, isLogin);
        nextActivity .finish();
    }

    public void testRegisterButton() {
        Instrumentation.ActivityMonitor activityMonitor = getInstrumentation().addMonitor(LoginActivity.class.getName(), null, false);

        SplashScreenActivity activity = getActivity();
        final Button registerButton = (Button) activity.findViewById(R.id.register_button);
        TouchUtils.clickView(this, registerButton);

        Activity nextActivity = getInstrumentation().waitForMonitorWithTimeout(activityMonitor, 5000);
        assertNotNull(nextActivity);
        Intent myIntent = nextActivity.getIntent();
        assertNotNull(myIntent);
        final boolean isLogin = myIntent.getBooleanExtra(nextActivity.getString(R.string.is_login), true);
        assertEquals(false, isLogin);
        nextActivity .finish();
    }
}
