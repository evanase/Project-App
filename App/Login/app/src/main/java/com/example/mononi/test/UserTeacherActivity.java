package com.example.mononi.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Evanase on 6/21/2016.
 */
public class UserTeacherActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userteacher);

        Button UsertButton = (Button) findViewById(R.id.button8);
        UsertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserTeacherActivity.this, ProfileTeacherActivity.class);

                startActivity(intent);
            }
        });
    }
}