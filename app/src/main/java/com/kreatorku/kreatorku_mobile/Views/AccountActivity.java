package com.kreatorku.kreatorku_mobile.Views;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.kreatorku.kreatorku_mobile.R;
import com.kreatorku.kreatorku_mobile.Utils.BottomNavHelper;

public class AccountActivity extends AppCompatActivity {

    public boolean isAuthenticated = false;

    private ImageButton btnClose;
    private Button btnRegister;
    private Button btnLogin;

    private Context mContext = AccountActivity.this;

    private static final int ACTIVITY_NUM = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        btnClose = (ImageButton) findViewById(R.id.close_button);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountActivity.this, HomeActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        onAuthLogin();
        setOnClickLogin();
    }

    private void setOnClickLogin(){

        btnLogin = (Button) findViewById(R.id.login_button);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoginActivity = new Intent(AccountActivity.this, LoginActivity.class);
                startActivity(intentLoginActivity);
                finish();
            }
        });
    }

    private void onAuthLogin(){
        if (isAuthenticated == false){
            ///TODO:Alihkan ke tampilan login dan register
        }
        else{
            ///TODO:tampilkan fragment profile dan pegaturan profile
        }
    }
}
