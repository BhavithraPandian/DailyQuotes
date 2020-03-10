package com.example.dailyquotes.Fragments;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

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
    ArrayList<search> searchAL = new ArrayList<>();
    SearchAdapter adapterRV;
    RecyclerView searchRV;
    TextView searchTV;

    public SearchFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        searchRV = view.findViewById(R.id.seaechRV);
        adapterRV = new SearchAdapter(getContext(), searchAL);
        searchRV.setHasFixedSize(true);
        searchRV.setLayoutManager(new GridLayoutManager(getContext(), 2));
        searchRV.setAdapter(adapterRV);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 /*       searchTV =(TextView) getView().findViewById(R.id.searchTV);
        searchTV.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());

            }

            private void filter(String category) {
                ArrayList<search> filteredAL = new ArrayList<>();
                for (search item : searchAL) {
                    if (item.getCaterogyTX().toLowerCase().contains(category.toLowerCase())) ;
                    filteredAL.add(item);
                }
                adapterRV.filterList(filteredAL);
            }
        });*/

        searchAL.add(new search(R.drawable.angry_emoji, "Angry"));
        searchAL.add(new search(R.drawable.birthday, "Birthday"));
        searchAL.add(new search(R.drawable.break_up, "Break up"));
        searchAL.add(new search(R.drawable.brother, "Brother-Sister"));
        searchAL.add(new search(R.drawable.college, "College"));
        searchAL.add(new search(R.drawable.failure, "Failure"));
        searchAL.add(new search(R.drawable.family, "Family"));
        searchAL.add(new search(R.drawable.father, "Father's Day"));
        searchAL.add(new search(R.drawable.friends, "Friends"));
        searchAL.add(new search(R.drawable.happy, "Happy"));
        searchAL.add(new search(R.drawable.life, "Life"));
        searchAL.add(new search(R.drawable.love_emoji, "Love"));
        searchAL.add(new search(R.drawable.work, "Motivational"));
        searchAL.add(new search(R.drawable.sad_emoji, "Sad"));
        searchAL.add(new search(R.drawable.school, "School"));
        searchAL.add(new search(R.drawable.success, "Success"));
        searchAL.add(new search(R.drawable.time, "Time"));

    }

}
