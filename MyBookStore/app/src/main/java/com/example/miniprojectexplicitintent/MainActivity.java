package com.example.miniprojectexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void update(View v){
        try{
            EditText inputET = findViewById(R.id.inputET);
            String value = inputET.getText().toString();
            // Create the intent
            // Put the value in the intent with key "quality"
            // Start the second activity
            Intent intent = new Intent(MainActivity.this, UpdateBook.class);
            startActivity(intent);
        } catch (Exception any){
            // ignored
        }

    }

    public void addBook(View v){
        try{
            EditText inputET = findViewById(R.id.inputET);
            String value = inputET.getText().toString();
            // Create the intent
            // Put the value in the intent with key "quality"
            // Start the second activity
            Intent intent = new Intent(MainActivity.this, CreateBook.class);
            startActivity(intent);
        } catch (Exception any){
            // ignored
        }

    }

    public void showBooks(View v){
        try{
            EditText inputET = findViewById(R.id.inputET);
            String value = inputET.getText().toString();
            // Create the intent
            // Put the value in the intent with key "quality"
            // Start the second activity
            Intent intent = new Intent(MainActivity.this, ShowBooksList.class);
            startActivity(intent);
        } catch (Exception any){
            // ignored
        }

    }

    public void deleteBook(View v){
        try{
            EditText inputET = findViewById(R.id.inputET);
            String value = inputET.getText().toString();
            // Create the intent
            // Put the value in the intent with key "quality"
            // Start the second activity
            Intent intent = new Intent(MainActivity.this, DeleteBook.class);
            startActivity(intent);
        } catch (Exception any){
            // ignored
        }

    }
}