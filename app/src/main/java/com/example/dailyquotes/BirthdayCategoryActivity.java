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

public class BirthdayCategoryActivity extends AppCompatActivity {

    ArrayList<mainfeed> birthdayAL=new ArrayList<>();
    QuotesAdapter adapter;
    RecyclerView birthdayRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_category);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        }
        initUI();

        birthdayAL.add(new mainfeed("\"Happy birthday! May your Facebook wall be filled with messages from people you never talk to\"",R.mipmap.p33));
        birthdayAL.add(new mainfeed("\"I hope your special day will bring you lots of happiness, love, and fun. You deserve them a lot. Enjoy!\"",R.mipmap.p34));
        birthdayAL.add(new mainfeed("\"Let’s light the candles and celebrate this special day of your life. Happy birthday.\"",R.mipmap.p35));
        birthdayAL.add(new mainfeed("\"Wherever your feet may take, whatever endeavor you lay hands on. It will always be successful. Happy birthday\"",R.mipmap.p36));
        birthdayAL.add(new mainfeed("\"May this special day bring you endless joy and tons of precious memories!\"",R.mipmap.p37));
        birthdayAL.add(new mainfeed("\"You are very special and that’s why you need to float with lots of smiles on your lovely face. Happy birthday.\"",R.mipmap.p45));
        birthdayAL.add(new mainfeed("\"It’s as simple as ABC; today makes more sense because of you, Happy birthday.\"",R.mipmap.p39));
        birthdayAL.add(new mainfeed("\"Let your all the dreams to be on fire and light your birthday candles with that. Have a gorgeous birthday.\"",R.mipmap.p40));
        birthdayAL.add(new mainfeed("\"May you continue to improve as a person with each passing year. Wishing you a very happy birthday.\"",R.mipmap.p41));
        birthdayAL.add(new mainfeed("\"Happy birthday! Here’s to a bright, healthy and exciting future\"",R.mipmap.p42));
        birthdayAL.add(new mainfeed("\"Here’s to the sweetest and loveliest person I know. Happy birthday!\"",R.mipmap.p43));
        birthdayAL.add(new mainfeed("\"The joy is in the air because your special day is here!\"",R.mipmap.p44));
        birthdayAL.add(new mainfeed("\"Your birthday only comes once a year, so make sure this is the most memorable one ever and have a colorful day.\"",R.mipmap.p45));
        birthdayAL.add(new mainfeed("\"I don’t have words to describe what I feel for you. Meeting you is the best thing that ever happened in my life. Happy Birthday!\"",R.mipmap.p46));
        birthdayAL.add(new mainfeed("\"Today I wish you a fun time, shared with your dear ones, and a lifelong happiness!\"",R.mipmap.p47));
        birthdayAL.add(new mainfeed("\"I always wished to be a great friend like you. But there is no way to be a better friend than you in the world. Happy birthday.\"",R.mipmap.p48));
        birthdayAL.add(new mainfeed("\"Life is tough but birthdays are smooth because I will finally have a chance to smile at you. Happy birthday.\"",R.mipmap.p49));
        birthdayAL.add(new mainfeed("\"May your birthday be full of happy hours and special moments to remember for a long long time!\"",R.mipmap.p50));
        birthdayAL.add(new mainfeed("\"Hugging you don’t need any reason but, if there is a reason, more than one hug is a norm. Happy Birthday!\"",R.mipmap.p51));
        birthdayAL.add(new mainfeed("\"Thank you for all the memories we have. Without you, the world would have been colorless to me.\"",R.mipmap.p52));
        birthdayAL.add(new mainfeed("\"On your birthday friends wish you many things, but I will wish you only two: always and never. Never feel blue and always be happy!\"",R.mipmap.p53));
        birthdayAL.add(new mainfeed("\"With you, it is always about bringing in fun, in more ways than one, come rain come sun, just fun. Happy Birthday!\"",R.mipmap.p54));
        birthdayAL.add(new mainfeed("\"May your birthday mark the beginning of a wonderful period of time in your life!\"",R.mipmap.p55));
        birthdayAL.add(new mainfeed("\"Happy birthday, gorgeous! You are another year older and I just can’t see it. Have a blast! Wishing you the best of the best!\"",R.mipmap.p56));
        birthdayAL.add(new mainfeed("\"What did little birdie say?  Oh! It said it is your birthday today. Happy Birthday my love.\"",R.mipmap.p57));
        birthdayAL.add(new mainfeed("\"Mom, there is no one who can come even closer to your winning ways. Happy Birthday to my great mom.\"",R.mipmap.p58));
        birthdayAL.add(new mainfeed("\"Cheers on your birthday. One step closer to adult underpants.\"",R.mipmap.p58));
        birthdayAL.add(new mainfeed("\"You are only young once, but you can be immature for a lifetime. Happy birthday!\"",R.mipmap.p59));
        birthdayAL.add(new mainfeed("\"We thought we would get the right amount of candles to put on your cake this year, but quickly ran out of space. Happy Birthday!\"",R.mipmap.p60));
        birthdayAL.add(new mainfeed("\"Seeing as I usually forget everyone’s birthdays, you should consider it a miracle that I’m sending you this message. Happy Birthday!\"",R.mipmap.p61));
        birthdayAL.add(new mainfeed("\"Don’t you think it’s about time we grew up a bit and stopped painting the town? I know exactly what you’ll say. Next year. Happy Birthday!\"",R.mipmap.p62));
        birthdayAL.add(new mainfeed("\"Party like it’s 1959, when you could still dance and drink alcohol without ending up you to the hospital.\"",R.mipmap.p63));
        birthdayAL.add(new mainfeed("\"Remember when we stayed up late running from the law? No? Good. I don’t either. Happy Birthday oldie!\"",R.mipmap.p64));
        birthdayAL.add(new mainfeed("\"You’re not old. You’re just old enough to know better and not old enough to care. Happy Birthday!\"",R.mipmap.p65));
        birthdayAL.add(new mainfeed("\"Another year to prove that older doesn’t really mean wiser. Happy birthday!\"",R.mipmap.p66));
        birthdayAL.add(new mainfeed("\"I made a list about the words of wisdom I wanted to give you for your birthday. It’s still blank. Maybe next year.\"",R.mipmap.p67));
        birthdayAL.add(new mainfeed("\"Statistics show that people who live longer have more birthdays, costing us more money for presents!\"",R.mipmap.p68));
        birthdayAL.add(new mainfeed("\"Today is the start of the rest of your life. What? You’re how old. Revise: Today is the start of the oldest part of your life.\"",R.mipmap.p69));
        birthdayAL.add(new mainfeed("\"I’m just coming over for the treat. By the way, many happy returns.\"",R.mipmap.p70));
        birthdayAL.add(new mainfeed("\"Another year to kick your bucket list to the curb.\"",R.mipmap.p71));

        adapter=new QuotesAdapter(getApplicationContext(),birthdayAL);
        birthdayRV.setHasFixedSize(true);
        birthdayRV.setLayoutManager(new LinearLayoutManager(this));
        birthdayRV.setAdapter(adapter);

    }

    private void initUI() {
        birthdayRV=findViewById(R.id.birthdayRV);
    }
}
