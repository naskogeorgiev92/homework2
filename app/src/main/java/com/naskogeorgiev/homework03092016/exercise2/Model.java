package com.naskogeorgiev.homework03092016.exercise2;


/**
 * Created by nasko.georgiev on 7.9.2016 г..
 */
class Model {
    private String mTitle, mLikes, mComments;
    private int mImage;

    public Model(String title, String likes, String comments, int image) {
        this.mTitle = title;
        this.mLikes = likes;
        this.mComments = comments;
        this.mImage = image;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getLikes() {
        return mLikes;
    }

    public void setLikes(String mLikes) {
        this.mLikes = mLikes;
    }

    public String getComments() {
        return mComments;
    }

    public void setComments(String mComments) {
        this.mComments = mComments;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int mImage) {
        this.mImage = mImage;
    }
}
