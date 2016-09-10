package com.naskogeorgiev.homework03092016.exercise2;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.naskogeorgiev.homework03092016.R;

import java.util.ArrayList;

public class FavoriteAppActivity extends Activity {

    private RecyclerView mRecyclerView;
    private FavoriteRecyclerViewAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Model> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_app);

        data = new ArrayList<>();
        data.add(0, new Model("The struggle is real", "19,209 likes", "931 comments", R.drawable.gag_1));
        data.add(1, new Model("This was the first client on the McDonald's that just opened in my town", "10,904 likes", "285 comments", R.drawable.gag_2));
        data.add(2, new Model("You can do it", "8,009 likes", "338 comments", R.drawable.gag_3));
        data.add(3, new Model("Why America why!", "9,788 likes", "396 comments", R.drawable.gag_4));
        data.add(4, new Model("Anglish", "8,405 likes", "125 comments", R.drawable.gag_5));
        data.add(5, new Model("Studying be like", "3,578 likes", "257 comments", R.drawable.gag_6));


        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(FavoriteAppActivity.this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new FavoriteRecyclerViewAdapter(data);
        mRecyclerView.setAdapter(mAdapter);
    }
}
