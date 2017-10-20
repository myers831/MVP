package com.example.admin.mvp.view.mainactivity;

/**
 * Created by Admin on 10/18/2017.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {

    MainActivityContract.View view;

    @Override
    public void addView(MainActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void removeView() {
        this.view = null;
    }

    @Override
    public void getFullName(String firstname) {
        String fullname = getFullNameFromDB(firstname);

        if(firstname.equals("aaa")) view.showError("Invalid name");
        view.setFullName(fullname);
    }

    public String getFullNameFromDB(String firstName){
        return firstName + " Myers";
    }
}
