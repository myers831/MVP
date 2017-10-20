package com.example.admin.mvp;

/**
 * Created by Admin on 10/18/2017.
 */

public interface BasePresenter<V extends BaseView> {

    void addView(V View);
    void removeView();

}
