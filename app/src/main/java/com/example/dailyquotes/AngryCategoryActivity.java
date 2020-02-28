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

public class AngryCategoryActivity extends AppCompatActivity {

    ArrayList<mainfeed> angryAL=new ArrayList<>();
    QuotesAdapter adapter;
    RecyclerView angryRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angry_category);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        }
        initUI();

        angryAL.add(new mainfeed("\"I shall allow no man to belittle my soul by making me hate him.\"",R.mipmap.p1));
        angryAL.add(new mainfeed("\"There are two things a person should never be angry at, what they can help, and what they cannot.\"",R.mipmap.p2));
        angryAL.add(new mainfeed("\"A man in a passion, rides a mad horse.\"",R.mipmap.p3));
        angryAL.add(new mainfeed("\"Anger is one letter short of danger.\"",R.mipmap.p4));
        angryAL.add(new mainfeed("\"A hand ready to hit, may cause you great trouble.\"",R.mipmap.p5));
        angryAL.add(new mainfeed("\"Where there is anger, there is always pain underneath.\"",R.mipmap.p6));
        angryAL.add(new mainfeed("\"Anger makes you smaller, while forgiveness forces you to grow beyond what you are.\"",R.mipmap.p7));
        angryAL.add(new mainfeed("\"If you are patient in one moment of anger, you will escape a hundred days of sorrow.\"",R.mipmap.p8));
        angryAL.add(new mainfeed("\"You can't shake hands with a clenched fist.\"",R.mipmap.p10));
        angryAL.add(new mainfeed("\"A quarrelsome man has no good neighbours.\"",R.mipmap.p11));
        angryAL.add(new mainfeed("\"Bitterness is like cancer. It eats upon the host. But anger is like fire. It burns it all clean.\"",R.mipmap.p12));
        angryAL.add(new mainfeed("\"Anger is often more hurtful than the injury that caused it.\"",R.mipmap.p13));
        angryAL.add(new mainfeed("\"Beware the fury of a patient man.\"",R.mipmap.p14));
        angryAL.add(new mainfeed("\"Anger ventilated often hurries toward forgiveness; and concealed often hardens into revenge.\"",R.mipmap.p15));
        angryAL.add(new mainfeed("\"He who angers you conquers you.\"",R.mipmap.p16));
        angryAL.add(new mainfeed("\"Anger dwells only in the bosom of fools.\"",R.mipmap.p17));
        angryAL.add(new mainfeed("\"A quick temper will make a fool of you soon enough.\"",R.mipmap.p18));
        angryAL.add(new mainfeed("\"The sharpest sword is a word spoken in wrath.\"",R.mipmap.p19));
        angryAL.add(new mainfeed("\"Not the fastest horse can catch a word spoken in anger.\"",R.mipmap.p33));
        angryAL.add(new mainfeed("\"Fire in the heart sends smoke into the head.\"",R.mipmap.p34));
        angryAL.add(new mainfeed("\"It is wise to direct your anger towards problems — not people; to focus your energies on answers — not excuses.\"",R.mipmap.p35));
        angryAL.add(new mainfeed("\"Anger is a short madness.\"",R.mipmap.p23));
        angryAL.add(new mainfeed("\"Whatever is begun in anger ends in shame.\"",R.mipmap.p24));
        angryAL.add(new mainfeed("\"Anger is never without a reason, but seldom with a good one.\"",R.mipmap.p25));
        angryAL.add(new mainfeed("\"Postpone today's anger until tomorrow.\"",R.mipmap.p26));
        angryAL.add(new mainfeed("\"Anger is what makes a clear mind seem clouded.\"",R.mipmap.p27));
        angryAL.add(new mainfeed("\"Anger ... it's a paralyzing emotion ... you can't get anything done.\"",R.mipmap.p28));
        angryAL.add(new mainfeed("\"Bitter people are not interested in what you say, but what you hide.\"",R.mipmap.p29));
        angryAL.add(new mainfeed("\"Sometimes when I'm angry I have the right to be angry, but that doesn't give me the right to be cruel.\"",R.mipmap.p30));
        angryAL.add(new mainfeed("\"Be leery of silence. It doesn't mean you won the argument. Often, people are just busy reloading their guns.\"",R.mipmap.p31));
        angryAL.add(new mainfeed("\"The greatest remedy for anger is delay.\"",R.mipmap.p32));

        adapter=new QuotesAdapter(getApplicationContext(),angryAL);
        angryRV.setHasFixedSize(true);
        angryRV.setLayoutManager(new LinearLayoutManager(this));
        angryRV.setAdapter(adapter);

    }


    private void initUI() {
        angryRV=findViewById(R.id.angryRV);
    }
}
