package com.example.librarystorebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class aboutActivity extends AppCompatActivity {
        DrawerLayout drawerLayout;
        ImageView menu;
        LinearLayout home, settings, share, about, logout;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_about);

            drawerLayout = findViewById(R.id.drawerlayout);
            menu = findViewById(R.id.menu);
            home = findViewById(R.id.home);
            about = findViewById(R.id.about);
            logout = findViewById(R.id.logout);
            settings = findViewById(R.id.settings);
            share = findViewById(R.id.share);

            menu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openDrawer(drawerLayout);
                }
            });
            home.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    redirectActivity(aboutActivity.this, HomeActivity.class);

                }
            });
            settings.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    redirectActivity(aboutActivity.this, SettingActvity.class);

                }
            });
            share.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    redirectActivity(aboutActivity.this, shareActivity.class);
                    recreate();
                }
            });
            about.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    recreate();
                }
            });

         logout.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(aboutActivity.this, "Logout", Toast.LENGTH_SHORT).show();
        }
    });
}

    public static void openDrawer(DrawerLayout drawerLayout){
            drawerLayout.openDrawer(GravityCompat.START);
        }
        public static void closeDrawer(DrawerLayout drawerLayout){
            if (drawerLayout.isDrawerOpen(GravityCompat.START)){
                drawerLayout.closeDrawer(GravityCompat.START);
            }
        }
        public static void redirectActivity(Activity activity, Class secondActvity){
            Intent intent = new Intent(activity, secondActvity);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            activity.startActivity(intent);
            activity.finish();
        }

        @Override
        protected void onPause() {
            super.onPause();
            closeDrawer(drawerLayout);
        }
    }