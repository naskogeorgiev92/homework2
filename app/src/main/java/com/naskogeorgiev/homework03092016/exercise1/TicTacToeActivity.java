package com.naskogeorgiev.homework03092016.exercise1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.naskogeorgiev.homework03092016.R;

public class TicTacToeActivity extends Activity implements View.OnClickListener {
    TicTacToe ticTacToe;
    Boolean turn;
    State currentState;

    Button mTtt100, mTtt010, mTtt001;
    Button mTtt200, mTtt020, mTtt002;
    Button mTtt300, mTtt030, mTtt003;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);

        ticTacToe = new TicTacToe(3);
        turn = true;

        mTtt100 = (Button) findViewById(R.id.btn_ttt100);
        mTtt010 = (Button) findViewById(R.id.btn_ttt010);
        mTtt001 = (Button) findViewById(R.id.btn_ttt001);
        mTtt200 = (Button) findViewById(R.id.btn_ttt200);
        mTtt020 = (Button) findViewById(R.id.btn_ttt020);
        mTtt002 = (Button) findViewById(R.id.btn_ttt002);
        mTtt300 = (Button) findViewById(R.id.btn_ttt300);
        mTtt030 = (Button) findViewById(R.id.btn_ttt030);
        mTtt003 = (Button) findViewById(R.id.btn_ttt003);

        mTtt100.setOnClickListener(this);
        mTtt010.setOnClickListener(this);
        mTtt001.setOnClickListener(this);
        mTtt200.setOnClickListener(this);
        mTtt020.setOnClickListener(this);
        mTtt002.setOnClickListener(this);
        mTtt300.setOnClickListener(this);
        mTtt030.setOnClickListener(this);
        mTtt003.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == mTtt100.getId()) {
            currentState = getState();
            mTtt100.setText(currentState.toString());
            mTtt100.setEnabled(false);
            if (ticTacToe.Move(0, 0, currentState)) {
                reportWinner(currentState);
            }
        }
        if (v.getId() == mTtt010.getId()) {
            currentState = getState();
            mTtt010.setText(currentState.toString());
            mTtt010.setEnabled(false);
            if (ticTacToe.Move(1, 0, currentState)) {
                reportWinner(currentState);
            }
        }
        if (v.getId() == mTtt001.getId()) {
            currentState = getState();
            mTtt001.setText(currentState.toString());
            mTtt001.setEnabled(false);
            if (ticTacToe.Move(2, 0, currentState)) {
                reportWinner(currentState);
            }
        }

        if (v.getId() == mTtt200.getId()) {
            currentState = getState();
            mTtt200.setText(currentState.toString());
            mTtt200.setEnabled(false);
            if (ticTacToe.Move(0, 1, currentState)) {
                reportWinner(currentState);
            }
        }
        if (v.getId() == mTtt020.getId()) {
            currentState = getState();
            mTtt020.setText(currentState.toString());
            mTtt020.setEnabled(false);
            if (ticTacToe.Move(1, 1, currentState)) {
                reportWinner(currentState);
            }
        }
        if (v.getId() == mTtt002.getId()) {
            currentState = getState();
            mTtt002.setText(currentState.toString());
            mTtt002.setEnabled(false);
            if (ticTacToe.Move(2, 1, currentState)) {
                reportWinner(currentState);
            }
        }

        if (v.getId() == mTtt300.getId()) {
            currentState = getState();
            mTtt300.setText(currentState.toString());
            mTtt300.setEnabled(false);
            if (ticTacToe.Move(0, 2, currentState)) {
                reportWinner(currentState);
            }
        }
        if (v.getId() == mTtt030.getId()) {
            currentState = getState();
            mTtt030.setText(currentState.toString());
            mTtt030.setEnabled(false);
            if (ticTacToe.Move(1, 2, currentState)) {
                reportWinner(currentState);
            }
        }
        if (v.getId() == mTtt003.getId()) {
            currentState = getState();
            mTtt003.setText(currentState.toString());
            mTtt003.setEnabled(false);
            if (ticTacToe.Move(2, 2, currentState)) {
                reportWinner(currentState);
            }
        }
    }

    private State getState() {
        if (turn) {
            turn = false;
            return State.X;
        } else {
            turn = true;
            return State.O;
        }
    }

    private void disableBoard() {
        mTtt100.setEnabled(false);
        mTtt010.setEnabled(false);
        mTtt001.setEnabled(false);
        mTtt200.setEnabled(false);
        mTtt020.setEnabled(false);
        mTtt002.setEnabled(false);
        mTtt300.setEnabled(false);
        mTtt030.setEnabled(false);
        mTtt003.setEnabled(false);
    }

    private void reportWinner(State s) {
        disableBoard();

        AlertDialog.Builder builder = new AlertDialog.Builder(TicTacToeActivity.this);
        builder.setMessage(getString(R.string.winner_message) + s.toString() + "!");
        builder.setPositiveButton(R.string.new_game, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                recreate();
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
