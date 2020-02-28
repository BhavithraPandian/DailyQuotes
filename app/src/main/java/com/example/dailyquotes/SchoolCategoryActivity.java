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

public class SchoolCategoryActivity extends AppCompatActivity {

    ArrayList<mainfeed> schoolAL=new ArrayList<>();
    QuotesAdapter adapter;
    RecyclerView schoolRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_category);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        }
        initUI();

        schoolAL.add(new mainfeed("\"\"",R.mipmap.p43));

        adapter=new QuotesAdapter(getApplicationContext(),schoolAL);
        schoolRV.setHasFixedSize(true);
        schoolRV.setLayoutManager(new LinearLayoutManager(this));
        schoolRV.setAdapter(adapter);
    }

    private void initUI() {
        schoolRV=findViewById(R.id.schoolRV);
    }
}
