package com.example.admin.mvp.di.mainactivity;

import com.example.admin.mvp.view.mainactivity.MainActivity;

import dagger.Component;

/**
 * Created by Admin on 10/20/2017.
 */

@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity mainActivity);
}
