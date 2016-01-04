package com.mggames.app.howfar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Activity by default : invite the user to log or register
 */
public class SplashScreenActivity extends AppCompatActivity {

    public SplashScreenActivity() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final Button loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SplashScreenActivity.this.createIntent(true);
            }
        });

        final Button registerButton = (Button) findViewById(R.id.register_button);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SplashScreenActivity.this.createIntent(false);
            }
        });
    }

    private void createIntent(boolean isLogin) {
        finish();
        Intent myIntent = new Intent(SplashScreenActivity.this, LoginActivity.class);
        myIntent.putExtra(getString(R.string.is_login), isLogin);
        SplashScreenActivity.this.startActivity(myIntent);
    }
}
