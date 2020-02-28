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


        loveAL.add(new mainfeed("\"In the arithmetic of love, one plus one equals everything, and two minus one equals nothing.\"",R.mipmap.p80));
        loveAL.add(new mainfeed("\"Love is a fabric which never fades, no matter how often it is washed in the water of adversity and grief.\"",R.mipmap.p81));
        loveAL.add(new mainfeed("\"If I were pressed to say why I loved him, I feel that my only reply could be: 'Because it was he, because it was I'.  \"",R.mipmap.p82));
        loveAL.add(new mainfeed("\"At the touch of love, everyone becomes a poet.\"",R.mipmap.p83));
        loveAL.add(new mainfeed("\"The best and most beautiful things in the world cannot be seen nor even touched, but just felt in the heart.\"",R.mipmap.p84));
        loveAL.add(new mainfeed("\"Love is a canvas furnished by Nature and embroidered by imagination.    \"",R.mipmap.p85));
        loveAL.add(new mainfeed("\"Sometimes the heart sees what is invisible to the eye. \"",R.mipmap.p86));
        loveAL.add(new mainfeed("\"Love is a fruit in season at all times, and within reach of every hand.\"",R.mipmap.p87));
        loveAL.add(new mainfeed("\"Absence is to love as wind is to fire; it extinguishes the small and enkindles the great. \"",R.mipmap.p88));
        loveAL.add(new mainfeed("\"I love you more than yesterday, less than tomorrow.\"",R.mipmap.p89));
        loveAL.add(new mainfeed("\"Everything is clearer when you're in love. \"",R.mipmap.p90));
        loveAL.add(new mainfeed("\"If a thing loves, it is infinite.   \"",R.mipmap.p91));
        loveAL.add(new mainfeed("\"Love is when the other person's happiness is more important than your own.  \"",R.mipmap.p92));
        loveAL.add(new mainfeed("\"He who wants to do good, knocks at the gate; he who loves finds the gates open.  \"",R.mipmap.p93));
        loveAL.add(new mainfeed("\"Love is composed of a single soul inhabiting two bodies.\"",R.mipmap.p94));
        loveAL.add(new mainfeed("\"And even so, what happiness to be loved! And, oh you gods, what happiness it is to love! \"",R.mipmap.p95));
        loveAL.add(new mainfeed("\"Love is like the wind, you can't see it but you can feel it.\"",R.mipmap.p96));
        loveAL.add(new mainfeed("\"What is irritating about love is that it is a crime that requires an accomplice.   \"",R.mipmap.p97));
        loveAL.add(new mainfeed("\"Love doesn't make the world go 'round. Love is what makes the ride worthwhile. \"",R.mipmap.p98));
        loveAL.add(new mainfeed("\"Never pretend to a love which you do not actually feel, for love is not ours to command.\"",R.mipmap.p99));
        loveAL.add(new mainfeed("\"There is only one happiness in life -- to love and to be loved.\"",R.mipmap.p1));
        loveAL.add(new mainfeed("\"Even when love isn't enough, somehow it is.\"",R.mipmap.p2));
        loveAL.add(new mainfeed("\"Love is like an hourglass, with the heart filling up as the brain empties.   \"",R.mipmap.p3));
        loveAL.add(new mainfeed("\"The best and most beautiful things in this world cannot be seen or even heard, but must be felt with the heart.\"",R.mipmap.p4));
        loveAL.add(new mainfeed("\"Absence sharpens love, presence strengthens it.\"",R.mipmap.p5));
        loveAL.add(new mainfeed("\"We are most alive when we're in love. \"",R.mipmap.p6));
        loveAL.add(new mainfeed("\"Love is like quicksilver in the hand. Leave the fingers open and it stays. Clutch it, and it darts away.\"",R.mipmap.p7));
        loveAL.add(new mainfeed("\"Love is the joy of the good, the wonder of the wise, the amazement of the Gods.\"",R.mipmap.p8));
        loveAL.add(new mainfeed("\"I shall be great and you rich, because we love each other.\"",R.mipmap.p9));
        loveAL.add(new mainfeed("\"Love is like war: easy to begin but very hard to stop. \"",R.mipmap.p10));
        loveAL.add(new mainfeed("\"Love is the only sane and satisfactory answer to the problem of human existence. \"",R.mipmap.p11));
        loveAL.add(new mainfeed("\"Love is something eternal; the aspect may change, but not the essence.\"",R.mipmap.p12));
        loveAL.add(new mainfeed("\"Absence makes the heart grow fonder.\"",R.mipmap.p13));
        loveAL.add(new mainfeed("\"Love has unbound my limbs and set me shaking, a monster bitter sweet and my unmaking.\"",R.mipmap.p14));
        loveAL.add(new mainfeed("\"Love is of all passions the strongest, for it attacks simultaneously the head, the heart and the senses.  \"",R.mipmap.p15));
        loveAL.add(new mainfeed("\"Love has unbound my limbs and set me shaking, a monster bitter sweet and my unmaking.\"",R.mipmap.p16));
        loveAL.add(new mainfeed("\"Love is a fire. But whether it is going to warm your hearth or burn down your house, you can never tell.\"",R.mipmap.p17));
        loveAL.add(new mainfeed("\"Love is to love someone for who they are, who they were, and who they will be.    \"",R.mipmap.p18));
        loveAL.add(new mainfeed("\"To love is nothing. To be loved is something. But to love and be loved, that's everything. \"",R.mipmap.p19));
        loveAL.add(new mainfeed("\"Love is an act of endless forgiveness, a tender look which becomes a habit. \"",R.mipmap.p77));

        adapter=new QuotesAdapter(getApplicationContext(),loveAL);
        loveRV.setLayoutManager(new LinearLayoutManager(this));
        loveRV.setHasFixedSize(true);
        loveRV.setAdapter(adapter);
    }

    private void initUI() {
        loveRV=findViewById(R.id.loveRV);
    }
}
