package com.example.admin.mvp.view.mainactivity;

import com.example.admin.mvp.BasePresenter;
import com.example.admin.mvp.BaseView;

/**
 * Created by Admin on 10/18/2017.
 */

public interface MainActivityContract {

    interface View extends BaseView{
        void setFullName(String fullName);
    }

    interface Presenter extends BasePresenter<View>{
        void getFullName(String firstname);
    }
}
