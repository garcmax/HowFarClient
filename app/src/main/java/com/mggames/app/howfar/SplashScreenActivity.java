package com.mggames.app.howfar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final Button loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(view -> createIntent(true));

        final Button registerButton = (Button) findViewById(R.id.register_button);
        registerButton.setOnClickListener(view -> createIntent(false));
    }

    private void createIntent(boolean value) {
        finish();
        Intent myIntent = new Intent(SplashScreenActivity.this, LoginActivity.class);
        myIntent.putExtra(getString(R.string.is_login), value);
        SplashScreenActivity.this.startActivity(myIntent);
    }
}
