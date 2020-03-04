package com.example.dailyquotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dailyquotes.Adapter.BackgroundEditAdapter;
import com.example.dailyquotes.Models.backgroundedit;

import java.util.ArrayList;
import java.util.Map;

public class EditActivity extends AppCompatActivity {

    ArrayList<backgroundedit> bg_thumbnailAl = new ArrayList<>();
    BackgroundEditAdapter adapter;
    RecyclerView bg_thumnailRV;
    ImageView backIV, bg_changerIV, bgIV;
    TextView quoteTV;
    int editimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

        initUI();

        Intent intent=getIntent();
        String qoute = intent.getStringExtra("quote");

        quoteTV.setText(qoute);
        backIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        bg_changerIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bg_thumbnailAl.clear();
                bg_thumbnailAl.add(new backgroundedit(R.mipmap.p10));
                bg_thumbnailAl.add(new backgroundedit(R.mipmap.p70));
                bg_thumbnailAl.add(new backgroundedit(R.mipmap.p40));
                adapter = new BackgroundEditAdapter(getBaseContext(), bg_thumbnailAl, EditActivity.this);
                bg_thumnailRV.setLayoutManager(new LinearLayoutManager(EditActivity.this, RecyclerView.HORIZONTAL, false));
                bg_thumnailRV.setHasFixedSize(true);
                bg_thumnailRV.setAdapter(adapter);
            }
        });
    }

    private void initUI() {
        backIV = findViewById(R.id.backarrowIV);
        bg_thumnailRV = findViewById(R.id.bgchangerRV);
        bgIV=findViewById(R.id.backgroundIV);
        bg_changerIV = findViewById(R.id.bg_editIV);
        quoteTV=findViewById(R.id.quoteTV);
    }
    public void OnImageClick(int editimg) {
        bgIV.setImageResource(editimg);
    }
}







