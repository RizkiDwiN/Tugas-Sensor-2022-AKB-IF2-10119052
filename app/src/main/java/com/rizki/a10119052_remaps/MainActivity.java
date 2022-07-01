package com.rizki.a10119052_remaps;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.List;
/**
 * Tanggal Pengerjaan : 01 JULI 2022 , 20.24 WIB
 * NIM : 10119052
 * Nama : Rizki Dwi Nugraha
 * Kelas : IF-2
 **/
public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    BottomNavigationView bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selecttedFragment = null;

                switch (menuItem.getItemId()){
                    case R.id.home:
                        selecttedFragment = new HomeFragment();
                        break;
                    case R.id.profile:
                        selecttedFragment = new ProfileFragment();
                        break;
                    case R.id.about:
                        selecttedFragment = new AboutFragment();
                        break;

                }


                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selecttedFragment).commit();

                return true;
            }
        });

    }
}