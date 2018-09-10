package com.example.linhnb.androidcore.screen.base;

public interface BaseViewModel<T extends BasePresenter> {

    void onStart();

    void onStop();
}
