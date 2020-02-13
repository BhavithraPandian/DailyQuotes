package com.example.dailyquotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Adapter;

import com.example.dailyquotes.Adapter.HomeViewPagerAdapter;
import com.example.dailyquotes.Adapter.QuotesAdapter;
import com.example.dailyquotes.Fragments.FavouriteFragment;
import com.example.dailyquotes.Fragments.HomeFeedFragment;
import com.example.dailyquotes.Fragments.SearchFragment;
import com.example.dailyquotes.Models.mainfeed;
import com.ogaclejapan.smarttablayout.SmartTabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    HomeViewPagerAdapter adapterVP=new HomeViewPagerAdapter(getSupportFragmentManager());;
    ViewPager fragmentVP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        }
        initUI();

        adapterVP.addFragment(new HomeFeedFragment(),"HOME");
        adapterVP.addFragment(new SearchFragment(),"SEARCH");
        adapterVP.addFragment(new FavouriteFragment(),"FAV");


        fragmentVP.setAdapter(adapterVP);

        SmartTabLayout viewPagerTab = (SmartTabLayout) findViewById(R.id.viewpagertab);
        viewPagerTab.setViewPager(fragmentVP);


    }

    public void initUI() {
        fragmentVP=findViewById(R.id.fragmentVP);


    }
}

