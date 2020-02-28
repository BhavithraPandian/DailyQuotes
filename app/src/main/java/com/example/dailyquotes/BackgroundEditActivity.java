package com.example.dailyquotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.dailyquotes.Adapter.BackgroundEditAdapter;
import com.example.dailyquotes.Models.backgroundedit;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static java.security.AccessController.getContext;

public class BackgroundEditActivity extends AppCompatActivity {

    ArrayList<backgroundedit> bgAL=new ArrayList();
    BackgroundEditAdapter adapterRV;
    RecyclerView bgRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background_edit);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        }
        initUI();

        bgAL.add(new backgroundedit(R.mipmap.p60));
        bgAL.add(new backgroundedit(R.mipmap.p61));
        bgAL.add(new backgroundedit(R.mipmap.p62));
        bgAL.add(new backgroundedit(R.mipmap.p63));
        bgAL.add(new backgroundedit(R.mipmap.p64));
        bgAL.add(new backgroundedit(R.mipmap.p65));
        bgAL.add(new backgroundedit(R.mipmap.p66));
        bgAL.add(new backgroundedit(R.mipmap.p67));
        bgAL.add(new backgroundedit(R.mipmap.p68));
        bgAL.add(new backgroundedit(R.mipmap.p69));
        bgAL.add(new backgroundedit(R.mipmap.p70));

        adapterRV=new BackgroundEditAdapter(getApplicationContext(),bgAL,BackgroundEditActivity.this);
        bgRV.setHasFixedSize(true);
        bgRV.setAdapter(adapterRV);
    }

    private void initUI() {
        bgRV=findViewById(R.id.bgchangerRV);
        bgRV.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));


    }
}
