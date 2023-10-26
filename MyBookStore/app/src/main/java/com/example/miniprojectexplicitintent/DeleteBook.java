package com.example.miniprojectexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class DeleteBook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deletebook_activity);

    }

    public void goAction(View v){
        try{
            EditText inputET = findViewById(R.id.inputET);
            String value = inputET.getText().toString();
            // Start the second activity
            Intent intent = new Intent( DeleteBook.this, LastActivity.class);
            startActivity(intent);
        } catch (Exception any){
            // ignored
        }

    }
}