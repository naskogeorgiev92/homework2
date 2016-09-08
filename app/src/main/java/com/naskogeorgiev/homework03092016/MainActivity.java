package com.naskogeorgiev.homework03092016;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.naskogeorgiev.homework03092016.exercise1.TicTacToeActivity;
import com.naskogeorgiev.homework03092016.exercise2.FavoriteAppActivity;
import com.naskogeorgiev.homework03092016.exercise3.SpotifyActivity;

public class MainActivity extends Activity implements View.OnClickListener {

    Button mBtnTicTacToe, mBtnFavoriteApp, mBtnSpotify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mBtnTicTacToe = (Button) findViewById(R.id.btn_exercise1);
        mBtnFavoriteApp = (Button) findViewById(R.id.btn_exercise2);
        mBtnSpotify = (Button) findViewById(R.id.btn_exercise3);

        mBtnTicTacToe.setOnClickListener(this);
        mBtnFavoriteApp.setOnClickListener(this);
        mBtnSpotify.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_exercise1) {
            startActivity(new Intent(MainActivity.this, TicTacToeActivity.class));
        }

        if (v.getId() == R.id.btn_exercise2) {
            startActivity(new Intent(MainActivity.this, FavoriteAppActivity.class));
        }

        if (v.getId() == R.id.btn_exercise3) {
            startActivity(new Intent(MainActivity.this, SpotifyActivity.class));
        }
    }
}
