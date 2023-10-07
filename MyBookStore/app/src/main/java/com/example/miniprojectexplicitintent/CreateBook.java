package com.example.miniprojectexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CreateBook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createbook_activity);
    }

    public void goAction(View v){
        try{
           // EditText inputET = findViewById(R.id.inputET);
           // String value = inputET.getText().toString();
            // Create the intent
            // Put the value in the intent with key "quality"
            // Start the second activity
            Intent intent = new Intent(CreateBook.this, LastActivity.class);
            startActivity(intent);
        } catch (Exception any){
            // ignored
        }

    }
}