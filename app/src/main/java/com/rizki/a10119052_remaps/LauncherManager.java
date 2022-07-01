package com.rizki.a10119052_remaps;

import android.content.Context;
import android.content.SharedPreferences;
/**
 * Tanggal Pengerjaan : 01 JULI 2022 , 20.24 WIB
 * NIM : 10119052
 * Nama : Rizki Dwi Nugraha
 * Kelas : IF-2
 **/
public class LauncherManager {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    private static String PREF_NAME = "LaunchManger";
    private static String IS_FIRST_TIME = "isFirst";

    public LauncherManager(Context context){
        sharedPreferences = context.getSharedPreferences(PREF_NAME,0);
        editor = sharedPreferences.edit();
    }

    public void setFirstLunch(boolean isFirst){
        editor.putBoolean(IS_FIRST_TIME,isFirst);
        editor.commit();
    }

    public boolean isFirstTime(){
        return sharedPreferences.getBoolean(IS_FIRST_TIME,true);
    }
}
