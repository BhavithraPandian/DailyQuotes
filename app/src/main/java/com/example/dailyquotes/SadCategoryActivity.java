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

public class SadCategoryActivity extends AppCompatActivity {

    ArrayList<mainfeed> sadAL=new ArrayList<>();
    QuotesAdapter adapter;
    RecyclerView sadRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sad_category);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        }
        initUI();

        sadAL.add(new mainfeed("\"\"",R.mipmap.p9));

        adapter=new QuotesAdapter(getApplicationContext(),sadAL);
        sadRV.setHasFixedSize(true);
        sadRV.setLayoutManager(new LinearLayoutManager(this));
        sadRV.setAdapter(adapter);
    }

    private void initUI() {
        sadRV=findViewById(R.id.sadRV);
    }
}
