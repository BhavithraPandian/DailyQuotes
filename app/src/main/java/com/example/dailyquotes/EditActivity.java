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

    ArrayList<backgroundedit> bg_thumbnailAL = new ArrayList<>();
    ArrayList<backgroundedit> font_thumbnailAL = new ArrayList<>();
    BackgroundEditAdapter adapter;
    RecyclerView thumbnailRV;
    ImageView backIV, bg_changerIV, bgIV,font_changerIV;
    TextView quoteTV;
    /*int editimg;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

        initUI();

        final Intent intent=getIntent();
        String qoute = intent.getStringExtra("quote");
        Integer image=intent.getIntExtra("image",0);

        quoteTV.setText(qoute);
        bgIV.setImageResource(image);

        backIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        bg_changerIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bg_thumbnailAL.clear();

                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p10));
                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p70));
                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p40));

                adapter = new BackgroundEditAdapter(getBaseContext(), bg_thumbnailAL, EditActivity.this);
                thumbnailRV.setLayoutManager(new LinearLayoutManager(EditActivity.this, RecyclerView.HORIZONTAL, false));
                thumbnailRV.setHasFixedSize(true);
                thumbnailRV.setAdapter(adapter);
            }
        });

        font_changerIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                font_thumbnailAL.clear();

                font_thumbnailAL.add(new backgroundedit(R.mipmap.p30));

                adapter=new BackgroundEditAdapter(getBaseContext(),font_thumbnailAL,EditActivity.this);
                thumbnailRV.setLayoutManager(new LinearLayoutManager(EditActivity.this, RecyclerView.HORIZONTAL, false));
                thumbnailRV.setHasFixedSize(true);
                thumbnailRV.setAdapter(adapter);
            }
        });

    }

    private void initUI() {
        backIV = findViewById(R.id.backarrowIV);
        thumbnailRV = findViewById(R.id.changerRV);
        bgIV=findViewById(R.id.backgroundIV);
        bg_changerIV = findViewById(R.id.bg_editIV);
        quoteTV=findViewById(R.id.quoteTV);
        font_changerIV=findViewById(R.id.fontchangerIV);
    }

    public void OnImageClick(int editimg) {

        bgIV.setImageResource(editimg);
    }
}







