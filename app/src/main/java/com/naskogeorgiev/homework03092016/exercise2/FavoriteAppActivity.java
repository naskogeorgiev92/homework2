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
        data.add(0, new Model("Test image", "1000 likes", "120 comments", R.drawable.placeholder_image));
        data.add(1, new Model("Test image 2", "2000 likes", "12 comments", R.drawable.placeholder_image));
        data.add(2, new Model("Test image 3", "3000 likes", "54 comments", R.drawable.placeholder_image));
        data.add(3, new Model("Test image 4", "4000 likes", "57 comments", R.drawable.placeholder_image));

        Log.d("DEBUG", "The size of data array list is " + data.size());
        Log.d("DEBUG", "The first entry of data array list is " + data.get(0).getTitle());

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(FavoriteAppActivity.this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new FavoriteRecyclerViewAdapter(data);
        mRecyclerView.setAdapter(mAdapter);
    }
}
