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

public class FamilyCategoryActivity extends AppCompatActivity {

    ArrayList<mainfeed> familyAL=new ArrayList<>();
    QuotesAdapter adapter;
    RecyclerView familyRV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_category);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        }
        initUI();


        familyAL.add(new mainfeed("\"It is not flesh and blood but the heart which makes us fathers and sons.\"",R.mipmap.p6));
        familyAL.add(new mainfeed("\"You don't choose your family. They are God's gift to you, as you are to them.\"",R.mipmap.p16));
        familyAL.add(new mainfeed("\"A father's a treasure; a brother's a comfort; a friend is both. \"",R.mipmap.p26));
        familyAL.add(new mainfeed("\"Home is where you are loved the most and act the worst.\"",R.mipmap.p36));
        familyAL.add(new mainfeed("\"The most important thing a father can do for his children is to love their mother\"",R.mipmap.p46));
        familyAL.add(new mainfeed("\"While we try to teach our children all about life, our children teach us what life is all about.\"",R.mipmap.p56));
        familyAL.add(new mainfeed("\"Bringing up a family should be an adventure, not an anxious discipline in which everybody is constantly graded for performance.  \"",R.mipmap.p66));
        familyAL.add(new mainfeed("\"Be it ever so humble there's no place like home. \"",R.mipmap.p79));
        familyAL.add(new mainfeed("\"Families ties are cherished things, forged in childhood days, by love of parents, deep and true, and sweet familiar ways.\"",R.mipmap.p86));
        familyAL.add(new mainfeed("\"Parents were the only ones obligated to love you; from the rest of the world you had to earn it.    \"",R.mipmap.p7));
        familyAL.add(new mainfeed("\"The strength of a nation derives from the integrity of the home.\"",R.mipmap.p17));
        familyAL.add(new mainfeed("\"A mother is not a person to lean on, but a person to make leaning unnecessary.\"",R.mipmap.p27));
        familyAL.add(new mainfeed("\"Having children makes you no more a parent than having a piano makes you a pianist.\"",R.mipmap.p37));
        familyAL.add(new mainfeed("\"An ounce of blood is worth more than a pound of friendship.\"",R.mipmap.p47));
        familyAL.add(new mainfeed("\"The best inheritance a parent can give to his children is a few minutes of their time each day.  \"",R.mipmap.p57));
        familyAL.add(new mainfeed("\"A daughter without her mother is a woman broken. It is a loss that turns to arthritis and settles deep into her bones.\"",R.mipmap.p67));
        familyAL.add(new mainfeed("\"The children despise their parents until the age of when they suddenly become just like them - thus preserving the system.\"",R.mipmap.p77));
        familyAL.add(new mainfeed("\"The informality of family life is a blessed condition that allows us to become our best while looking our worst.\"",R.mipmap.p87));
        familyAL.add(new mainfeed("\"We cannot destroy kindred: our chains stretch a little sometimes, but they never break.\"",R.mipmap.p8));
        familyAL.add(new mainfeed("\"This was the trouble with families. Like invidious doctors, they knew just where it hurt.\"",R.mipmap.p18));
        familyAL.add(new mainfeed("\"Home is people. Not a place. If you go back there after the people are gone, then all you can see is what is not there any more.\"",R.mipmap.p28));
        familyAL.add(new mainfeed("\"A house divided cannot stand. \"",R.mipmap.p31));
        familyAL.add(new mainfeed("\"Home is where the heart is.\"",R.mipmap.p48));
        familyAL.add(new mainfeed("\"When you educate a man you educate an individual. When you educate a woman you educate a whole family.\"",R.mipmap.p58));
        familyAL.add(new mainfeed("\"In family life, love is the oil that eases friction, the cement that binds closer together, and the music that brings harmony.\"",R.mipmap.p68));
        familyAL.add(new mainfeed("\"The love of a family is life's greatest blessing.\"",R.mipmap.p78));
        familyAL.add(new mainfeed("\"To us, family means putting your arms around each other and being there.\"",R.mipmap.p88));
        familyAL.add(new mainfeed("\"Family love is messy, clinging, and of an annoying and repetitive pattern, like bad wallpaper\"",R.mipmap.p1));
        familyAL.add(new mainfeed("\"Like father, like son.\"",R.mipmap.p2));
        familyAL.add(new mainfeed("\"The love of family and the admiration of friends is much more important than wealth and privilege.\"",R.mipmap.p3));
        familyAL.add(new mainfeed("\"I sustain myself with the love of family. \"",R.mipmap.p4));
        familyAL.add(new mainfeed("\"The world, we'd discovered, doesn't love you like your family loves you.   \"",R.mipmap.p5));
        familyAL.add(new mainfeed("\"At the end of the day, a loving family should find everything forgivable.  \"",R.mipmap.p6));
        familyAL.add(new mainfeed("\"Family comes first. In a world full of unknown faces which do not care, the family comes in with all the love that there is to be found.\"",R.mipmap.p7));
        familyAL.add(new mainfeed("\"The most important thing a father can do for his children is to love their mother.\"",R.mipmap.p8));
        familyAL.add(new mainfeed("\"A family can develop only with a loving woman as its center.\"",R.mipmap.p9));
        familyAL.add(new mainfeed("\"There is no friendship, no love, like that of the parent for the child. \"",R.mipmap.p10));
        familyAL.add(new mainfeed("\"The love of the family, the love of the person can heal. It heals the scars left by a larger society. A massive, powerful society.\"",R.mipmap.p11));
        familyAL.add(new mainfeed("\"It didn't matter how big our house was; it mattered that there was love in it.\"",R.mipmap.p12));
        familyAL.add(new mainfeed("\"The only people that you really have, that I learned, are your family, because they love you no matter what.\"",R.mipmap.p13));

        adapter=new QuotesAdapter(getApplicationContext(),familyAL);
        familyRV.setHasFixedSize(true);
        familyRV.setLayoutManager(new LinearLayoutManager(this));
        familyRV.setAdapter(adapter);
    }

    private void initUI() {
        familyRV=findViewById(R.id.familyRV);
    }
}
