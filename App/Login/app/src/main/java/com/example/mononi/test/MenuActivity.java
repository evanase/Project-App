package com.example.mononi.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

/**
 * Created by Evanase on 6/19/2016.
 */
public class MenuActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button ProfileStudentButton = (Button) findViewById(R.id.button);
        ProfileStudentButton.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {
             Intent intent = new Intent (MenuActivity.this, DepartStudentActivity.class);

            startActivity(intent);
        }
        });


            Button ProfileTeacherButton = (Button) findViewById(R.id.button3);
            ProfileTeacherButton.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent (MenuActivity.this, DepartTeacherActivity.class);

                    startActivity(intent);
            }
        });

        Button TableButton = (Button) findViewById(R.id.button2);
        TableButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MenuActivity.this, TableStudentActivity.class);

                startActivity(intent);
            }
        });

        Button MapButton = (Button) findViewById(R.id.button4);
        MapButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MenuActivity.this, MapActivity.class);

                startActivity(intent);
            }
        });
    }
}
