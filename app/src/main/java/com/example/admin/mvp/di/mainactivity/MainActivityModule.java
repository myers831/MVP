package com.example.admin.mvp.di.mainactivity;

import com.example.admin.mvp.view.mainactivity.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Admin on 10/20/2017.
 */

//denote the module with @module annotation
@Module
public class MainActivityModule {

    //provides the MainActivityPresenter object by this method
    @Provides
    MainActivityPresenter providesMainActivityPresenter(){
        return new MainActivityPresenter();
    }
}
