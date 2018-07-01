package com.kreatorku.kreatorku_mobile.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.kreatorku.kreatorku_mobile.R;
import com.kreatorku.kreatorku_mobile.Views.AccountActivity;
import com.kreatorku.kreatorku_mobile.Views.HomeActivity;

/**
 * Created by Redacted-PC on 30/06/2018.
 */

public class BottomNavHelper {
    public static void setupBottomNavView(BottomNavigationViewEx navBottom){
        navBottom.enableShiftingMode(false);
        navBottom.enableAnimation(false);
        navBottom.enableItemShiftingMode(false);
        navBottom.setTextVisibility(true);
        navBottom.setIconSize(30, 30);
    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.kreator_home:
                        Intent intentHome = new Intent(context, HomeActivity.class);
                        context.startActivity(intentHome);
                        break;
                    case R.id.kreator_explore:
                        break;
                    case R.id.kreator_account:
                        Intent intentAccount = new Intent(context, AccountActivity.class);
                        context.startActivity(intentAccount);
                        break;
                }
                return false;
            }
        });
    }
}
