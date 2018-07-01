package com.kreatorku.kreatorku_mobile;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.kreatorku.kreatorku_mobile.Utils.BottomNavHelper;
import com.kreatorku.kreatorku_mobile.Utils.PrefManager;
import com.kreatorku.kreatorku_mobile.Views.HomeActivity;

public class MainActivity extends AppCompatActivity {

    private Button startButton;
    private PrefManager prefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //check apakah aplikasi berjalan untuk pertama kali atau tidak sebelum memangil setContentView()
        prefManager = new PrefManager(this);
        if(!prefManager.isFirstimeLaunch()){
            launchMainScreen();
            finish();
        }

        setContentView(R.layout.activity_main);

        startButton = (Button) findViewById(R.id.startButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchMainScreen();
            }
        });
    }

    private void launchMainScreen(){
        prefManager.setIsFirstTimeLaunch(false);
        startActivity(new Intent(MainActivity.this, HomeActivity.class));
        finish();
    }


}
