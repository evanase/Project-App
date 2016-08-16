package com.example.mononi.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Evanase on 6/21/2016.
 */
public class DepartStudentActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);

        Button ITsButton = (Button) findViewById(R.id.button5);
        ITsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DepartStudentActivity.this, UserStudentActivity.class);

                startActivity(intent);
            }
        });
    }
}
