package org.pongs92.ej;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends Activity implements View.OnClickListener {
    Button loginButton;
    Button signupButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.loginButton =(Button) findViewById(R.id.loginButton);

        this.signupButton = (Button)findViewById(R.id.signupButton);

        loginButton.setOnClickListener(this);

        //signupButton.setOnClickListener();


    }

    @Override
    public void onClick(View v) {
        Intent intent;
        intent = new Intent(this,MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);


    }
}
