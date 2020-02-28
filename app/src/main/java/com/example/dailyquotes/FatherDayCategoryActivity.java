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

public class FatherDayCategoryActivity extends AppCompatActivity {

    ArrayList<mainfeed> fatherdayAL=new ArrayList<>();
    QuotesAdapter adapter;
    RecyclerView fatherdayRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_father_day_category);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        }
        initUI();

        fatherdayAL.add(new mainfeed("\"\"",R.mipmap.p3));

        adapter=new QuotesAdapter(getApplicationContext(),fatherdayAL);
        fatherdayRV.setHasFixedSize(true);
        fatherdayRV.setLayoutManager(new LinearLayoutManager(this));
        fatherdayRV.setAdapter(adapter);
    }

    private void initUI() {
        fatherdayRV=findViewById(R.id.fatherdayRV);

    }
}
