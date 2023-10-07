package com.example.miniprojectexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShowBooksList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showbookslist_activity);
    }

    public void goHome1(View v){
        try{
            EditText inputET = findViewById(R.id.inputET);
            String value = inputET.getText().toString();
            Intent intent = new Intent(ShowBooksList.this, MainActivity.class);
            startActivity(intent);
        } catch (Exception any){
            // ignored
        }

    }
}