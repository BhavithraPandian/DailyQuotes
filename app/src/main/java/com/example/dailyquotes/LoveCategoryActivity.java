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

public class LoveCategoryActivity extends AppCompatActivity {

    ArrayList<mainfeed> loveAL=new ArrayList<>();
    QuotesAdapter adapter;
    RecyclerView loveRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_love_category);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        }
        initUI();

        loveAL.add(new mainfeed("If you want a happy goal,tie it to a goal,not to people or thing.",R.mipmap.cc));

        adapter=new QuotesAdapter(getApplicationContext(),loveAL);
        loveRV.setLayoutManager(new LinearLayoutManager(this));
        loveRV.setHasFixedSize(true);
        loveRV.setAdapter(adapter);
    }

    private void initUI() {
        loveRV=findViewById(R.id.loveRV);
    }
}
