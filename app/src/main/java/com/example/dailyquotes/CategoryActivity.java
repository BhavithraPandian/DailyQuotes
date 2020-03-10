package com.example.dailyquotes;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dailyquotes.Adapter.QuotesAdapter;
import com.example.dailyquotes.Fragments.SearchFragment;
import com.example.dailyquotes.Models.mainfeed;

import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity {

    ArrayList<mainfeed> categoryAL = new ArrayList<>();
    QuotesAdapter adapter;
    RecyclerView categoryRV;
    ImageView backIV;
    TextView headerTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        }
        initUI();

       backIV.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               onBackPressed();
           }
       });

        Intent intent = getIntent();
        String key = intent.getStringExtra("key");

        if (key.equals("Angry")) {

            headerTV.setText("Angry");

            categoryAL.add(new mainfeed("\"I shall allow no man to belittle my soul by making me hate him.\"", R.mipmap.p1));
            categoryAL.add(new mainfeed("\"There are two things a person should never be angry at, what they can help, and what they cannot.\"", R.mipmap.p2));
            categoryAL.add(new mainfeed("\"A man in a passion, rides a mad horse.\"", R.mipmap.p3));
            categoryAL.add(new mainfeed("\"Anger is one letter short of danger.\"", R.mipmap.p4));
            categoryAL.add(new mainfeed("\"A hand ready to hit, may cause you great trouble.\"", R.mipmap.p5));
            categoryAL.add(new mainfeed("\"Where there is anger, there is always pain underneath.\"", R.mipmap.p6));
            categoryAL.add(new mainfeed("\"Anger makes you smaller, while forgiveness forces you to grow beyond what you are.\"", R.mipmap.p7));
            categoryAL.add(new mainfeed("\"If you are patient in one moment of anger, you will escape a hundred days of sorrow.\"", R.mipmap.p8));
            categoryAL.add(new mainfeed("\"You can't shake hands with a clenched fist.\"", R.mipmap.p10));
            categoryAL.add(new mainfeed("\"A quarrelsome man has no good neighbours.\"", R.mipmap.p11));
            categoryAL.add(new mainfeed("\"Bitterness is like cancer. It eats upon the host. But anger is like fire. It burns it all clean.\"", R.mipmap.p12));
            categoryAL.add(new mainfeed("\"Anger is often more hurtful than the injury that caused it.\"", R.mipmap.p13));
            categoryAL.add(new mainfeed("\"Beware the fury of a patient man.\"", R.mipmap.p14));
            categoryAL.add(new mainfeed("\"Anger ventilated often hurries toward forgiveness; and concealed often hardens into revenge.\"", R.mipmap.p15));
            categoryAL.add(new mainfeed("\"He who angers you conquers you.\"", R.mipmap.p16));
            categoryAL.add(new mainfeed("\"Anger dwells only in the bosom of fools.\"", R.mipmap.p17));
            categoryAL.add(new mainfeed("\"A quick temper will make a fool of you soon enough.\"", R.mipmap.p18));
            categoryAL.add(new mainfeed("\"The sharpest sword is a word spoken in wrath.\"", R.mipmap.p19));
            categoryAL.add(new mainfeed("\"Not the fastest horse can catch a word spoken in anger.\"", R.mipmap.p33));
            categoryAL.add(new mainfeed("\"Fire in the heart sends smoke into the head.\"", R.mipmap.p34));
            categoryAL.add(new mainfeed("\"It is wise to direct your anger towards problems — not people; to focus your energies on answers — not excuses.\"", R.mipmap.p35));
            categoryAL.add(new mainfeed("\"Anger is a short madness.\"", R.mipmap.p23));
            categoryAL.add(new mainfeed("\"Whatever is begun in anger ends in shame.\"", R.mipmap.p24));
            categoryAL.add(new mainfeed("\"Anger is never without a reason, but seldom with a good one.\"", R.mipmap.p25));
            categoryAL.add(new mainfeed("\"Postpone today's anger until tomorrow.\"", R.mipmap.p26));
            categoryAL.add(new mainfeed("\"Anger is what makes a clear mind seem clouded.\"", R.mipmap.p27));
            categoryAL.add(new mainfeed("\"Anger ... it's a paralyzing emotion ... you can't get anything done.\"", R.mipmap.p28));
            categoryAL.add(new mainfeed("\"Bitter people are not interested in what you say, but what you hide.\"", R.mipmap.p29));
            categoryAL.add(new mainfeed("\"Sometimes when I'm angry I have the right to be angry, but that doesn't give me the right to be cruel.\"", R.mipmap.p30));
            categoryAL.add(new mainfeed("\"Be leery of silence. It doesn't mean you won the argument. Often, people are just busy reloading their guns.\"", R.mipmap.p31));
            categoryAL.add(new mainfeed("\"The greatest remedy for anger is delay.\"", R.mipmap.p32));


        } else if (key.equals("Birthday")) {

            headerTV.setText("Birthday");

            categoryAL.add(new mainfeed("\"Happy birthday! May your Facebook wall be filled with messages from people you never talk to\"", R.mipmap.p33));
            categoryAL.add(new mainfeed("\"I hope your special day will bring you lots of happiness, love, and fun. You deserve them a lot. Enjoy!\"", R.mipmap.p34));
            categoryAL.add(new mainfeed("\"Let’s light the candles and celebrate this special day of your life. Happy birthday.\"", R.mipmap.p35));
            categoryAL.add(new mainfeed("\"Wherever your feet may take, whatever endeavor you lay hands on. It will always be successful. Happy birthday\"", R.mipmap.p36));
            categoryAL.add(new mainfeed("\"May this special day bring you endless joy and tons of precious memories!\"", R.mipmap.p37));
            categoryAL.add(new mainfeed("\"You are very special and that’s why you need to float with lots of smiles on your lovely face. Happy birthday.\"", R.mipmap.p45));
            categoryAL.add(new mainfeed("\"It’s as simple as ABC; today makes more sense because of you, Happy birthday.\"", R.mipmap.p39));
            categoryAL.add(new mainfeed("\"Let your all the dreams to be on fire and light your birthday candles with that. Have a gorgeous birthday.\"", R.mipmap.p40));
            categoryAL.add(new mainfeed("\"May you continue to improve as a person with each passing year. Wishing you a very happy birthday.\"", R.mipmap.p41));
            categoryAL.add(new mainfeed("\"Happy birthday! Here’s to a bright, healthy and exciting future\"", R.mipmap.p42));
            categoryAL.add(new mainfeed("\"Here’s to the sweetest and loveliest person I know. Happy birthday!\"", R.mipmap.p43));
            categoryAL.add(new mainfeed("\"The joy is in the air because your special day is here!\"", R.mipmap.p44));
            categoryAL.add(new mainfeed("\"Your birthday only comes once a year, so make sure this is the most memorable one ever and have a colorful day.\"", R.mipmap.p45));
            categoryAL.add(new mainfeed("\"I don’t have words to describe what I feel for you. Meeting you is the best thing that ever happened in my life. Happy Birthday!\"", R.mipmap.p46));
            categoryAL.add(new mainfeed("\"Today I wish you a fun time, shared with your dear ones, and a lifelong happiness!\"", R.mipmap.p47));
            categoryAL.add(new mainfeed("\"I always wished to be a great friend like you. But there is no way to be a better friend than you in the world. Happy birthday.\"", R.mipmap.p48));
            categoryAL.add(new mainfeed("\"Life is tough but birthdays are smooth because I will finally have a chance to smile at you. Happy birthday.\"", R.mipmap.p49));
            categoryAL.add(new mainfeed("\"May your birthday be full of happy hours and special moments to remember for a long long time!\"", R.mipmap.p50));
            categoryAL.add(new mainfeed("\"Hugging you don’t need any reason but, if there is a reason, more than one hug is a norm. Happy Birthday!\"", R.mipmap.p51));
            categoryAL.add(new mainfeed("\"Thank you for all the memories we have. Without you, the world would have been colorless to me.\"", R.mipmap.p52));
            categoryAL.add(new mainfeed("\"On your birthday friends wish you many things, but I will wish you only two: always and never. Never feel blue and always be happy!\"", R.mipmap.p53));
            categoryAL.add(new mainfeed("\"With you, it is always about bringing in fun, in more ways than one, come rain come sun, just fun. Happy Birthday!\"", R.mipmap.p54));
            categoryAL.add(new mainfeed("\"May your birthday mark the beginning of a wonderful period of time in your life!\"", R.mipmap.p55));
            categoryAL.add(new mainfeed("\"Happy birthday, gorgeous! You are another year older and I just can’t see it. Have a blast! Wishing you the best of the best!\"", R.mipmap.p56));
            categoryAL.add(new mainfeed("\"What did little birdie say?  Oh! It said it is your birthday today. Happy Birthday my love.\"", R.mipmap.p57));
            categoryAL.add(new mainfeed("\"Mom, there is no one who can come even closer to your winning ways. Happy Birthday to my great mom.\"", R.mipmap.p58));
            categoryAL.add(new mainfeed("\"Cheers on your birthday. One step closer to adult underpants.\"", R.mipmap.p58));
            categoryAL.add(new mainfeed("\"You are only young once, but you can be immature for a lifetime. Happy birthday!\"", R.mipmap.p59));
            categoryAL.add(new mainfeed("\"We thought we would get the right amount of candles to put on your cake this year, but quickly ran out of space. Happy Birthday!\"", R.mipmap.p60));
            categoryAL.add(new mainfeed("\"Seeing as I usually forget everyone’s birthdays, you should consider it a miracle that I’m sending you this message. Happy Birthday!\"", R.mipmap.p61));
            categoryAL.add(new mainfeed("\"Don’t you think it’s about time we grew up a bit and stopped painting the town? I know exactly what you’ll say. Next year. Happy Birthday!\"", R.mipmap.p62));
            categoryAL.add(new mainfeed("\"Party like it’s 1959, when you could still dance and drink alcohol without ending up you to the hospital.\"", R.mipmap.p63));
            categoryAL.add(new mainfeed("\"Remember when we stayed up late running from the law? No? Good. I don’t either. Happy Birthday oldie!\"", R.mipmap.p64));
            categoryAL.add(new mainfeed("\"You’re not old. You’re just old enough to know better and not old enough to care. Happy Birthday!\"", R.mipmap.p65));
            categoryAL.add(new mainfeed("\"Another year to prove that older doesn’t really mean wiser. Happy birthday!\"", R.mipmap.p66));
            categoryAL.add(new mainfeed("\"I made a list about the words of wisdom I wanted to give you for your birthday. It’s still blank. Maybe next year.\"", R.mipmap.p67));
            categoryAL.add(new mainfeed("\"Statistics show that people who live longer have more birthdays, costing us more money for presents!\"", R.mipmap.p68));
            categoryAL.add(new mainfeed("\"Today is the start of the rest of your life. What? You’re how old. Revise: Today is the start of the oldest part of your life.\"", R.mipmap.p69));
            categoryAL.add(new mainfeed("\"I’m just coming over for the treat. By the way, many happy returns.\"", R.mipmap.p70));
            categoryAL.add(new mainfeed("\"Another year to kick your bucket list to the curb.\"", R.mipmap.p71));

        } else if (key.equals("Break up")) {

            headerTV.setText("Break Up");

            categoryAL.add(new mainfeed("\" Truth is everybody is going to hurt you:you just gotta find the ones worth suffering\"", R.mipmap.p31));
            categoryAL.add(new mainfeed("\"Nobody can hurt me without my permission.\"", R.mipmap.p32));
            categoryAL.add(new mainfeed("\"I have learned now that while those who speak about one's miseries usually hurt, those who keep silence hurt more.\"", R.mipmap.p33));
            categoryAL.add(new mainfeed("\"Just because one person's problem is less traumatic than another's doesn't mean they're required to hurt less \"", R.mipmap.p34));
            categoryAL.add(new mainfeed("\"Those who really love you don't mean to hurt you and if they do, you can't see it in their eyes but it hurts them too.\"", R.mipmap.p35));
            categoryAL.add(new mainfeed("\"It is when we hurt that we learn.  \"", R.mipmap.p36));
            categoryAL.add(new mainfeed("\"The surest way to hurt yourself is to give up on love, just because it didn't work out the first time.\"", R.mipmap.p12));
            categoryAL.add(new mainfeed("\"Just because somebody is strong enough to handle pain doesn't mean they deserve it.\"", R.mipmap.p37));
            categoryAL.add(new mainfeed("\"You don't get to choose if you get hurt in this world. But you do have some say in who hurts you.\"", R.mipmap.p39));
            categoryAL.add(new mainfeed("\"Do you know the feeling, when your heart is so hurt, that you could feel the blood dripping?\"", R.mipmap.p40));
            categoryAL.add(new mainfeed("\"Being hurt by someone you truly care about leaves a hole in you heart that only love can fill.\"", R.mipmap.p41));
            categoryAL.add(new mainfeed("\"Being brokenhearted is like having broken ribs. On the outside it looks like nothing's wrong, but every breath hurts.\"", R.mipmap.p42));
            categoryAL.add(new mainfeed("\"He who lives long knows what pain is.\"", R.mipmap.p43));
            categoryAL.add(new mainfeed("\"True pain cannot be concealed.  \"", R.mipmap.p44));
            categoryAL.add(new mainfeed("\"A man can sleep on every hurt but his own.\"", R.mipmap.p45));
            categoryAL.add(new mainfeed("\"The least and weakest man can do some hurt.\"", R.mipmap.p46));
            categoryAL.add(new mainfeed("\"‘Tis easier to hurt than heal. \"", R.mipmap.p47));
            categoryAL.add(new mainfeed("\"When you are dressing a wound, pain is pain’s medicine.\"", R.mipmap.p48));
            categoryAL.add(new mainfeed("\"From hurt comes pain, from pain comes change. If it hurts enough, change will happen.\"", R.mipmap.p49));
            categoryAL.add(new mainfeed("\"Pain is only bearable if we know it will end, not if we deny it exists.\"", R.mipmap.p50));
            categoryAL.add(new mainfeed("\"To have a body is to suffer.\"", R.mipmap.p51));
            categoryAL.add(new mainfeed("\"Better to have pain than paralysis. \"", R.mipmap.p52));
            categoryAL.add(new mainfeed("\"Love means exposing yourself to the pains of being hurt, deeply hurt by someone you trust.\"", R.mipmap.p53));
            categoryAL.add(new mainfeed("\"A person in pain is being spoken to by that part of himself that knows only how to communicate this way. \"", R.mipmap.p54));
            categoryAL.add(new mainfeed("\"Pain is what we’re in most of the time. And I think the bigger the pain the more gods we need.\"", R.mipmap.p55));
            categoryAL.add(new mainfeed("\"The reason it hurts so much to separate is because our souls are connected.  \"", R.mipmap.p56));
            categoryAL.add(new mainfeed("\"It hurts to have someone in your heart that you can't have in your arms.\"", R.mipmap.p57));
            categoryAL.add(new mainfeed("\"I still own my heart, which I know because it hurts so much.\"", R.mipmap.p58));
            categoryAL.add(new mainfeed("\"If someone really wants to hurt you, they'll find a way whatever. I don't want to live my life worrying about it.\"", R.mipmap.p59));
            categoryAL.add(new mainfeed("\"It doesn't hurt to feel sad from time to time.\"", R.mipmap.p60));
            categoryAL.add(new mainfeed("\"That old saying, how you always hurt the one you love, well, it works both ways\"", R.mipmap.p61));
            categoryAL.add(new mainfeed("\"It's a lot easier to be angry at someone than it is to tell them you're hurt.\"", R.mipmap.p62));
            categoryAL.add(new mainfeed("\"A torn jacket is soon mended, but hard words bruise the heart of a child.\"", R.mipmap.p63));
            categoryAL.add(new mainfeed("\"When someone stabs you it's not your fault that you feel pain.\"", R.mipmap.p64));
            categoryAL.add(new mainfeed("\"Forget what hurt you in the past, but never forget what it taught you.\"", R.mipmap.p65));
            categoryAL.add(new mainfeed("\"Two barrels of tears will not heal a bruise.\"", R.mipmap.p66));
            categoryAL.add(new mainfeed("\"I can feel the hurt. There's something good about it. Mostly it makes me stop remembering.\"", R.mipmap.p67));
            categoryAL.add(new mainfeed("\"He who is or has been deeply hurt has a RIGHT to be sure he is LOVED.\"", R.mipmap.p68));
            categoryAL.add(new mainfeed("\"If you're in trouble, or hurt or need -- go to the poor people. They're the only ones that'll help -- the only ones.\"", R.mipmap.p69));
            categoryAL.add(new mainfeed("\"What hurts us is what heals us.\"", R.mipmap.p70));

        } else if (key.equals("Brother-Sister")) {

            headerTV.setText("Brother-Sister");

            categoryAL.add(new mainfeed("\"To have a loving relationship with a sister is not simply to have a buddy or a confident -- it is to have a soulmate for life.\"", R.mipmap.p60));
            categoryAL.add(new mainfeed("\"Our brothers and sisters are there with us from the dawn of our personal stories to the inevitable dusk. \"", R.mipmap.p61));
            categoryAL.add(new mainfeed("\"Being his real brother I could feel I live in his shadows, but I never have and I do not now. I live in his glow.\"", R.mipmap.p62));
            categoryAL.add(new mainfeed("\"There is a little boy inside the man who is my brother. Oh, how I hated that little boy, and how I love him too.\"", R.mipmap.p63));
            categoryAL.add(new mainfeed("\"A sibling may be the keeper of one's identity, the only person with the keys to one's unfettered, more fundamental self.\"", R.mipmap.p64));
            categoryAL.add(new mainfeed("\"Siblings: children of the same parents, each of whom is perfectly normal until they get together.\"", R.mipmap.p65));
            categoryAL.add(new mainfeed("\"The mildest, drowsiest sister has been known to turn tiger if her sibling is in trouble.\"", R.mipmap.p66));
            categoryAL.add(new mainfeed("\"The best thing about having a sister was that I always had a friend.\"", R.mipmap.p67));
            categoryAL.add(new mainfeed("\"Having a sister is like having a best friend you can't get rid of. You know whatever you do, they will still be there.\"", R.mipmap.p68));
            categoryAL.add(new mainfeed("\"If thy brother wrongs thee, remember not so much his wrong-doing, but more than ever that he is thy brother.\"", R.mipmap.p69));
            categoryAL.add(new mainfeed("\"My sister and I are so close that we finish each other's sentences and often wonder who's memories belong to whom.\"", R.mipmap.p70));
            categoryAL.add(new mainfeed("\"Brothers and sisters are as close as hands and feet.\"", R.mipmap.p71));
            categoryAL.add(new mainfeed("\"My brother is one of my true heroes. Steady and sober where I am impulsive and emotional.\"", R.mipmap.p72));
            categoryAL.add(new mainfeed("\"After a girl is grown, her little brothers—now her protectors—seem like big brothers.\"", R.mipmap.p73));
            categoryAL.add(new mainfeed("\"A sister is a gift to the heart, a friend to the spirit, a golden thread to the meaning of life.\"", R.mipmap.p74));
            categoryAL.add(new mainfeed("\"Half the time when brothers wrestle, it's just an excuse to hug each other.\"", R.mipmap.p75));
            categoryAL.add(new mainfeed("\"Because brothers don't let each other wander in the dark alone.\"", R.mipmap.p14));
            categoryAL.add(new mainfeed("\"There's no other love like the love for a brother. There's no other love like the love from a brother.\"", R.mipmap.p77));
            categoryAL.add(new mainfeed("\"Brothers and sisters separated by distance, joined by love.\"", R.mipmap.p78));
            categoryAL.add(new mainfeed("\"Sometimes being a brother is even better than being a superhero.  \"", R.mipmap.p79));
            categoryAL.add(new mainfeed("\"A brother may not be a friend, but a friend will always be a brother.\"", R.mipmap.p80));
            categoryAL.add(new mainfeed("\"Sincere art brings us together, the brotherhood and sisterhood of mankind.\"", R.mipmap.p81));
            categoryAL.add(new mainfeed("\"What's the good news if you haven't a sister to share it?\"", R.mipmap.p82));
            categoryAL.add(new mainfeed("\"We came into the world like brother and brother; And now let's go hand in hand, not one before another.\"", R.mipmap.p83));
            categoryAL.add(new mainfeed("\"A brother is a friend God gave you; a friend is a brother your heart chose for you.\"", R.mipmap.p84));
            categoryAL.add(new mainfeed("\"Mum used to say we were the same soul split in two and walking around on four legs.\"", R.mipmap.p85));
            categoryAL.add(new mainfeed("\"Big sisters are the crab grass in the lawn of life.  \"", R.mipmap.p86));
            categoryAL.add(new mainfeed("\"We are part of a great whole. All living things are our brothers and sisters.\"", R.mipmap.p87));
            categoryAL.add(new mainfeed("\"A sister is a little bit of childhood that can never be lost.\"", R.mipmap.p88));
            categoryAL.add(new mainfeed("\"Until blacks and whites see each other as brother and sister, we will not have parity. It's very clear.\"", R.mipmap.p89));
            categoryAL.add(new mainfeed("\"Being sister and brother means being there for each other. \"", R.mipmap.p90));
            categoryAL.add(new mainfeed("\"What are sisters for if not to point out the things the rest of the world is too polite to mention.\"", R.mipmap.p91));
            categoryAL.add(new mainfeed("\"The greatest gift our parents ever gave us was each other.   \"", R.mipmap.p92));
            categoryAL.add(new mainfeed("\"Brothers and sisters are as close as hands and feet.\"", R.mipmap.p93));
            categoryAL.add(new mainfeed("\"What brothers say to tease their sisters has nothing to do with what they really think of them.\"", R.mipmap.p94));
            categoryAL.add(new mainfeed("\"The greatest gift our parents gave us was each other.\"", R.mipmap.p95));
            categoryAL.add(new mainfeed("\"Sisters and brothers just happen, we don’t get to choose them, but they become one of our most cherished relationships.\"", R.mipmap.p96));
            categoryAL.add(new mainfeed("\"We didn’t even realize we were making memories, we just knew we were having fun.\"", R.mipmap.p97));
            categoryAL.add(new mainfeed("\"Brothers are playmates in the beginning and best friends for life.\"", R.mipmap.p98));
            categoryAL.add(new mainfeed("\"We may look old and wish to the outside world, but to each other, we are still in junior school.\"", R.mipmap.p99));
        } else if (key.equals("College")) {

            headerTV.setText("Colllege");

            categoryAL.add(new mainfeed("\"When we make college more affordable, we make the American dream more achievable.\"", R.mipmap.p10));
            categoryAL.add(new mainfeed("\"College is fun as long as you don't die.\"", R.mipmap.p11));
            categoryAL.add(new mainfeed("\"I'm going to college. I don't care if it ruins my career. I'd rather be smart than a movie star.\"", R.mipmap.p12));
            categoryAL.add(new mainfeed("\"Every year, many, many stupid people graduate from college. And if they can do it, so can you.\"", R.mipmap.p13));
            categoryAL.add(new mainfeed("\"College is a refuge from hasty judgment.\"", R.mipmap.p14));
            categoryAL.add(new mainfeed("\"No period of my life has been one of such unmixed happiness as the four years which have been spent within college walls.\"", R.mipmap.p15));
            categoryAL.add(new mainfeed("\"I think, especially when you're in college, each book that you're reading tends to tell you who you are. \"", R.mipmap.p16));
            categoryAL.add(new mainfeed("\"College isn't the place to go for ideas.\"", R.mipmap.p17));
            categoryAL.add(new mainfeed("\"It is virtually impossible to compete in today's global economy without a college degree.\"", R.mipmap.p18));
            categoryAL.add(new mainfeed("\"College has given me the confidence I need to fail.\"", R.mipmap.p19));
            categoryAL.add(new mainfeed("\"If the college you visit has a bookstore filled with t-shirts rather than books, find another college.\"", R.mipmap.p45));
            categoryAL.add(new mainfeed("\"College campuses were once a hotbed of political activity.\"", R.mipmap.p46));
            categoryAL.add(new mainfeed("\"The things taught in schools and colleges are not an education, but the means to an education. \"", R.mipmap.p47));
            categoryAL.add(new mainfeed("\"A college education shows a man how little other people know.\"", R.mipmap.p23));
            categoryAL.add(new mainfeed("\"College is a place to keep warm between high school and an early marriage.\"", R.mipmap.p24));
            categoryAL.add(new mainfeed("\"College is like a fountain of knowledge - and the students are there to drink\"", R.mipmap.p25));
            categoryAL.add(new mainfeed("\"One of the great mind destroyers of college education is the belief that if it's very complex, it's very profound.\"", R.mipmap.p26));
            categoryAL.add(new mainfeed("\"Our colleges ought to have lit up in us a lasting relish for he better kind of man, a loss of appetite for mediocrities\"", R.mipmap.p27));
            categoryAL.add(new mainfeed("\"What school, college, or lecture bring men depends on what men bring to carry it home in. \"", R.mipmap.p28));
            categoryAL.add(new mainfeed("\"One of the benefits of a college education is to show the boy its little avail.\"", R.mipmap.p29));
            categoryAL.add(new mainfeed("\"Colleges don't make fools, they only develop them.\"", R.mipmap.p30));
            categoryAL.add(new mainfeed("\"Colleges are places where pebbles are polished and diamonds are dimmed.\"", R.mipmap.p31));
            categoryAL.add(new mainfeed("\"The aim of a college education is to teach you to know a good man when you see one. \"", R.mipmap.p32));
            categoryAL.add(new mainfeed("\"College ain't so much where you been as how you talk when you get back.\"", R.mipmap.p33));
            categoryAL.add(new mainfeed("\"A college education should equip one to entertain three things: a friend, an idea and oneself.\"", R.mipmap.p34));
            categoryAL.add(new mainfeed("\"So if a college education is indispensable, the challenge as I see it is how to make it more accessible. \"", R.mipmap.p35));
            categoryAL.add(new mainfeed("\"I accidentally forgot to graduate from college.\"", R.mipmap.p36));
            categoryAL.add(new mainfeed("\"The college graduate is presented with a sheepskin to cover his intellectual nakedness.  \"", R.mipmap.p37));
            categoryAL.add(new mainfeed("\"A college degree is not a sign that one is a finished product but an indication a person is prepared for life.  \"", R.mipmap.p88));
            categoryAL.add(new mainfeed("\"Colleges are like old age homes, except for the fact that more people die in colleges.\"", R.mipmap.p39));
            categoryAL.add(new mainfeed("\"I think a college education is important no matter what you do in life.\"", R.mipmap.p40));
            categoryAL.add(new mainfeed("\"College inspired me to think differently. It's like no other time in your life.\"", R.mipmap.p41));
            categoryAL.add(new mainfeed("\"Fathers send their sons to college either because they went to college or because they didn't.\"", R.mipmap.p42));
            categoryAL.add(new mainfeed("\"The chief value in going to college is that it's the only way to learn it really doesn't matter.\"", R.mipmap.p43));
            categoryAL.add(new mainfeed("\"Third Law of Applied Terror - 80% of the final exam will be based on the one lecture you missed and the one book you didn't read. \"", R.mipmap.p44));
            categoryAL.add(new mainfeed("\"College is the reward for surviving high school.\"", R.mipmap.p45));
            categoryAL.add(new mainfeed("\"Some people get an education without going to college. The rest get it after they get out.\"", R.mipmap.p46));
            categoryAL.add(new mainfeed("\"A mind is a fire to be kindled, not a vessel to be filled.\"", R.mipmap.p47));
            categoryAL.add(new mainfeed("\"College inspired me to think differently. It's like no other time in your life.\"", R.mipmap.p48));
            categoryAL.add(new mainfeed("\"An investment in knowledge always pays the best interest.\"", R.mipmap.p49));

        } else if (key.equals("Failure")) {

            headerTV.setText("Failure");

            categoryAL.add(new mainfeed("\"It's fine to celebrate success but it is more important to heed the lessons of failure.\"", R.mipmap.p1));
            categoryAL.add(new mainfeed("\"Just because you fail once doesn't mean you're gonna fail at everything. \"", R.mipmap.p11));
            categoryAL.add(new mainfeed("\"You have to be able to accept failure to get better.  \"", R.mipmap.p29));
            categoryAL.add(new mainfeed("\"Think like a queen. A queen is not afraid to fail. Failure is another steppingstone to greatness. \"", R.mipmap.p31));
            categoryAL.add(new mainfeed("\"It is hard to fail, but it is worse never to have tried to succeed.\"", R.mipmap.p41));
            categoryAL.add(new mainfeed("\"Failure is the foundation of success, and the means by which it is achieved.\"", R.mipmap.p51));
            categoryAL.add(new mainfeed("\"Mistakes are the portals of discovery. \"", R.mipmap.p61));
            categoryAL.add(new mainfeed("\"I can accept failure, everyone fails at something. But I can't accept not trying.\"", R.mipmap.p71));
            categoryAL.add(new mainfeed("\"I think you have to try and fail, because failure gets you closer to what you're good at. \"", R.mipmap.p81));
            categoryAL.add(new mainfeed("\"The only real failure in life is not to be true to the best one knows.\"", R.mipmap.p91));
            categoryAL.add(new mainfeed("\"If you fell down yesterday, stand up today.\"", R.mipmap.p2));
            categoryAL.add(new mainfeed("\"Our greatest glory is not in never failing, but in rising every time we fail.\"", R.mipmap.p25));
            categoryAL.add(new mainfeed("\"Success is not final, failure is not fatal: it is the courage to continue that counts.\"", R.mipmap.p32));
            categoryAL.add(new mainfeed("\"Any man can make mistakes, but only an idiot persists in his error.\"", R.mipmap.p42));
            categoryAL.add(new mainfeed("\"The chief cause of failure and unhappiness is trading what you want most for what you want right now. \"", R.mipmap.p52));
            categoryAL.add(new mainfeed("\"There is only one thing that makes a dream impossible to achieve: the fear of failure.\"", R.mipmap.p62));
            categoryAL.add(new mainfeed("\"Failure is success if we learn from it.\"", R.mipmap.p72));
            categoryAL.add(new mainfeed("\"Only those who dare to fail greatly can ever achieve greatly.\"", R.mipmap.p82));
            categoryAL.add(new mainfeed("\"Failure is a bend in the road, not the end of the road. Learn from failure and keep moving forward.\"", R.mipmap.p92));
            categoryAL.add(new mainfeed("\"If at first you don't succeed, destroy all evidence that you tried.\"", R.mipmap.p3));
            categoryAL.add(new mainfeed("\"Failure is unimportant. It takes courage to make a fool of yourself.\"", R.mipmap.p13));
            categoryAL.add(new mainfeed("\"Success is not a good teacher, failure makes you humble.\"", R.mipmap.p23));
            categoryAL.add(new mainfeed("\"My fault, my failure, is not in the passions I have, but in my lack of control of them.\"", R.mipmap.p33));
            categoryAL.add(new mainfeed("\"There is no failure except in no longer trying.\"", R.mipmap.p43));
            categoryAL.add(new mainfeed("\"Every adversity, every failure, every heartache carries with it the seed of a greater or equal benefit.\"", R.mipmap.p53));
            categoryAL.add(new mainfeed("\"Sometimes by losing a battle you find a new way to win the war.\"", R.mipmap.p63));
            categoryAL.add(new mainfeed("\"Failure will never overtake me if my determination to succeed is strong enough. \"", R.mipmap.p73));
            categoryAL.add(new mainfeed("\"Life is full of screwups. You're supposed to fail sometimes. It's a required part of the human existance.\"", R.mipmap.p83));
            categoryAL.add(new mainfeed("\"Remember that failure is an event, not a person.\"", R.mipmap.p93));
            categoryAL.add(new mainfeed("\"Failure is simply the opportunity to begin again, this time more intelligently.  \"", R.mipmap.p4));
            categoryAL.add(new mainfeed("\"The wise say that our failure is to form habits: for habit is the mark of a stereotyped world.  \"", R.mipmap.p14));
            categoryAL.add(new mainfeed("\"Failure is the condiment that gives success its flavor.\"", R.mipmap.p24));
            categoryAL.add(new mainfeed("\"Do not be embarrassed by your failures, learn from them and start again.  \"", R.mipmap.p34));
            categoryAL.add(new mainfeed("\"My great concern is not whether you have failed, but whether you are content with failure.\"", R.mipmap.p44));
            categoryAL.add(new mainfeed("\"A fear of weakness only strengthens weakness.\"", R.mipmap.p54));
            categoryAL.add(new mainfeed("\"The men who try to do something and fail are infinitely better than those who try to do nothing and succeed.\"", R.mipmap.p64));
            categoryAL.add(new mainfeed("\"Failing to prepare is preparing to fail.\"", R.mipmap.p74));
            categoryAL.add(new mainfeed("\"Fear of failure must never be a reason not to try something. \"", R.mipmap.p84));
            categoryAL.add(new mainfeed("\"If you don't try at anything, you can't fail, it takes back bone to lead the life you want.\"", R.mipmap.p94));
            categoryAL.add(new mainfeed("\"If you're not prepared to be wrong, you'll never come up with anything original.\"", R.mipmap.p5));
            categoryAL.add(new mainfeed("\"There is no failure except in no longer trying. \"", R.mipmap.p15));

        } else if (key.equals("Family")) {

            headerTV.setText("Family");

            categoryAL.add(new mainfeed("\"It is not flesh and blood but the heart which makes us fathers and sons.\"", R.mipmap.p6));
            categoryAL.add(new mainfeed("\"You don't choose your family. They are God's gift to you, as you are to them.\"", R.mipmap.p16));
            categoryAL.add(new mainfeed("\"A father's a treasure; a brother's a comfort; a friend is both. \"", R.mipmap.p26));
            categoryAL.add(new mainfeed("\"Home is where you are loved the most and act the worst.\"", R.mipmap.p36));
            categoryAL.add(new mainfeed("\"The most important thing a father can do for his children is to love their mother\"", R.mipmap.p46));
            categoryAL.add(new mainfeed("\"While we try to teach our children all about life, our children teach us what life is all about.\"", R.mipmap.p56));
            categoryAL.add(new mainfeed("\"Bringing up a family should be an adventure, not an anxious discipline in which everybody is constantly graded for performance.  \"", R.mipmap.p66));
            categoryAL.add(new mainfeed("\"Be it ever so humble there's no place like home. \"", R.mipmap.p79));
            categoryAL.add(new mainfeed("\"Families ties are cherished things, forged in childhood days, by love of parents, deep and true, and sweet familiar ways.\"", R.mipmap.p86));
            categoryAL.add(new mainfeed("\"Parents were the only ones obligated to love you; from the rest of the world you had to earn it.    \"", R.mipmap.p7));
            categoryAL.add(new mainfeed("\"The strength of a nation derives from the integrity of the home.\"", R.mipmap.p17));
            categoryAL.add(new mainfeed("\"A mother is not a person to lean on, but a person to make leaning unnecessary.\"", R.mipmap.p27));
            categoryAL.add(new mainfeed("\"Having children makes you no more a parent than having a piano makes you a pianist.\"", R.mipmap.p37));
            categoryAL.add(new mainfeed("\"An ounce of blood is worth more than a pound of friendship.\"", R.mipmap.p47));
            categoryAL.add(new mainfeed("\"The best inheritance a parent can give to his children is a few minutes of their time each day.  \"", R.mipmap.p57));
            categoryAL.add(new mainfeed("\"A daughter without her mother is a woman broken. It is a loss that turns to arthritis and settles deep into her bones.\"", R.mipmap.p67));
            categoryAL.add(new mainfeed("\"The children despise their parents until the age of when they suddenly become just like them - thus preserving the system.\"", R.mipmap.p77));
            categoryAL.add(new mainfeed("\"The informality of family life is a blessed condition that allows us to become our best while looking our worst.\"", R.mipmap.p87));
            categoryAL.add(new mainfeed("\"We cannot destroy kindred: our chains stretch a little sometimes, but they never break.\"", R.mipmap.p8));
            categoryAL.add(new mainfeed("\"This was the trouble with families. Like invidious doctors, they knew just where it hurt.\"", R.mipmap.p18));
            categoryAL.add(new mainfeed("\"Home is people. Not a place. If you go back there after the people are gone, then all you can see is what is not there any more.\"", R.mipmap.p28));
            categoryAL.add(new mainfeed("\"A house divided cannot stand. \"", R.mipmap.p31));
            categoryAL.add(new mainfeed("\"Home is where the heart is.\"", R.mipmap.p48));
            categoryAL.add(new mainfeed("\"When you educate a man you educate an individual. When you educate a woman you educate a whole family.\"", R.mipmap.p58));
            categoryAL.add(new mainfeed("\"In family life, love is the oil that eases friction, the cement that binds closer together, and the music that brings harmony.\"", R.mipmap.p68));
            categoryAL.add(new mainfeed("\"The love of a family is life's greatest blessing.\"", R.mipmap.p78));
            categoryAL.add(new mainfeed("\"To us, family means putting your arms around each other and being there.\"", R.mipmap.p88));
            categoryAL.add(new mainfeed("\"Family love is messy, clinging, and of an annoying and repetitive pattern, like bad wallpaper\"", R.mipmap.p1));
            categoryAL.add(new mainfeed("\"Like father, like son.\"", R.mipmap.p2));
            categoryAL.add(new mainfeed("\"The love of family and the admiration of friends is much more important than wealth and privilege.\"", R.mipmap.p3));
            categoryAL.add(new mainfeed("\"I sustain myself with the love of family. \"", R.mipmap.p4));
            categoryAL.add(new mainfeed("\"The world, we'd discovered, doesn't love you like your family loves you.   \"", R.mipmap.p5));
            categoryAL.add(new mainfeed("\"At the end of the day, a loving family should find everything forgivable.  \"", R.mipmap.p6));
            categoryAL.add(new mainfeed("\"Family comes first. In a world full of unknown faces which do not care, the family comes in with all the love that there is to be found.\"", R.mipmap.p7));
            categoryAL.add(new mainfeed("\"The most important thing a father can do for his children is to love their mother.\"", R.mipmap.p8));
            categoryAL.add(new mainfeed("\"A family can develop only with a loving woman as its center.\"", R.mipmap.p9));
            categoryAL.add(new mainfeed("\"There is no friendship, no love, like that of the parent for the child. \"", R.mipmap.p10));
            categoryAL.add(new mainfeed("\"The love of the family, the love of the person can heal. It heals the scars left by a larger society. A massive, powerful society.\"", R.mipmap.p11));
            categoryAL.add(new mainfeed("\"It didn't matter how big our house was; it mattered that there was love in it.\"", R.mipmap.p12));
            categoryAL.add(new mainfeed("\"The only people that you really have, that I learned, are your family, because they love you no matter what.\"", R.mipmap.p13));
        } else if (key.equals("Father's Day")) {

            headerTV.setText("Father's Day");

            categoryAL.add(new mainfeed("\"He didn't tell me how to live; he lived, and let me watch him do it.\"", R.mipmap.p1));
            categoryAL.add(new mainfeed("\"A truly rich man is one whose children run into his arms when his hands are empty.\"", R.mipmap.p2));
            categoryAL.add(new mainfeed("\"It is much easier to become a father than to be one.\"", R.mipmap.p3));
            categoryAL.add(new mainfeed("\"I love my father as the stars - he's a bright shining example and a happy twinkling in my heart.\"", R.mipmap.p4));
            categoryAL.add(new mainfeed("\"You will find that if you really try to be a father, your child will meet you halfway. \"", R.mipmap.p5));
            categoryAL.add(new mainfeed("\"Why are men reluctant to become fathers? They aren't through being children. \"", R.mipmap.p6));
            categoryAL.add(new mainfeed("\"Being a great father is like shaving. No matter how good you shaved today, you have to do it again tomorrow.\"", R.mipmap.p7));
            categoryAL.add(new mainfeed("\"Fatherhood is pretending the present you love most is \"soap-on-a-rope.\"\"", R.mipmap.p8));
            categoryAL.add(new mainfeed("\"My father gave me the greatest gift anyone could give another person, he believed in me. \"", R.mipmap.p9));
            categoryAL.add(new mainfeed("\"It is easier for a father to have children than for children to have a real father.\"", R.mipmap.p10));
            categoryAL.add(new mainfeed("\"A good father is one of the most unsung, unpraised, unnoticed, and yet one of the most valuable assets in our society.\"", R.mipmap.p11));
            categoryAL.add(new mainfeed("\"A father is a man who expects his son to be as good a man as he meant to be.  \"", R.mipmap.p12));
            categoryAL.add(new mainfeed("\"I cannot think of any need in childhood as strong as the need for a father's protection.\"", R.mipmap.p13));
            categoryAL.add(new mainfeed("\"It is a wise father that knows his own child. \"", R.mipmap.p14));
            categoryAL.add(new mainfeed("\"Fathers are biological necessities, but social accidents. \"", R.mipmap.p15));
            categoryAL.add(new mainfeed("\"The father who does not teach his son his duties is equally guilty with the son who neglects them.\"", R.mipmap.p16));
            categoryAL.add(new mainfeed("\"The fundamental defect with fathers is that they want their children to be a credit to them.\"", R.mipmap.p17));
            categoryAL.add(new mainfeed("\"Fathers, like mothers, are not born. Men grow into fathers and fathering is a very important stage in their development. \"", R.mipmap.p18));
            categoryAL.add(new mainfeed("\"Noble fathers have noble children.\"", R.mipmap.p19));
            categoryAL.add(new mainfeed("\"To be a successful father there's one absolute rule: when you have a kid, don't look at it for the first two years.\"", R.mipmap.p88));
            categoryAL.add(new mainfeed("\"The older I get, the smarter my father seems to get.\"", R.mipmap.p87));
            categoryAL.add(new mainfeed("\"By the time a man realizes that maybe his father was right, he usually has a son who thinks he's wrong.\"", R.mipmap.p86));
            categoryAL.add(new mainfeed("\"Fathers, be good to your daughters. You are the god and the weight of her world.\"", R.mipmap.p23));
            categoryAL.add(new mainfeed("\"The greatest thing a father can do to his children is to love their mother.\"", R.mipmap.p24));
            categoryAL.add(new mainfeed("\"A father is a banker provided by nature.\"", R.mipmap.p25));
            categoryAL.add(new mainfeed("\"Noble fathers have noble children.\"", R.mipmap.p26));
            categoryAL.add(new mainfeed("\"My father didn't tell me how to live; he lived,and let me watch him do it. \"", R.mipmap.p27));
            categoryAL.add(new mainfeed("\"He adopted a role called \"being a father\" so that his child would have something mythical and infinitely important: a protector.\"", R.mipmap.p28));
            categoryAL.add(new mainfeed("\"When my father didn't have my hand, he had my back.\"", R.mipmap.p29));
            categoryAL.add(new mainfeed("\"A father is neither an anchor to holdÂ us back, nor a sail to take us there, but a guiding light whose love shows us the way.\"", R.mipmap.p30));
            categoryAL.add(new mainfeed("\"The gift of a Father cannot been seen by our eyes, yet he sacrificed his every breath,sweat and everything to comfort us, his family. \"", R.mipmap.p31));
            categoryAL.add(new mainfeed("\"Becoming a father is easy enough, but being one can be very rough.\"", R.mipmap.p32));
            categoryAL.add(new mainfeed("\"A Father is someone you look up to no matter how tall you grow.\"", R.mipmap.p33));
            categoryAL.add(new mainfeed("\"It doesn't matter who my father was; it matters who I remember he was.\"", R.mipmap.p34));
            categoryAL.add(new mainfeed("\"When you're young, you think your dad is Superman. Then you grow up, and you realize he's just a regular guy who wears a cape.\"", R.mipmap.p35));
            categoryAL.add(new mainfeed("\"It is a wise father that knows his own child.\"", R.mipmap.p36));
            categoryAL.add(new mainfeed("\"It is easier for a father to have children than for children to have a real father.\"", R.mipmap.p37));
            categoryAL.add(new mainfeed("\"No one in this world can love a girl more than her father. \"", R.mipmap.p88));
            categoryAL.add(new mainfeed("\"Dads are most ordinary men turned by love into heroes, adventurers, story-tellers, singers of songs.\"", R.mipmap.p39));
            categoryAL.add(new mainfeed("\"One father is enough to govern one hundred sons, but not a hundred sons one father.\"", R.mipmap.p40));

        } else if (key.equals("Friends")) {

            headerTV.setText("Friends");

            categoryAL.add(new mainfeed("\"The wise man learns more from his enemies than the fool does from his friends. \"", R.mipmap.p40));
            categoryAL.add(new mainfeed("\"A real friend is one who walks in when the rest of the world walks out.\"", R.mipmap.p41));
            categoryAL.add(new mainfeed("\"Misfortune tests the sincerity of friends.\"", R.mipmap.p42));
            categoryAL.add(new mainfeed("\"The most beautiful discovery true friends make is that they can grow separately without growing apart.\"", R.mipmap.p43));
            categoryAL.add(new mainfeed("\"Who is mighty? He who makes an enemy into a friend. \"", R.mipmap.p44));
            categoryAL.add(new mainfeed("\"Keep your friendships in repair.  \"", R.mipmap.p45));
            categoryAL.add(new mainfeed("\"Friendship is always a sweet responsibility, never an opportunity.  \"", R.mipmap.p46));
            categoryAL.add(new mainfeed("\"Friendship is the only cement that will ever hold the world together.\"", R.mipmap.p47));
            categoryAL.add(new mainfeed("\"Most of us don't need a psychiatric therapist as much as a friend to be silly with. \"", R.mipmap.p48));
            categoryAL.add(new mainfeed("\"The language of friendship is not words but meanings.\"", R.mipmap.p49));
            categoryAL.add(new mainfeed("\"I would rather walk with a friend in the dark, than alone in the light.\"", R.mipmap.p50));
            categoryAL.add(new mainfeed("\"Friends are God's way of taking care of us.\"", R.mipmap.p51));
            categoryAL.add(new mainfeed("\"A true friend is the best Possession.\"", R.mipmap.p52));
            categoryAL.add(new mainfeed("\"Friendship increases by visiting friends but visiting seldom. \"", R.mipmap.p53));
            categoryAL.add(new mainfeed("\"Friendship is one mind in two bodies. \"", R.mipmap.p54));
            categoryAL.add(new mainfeed("\"Keep your friends close, your enemies even closer. \"", R.mipmap.p55));
            categoryAL.add(new mainfeed("\"Make a friend when you don't need one. \"", R.mipmap.p56));
            categoryAL.add(new mainfeed("\"The wolf and the dog agree, at the expense of the goat which together they eat.   \"", R.mipmap.p57));
            categoryAL.add(new mainfeed("\"You never really know your friends from your enemies until the ice breaks.\"", R.mipmap.p58));
            categoryAL.add(new mainfeed("\"Friendship is born at that moment when one man says to another: What! You too? I thought that no one but myself . . .  \"", R.mipmap.p59));
            categoryAL.add(new mainfeed("\"One enemy is too many and a hundred friends too few.\"", R.mipmap.p60));
            categoryAL.add(new mainfeed("\"There are some people in life that make you laugh a little louder, smile a little bigger, and live just a little bit better.\"", R.mipmap.p61));
            categoryAL.add(new mainfeed("\"It's the friends you can call up at 4 a.m. that matter.\"", R.mipmap.p62));
            categoryAL.add(new mainfeed("\"Good friends help you find important things when you have lost them. Your smile, you hope, and your courage.\"", R.mipmap.p63));
            categoryAL.add(new mainfeed("\"Don't walk behind me; I may not lead. Don't walk in front of me; I may not follow. Just walk beside me and be my friend.\"", R.mipmap.p64));
            categoryAL.add(new mainfeed("\"The road to a friend's house is never long.  \"", R.mipmap.p65));
            categoryAL.add(new mainfeed("\"True friendship comes when the silence between two people is comfortable.\"", R.mipmap.p66));
            categoryAL.add(new mainfeed("\"Friendship consists in forgetting what one gives and remembering what one receives.\"", R.mipmap.p67));
            categoryAL.add(new mainfeed("\"Little friends may prove great friends.   \"", R.mipmap.p68));
            categoryAL.add(new mainfeed("\"I don't need a friend who changes when I change and who nods when I nod; my shadow does that much better.\"", R.mipmap.p69));
            categoryAL.add(new mainfeed("\"Friendship isn't a big thing it's a million little things.\"", R.mipmap.p70));
            categoryAL.add(new mainfeed("\"The truth is, everyone is going to hurt you. You just got to find the ones worth suffering for. \"", R.mipmap.p71));
            categoryAL.add(new mainfeed("\"The best mirror is an old friend.\"", R.mipmap.p72));
            categoryAL.add(new mainfeed("\"It’s not that diamonds are a girl’s best friend, but it’s your best friends who are your diamonds.\"", R.mipmap.p73));
            categoryAL.add(new mainfeed("\"For good times and bad times / I'll be on your side forever more / That's what friends are for.   \"", R.mipmap.p74));
            categoryAL.add(new mainfeed("\"Friends show their love in times of trouble, not in happiness. \"", R.mipmap.p75));
            categoryAL.add(new mainfeed("\"[Friends are] God’s apology for relations.  \"", R.mipmap.p6));
            categoryAL.add(new mainfeed("\"A friend is one who overlooks your broken fence and admires the flowers in the garden.   \"", R.mipmap.p77));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p78));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p79));
        } else if (key.equals("Happy")) {

            headerTV.setText("Happy");

            categoryAL.add(new mainfeed("\"It is not easy to find happiness in ourselves, and it is not possible to find it elsewhere.  \"", R.mipmap.p1));
            categoryAL.add(new mainfeed("\"The most important thing is to enjoy your life—to be happy—it’s all that matters.\"", R.mipmap.p2));
            categoryAL.add(new mainfeed("\"The greatest part of our happiness depends on our dispositions, not our circumstances. \"", R.mipmap.p3));
            categoryAL.add(new mainfeed("\"A happy life is one spent in learning, earning, and yearning.\"", R.mipmap.p4));
            categoryAL.add(new mainfeed("\"True happiness ne’er entered at an eye; true happiness resides in things unseen.\"", R.mipmap.p5));
            categoryAL.add(new mainfeed("\"Happiness lies in the consciousness we have of it, and by no means in the way the future keeps its promises.\"", R.mipmap.p6));
            categoryAL.add(new mainfeed("\"Real happiness is cheap enough, yet how dearly we pay for its counterfeit.  \"", R.mipmap.p7));
            categoryAL.add(new mainfeed("\"Better to be happy than wise.\"", R.mipmap.p8));
            categoryAL.add(new mainfeed("\"Happiness is found in doing, not merely possessing. \"", R.mipmap.p9));
            categoryAL.add(new mainfeed("\"Happiness is the art of learning how to get joy from your substance. \"", R.mipmap.p10));
            categoryAL.add(new mainfeed("\"A happy man is too satisfied with the present to dwell too much on the future.\"", R.mipmap.p11));
            categoryAL.add(new mainfeed("\"The foolish man seeks happiness in the distance, the wise grows it under his feet.\"", R.mipmap.p12));
            categoryAL.add(new mainfeed("\"If you want others to be happy, practice compassion. If you want to be happy, practice compassion. \"", R.mipmap.p13));
            categoryAL.add(new mainfeed("\"Happiness is the meaning and the purpose of life, the whole aim and end of human existence.  \"", R.mipmap.p14));
            categoryAL.add(new mainfeed("\"A happy life consists not in the absence, but in the mastery of hardships.\"", R.mipmap.p15));
            categoryAL.add(new mainfeed("\"Doing what you like is freedom. Liking what you do is happiness. \"", R.mipmap.p16));
            categoryAL.add(new mainfeed("\"We all live with the objective of being happy; our lives are all different and yet the same.\"", R.mipmap.p17));
            categoryAL.add(new mainfeed("\"If you want to be happy, set a goal that commands your thoughts, liberates your energy, and inspires your hopes.\"", R.mipmap.p18));
            categoryAL.add(new mainfeed("\"The art of being happy lies in the power of extracting happiness from common things.\"", R.mipmap.p19));
            categoryAL.add(new mainfeed("\"Anyone can be happy when times are good; the richer experience is to be happy when times are not.\"", R.mipmap.p88));
            categoryAL.add(new mainfeed("\"One of the secrets of a happy life is continuous small treats.\"", R.mipmap.p87));
            categoryAL.add(new mainfeed("\"Happy is he who learns to bear what he cannot change.\"", R.mipmap.p86));
            categoryAL.add(new mainfeed("\"A multitude of small delights constitute happiness. \"", R.mipmap.p23));
            categoryAL.add(new mainfeed("\"Happiness, not in another place but this place, not for another hour but this hour. \"", R.mipmap.p24));
            categoryAL.add(new mainfeed("\"Happiness in intelligent people is the rarest thing I know. \"", R.mipmap.p25));
            categoryAL.add(new mainfeed("\"Happiness: An agreeable sensation arising from contemplating the misery of another. \"", R.mipmap.p26));
            categoryAL.add(new mainfeed("\"Happiness is a way of travel, not a destination.\"", R.mipmap.p27));
            categoryAL.add(new mainfeed("\"The secret of happiness is freedom, and the secret of freedom, courage.\"", R.mipmap.p28));
            categoryAL.add(new mainfeed("\"I have no money, no resources, no hopes. I am the happiest man alive.\"", R.mipmap.p29));
            categoryAL.add(new mainfeed("\"For peace of mind, resign as general manager of the universe.\"", R.mipmap.p30));
            categoryAL.add(new mainfeed("\"Happiness is when what you think, what you say, and what you so are in harmony.\"", R.mipmap.p31));
            categoryAL.add(new mainfeed("\"There will always be a lost dog somewhere that will prevent me from being happy.\"", R.mipmap.p32));
            categoryAL.add(new mainfeed("\"The only thing that will make you happy is being happy with who you are, and not who people think you are.\"", R.mipmap.p33));
            categoryAL.add(new mainfeed("\"The talent for being happy is appreciating and liking what you have, instead of what you don't have.\"", R.mipmap.p34));
            categoryAL.add(new mainfeed("\"Dream as if you'll live forever, live as if you'll die today.\"", R.mipmap.p35));
            categoryAL.add(new mainfeed("\"Be happy with what you have. Be excited about what you want.\"", R.mipmap.p36));
            categoryAL.add(new mainfeed("\"The habit of being happy enables one to be freed, or largely freed, from the domination of outward conditions. \"", R.mipmap.p37));
            categoryAL.add(new mainfeed("\"Nobody really cares if you're miserable, so you might as well be happy.\"", R.mipmap.p88));
            categoryAL.add(new mainfeed("\"Indeed, man wishes to be happy even when he so lives as to make happiness impossible. \"", R.mipmap.p39));
            categoryAL.add(new mainfeed("\"Happiness is not something ready-made. It comes from your own actions.\"", R.mipmap.p40));

        } else if (key.equals("Life")) {

            headerTV.setText("Life");

            categoryAL.add(new mainfeed("\"There comes a time when you have to choose between turning the page and closing the book.\"", R.mipmap.p1));
            categoryAL.add(new mainfeed("\"Work like you don't need the money, love like you've never been hurt and dance like no one is watching.\"", R.mipmap.p2));
            categoryAL.add(new mainfeed("\"Mellow doesn't always make for a good story, but it makes for a good life.\"", R.mipmap.p3));
            categoryAL.add(new mainfeed("\"The most important thing is to enjoy your life -- to be happy -- it's all that matters.\"", R.mipmap.p4));
            categoryAL.add(new mainfeed("\"Life is a gamble at terrible odds—if it was a bet, you wouldn’t take it.  \"", R.mipmap.p5));
            categoryAL.add(new mainfeed("\"If A is success in life, then A equals x plus y plus z. Work is x; y is play; and z is keeping your mouth shut.\"", R.mipmap.p6));
            categoryAL.add(new mainfeed("\"The only thing I regret about my life is the length of it. If I had to live my life again I’d make all the same mistakes—only sooner.\"", R.mipmap.p7));
            categoryAL.add(new mainfeed("\"Life is a spell so exquisite that everything conspires to break it.   \"", R.mipmap.p8));
            categoryAL.add(new mainfeed("\"Life is like walking through Paradise with peas in your shoes.\"", R.mipmap.p9));
            categoryAL.add(new mainfeed("\"The two most important days in your life are the day you are born and the day you find out why. \"", R.mipmap.p10));
            categoryAL.add(new mainfeed("\"Life is all memory except for the one present moment that goes by so quick you can hardly catch it going.\"", R.mipmap.p11));
            categoryAL.add(new mainfeed("\"Many of life's failures are experienced by people who did not realize how close they were to success when they gave up.   \"", R.mipmap.p12));
            categoryAL.add(new mainfeed("\"Life is not always a matter of holding good cards, but sometimes, playing a poor hand well.   \"", R.mipmap.p13));
            categoryAL.add(new mainfeed("\"To live is so startling it leaves little time for anything else.\"", R.mipmap.p14));
            categoryAL.add(new mainfeed("\"Life is what happens to you while you're busy making other plans.\"", R.mipmap.p15));
            categoryAL.add(new mainfeed("\"To live is the rarest thing in the world. Most people exist, that is all.\"", R.mipmap.p16));
            categoryAL.add(new mainfeed("\"Life is really simple, but we insist on making it complicated.\"", R.mipmap.p17));
            categoryAL.add(new mainfeed("\"You get in life what you have the courage to ask for.\"", R.mipmap.p18));
            categoryAL.add(new mainfeed("\"We all have two lives. The second one starts when we realize we only have one.\"", R.mipmap.p19));
            categoryAL.add(new mainfeed("\"I have found that if you love life, life will love you back.\"", R.mipmap.p88));
            categoryAL.add(new mainfeed("\"Life isn't about finding yourself. Life is about creating yourself.\"", R.mipmap.p87));
            categoryAL.add(new mainfeed("\"Life is inherently risky. There is only one big risk you should avoid at all costs, and that is the risk of doing nothing.\"", R.mipmap.p86));
            categoryAL.add(new mainfeed("\"In the end, it's not the years in your life that count. It's the life in your years.\"", R.mipmap.p23));
            categoryAL.add(new mainfeed("\"Life is a progress, and not a station.\"", R.mipmap.p24));
            categoryAL.add(new mainfeed("\"People have different reasons for the way they live their lives. You cannot put everyone's reasons in the same box. \"", R.mipmap.p25));
            categoryAL.add(new mainfeed("\"Life is 10% what happens to us and 90% how we react to it.\"", R.mipmap.p26));
            categoryAL.add(new mainfeed("\"Be not afraid of life. Believe that life is worth living, and your belief will help create the fact.\"", R.mipmap.p27));
            categoryAL.add(new mainfeed("\"It is not the length of life, but depth of life. \"", R.mipmap.p28));
            categoryAL.add(new mainfeed("\"Our lives begin to end the day we become silent about things that matter.\"", R.mipmap.p29));
            categoryAL.add(new mainfeed("\"Life is about making an impact, not making an income.\"", R.mipmap.p30));
            categoryAL.add(new mainfeed("\"Your time is limited, so don't waste it living someone else's life.\"", R.mipmap.p31));
            categoryAL.add(new mainfeed("\"Accept responsibility for your life. Know that it is you who will get you where you want to go, no one else. \"", R.mipmap.p32));
            categoryAL.add(new mainfeed("\"The great pleasure in life is doing what people say you cannot do. \"", R.mipmap.p33));
            categoryAL.add(new mainfeed("\"Keep your eyes on the stars and your feet on the ground.\"", R.mipmap.p34));
            categoryAL.add(new mainfeed("\"Life's too mysterious to take too serious.\"", R.mipmap.p35));
            categoryAL.add(new mainfeed("\"Life must be lived and curiosity kept alive. One must never, for whatever reason, turn his back on life. \"", R.mipmap.p36));
            categoryAL.add(new mainfeed("\"It's not about how hard you can hit; it's about how hard you can get hit and keep moving forward.\"", R.mipmap.p37));
            categoryAL.add(new mainfeed("\"Nothing in life is to be feared; it is only to be understood. Now is the time to understand more so that we may fear less. \"", R.mipmap.p88));
            categoryAL.add(new mainfeed("\"Do not wait to strike till the iron is hot; but make it hot by striking.\"", R.mipmap.p39));
            categoryAL.add(new mainfeed("\"In youth we learn, in age we understand.\"", R.mipmap.p40));
        } else if (key.equals("Love")) {

            headerTV.setText("Love");

            categoryAL.add(new mainfeed("\"In the arithmetic of love, one plus one equals everything, and two minus one equals nothing.\"", R.mipmap.p80));
            categoryAL.add(new mainfeed("\"Love is a fabric which never fades, no matter how often it is washed in the water of adversity and grief.\"", R.mipmap.p81));
            categoryAL.add(new mainfeed("\"If I were pressed to say why I loved him, I feel that my only reply could be: 'Because it was he, because it was I'.  \"", R.mipmap.p82));
            categoryAL.add(new mainfeed("\"At the touch of love, everyone becomes a poet.\"", R.mipmap.p83));
            categoryAL.add(new mainfeed("\"The best and most beautiful things in the world cannot be seen nor even touched, but just felt in the heart.\"", R.mipmap.p84));
            categoryAL.add(new mainfeed("\"Love is a canvas furnished by Nature and embroidered by imagination.    \"", R.mipmap.p85));
            categoryAL.add(new mainfeed("\"Sometimes the heart sees what is invisible to the eye. \"", R.mipmap.p86));
            categoryAL.add(new mainfeed("\"Love is a fruit in season at all times, and within reach of every hand.\"", R.mipmap.p87));
            categoryAL.add(new mainfeed("\"Absence is to love as wind is to fire; it extinguishes the small and enkindles the great. \"", R.mipmap.p88));
            categoryAL.add(new mainfeed("\"I love you more than yesterday, less than tomorrow.\"", R.mipmap.p89));
            categoryAL.add(new mainfeed("\"Everything is clearer when you're in love. \"", R.mipmap.p90));
            categoryAL.add(new mainfeed("\"If a thing loves, it is infinite.   \"", R.mipmap.p91));
            categoryAL.add(new mainfeed("\"Love is when the other person's happiness is more important than your own.  \"", R.mipmap.p92));
            categoryAL.add(new mainfeed("\"He who wants to do good, knocks at the gate; he who loves finds the gates open.  \"", R.mipmap.p93));
            categoryAL.add(new mainfeed("\"Love is composed of a single soul inhabiting two bodies.\"", R.mipmap.p94));
            categoryAL.add(new mainfeed("\"And even so, what happiness to be loved! And, oh you gods, what happiness it is to love! \"", R.mipmap.p95));
            categoryAL.add(new mainfeed("\"Love is like the wind, you can't see it but you can feel it.\"", R.mipmap.p96));
            categoryAL.add(new mainfeed("\"What is irritating about love is that it is a crime that requires an accomplice.   \"", R.mipmap.p97));
            categoryAL.add(new mainfeed("\"Love doesn't make the world go 'round. Love is what makes the ride worthwhile. \"", R.mipmap.p98));
            categoryAL.add(new mainfeed("\"Never pretend to a love which you do not actually feel, for love is not ours to command.\"", R.mipmap.p99));
            categoryAL.add(new mainfeed("\"There is only one happiness in life -- to love and to be loved.\"", R.mipmap.p1));
            categoryAL.add(new mainfeed("\"Even when love isn't enough, somehow it is.\"", R.mipmap.p2));
            categoryAL.add(new mainfeed("\"Love is like an hourglass, with the heart filling up as the brain empties.   \"", R.mipmap.p3));
            categoryAL.add(new mainfeed("\"The best and most beautiful things in this world cannot be seen or even heard, but must be felt with the heart.\"", R.mipmap.p4));
            categoryAL.add(new mainfeed("\"Absence sharpens love, presence strengthens it.\"", R.mipmap.p5));
            categoryAL.add(new mainfeed("\"We are most alive when we're in love. \"", R.mipmap.p6));
            categoryAL.add(new mainfeed("\"Love is like quicksilver in the hand. Leave the fingers open and it stays. Clutch it, and it darts away.\"", R.mipmap.p7));
            categoryAL.add(new mainfeed("\"Love is the joy of the good, the wonder of the wise, the amazement of the Gods.\"", R.mipmap.p8));
            categoryAL.add(new mainfeed("\"I shall be great and you rich, because we love each other.\"", R.mipmap.p9));
            categoryAL.add(new mainfeed("\"Love is like war: easy to begin but very hard to stop. \"", R.mipmap.p10));
            categoryAL.add(new mainfeed("\"Love is the only sane and satisfactory answer to the problem of human existence. \"", R.mipmap.p11));
            categoryAL.add(new mainfeed("\"Love is something eternal; the aspect may change, but not the essence.\"", R.mipmap.p12));
            categoryAL.add(new mainfeed("\"Absence makes the heart grow fonder.\"", R.mipmap.p13));
            categoryAL.add(new mainfeed("\"Love has unbound my limbs and set me shaking, a monster bitter sweet and my unmaking.\"", R.mipmap.p14));
            categoryAL.add(new mainfeed("\"Love is of all passions the strongest, for it attacks simultaneously the head, the heart and the senses.  \"", R.mipmap.p15));
            categoryAL.add(new mainfeed("\"Love has unbound my limbs and set me shaking, a monster bitter sweet and my unmaking.\"", R.mipmap.p16));
            categoryAL.add(new mainfeed("\"Love is a fire. But whether it is going to warm your hearth or burn down your house, you can never tell.\"", R.mipmap.p17));
            categoryAL.add(new mainfeed("\"Love is to love someone for who they are, who they were, and who they will be.    \"", R.mipmap.p18));
            categoryAL.add(new mainfeed("\"To love is nothing. To be loved is something. But to love and be loved, that's everything. \"", R.mipmap.p19));
            categoryAL.add(new mainfeed("\"Love is an act of endless forgiveness, a tender look which becomes a habit. \"", R.mipmap.p77));
        } else if (key.equals("Motivational")) {

            headerTV.setText("Motivational");

            categoryAL.add(new mainfeed("\"Change your thoughts and you change your world.\"", R.mipmap.p1));
            categoryAL.add(new mainfeed("\"Believe you can and you're halfway there. \"", R.mipmap.p2));
            categoryAL.add(new mainfeed("\"It is during our darkest moments that we must focus to see the light.\"", R.mipmap.p3));
            categoryAL.add(new mainfeed("\"You miss 100% of the shots you don't take. \"", R.mipmap.p4));
            categoryAL.add(new mainfeed("\"Forget about all the reasons why something may not work. You only need to find one good reason why it will.\"", R.mipmap.p5));
            categoryAL.add(new mainfeed("\"Do not go where the path may lead; go instead where there is no path and leave a trail.\"", R.mipmap.p6));
            categoryAL.add(new mainfeed("\"The greatest pleasure in life is doing what people say you cannot do. \"", R.mipmap.p7));
            categoryAL.add(new mainfeed("\"Judge each day not by the harvest you reap but by the seeds you plant.\"", R.mipmap.p8));
            categoryAL.add(new mainfeed("\"Always be a first-rate version of yourself, instead of a second-rate version of somebody else.  \"", R.mipmap.p9));
            categoryAL.add(new mainfeed("\"It is by acts and not by ideas that people live.\"", R.mipmap.p10));
            categoryAL.add(new mainfeed("\"Either I will find a way, or I will make one.\"", R.mipmap.p11));
            categoryAL.add(new mainfeed("\"You are never too old to set another goal or to dream a new dream.\"", R.mipmap.p12));
            categoryAL.add(new mainfeed("\"Always do your best. What you plant now, you will harvest later.\"", R.mipmap.p13));
            categoryAL.add(new mainfeed("\"It does not matter how slowly you go as long as you do not stop.\"", R.mipmap.p14));
            categoryAL.add(new mainfeed("\"I attribute my success to this: I never gave or took any excuse.\"", R.mipmap.p15));
            categoryAL.add(new mainfeed("\"Two roads diverged in a wood, and I took the one less traveled by, And that has made all the difference.\"", R.mipmap.p16));
            categoryAL.add(new mainfeed("\"Strive not to be a success, but rather to be of value.\"", R.mipmap.p17));
            categoryAL.add(new mainfeed("\"Whatever the mind of man can conceive and believe, it can achieve.\"", R.mipmap.p18));
            categoryAL.add(new mainfeed("\"Life is about making an impact, not making an income.\"", R.mipmap.p19));
            categoryAL.add(new mainfeed("\"It is never too late to be what you might have been.\"", R.mipmap.p88));
            categoryAL.add(new mainfeed("\"In order to be effective truth must penetrate like an arrow -- and that is likely to hurt.\"", R.mipmap.p87));
            categoryAL.add(new mainfeed("\"It takes courage to grow up and turn out to be who you really are.\"", R.mipmap.p86));
            categoryAL.add(new mainfeed("\"It is not what we take up, but what we give up, that makes us rich.\"", R.mipmap.p23));
            categoryAL.add(new mainfeed("\"Falling down is how we grow. Staying down is how we die.\"", R.mipmap.p24));
            categoryAL.add(new mainfeed("\"Whether you think you can or think you can't, you are right. \"", R.mipmap.p25));
            categoryAL.add(new mainfeed("\"Great spirits have always encountered violent opposition from mediocre minds.\"", R.mipmap.p26));
            categoryAL.add(new mainfeed("\"Do not wait to strike till the iron is hot; but make it hot by striking.\"", R.mipmap.p27));
            categoryAL.add(new mainfeed("\"We are what we repeatedly do. Excellence, therefore, is not an act but a habit.  \"", R.mipmap.p28));
            categoryAL.add(new mainfeed("\"Thinking will not overcome fear, but action will.\"", R.mipmap.p29));
            categoryAL.add(new mainfeed("\"A journey of a thousand miles begins with a single step.\"", R.mipmap.p30));
            categoryAL.add(new mainfeed("\"The trouble with not having a goal is that you can spend your life running up and down the field and never score.\"", R.mipmap.p31));
            categoryAL.add(new mainfeed("\"Great minds discuss ideas. Average minds discuss events. Small minds discuss people.\"", R.mipmap.p32));
            categoryAL.add(new mainfeed("\"If opportunity doesn't knock, build a door.\"", R.mipmap.p33));
            categoryAL.add(new mainfeed("\"Be not afraid of greatness. Some are born great, some achieve greatness, and some have greatness thrust upon 'em.\"", R.mipmap.p34));
            categoryAL.add(new mainfeed("\"The way to get started is to quit talking and begin doing.\"", R.mipmap.p35));
            categoryAL.add(new mainfeed("\"It's not the load that breaks you down, it's the way you carry it.\"", R.mipmap.p36));
            categoryAL.add(new mainfeed("\"Challenges are what make life interesting and overcoming them is what makes life meaningful. \"", R.mipmap.p37));
            categoryAL.add(new mainfeed("\"In order to succeed, your desire for success should be greater than your fear of failure.\"", R.mipmap.p88));
            categoryAL.add(new mainfeed("\"The only way to do great work is to love what you do. If you haven't found it yet, keep looking. Don't settle.\"", R.mipmap.p39));
            categoryAL.add(new mainfeed("\"I haven't failed. I've just found 10,000 ways that won't work.\"", R.mipmap.p40));

        } else if (key.equals("Sad")) {

            headerTV.setText("Sad");

            categoryAL.add(new mainfeed("\"Sinks my sad soul with sorrow to the grave.\"", R.mipmap.p1));
            categoryAL.add(new mainfeed("\"Absolute silence leads to sadness. It is the image of death.\"", R.mipmap.p2));
            categoryAL.add(new mainfeed("\"Tears are words that need to be written.\"", R.mipmap.p3));
            categoryAL.add(new mainfeed("\"Never make someone a priority when all you are to them is an option.\"", R.mipmap.p4));
            categoryAL.add(new mainfeed("\"Sometimes you have to do things when sad things happen.\"", R.mipmap.p5));
            categoryAL.add(new mainfeed("\"It's sad when someone you know becomes someone you knew.\"", R.mipmap.p6));
            categoryAL.add(new mainfeed("\"You cannot protect yourself from sadness without protecting yourself from happiness. \"", R.mipmap.p7));
            categoryAL.add(new mainfeed("\"Don't be sad because it's over. Be happy because you can start over.\"", R.mipmap.p8));
            categoryAL.add(new mainfeed("\"Being sad with the right people is better than being happy with the wrong ones.\"", R.mipmap.p9));
            categoryAL.add(new mainfeed("\"If life doesn't kill you, emptiness will.\"", R.mipmap.p10));
            categoryAL.add(new mainfeed("\"Behind every beautiful thing, there's some kind of pain.\"", R.mipmap.p11));
            categoryAL.add(new mainfeed("\"The only thing worse than being sad is for others to know you are sad.\"", R.mipmap.p12));
            categoryAL.add(new mainfeed("\"Every thought is a battle. Every breath is a war, and I don't think I'm winning anymore.\"", R.mipmap.p13));
            categoryAL.add(new mainfeed("\"When sorrows come, they come not single spies, but in battalions. \"", R.mipmap.p14));
            categoryAL.add(new mainfeed("\"Pain is inevitable. Suffering is optional.\"", R.mipmap.p15));
            categoryAL.add(new mainfeed("\"Sadness does not come from bad circumstances. It comes from bad thoughts. \"", R.mipmap.p16));
            categoryAL.add(new mainfeed("\"When feeling sad, dream on! When feeling happy, dream on! You shall survive by means of your dreams!\"", R.mipmap.p17));
            categoryAL.add(new mainfeed("\"There can be no rainbow without a cloud and a storm.\"", R.mipmap.p18));
            categoryAL.add(new mainfeed("\"I'm not okay, I'm just good at pretending I am. \"", R.mipmap.p19));
            categoryAL.add(new mainfeed("\"Don't criticize something you know nothing about. It only brings people down and makes everyone miserable.\"", R.mipmap.p88));
            categoryAL.add(new mainfeed("\"There is no greater sorrow than to recall happiness in times of misery.\"", R.mipmap.p87));
            categoryAL.add(new mainfeed("\"Every man has his secret sorrows which the world knows not, and often times we call a man cold when he is only sad.\"", R.mipmap.p86));
            categoryAL.add(new mainfeed("\"Anger, tears and sadness are only for those who have given up. \"", R.mipmap.p23));
            categoryAL.add(new mainfeed("\"The reason it hurts so much to separate is because our souls are connected.    \"", R.mipmap.p24));
            categoryAL.add(new mainfeed("\"The saddest summary of a life contains three descriptions: could have, might have, and should have.  \"", R.mipmap.p25));
            categoryAL.add(new mainfeed("\"At times, I feel overwhelmed and my depression leads me into darkness.\"", R.mipmap.p26));
            categoryAL.add(new mainfeed("\"Don't cry over someone who wouldn't cry over you.\"", R.mipmap.p27));
            categoryAL.add(new mainfeed("\"It's easy to cry when you realize that everyone you love will reject you or die.\"", R.mipmap.p28));
            categoryAL.add(new mainfeed("\"For all sad words of tongue and pen, the saddest are these, 'It might have been.\"", R.mipmap.p29));
            categoryAL.add(new mainfeed("\"Never love with all your heart, it only ends in breaking.\"", R.mipmap.p30));
            categoryAL.add(new mainfeed("\"We must get our hearts broken sometimes. This is a good sign, having a broken heart. It means we have tried for something. \"", R.mipmap.p31));
            categoryAL.add(new mainfeed("\"Love without return is like a question without an answer.\"", R.mipmap.p32));
            categoryAL.add(new mainfeed("\"You gave me wings to fly, then took away my sky.\"", R.mipmap.p33));
            categoryAL.add(new mainfeed("\"If we must part forever, Give me but one kind word to think upon, And please myself with, while my heart's breaking.\"", R.mipmap.p34));
            categoryAL.add(new mainfeed("\"The walls we build around us to keep sadness out also keeps out the joy.\"", R.mipmap.p35));
            categoryAL.add(new mainfeed("\"Ever has it been that love knows not its own depth until the hour of separation.    \"", R.mipmap.p36));
            categoryAL.add(new mainfeed("\"There is no disguise which can hide love for long where it exists, or simulate it where it does not.\"", R.mipmap.p37));
            categoryAL.add(new mainfeed("\"There is a distinct, awful pain that comes with loving someone more than they love you.\"", R.mipmap.p88));
            categoryAL.add(new mainfeed("\"I will wait for you till the day I can forget you or till the day you realize you cannot forget me \"", R.mipmap.p39));
            categoryAL.add(new mainfeed("\"Everything is temporary if you give it enough time. \"", R.mipmap.p40));
        } else if (key.equals("School")) {

            headerTV.setText("School");

            categoryAL.add(new mainfeed("\"\"", R.mipmap.p1));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p2));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p3));
            categoryAL.add(new mainfeed("\"We class schools into four grades: leading school, first-rate school, good school and school.\"", R.mipmap.p4));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p5));
            categoryAL.add(new mainfeed("\"There is a grave defect in the school where the playground suggests happy and classroom disagreeable thoughts.\"", R.mipmap.p6));
            categoryAL.add(new mainfeed("\"Experience keeps a dear school, but fools will learn in no other.\"", R.mipmap.p7));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p8));
            categoryAL.add(new mainfeed("\"The pathway to educational excellence lies within each school.\"", R.mipmap.p9));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p10));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p11));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p12));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p13));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p14));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p15));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p16));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p17));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p18));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p19));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p88));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p87));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p86));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p23));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p24));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p25));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p26));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p27));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p28));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p29));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p30));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p31));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p32));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p33));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p34));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p35));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p36));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p37));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p88));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p39));
            categoryAL.add(new mainfeed("\"\"", R.mipmap.p40));

        } else if (key.equals("Success")) {

            headerTV.setText("Success");

            categoryAL.add(new mainfeed("\"If you don't make mistakes, you're not working on hard enough problems. And that's a big mistake.\"", R.mipmap.p1));
            categoryAL.add(new mainfeed("\"No human being will work hard at anything unless they believe that they are working for competence. \"", R.mipmap.p2));
            categoryAL.add(new mainfeed("\"Working hard and working smart sometimes can be two different things.\"", R.mipmap.p3));
            categoryAL.add(new mainfeed("\"God gives every bird its food, but He does not throw it into its nest.\"", R.mipmap.p4));
            categoryAL.add(new mainfeed("\"I've got a theory that if you give 100 percent all of the time, somehow things will work out in the end.\"", R.mipmap.p5));
            categoryAL.add(new mainfeed("\"Working hard is very important. You're not going to get anywhere without working extremely hard.\"", R.mipmap.p6));
            categoryAL.add(new mainfeed("\"Keep working hard and you can get anything that you want.\"", R.mipmap.p7));
            categoryAL.add(new mainfeed("\"It's hard to beat a person who never gives up.\"", R.mipmap.p8));
            categoryAL.add(new mainfeed("\"There are no shortcuts to any place worth going.\"", R.mipmap.p9));
            categoryAL.add(new mainfeed("\"When I was young, I observed that nine out of ten things I did were failures. So I did ten times more work.\"", R.mipmap.p10));
            categoryAL.add(new mainfeed("\"If you shoot for the stars and hit the moon, it's OK. But you've got to shoot for something. A lot of people don't even shoot.\"", R.mipmap.p11));
            categoryAL.add(new mainfeed("\"I think that my biggest attribute to any success that I have had is hard work. There really is no substitute for working hard. \"", R.mipmap.p12));
            categoryAL.add(new mainfeed("\"Difficult things take a long time, impossible things a little longer.\"", R.mipmap.p13));
            categoryAL.add(new mainfeed("\"Retirement kills more people than hard work ever did.  \"", R.mipmap.p14));
            categoryAL.add(new mainfeed("\"Success seems to be largely a matter of hanging on after others have let go.  \"", R.mipmap.p15));
            categoryAL.add(new mainfeed("\"Don't judge each day by the harvest you reap, but by the seeds you plant.\"", R.mipmap.p16));
            categoryAL.add(new mainfeed("\"Life doesn't require that we be the best, only that we try our best.\"", R.mipmap.p17));
            categoryAL.add(new mainfeed("\"If the power to do hard work is not a skill, it's the best possible substitute for it. \"", R.mipmap.p18));
            categoryAL.add(new mainfeed("\"Hard work brings prosperity; playing around brings poverty.\"", R.mipmap.p19));
            categoryAL.add(new mainfeed("\"I learned the value of hard work by working hard.\"", R.mipmap.p88));
            categoryAL.add(new mainfeed("\"No matter how hard you work to bring yourself up, there's someone out there working just as hard, to put you down.\"", R.mipmap.p87));
            categoryAL.add(new mainfeed("\"Working hard and working smart sometimes can be two different things.\"", R.mipmap.p86));
            categoryAL.add(new mainfeed("\"No human being will work hard at anything unless they believe that they are working for competence.  \"", R.mipmap.p23));
            categoryAL.add(new mainfeed("\"If you don't make mistakes, you're not working on hard enough problems. And that's a big mistake.\"", R.mipmap.p24));
            categoryAL.add(new mainfeed("\"Talent is cheaper than table salt. What separates the talented individual from the successful one is a lot of hard work.  \"", R.mipmap.p25));
            categoryAL.add(new mainfeed("\"The difference between try and triumph is just a little umph! \"", R.mipmap.p26));
            categoryAL.add(new mainfeed("\"Always make a total effort, even when the odds are against you.\"", R.mipmap.p27));
            categoryAL.add(new mainfeed("\"Don't wish it were easier. Wish you were better. \"", R.mipmap.p28));
            categoryAL.add(new mainfeed("\"A dream doesn't become reality through magic; it takes sweat, determination and hard work. \"", R.mipmap.p29));
            categoryAL.add(new mainfeed("\"Hard work without talent is a shame, but talent without hard work is a tragedy.\"", R.mipmap.p30));
            categoryAL.add(new mainfeed("\"Easy and difficult things are just small parts of life, the rest are what have to be done.\"", R.mipmap.p31));
            categoryAL.add(new mainfeed("\"Start by doing what's necessary, then what's possible; and suddenly you are doing the impossible. \"", R.mipmap.p32));
            categoryAL.add(new mainfeed("\"Nothing can make you a failure without your consent. Nothing can make you a success without your hard work.\"", R.mipmap.p33));
            categoryAL.add(new mainfeed("\"Striving for success without hard work is like trying to harvest where you haven't planted.\"", R.mipmap.p34));
            categoryAL.add(new mainfeed("\"When you live for a strong purpose, then hard work isn't an option. It's a necessity.     \"", R.mipmap.p35));
            categoryAL.add(new mainfeed("\"There is no shortcut to perfection. All it takes is hard work, and more hard work. \"", R.mipmap.p36));
            categoryAL.add(new mainfeed("\"Work hard and always expect the best, but make your expectations so small such that it can be easily satisfied.  \"", R.mipmap.p37));
            categoryAL.add(new mainfeed("\"Time stays long enough for anyone who will use it.\"", R.mipmap.p88));
            categoryAL.add(new mainfeed("\"What's tough is to go out and work hard on the things that you don't do very well.\"", R.mipmap.p39));
            categoryAL.add(new mainfeed("\"Success is determined by those whom prove the impossible, possible.\"", R.mipmap.p40));
        } else if (key.equals("Time")) {

            headerTV.setText("Time");

            categoryAL.add(new mainfeed("\"A man who dares to waste one hour of life has not discovered the value of life. \"", R.mipmap.p1));
            categoryAL.add(new mainfeed("\"There is one kind of robber whom the law does not strike at, and who steals what is most precious to men: time.\"", R.mipmap.p2));
            categoryAL.add(new mainfeed("\"Time is like the wind, it lifts the light and leaves the heavy.\"", R.mipmap.p3));
            categoryAL.add(new mainfeed("\"For disappearing acts, it's hard to beat what happens to the eight hours supposedly left after eight of sleep and eight of work. \"", R.mipmap.p4));
            categoryAL.add(new mainfeed("\"Men talk of killing time, while time quietly kills them.\"", R.mipmap.p5));
            categoryAL.add(new mainfeed("\"Time ripens all things; with Time all things are revealed; Time is the father of truth.\"", R.mipmap.p6));
            categoryAL.add(new mainfeed("\"We all have our time machines. Some take us back, they're called memories. Some take us forward, they're called dreams.\"", R.mipmap.p7));
            categoryAL.add(new mainfeed("\"Time = life; therefore, waste your time and waste of your life, or master your time and master your life.\"", R.mipmap.p8));
            categoryAL.add(new mainfeed("\"The common man is not concerned about the passage of time, the man of talent is driven by it. \"", R.mipmap.p9));
            categoryAL.add(new mainfeed("\"Suspect each moment, for it is a thief, tiptoeing away with more than it brings.\"", R.mipmap.p10));
            categoryAL.add(new mainfeed("\"The future is something which everyone reaches at the rate of sixty minutes an hour, whatever he does, whoever he is.\"", R.mipmap.p11));
            categoryAL.add(new mainfeed("\"The timeless in you is aware of life's timelessness. And knows that yesterday is but today's memory and tomorrow is today's dream. \"", R.mipmap.p12));
            categoryAL.add(new mainfeed("\"Time flies over us, but leaves its shadow behind.\"", R.mipmap.p13));
            categoryAL.add(new mainfeed("\"Time is a created thing. To say 'I don't have time,' is like saying, 'I don't want to.\"", R.mipmap.p14));
            categoryAL.add(new mainfeed("\"If we take care of the moments, the years will take care of themselves. \"", R.mipmap.p15));
            categoryAL.add(new mainfeed("\"If time flies when you're having fun, it hits the afterburners when you don't think you're having enough. \"", R.mipmap.p16));
            categoryAL.add(new mainfeed("\"Yesterday's the past, tomorrow's the future, but today is a gift. That's why it's called the present.\"", R.mipmap.p17));
            categoryAL.add(new mainfeed("\"Time is the longest distance between two places.\"", R.mipmap.p18));
            categoryAL.add(new mainfeed("\"All that really belongs to us is time; even he who has nothing else has that.\"", R.mipmap.p19));
            categoryAL.add(new mainfeed("\"The world was made, not in time, but simultaneously with time. There was no time before the world. \"", R.mipmap.p88));
            categoryAL.add(new mainfeed("\"Time is the most valuable thing a man can spend.\"", R.mipmap.p87));
            categoryAL.add(new mainfeed("\"If you let slip time, like a neglected rose it withers on the stalk with languished head. \"", R.mipmap.p86));
            categoryAL.add(new mainfeed("\"Time is neutral and does not change things. With courage and initiative, leaders change things.\"", R.mipmap.p23));
            categoryAL.add(new mainfeed("\"The moment hung in time like a miner’s hat on an oaken peg in a saloon abandoned ninety years ago.\"", R.mipmap.p24));
            categoryAL.add(new mainfeed("\"Time is a cruel thief to rob us of our former selves. We lose as much to life as we do to death.\"", R.mipmap.p25));
            categoryAL.add(new mainfeed("\"There is a rhythm inside a year of time, like a great mainspring that keeps it ticking from spring to summer to fall to winter.\"", R.mipmap.p26));
            categoryAL.add(new mainfeed("\"She was forever saving time, like bits of string.\"", R.mipmap.p27));
            categoryAL.add(new mainfeed("\"The passing years are like a mist sweeping up from the sea of time so that my memories acquire new aspects.\"", R.mipmap.p28));
            categoryAL.add(new mainfeed("\"The moment hung in time like a miner’s hat on an oaken peg in a saloon abandoned ninety years ago.\"", R.mipmap.p29));
            categoryAL.add(new mainfeed("\"Time is what we want most, but... what we use worst.\"", R.mipmap.p30));
            categoryAL.add(new mainfeed("\"If you let slip time, like a neglected rose it withers on the stalk with languished head.    \"", R.mipmap.p31));
            categoryAL.add(new mainfeed("\"Time takes it all, whether you want it to or not.\"", R.mipmap.p32));
            categoryAL.add(new mainfeed("\"Better three hours too soon, than one minute too late. \"", R.mipmap.p33));
            categoryAL.add(new mainfeed("\"Time goes, you say? Ah no! Alas, time stays, we go.\"", R.mipmap.p34));
            categoryAL.add(new mainfeed("\"Nothing is a waste of time if you use the experience wisely.\"", R.mipmap.p35));
            categoryAL.add(new mainfeed("\"The key is in not spending time, but in investing it.\"", R.mipmap.p36));
            categoryAL.add(new mainfeed("\"Time is the school in which we learn, time is the fire in which we burn.\"", R.mipmap.p37));
            categoryAL.add(new mainfeed("\"Who forces time is pushed back by time; who yields to time finds time on his side.\"", R.mipmap.p88));
            categoryAL.add(new mainfeed("\"You can't make up for lost time. You can only do better in the future.\"", R.mipmap.p39));
            categoryAL.add(new mainfeed("\"Yesterday is gone. Tomorrow has not yet come. We have only today. Let us begin.\"", R.mipmap.p40));

        }


        adapter = new QuotesAdapter(getApplicationContext(), categoryAL);
        categoryRV.setHasFixedSize(true);
        categoryRV.setLayoutManager(new LinearLayoutManager(this));
        categoryRV.setAdapter(adapter);

    }


    private void initUI() {
        categoryRV = findViewById(R.id.categoryRV);
        backIV = findViewById(R.id.backarrowIV);
        headerTV=findViewById(R.id.categoryTX);

    }

}
