package com.example.linhnb.androidcore.data.source.local.sharedprf;

public interface SharedPrefsApi {

    <T> T get(String key, Class<T> clazz);

    <T> void put(String key, T data);

    void clear();
}
