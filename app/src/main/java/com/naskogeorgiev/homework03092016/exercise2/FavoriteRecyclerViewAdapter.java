package com.naskogeorgiev.homework03092016.exercise2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.naskogeorgiev.homework03092016.R;

import java.util.ArrayList;

/**
 * Created by nasko.georgiev on 7.9.2016 г..
 */

class FavoriteRecyclerViewAdapter extends RecyclerView.Adapter<FavoriteRecyclerViewAdapter.MyViewHolder> {

    private ArrayList<Model> mAdapterData;

    FavoriteRecyclerViewAdapter(ArrayList<Model> data){
        this.mAdapterData = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_favorite_recycler, parent, false);
        MyViewHolder vh = new MyViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        if(holder!=null) {
            holder.mTitle.setText(mAdapterData.get(position).getTitle());
            holder.mComments.setText(mAdapterData.get(position).getComments());
            holder.mLikes.setText(mAdapterData.get(position).getLikes());
            holder.mImage.setImageResource(mAdapterData.get(position).getImage());
        }
    }

    @Override
    public int getItemCount() {
        return mAdapterData.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView mTitle, mComments, mLikes;
        ImageView mImage;

        MyViewHolder(View itemView) {
            super(itemView);

            mTitle = (TextView) itemView.findViewById(R.id.tv_post_title);
            mComments = (TextView) itemView.findViewById(R.id.tv_comments);
            mLikes = (TextView) itemView.findViewById(R.id.tv_likes);

            mImage = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }

}
