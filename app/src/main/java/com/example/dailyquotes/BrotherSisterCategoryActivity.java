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

public class BrotherSisterCategoryActivity extends AppCompatActivity {

    ArrayList<mainfeed> brosisAL=new ArrayList<>();
    QuotesAdapter adapter;
    RecyclerView brosisRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brother_sister_category);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        }
        initUI();

        brosisAL.add(new mainfeed("\"To have a loving relationship with a sister is not simply to have a buddy or a confident -- it is to have a soulmate for life.\"", R.mipmap.p60));
        brosisAL.add(new mainfeed("\"Our brothers and sisters are there with us from the dawn of our personal stories to the inevitable dusk. \"", R.mipmap.p61));
        brosisAL.add(new mainfeed("\"Being his real brother I could feel I live in his shadows, but I never have and I do not now. I live in his glow.\"", R.mipmap.p62));
        brosisAL.add(new mainfeed("\"There is a little boy inside the man who is my brother. Oh, how I hated that little boy, and how I love him too.\"", R.mipmap.p63));
        brosisAL.add(new mainfeed("\"A sibling may be the keeper of one's identity, the only person with the keys to one's unfettered, more fundamental self.\"", R.mipmap.p64));
        brosisAL.add(new mainfeed("\"Siblings: children of the same parents, each of whom is perfectly normal until they get together.\"", R.mipmap.p65));
        brosisAL.add(new mainfeed("\"The mildest, drowsiest sister has been known to turn tiger if her sibling is in trouble.\"", R.mipmap.p66));
        brosisAL.add(new mainfeed("\"The best thing about having a sister was that I always had a friend.\"", R.mipmap.p67));
        brosisAL.add(new mainfeed("\"Having a sister is like having a best friend you can't get rid of. You know whatever you do, they will still be there.\"", R.mipmap.p68));
        brosisAL.add(new mainfeed("\"If thy brother wrongs thee, remember not so much his wrong-doing, but more than ever that he is thy brother.\"", R.mipmap.p69));
        brosisAL.add(new mainfeed("\"My sister and I are so close that we finish each other's sentences and often wonder who's memories belong to whom.\"", R.mipmap.p70));
        brosisAL.add(new mainfeed("\"Brothers and sisters are as close as hands and feet.\"", R.mipmap.p71));
        brosisAL.add(new mainfeed("\"My brother is one of my true heroes. Steady and sober where I am impulsive and emotional.\"", R.mipmap.p72));
        brosisAL.add(new mainfeed("\"After a girl is grown, her little brothers—now her protectors—seem like big brothers.\"", R.mipmap.p73));
        brosisAL.add(new mainfeed("\"A sister is a gift to the heart, a friend to the spirit, a golden thread to the meaning of life.\"", R.mipmap.p74));
        brosisAL.add(new mainfeed("\"Half the time when brothers wrestle, it's just an excuse to hug each other.\"", R.mipmap.p75));
        brosisAL.add(new mainfeed("\"Because brothers don't let each other wander in the dark alone.\"", R.mipmap.p14));
        brosisAL.add(new mainfeed("\"There's no other love like the love for a brother. There's no other love like the love from a brother.\"", R.mipmap.p77));
        brosisAL.add(new mainfeed("\"Brothers and sisters separated by distance, joined by love.\"", R.mipmap.p78));
        brosisAL.add(new mainfeed("\"Sometimes being a brother is even better than being a superhero.  \"", R.mipmap.p79));
        brosisAL.add(new mainfeed("\"A brother may not be a friend, but a friend will always be a brother.\"", R.mipmap.p80));
        brosisAL.add(new mainfeed("\"Sincere art brings us together, the brotherhood and sisterhood of mankind.\"", R.mipmap.p81));
        brosisAL.add(new mainfeed("\"What's the good news if you haven't a sister to share it?\"", R.mipmap.p82));
        brosisAL.add(new mainfeed("\"We came into the world like brother and brother; And now let's go hand in hand, not one before another.\"", R.mipmap.p83));
        brosisAL.add(new mainfeed("\"A brother is a friend God gave you; a friend is a brother your heart chose for you.\"", R.mipmap.p84));
        brosisAL.add(new mainfeed("\"Mum used to say we were the same soul split in two and walking around on four legs.\"", R.mipmap.p85));
        brosisAL.add(new mainfeed("\"Big sisters are the crab grass in the lawn of life.  \"", R.mipmap.p86));
        brosisAL.add(new mainfeed("\"We are part of a great whole. All living things are our brothers and sisters.\"", R.mipmap.p87));
        brosisAL.add(new mainfeed("\"A sister is a little bit of childhood that can never be lost.\"", R.mipmap.p88));
        brosisAL.add(new mainfeed("\"Until blacks and whites see each other as brother and sister, we will not have parity. It's very clear.\"", R.mipmap.p89));
        brosisAL.add(new mainfeed("\"Being sister and brother means being there for each other. \"", R.mipmap.p90));
        brosisAL.add(new mainfeed("\"What are sisters for if not to point out the things the rest of the world is too polite to mention.\"", R.mipmap.p91));
        brosisAL.add(new mainfeed("\"The greatest gift our parents ever gave us was each other.   \"", R.mipmap.p92));
        brosisAL.add(new mainfeed("\"Brothers and sisters are as close as hands and feet.\"", R.mipmap.p93));
        brosisAL.add(new mainfeed("\"What brothers say to tease their sisters has nothing to do with what they really think of them.\"", R.mipmap.p94));
        brosisAL.add(new mainfeed("\"The greatest gift our parents gave us was each other.\"", R.mipmap.p95));
        brosisAL.add(new mainfeed("\"Sisters and brothers just happen, we don’t get to choose them, but they become one of our most cherished relationships.\"", R.mipmap.p96));
        brosisAL.add(new mainfeed("\"We didn’t even realize we were making memories, we just knew we were having fun.\"", R.mipmap.p97));
        brosisAL.add(new mainfeed("\"Brothers are playmates in the beginning and best friends for life.\"", R.mipmap.p98));
        brosisAL.add(new mainfeed("\"We may look old and wish to the outside world, but to each other, we are still in junior school.\"", R.mipmap.p99));

        adapter=new QuotesAdapter(getApplicationContext(),brosisAL);
        brosisRV.setHasFixedSize(true);
        brosisRV.setLayoutManager(new LinearLayoutManager(this));
        brosisRV.setAdapter(adapter);
    }

    private void initUI() {
        brosisRV=findViewById(R.id.brosisRV);
    }
}
