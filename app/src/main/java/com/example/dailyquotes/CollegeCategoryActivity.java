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

public class CollegeCategoryActivity extends AppCompatActivity {

    ArrayList<mainfeed> collegeAL=new ArrayList<>();
    QuotesAdapter adapter;
    RecyclerView collegeRV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_college_category);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        }
        initUI();


        collegeAL.add(new mainfeed("\"When we make college more affordable, we make the American dream more achievable.\"",R.mipmap.p10));
        collegeAL.add(new mainfeed("\"College is fun as long as you don't die.\"",R.mipmap.p11));
        collegeAL.add(new mainfeed("\"I'm going to college. I don't care if it ruins my career. I'd rather be smart than a movie star.\"",R.mipmap.p12));
        collegeAL.add(new mainfeed("\"Every year, many, many stupid people graduate from college. And if they can do it, so can you.\"",R.mipmap.p13));
        collegeAL.add(new mainfeed("\"College is a refuge from hasty judgment.\"",R.mipmap.p14));
        collegeAL.add(new mainfeed("\"No period of my life has been one of such unmixed happiness as the four years which have been spent within college walls.\"",R.mipmap.p15));
        collegeAL.add(new mainfeed("\"I think, especially when you're in college, each book that you're reading tends to tell you who you are. \"",R.mipmap.p16));
        collegeAL.add(new mainfeed("\"College isn't the place to go for ideas.\"",R.mipmap.p17));
        collegeAL.add(new mainfeed("\"It is virtually impossible to compete in today's global economy without a college degree.\"",R.mipmap.p18));
        collegeAL.add(new mainfeed("\"College has given me the confidence I need to fail.\"",R.mipmap.p19));
        collegeAL.add(new mainfeed("\"If the college you visit has a bookstore filled with t-shirts rather than books, find another college.\"",R.mipmap.p45));
        collegeAL.add(new mainfeed("\"College campuses were once a hotbed of political activity.\"",R.mipmap.p46));
        collegeAL.add(new mainfeed("\"The things taught in schools and colleges are not an education, but the means to an education. \"",R.mipmap.p47));
        collegeAL.add(new mainfeed("\"A college education shows a man how little other people know.\"",R.mipmap.p23));
        collegeAL.add(new mainfeed("\"College is a place to keep warm between high school and an early marriage.\"",R.mipmap.p24));
        collegeAL.add(new mainfeed("\"College is like a fountain of knowledge - and the students are there to drink\"",R.mipmap.p25));
        collegeAL.add(new mainfeed("\"One of the great mind destroyers of college education is the belief that if it's very complex, it's very profound.\"",R.mipmap.p26));
        collegeAL.add(new mainfeed("\"Our colleges ought to have lit up in us a lasting relish for he better kind of man, a loss of appetite for mediocrities\"",R.mipmap.p27));
        collegeAL.add(new mainfeed("\"What school, college, or lecture bring men depends on what men bring to carry it home in. \"",R.mipmap.p28));
        collegeAL.add(new mainfeed("\"One of the benefits of a college education is to show the boy its little avail.\"",R.mipmap.p29));
        collegeAL.add(new mainfeed("\"Colleges don't make fools, they only develop them.\"",R.mipmap.p30));
        collegeAL.add(new mainfeed("\"Colleges are places where pebbles are polished and diamonds are dimmed.\"",R.mipmap.p31));
        collegeAL.add(new mainfeed("\"The aim of a college education is to teach you to know a good man when you see one. \"",R.mipmap.p32));
        collegeAL.add(new mainfeed("\"College ain't so much where you been as how you talk when you get back.\"",R.mipmap.p33));
        collegeAL.add(new mainfeed("\"A college education should equip one to entertain three things: a friend, an idea and oneself.\"",R.mipmap.p34));
        collegeAL.add(new mainfeed("\"So if a college education is indispensable, the challenge as I see it is how to make it more accessible. \"",R.mipmap.p35));
        collegeAL.add(new mainfeed("\"I accidentally forgot to graduate from college.\"",R.mipmap.p36));
        collegeAL.add(new mainfeed("\"The college graduate is presented with a sheepskin to cover his intellectual nakedness.  \"",R.mipmap.p37));
        collegeAL.add(new mainfeed("\"A college degree is not a sign that one is a finished product but an indication a person is prepared for life.  \"",R.mipmap.p88));
        collegeAL.add(new mainfeed("\"Colleges are like old age homes, except for the fact that more people die in colleges.\"",R.mipmap.p39));
        collegeAL.add(new mainfeed("\"I think a college education is important no matter what you do in life.\"",R.mipmap.p40));
        collegeAL.add(new mainfeed("\"College inspired me to think differently. It's like no other time in your life.\"",R.mipmap.p41));
        collegeAL.add(new mainfeed("\"Fathers send their sons to college either because they went to college or because they didn't.\"",R.mipmap.p42));
        collegeAL.add(new mainfeed("\"The chief value in going to college is that it's the only way to learn it really doesn't matter.\"",R.mipmap.p43));
        collegeAL.add(new mainfeed("\"Third Law of Applied Terror - 80% of the final exam will be based on the one lecture you missed and the one book you didn't read. \"",R.mipmap.p44));
        collegeAL.add(new mainfeed("\"College is the reward for surviving high school.\"",R.mipmap.p45));
        collegeAL.add(new mainfeed("\"Some people get an education without going to college. The rest get it after they get out.\"",R.mipmap.p46));
        collegeAL.add(new mainfeed("\"A mind is a fire to be kindled, not a vessel to be filled.\"",R.mipmap.p47));
        collegeAL.add(new mainfeed("\"College inspired me to think differently. It's like no other time in your life.\"",R.mipmap.p48));
        collegeAL.add(new mainfeed("\"An investment in knowledge always pays the best interest.\"",R.mipmap.p49));

        adapter=new QuotesAdapter(getApplicationContext(),collegeAL);
        collegeRV.setHasFixedSize(true);
        collegeRV.setLayoutManager(new LinearLayoutManager(this));
        collegeRV.setAdapter(adapter);
    }

    private void initUI() {
        collegeRV=findViewById(R.id.collegeRV);
    }
}
