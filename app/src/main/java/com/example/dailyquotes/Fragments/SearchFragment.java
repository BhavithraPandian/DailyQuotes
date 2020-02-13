package com.example.dailyquotes.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dailyquotes.Adapter.SearchAdapter;
import com.example.dailyquotes.Models.search;
import com.example.dailyquotes.R;

import java.util.ArrayList;

public class SearchFragment extends Fragment {
    ArrayList<search> searchAL=new ArrayList<>();
    SearchAdapter adapterRV;
    RecyclerView searchRV;


    public SearchFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_search,container,false);

        searchRV=view.findViewById(R.id.seaechRV);
        adapterRV=new SearchAdapter(getContext(),searchAL);
        searchRV.setHasFixedSize(true);
        searchRV.setLayoutManager(new GridLayoutManager(getContext(),2));
        searchRV.setAdapter(adapterRV);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        searchAL.add(new search(R.drawable.home,"Angry"));
        searchAL.add(new search(R.drawable.home,"Sad"));
        searchAL.add(new search(R.drawable.home,"Love"));
        searchAL.add(new search(R.drawable.home,"Family"));
        searchAL.add(new search(R.drawable.home,"Friends"));
        searchAL.add(new search(R.drawable.home,"Life"));
        searchAL.add(new search(R.drawable.home,"Success"));
        searchAL.add(new search(R.drawable.home,"Work"));
        searchAL.add(new search(R.drawable.home,"Time"));
        searchAL.add(new search(R.drawable.home,"Alone"));

    }
}
