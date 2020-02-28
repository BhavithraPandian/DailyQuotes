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

public class FriendCategoryActivity extends AppCompatActivity {

    ArrayList<mainfeed> friendAL=new ArrayList<>();
    QuotesAdapter adapter;
    RecyclerView friendRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_category);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        }
        initUI();

        friendAL.add(new mainfeed("\"The wise man learns more from his enemies than the fool does from his friends. \"",R.mipmap.p40));
        friendAL.add(new mainfeed("\"A real friend is one who walks in when the rest of the world walks out.\"",R.mipmap.p41));
        friendAL.add(new mainfeed("\"Misfortune tests the sincerity of friends.\"",R.mipmap.p42));
        friendAL.add(new mainfeed("\"The most beautiful discovery true friends make is that they can grow separately without growing apart.\"",R.mipmap.p43));
        friendAL.add(new mainfeed("\"Who is mighty? He who makes an enemy into a friend. \"",R.mipmap.p44));
        friendAL.add(new mainfeed("\"Keep your friendships in repair.  \"",R.mipmap.p45));
        friendAL.add(new mainfeed("\"Friendship is always a sweet responsibility, never an opportunity.  \"",R.mipmap.p46));
        friendAL.add(new mainfeed("\"Friendship is the only cement that will ever hold the world together.\"",R.mipmap.p47));
        friendAL.add(new mainfeed("\"Most of us don't need a psychiatric therapist as much as a friend to be silly with. \"",R.mipmap.p48));
        friendAL.add(new mainfeed("\"The language of friendship is not words but meanings.\"",R.mipmap.p49));
        friendAL.add(new mainfeed("\"I would rather walk with a friend in the dark, than alone in the light.\"",R.mipmap.p50));
        friendAL.add(new mainfeed("\"Friends are God's way of taking care of us.\"",R.mipmap.p51));
        friendAL.add(new mainfeed("\"A true friend is the best Possession.\"",R.mipmap.p52));
        friendAL.add(new mainfeed("\"Friendship increases by visiting friends but visiting seldom. \"",R.mipmap.p53));
        friendAL.add(new mainfeed("\"Friendship is one mind in two bodies. \"",R.mipmap.p54));
        friendAL.add(new mainfeed("\"Keep your friends close, your enemies even closer. \"",R.mipmap.p55));
        friendAL.add(new mainfeed("\"Make a friend when you don't need one. \"",R.mipmap.p56));
        friendAL.add(new mainfeed("\"The wolf and the dog agree, at the expense of the goat which together they eat.   \"",R.mipmap.p57));
        friendAL.add(new mainfeed("\"You never really know your friends from your enemies until the ice breaks.\"",R.mipmap.p58));
        friendAL.add(new mainfeed("\"Friendship is born at that moment when one man says to another: What! You too? I thought that no one but myself . . .  \"",R.mipmap.p59));
        friendAL.add(new mainfeed("\"One enemy is too many and a hundred friends too few.\"",R.mipmap.p60));
        friendAL.add(new mainfeed("\"There are some people in life that make you laugh a little louder, smile a little bigger, and live just a little bit better.\"",R.mipmap.p61));
        friendAL.add(new mainfeed("\"It's the friends you can call up at 4 a.m. that matter.\"",R.mipmap.p62));
        friendAL.add(new mainfeed("\"Good friends help you find important things when you have lost them. Your smile, you hope, and your courage.\"",R.mipmap.p63));
        friendAL.add(new mainfeed("\"Don't walk behind me; I may not lead. Don't walk in front of me; I may not follow. Just walk beside me and be my friend.\"",R.mipmap.p64));
        friendAL.add(new mainfeed("\"The road to a friend's house is never long.  \"",R.mipmap.p65));
        friendAL.add(new mainfeed("\"True friendship comes when the silence between two people is comfortable.\"",R.mipmap.p66));
        friendAL.add(new mainfeed("\"Friendship consists in forgetting what one gives and remembering what one receives.\"",R.mipmap.p67));
        friendAL.add(new mainfeed("\"Little friends may prove great friends.   \"",R.mipmap.p68));
        friendAL.add(new mainfeed("\"I don't need a friend who changes when I change and who nods when I nod; my shadow does that much better.\"",R.mipmap.p69));
        friendAL.add(new mainfeed("\"Friendship isn't a big thing it's a million little things.\"",R.mipmap.p70));
        friendAL.add(new mainfeed("\"The truth is, everyone is going to hurt you. You just got to find the ones worth suffering for. \"",R.mipmap.p71));
        friendAL.add(new mainfeed("\"The best mirror is an old friend.\"",R.mipmap.p72));
        friendAL.add(new mainfeed("\"It’s not that diamonds are a girl’s best friend, but it’s your best friends who are your diamonds.\"",R.mipmap.p73));
        friendAL.add(new mainfeed("\"For good times and bad times / I'll be on your side forever more / That's what friends are for.   \"",R.mipmap.p74));
        friendAL.add(new mainfeed("\"Friends show their love in times of trouble, not in happiness. \"",R.mipmap.p75));
        friendAL.add(new mainfeed("\"[Friends are] God’s apology for relations.  \"",R.mipmap.p6));
        friendAL.add(new mainfeed("\"A friend is one who overlooks your broken fence and admires the flowers in the garden.   \"",R.mipmap.p77));
        friendAL.add(new mainfeed("\"\"",R.mipmap.p78));
        friendAL.add(new mainfeed("\"\"",R.mipmap.p79));

        adapter=new QuotesAdapter(getApplicationContext(),friendAL);
        friendRV.setHasFixedSize(true);
        friendRV.setLayoutManager(new LinearLayoutManager(this));
        friendRV.setAdapter(adapter);
    }

    private void initUI() {
        friendRV=findViewById(R.id.friendRV);
    }
}
