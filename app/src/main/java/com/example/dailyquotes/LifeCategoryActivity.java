package com.example.dailyquotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.dailyquotes.Adapter.QuotesAdapter;
import com.example.dailyquotes.Models.mainfeed;

import java.util.ArrayList;

public class LifeCategoryActivity extends AppCompatActivity {

    ArrayList<mainfeed> lifeAL=new ArrayList<>();
    QuotesAdapter adapter;
    RecyclerView lifeRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_category);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        }
        initUI();

        lifeAL.add(new mainfeed("\"\"",R.mipmap.p11));

        adapter=new QuotesAdapter(getApplicationContext(),lifeAL);
        lifeRV.setHasFixedSize(true);
        lifeRV.setLayoutManager(new LinearLayoutManager(this));
        lifeRV.setAdapter(adapter);
    }

    private void initUI() {
        lifeRV=findViewById(R.id.lifeRV);
    }
}
