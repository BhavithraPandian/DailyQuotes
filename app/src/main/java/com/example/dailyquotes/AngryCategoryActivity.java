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

        angryAL.add(new mainfeed("I shall allow no man to belittle my soul by making me hate him.",R.mipmap.angry_l1));
        angryAL.add(new mainfeed("There are two things a person should never be angry at, what they can help, and what they cannot.",R.mipmap.angry_l2));
        angryAL.add(new mainfeed("A man in a passion, rides a mad horse.",R.mipmap.angry_l3));
        angryAL.add(new mainfeed("Anger is one letter short of danger.",R.mipmap.angry_l4));
        angryAL.add(new mainfeed("A hand ready to hit, may cause you great trouble. ",R.mipmap.angry_l6));
        angryAL.add(new mainfeed("Where there is anger, there is always pain underneath. ",R.mipmap.angry_l7));
        angryAL.add(new mainfeed("Anger makes you smaller, while forgiveness forces you to grow beyond what you are. ",R.mipmap.aa));
        angryAL.add(new mainfeed("If you are patient in one moment of anger, you will escape a hundred days of sorrow.  ",R.mipmap.aa));
        angryAL.add(new mainfeed("You can't shake hands with a clenched fist.",R.mipmap.aa));
        angryAL.add(new mainfeed("A quarrelsome man has no good neighbours. ",R.mipmap.aa));
        angryAL.add(new mainfeed("Bitterness is like cancer. It eats upon the host. But anger is like fire. It burns it all clean.",R.mipmap.aa));
        angryAL.add(new mainfeed("Anger is often more hurtful than the injury that caused it.  ",R.mipmap.aa));
        angryAL.add(new mainfeed("Beware the fury of a patient man.",R.mipmap.aa));
        angryAL.add(new mainfeed("Anger ventilated often hurries toward forgiveness; and concealed often hardens into revenge.",R.mipmap.aa));
        angryAL.add(new mainfeed("He who angers you conquers you.",R.mipmap.aa));
        angryAL.add(new mainfeed("Anger dwells only in the bosom of fools. ",R.mipmap.aa));
        angryAL.add(new mainfeed("A quick temper will make a fool of you soon enough.",R.mipmap.aa));
        angryAL.add(new mainfeed("The sharpest sword is a word spoken in wrath.",R.mipmap.aa));
        angryAL.add(new mainfeed("Not the fastest horse can catch a word spoken in anger.",R.mipmap.aa));
        angryAL.add(new mainfeed("Fire in the heart sends smoke into the head. ",R.mipmap.aa));
        angryAL.add(new mainfeed("It is wise to direct your anger towards problems — not people; to focus your energies on answers — not excuses. ",R.mipmap.aa));
        angryAL.add(new mainfeed("Anger is a short madness.",R.mipmap.aa));
        angryAL.add(new mainfeed("Whatever is begun in anger ends in shame. ",R.mipmap.aa));
        angryAL.add(new mainfeed("Anger is never without a reason, but seldom with a good one. ",R.mipmap.aa));
        angryAL.add(new mainfeed("Postpone today's anger until tomorrow. ",R.mipmap.aa));
        angryAL.add(new mainfeed("Anger is what makes a clear mind seem clouded. ",R.mipmap.aa));
        angryAL.add(new mainfeed("Anger ... it's a paralyzing emotion ... you can't get anything done.   ",R.mipmap.aa));
        angryAL.add(new mainfeed("Bitter people are not interested in what you say, but what you hide.",R.mipmap.aa));
        angryAL.add(new mainfeed("Sometimes when I'm angry I have the right to be angry, but that doesn't give me the right to be cruel. ",R.mipmap.aa));
        angryAL.add(new mainfeed("Be leery of silence. It doesn't mean you won the argument. Often, people are just busy reloading their guns. ",R.mipmap.aa));
        angryAL.add(new mainfeed("The greatest remedy for anger is delay.  ",R.mipmap.aa));

        adapter=new QuotesAdapter(getApplicationContext(),angryAL);
        angryRV.setHasFixedSize(true);
        angryRV.setLayoutManager(new LinearLayoutManager(this));
        angryRV.setAdapter(adapter);

    }


    private void initUI() {
        angryRV=findViewById(R.id.angryRV);
    }
}
