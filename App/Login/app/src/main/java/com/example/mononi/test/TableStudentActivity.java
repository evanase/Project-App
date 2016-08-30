package com.example.mononi.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Evanase on 6/21/2016.
 */
public class TableStudentActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablestudent);

        Button ZoomMap = (Button) findViewById(R.id.table1);
        ZoomMap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (TableStudentActivity.this, ZoomTableStudentActivity.class);

                startActivity(intent);
            }
        });

    }
}