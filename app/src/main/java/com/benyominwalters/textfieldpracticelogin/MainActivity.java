package com.benyominwalters.textfieldpracticelogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void logLogin(View view) {

        EditText usernameTextField = (EditText) findViewById(R.id.usernameTextField);
        EditText passwordTextField = (EditText) findViewById(R.id.passwordTextField);

        Log.i("Info", "Username " + usernameTextField.getText().toString() + " Password " + passwordTextField.getText().toString());

        Toast.makeText(MainActivity.this, "Username " + usernameTextField.getText().toString() + " Password " + passwordTextField.getText().toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
