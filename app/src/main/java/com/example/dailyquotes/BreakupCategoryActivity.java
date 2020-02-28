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

public class BreakupCategoryActivity extends AppCompatActivity {

    ArrayList<mainfeed> breakupAL = new ArrayList<>();
    QuotesAdapter adapter;
    RecyclerView breakupRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakup_category);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        }
        initUI();

        breakupAL.add(new mainfeed("\" Truth is everybody is going to hurt you:you just gotta find the ones worth suffering\"", R.mipmap.p31));
        breakupAL.add(new mainfeed("\"Nobody can hurt me without my permission.\"", R.mipmap.p32));
        breakupAL.add(new mainfeed("\"I have learned now that while those who speak about one's miseries usually hurt, those who keep silence hurt more.\"", R.mipmap.p33));
        breakupAL.add(new mainfeed("\"Just because one person's problem is less traumatic than another's doesn't mean they're required to hurt less \"", R.mipmap.p34));
        breakupAL.add(new mainfeed("\"Those who really love you don't mean to hurt you and if they do, you can't see it in their eyes but it hurts them too.\"", R.mipmap.p35));
        breakupAL.add(new mainfeed("\"It is when we hurt that we learn.  \"", R.mipmap.p36));
        breakupAL.add(new mainfeed("\"The surest way to hurt yourself is to give up on love, just because it didn't work out the first time.\"", R.mipmap.p12));
        breakupAL.add(new mainfeed("\"Just because somebody is strong enough to handle pain doesn't mean they deserve it.\"", R.mipmap.p37));
        breakupAL.add(new mainfeed("\"You don't get to choose if you get hurt in this world. But you do have some say in who hurts you.\"", R.mipmap.p39));
        breakupAL.add(new mainfeed("\"Do you know the feeling, when your heart is so hurt, that you could feel the blood dripping?\"", R.mipmap.p40));
        breakupAL.add(new mainfeed("\"Being hurt by someone you truly care about leaves a hole in you heart that only love can fill.\"", R.mipmap.p41));
        breakupAL.add(new mainfeed("\"Being brokenhearted is like having broken ribs. On the outside it looks like nothing's wrong, but every breath hurts.\"", R.mipmap.p42));
        breakupAL.add(new mainfeed("\"He who lives long knows what pain is.\"", R.mipmap.p43));
        breakupAL.add(new mainfeed("\"True pain cannot be concealed.  \"", R.mipmap.p44));
        breakupAL.add(new mainfeed("\"A man can sleep on every hurt but his own.\"", R.mipmap.p45));
        breakupAL.add(new mainfeed("\"The least and weakest man can do some hurt.\"", R.mipmap.p46));
        breakupAL.add(new mainfeed("\"‘Tis easier to hurt than heal. \"", R.mipmap.p47));
        breakupAL.add(new mainfeed("\"When you are dressing a wound, pain is pain’s medicine.\"", R.mipmap.p48));
        breakupAL.add(new mainfeed("\"From hurt comes pain, from pain comes change. If it hurts enough, change will happen.\"", R.mipmap.p49));
        breakupAL.add(new mainfeed("\"Pain is only bearable if we know it will end, not if we deny it exists.\"", R.mipmap.p50));
        breakupAL.add(new mainfeed("\"To have a body is to suffer.\"", R.mipmap.p51));
        breakupAL.add(new mainfeed("\"Better to have pain than paralysis. \"", R.mipmap.p52));
        breakupAL.add(new mainfeed("\"Love means exposing yourself to the pains of being hurt, deeply hurt by someone you trust.\"", R.mipmap.p53));
        breakupAL.add(new mainfeed("\"A person in pain is being spoken to by that part of himself that knows only how to communicate this way. \"", R.mipmap.p54));
        breakupAL.add(new mainfeed("\"Pain is what we’re in most of the time. And I think the bigger the pain the more gods we need.\"", R.mipmap.p55));
        breakupAL.add(new mainfeed("\"The reason it hurts so much to separate is because our souls are connected.  \"", R.mipmap.p56));
        breakupAL.add(new mainfeed("\"It hurts to have someone in your heart that you can't have in your arms.\"", R.mipmap.p57));
        breakupAL.add(new mainfeed("\"I still own my heart, which I know because it hurts so much.\"", R.mipmap.p58));
        breakupAL.add(new mainfeed("\"If someone really wants to hurt you, they'll find a way whatever. I don't want to live my life worrying about it.\"", R.mipmap.p59));
        breakupAL.add(new mainfeed("\"It doesn't hurt to feel sad from time to time.\"", R.mipmap.p60));
        breakupAL.add(new mainfeed("\"That old saying, how you always hurt the one you love, well, it works both ways\"", R.mipmap.p61));
        breakupAL.add(new mainfeed("\"It's a lot easier to be angry at someone than it is to tell them you're hurt.\"", R.mipmap.p62));
        breakupAL.add(new mainfeed("\"A torn jacket is soon mended, but hard words bruise the heart of a child.\"", R.mipmap.p63));
        breakupAL.add(new mainfeed("\"When someone stabs you it's not your fault that you feel pain.\"", R.mipmap.p64));
        breakupAL.add(new mainfeed("\"Forget what hurt you in the past, but never forget what it taught you.\"", R.mipmap.p65));
        breakupAL.add(new mainfeed("\"Two barrels of tears will not heal a bruise.\"", R.mipmap.p66));
        breakupAL.add(new mainfeed("\"I can feel the hurt. There's something good about it. Mostly it makes me stop remembering.\"", R.mipmap.p67));
        breakupAL.add(new mainfeed("\"He who is or has been deeply hurt has a RIGHT to be sure he is LOVED.\"", R.mipmap.p68));
        breakupAL.add(new mainfeed("\"If you're in trouble, or hurt or need -- go to the poor people. They're the only ones that'll help -- the only ones.\"", R.mipmap.p69));
        breakupAL.add(new mainfeed("\"What hurts us is what heals us.\"", R.mipmap.p70));

        adapter = new QuotesAdapter(getApplicationContext(), breakupAL);
        breakupRV.setHasFixedSize(true);
        breakupRV.setLayoutManager(new LinearLayoutManager(this));
        breakupRV.setAdapter(adapter);

    }

    private void initUI() {
        breakupRV = findViewById(R.id.breakupRV);
    }
}
