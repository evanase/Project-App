package com.example.mononi.test;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/*import static com.example.mononi.test.Constants.CONTENT;
import static com.example.mononi.test.Constants.TABLE_NAME;
import static com.example.mononi.test.Constants._ID;*/

public class MainActivity extends Activity {

    /*private HelperClass helper;*/

    @Override
    protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);

       /* helper = new HelperClass(this);

        try{
            Cursor cursor = getAllNotes();
            showNotes(cursor);
        }

        final EditText txtNewText = (EditText) findViewById(R.id.editText);
        Button btnSave = (Button) findViewById(R.id.button6);
        try {
            addNote(txtNewText).getText().toString());
            Cursor cursor = getAllNote();
            showNoteText.setText(null);
        }
        finally {
            helper.close();
        }

        private void addNote(String str) {*/




        Button loginButton = (Button) findViewById(R.id.login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);

                startActivity(intent);
            }
        });
    }
}
