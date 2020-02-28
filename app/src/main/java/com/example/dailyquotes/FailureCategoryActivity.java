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

public class FailureCategoryActivity extends AppCompatActivity {

    ArrayList<mainfeed> failuerAL=new ArrayList<>();
    QuotesAdapter adapter;
    RecyclerView failureRV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_failure_category);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        }
        initUI();


        failuerAL.add(new mainfeed("\"It's fine to celebrate success but it is more important to heed the lessons of failure.\"",R.mipmap.p1));
        failuerAL.add(new mainfeed("\"Just because you fail once doesn't mean you're gonna fail at everything. \"",R.mipmap.p11));
        failuerAL.add(new mainfeed("\"You have to be able to accept failure to get better.  \"",R.mipmap.p29));
        failuerAL.add(new mainfeed("\"Think like a queen. A queen is not afraid to fail. Failure is another steppingstone to greatness. \"",R.mipmap.p31));
        failuerAL.add(new mainfeed("\"It is hard to fail, but it is worse never to have tried to succeed.\"",R.mipmap.p41));
        failuerAL.add(new mainfeed("\"Failure is the foundation of success, and the means by which it is achieved.\"",R.mipmap.p51));
        failuerAL.add(new mainfeed("\"Mistakes are the portals of discovery. \"",R.mipmap.p61));
        failuerAL.add(new mainfeed("\"I can accept failure, everyone fails at something. But I can't accept not trying.\"",R.mipmap.p71));
        failuerAL.add(new mainfeed("\"I think you have to try and fail, because failure gets you closer to what you're good at. \"",R.mipmap.p81));
        failuerAL.add(new mainfeed("\"The only real failure in life is not to be true to the best one knows.\"",R.mipmap.p91));
        failuerAL.add(new mainfeed("\"If you fell down yesterday, stand up today.\"",R.mipmap.p2));
        failuerAL.add(new mainfeed("\"Our greatest glory is not in never failing, but in rising every time we fail.\"",R.mipmap.p25));
        failuerAL.add(new mainfeed("\"Success is not final, failure is not fatal: it is the courage to continue that counts.\"",R.mipmap.p32));
        failuerAL.add(new mainfeed("\"Any man can make mistakes, but only an idiot persists in his error.\"",R.mipmap.p42));
        failuerAL.add(new mainfeed("\"The chief cause of failure and unhappiness is trading what you want most for what you want right now. \"",R.mipmap.p52));
        failuerAL.add(new mainfeed("\"There is only one thing that makes a dream impossible to achieve: the fear of failure.\"",R.mipmap.p62));
        failuerAL.add(new mainfeed("\"Failure is success if we learn from it.\"",R.mipmap.p72));
        failuerAL.add(new mainfeed("\"Only those who dare to fail greatly can ever achieve greatly.\"",R.mipmap.p82));
        failuerAL.add(new mainfeed("\"Failure is a bend in the road, not the end of the road. Learn from failure and keep moving forward.\"",R.mipmap.p92));
        failuerAL.add(new mainfeed("\"If at first you don't succeed, destroy all evidence that you tried.\"",R.mipmap.p3));
        failuerAL.add(new mainfeed("\"Failure is unimportant. It takes courage to make a fool of yourself.\"",R.mipmap.p13));
        failuerAL.add(new mainfeed("\"Success is not a good teacher, failure makes you humble.\"",R.mipmap.p23));
        failuerAL.add(new mainfeed("\"My fault, my failure, is not in the passions I have, but in my lack of control of them.\"",R.mipmap.p33));
        failuerAL.add(new mainfeed("\"There is no failure except in no longer trying.\"",R.mipmap.p43));
        failuerAL.add(new mainfeed("\"Every adversity, every failure, every heartache carries with it the seed of a greater or equal benefit.\"",R.mipmap.p53));
        failuerAL.add(new mainfeed("\"Sometimes by losing a battle you find a new way to win the war.\"",R.mipmap.p63));
        failuerAL.add(new mainfeed("\"Failure will never overtake me if my determination to succeed is strong enough. \"",R.mipmap.p73));
        failuerAL.add(new mainfeed("\"Life is full of screwups. You're supposed to fail sometimes. It's a required part of the human existance.\"",R.mipmap.p83));
        failuerAL.add(new mainfeed("\"Remember that failure is an event, not a person.\"",R.mipmap.p93));
        failuerAL.add(new mainfeed("\"Failure is simply the opportunity to begin again, this time more intelligently.  \"",R.mipmap.p4));
        failuerAL.add(new mainfeed("\"The wise say that our failure is to form habits: for habit is the mark of a stereotyped world.  \"",R.mipmap.p14));
        failuerAL.add(new mainfeed("\"Failure is the condiment that gives success its flavor.\"",R.mipmap.p24));
        failuerAL.add(new mainfeed("\"Do not be embarrassed by your failures, learn from them and start again.  \"",R.mipmap.p34));
        failuerAL.add(new mainfeed("\"My great concern is not whether you have failed, but whether you are content with failure.\"",R.mipmap.p44));
        failuerAL.add(new mainfeed("\"A fear of weakness only strengthens weakness.\"",R.mipmap.p54));
        failuerAL.add(new mainfeed("\"The men who try to do something and fail are infinitely better than those who try to do nothing and succeed.\"",R.mipmap.p64));
        failuerAL.add(new mainfeed("\"Failing to prepare is preparing to fail.\"",R.mipmap.p74));
        failuerAL.add(new mainfeed("\"Fear of failure must never be a reason not to try something. \"",R.mipmap.p84));
        failuerAL.add(new mainfeed("\"If you don't try at anything, you can't fail, it takes back bone to lead the life you want.\"",R.mipmap.p94));
        failuerAL.add(new mainfeed("\"If you're not prepared to be wrong, you'll never come up with anything original.\"",R.mipmap.p5));
        failuerAL.add(new mainfeed("\"There is no failure except in no longer trying. \"",R.mipmap.p15));


        adapter=new QuotesAdapter(getApplicationContext(),failuerAL);
        failureRV.setHasFixedSize(true);
        failureRV.setLayoutManager(new LinearLayoutManager(this));
        failureRV.setAdapter(adapter);
    }

    private void initUI() {
        failureRV=findViewById(R.id.failureRV);
    }
}
