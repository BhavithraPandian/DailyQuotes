package com.example.dailyquotes.Fragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dailyquotes.Adapter.QuotesAdapter;
import com.example.dailyquotes.MainActivity;
import com.example.dailyquotes.Models.mainfeed;
import com.example.dailyquotes.R;

import java.util.ArrayList;

import static com.example.dailyquotes.R.id.favIV;

public class HomeFeedFragment extends Fragment {

    ArrayList<mainfeed> quotesAL = new ArrayList<>();
    QuotesAdapter adapterRV;
    RecyclerView quotesRV;

    public HomeFeedFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_homefeed,container,false);

        quotesRV = view.findViewById(R.id.recycleRV);
        adapterRV = new QuotesAdapter(getContext(),quotesAL,getActivity());
        quotesRV.setHasFixedSize(true);
        quotesRV.setLayoutManager(new LinearLayoutManager(getActivity()));
        quotesRV.setAdapter(adapterRV);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        quotesAL.add(new mainfeed("\"A deadline is negative inspiration.Still,it's better than no inspiration at all.\"",R.mipmap.p55));
        quotesAL.add(new mainfeed("A goal without a plan is just wish.",R.mipmap.p56));
        quotesAL.add(new mainfeed("If you want a happy goal,tie it to a goal,not to people or thing.",R.mipmap.p57));
        quotesAL.add(new mainfeed("I owe my success to having listened respectfully to the very best advice, and then going away and doing the exact opposite.",R.mipmap.p88));
        quotesAL.add(new mainfeed("Success is not final; failure is not fatal: It is the courage to continue that counts.",R.mipmap.p9));

    }


}
