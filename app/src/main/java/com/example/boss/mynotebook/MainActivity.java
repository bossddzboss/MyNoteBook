package com.example.boss.mynotebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String PASSWORD = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText passwordEditText = findViewById(R.id.password_edit_text);
                String inputPassword = passwordEditText.getText().toString();

                if(PASSWORD.equals(inputPassword))
                {
                    Toast t = Toast.makeText(
                            getApplicationContext(),
                            "Welcome to My Notebook",
                            Toast.LENGTH_LONG
                    );
                    t.show();

                    Intent i = new Intent(getApplicationContext(),NoteListActivity.class);
                    startActivity(i);
                }
                else
                    {
                        Toast t = Toast.makeText(
                                getApplicationContext(),
                                "Password Incorrect",
                                Toast.LENGTH_LONG
                        );
                        t.show();
                    }
                }

        });

    }
}
