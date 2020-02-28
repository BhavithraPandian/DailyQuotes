package com.example.dailyquotes.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dailyquotes.AngryCategoryActivity;
import com.example.dailyquotes.BirthdayCategoryActivity;
import com.example.dailyquotes.BreakupCategoryActivity;
import com.example.dailyquotes.BrotherSisterCategoryActivity;
import com.example.dailyquotes.CollegeCategoryActivity;
import com.example.dailyquotes.FailureCategoryActivity;
import com.example.dailyquotes.FamilyCategoryActivity;
import com.example.dailyquotes.FatherDayCategoryActivity;
import com.example.dailyquotes.Fragments.SearchFragment;
import com.example.dailyquotes.FriendCategoryActivity;
import com.example.dailyquotes.HappyCategoryActivity;
import com.example.dailyquotes.LifeCategoryActivity;
import com.example.dailyquotes.LoveCategoryActivity;
import com.example.dailyquotes.MainActivity;
import com.example.dailyquotes.Models.search;
import com.example.dailyquotes.R;
import com.example.dailyquotes.SadCategoryActivity;
import com.example.dailyquotes.SchoolCategoryActivity;
import com.example.dailyquotes.SuccessCategoryActivity;
import com.example.dailyquotes.TimeCategoryActivity;
import com.example.dailyquotes.WorkCategoryActivity;

import java.util.ArrayList;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder> {


    ArrayList<search> searchAL = new ArrayList<>();
    Context mcontext;

    public SearchAdapter(Context mcontext, ArrayList<search> searchAL) {
        this.searchAL = searchAL;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.category_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {

        search obj = searchAL.get(position);
        holder.catimgIV.setImageResource(obj.getImgIV());
        holder.cattitTV.setText(obj.getCaterogyTX());
        holder.catLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (holder.cattitTV.getText().toString().trim() == "Angry") {

                    Intent intent = new Intent(mcontext, AngryCategoryActivity.class);
                    mcontext.startActivity(intent);
                } else if (holder.cattitTV.getText().toString().trim() == "Birthday") {

                    Intent intent = new Intent(mcontext, BirthdayCategoryActivity.class);
                    mcontext.startActivity(intent);
                } else if (holder.cattitTV.getText().toString().trim() == "Break up") {

                    Intent intent = new Intent(mcontext, BreakupCategoryActivity.class);
                    mcontext.startActivity(intent);
                } else if (holder.cattitTV.getText().toString().trim() == "Brother-Sister") {

                    Intent intent = new Intent(mcontext, BrotherSisterCategoryActivity.class);
                    mcontext.startActivity(intent);
                } else if (holder.cattitTV.getText().toString().trim() == "College") {

                    Intent intent = new Intent(mcontext, CollegeCategoryActivity.class);
                    mcontext.startActivity(intent);
                } else if (holder.cattitTV.getText().toString().trim() == "Failure") {

                    Intent intent = new Intent(mcontext, FailureCategoryActivity.class);
                    mcontext.startActivity(intent);
                } else if (holder.cattitTV.getText().toString().trim() == "Family") {

                    Intent intent = new Intent(mcontext, FamilyCategoryActivity.class);
                    mcontext.startActivity(intent);
                } else if (holder.cattitTV.getText().toString().trim() == "Father's Day") {

                    Intent intent = new Intent(mcontext, FatherDayCategoryActivity.class);
                    mcontext.startActivity(intent);
                } else if (holder.cattitTV.getText().toString().trim() == "Friends") {

                    Intent intent = new Intent(mcontext, FriendCategoryActivity.class);
                    mcontext.startActivity(intent);
                } else if (holder.cattitTV.getText().toString().trim() == "Happy") {

                    Intent intent = new Intent(mcontext, HappyCategoryActivity.class);
                    mcontext.startActivity(intent);
                } else if (holder.cattitTV.getText().toString().trim() == "Life") {

                    Intent intent = new Intent(mcontext, LifeCategoryActivity.class);
                    mcontext.startActivity(intent);
                }else if (holder.cattitTV.getText().toString().trim() == "Love") {

                    Intent intent = new Intent(mcontext, LoveCategoryActivity.class);
                    mcontext.startActivity(intent);
                }else if (holder.cattitTV.getText().toString().trim() == "Sad") {

                    Intent intent = new Intent(mcontext, SadCategoryActivity.class);
                    mcontext.startActivity(intent);
                }else if (holder.cattitTV.getText().toString().trim() == "School") {

                    Intent intent = new Intent(mcontext, SchoolCategoryActivity.class);
                    mcontext.startActivity(intent);
                }else if (holder.cattitTV.getText().toString().trim() == "Success") {

                    Intent intent = new Intent(mcontext, SuccessCategoryActivity.class);
                    mcontext.startActivity(intent);
                }else if (holder.cattitTV.getText().toString().trim() == "Work") {

                    Intent intent = new Intent(mcontext, WorkCategoryActivity.class);
                    mcontext.startActivity(intent);
                }else if (holder.cattitTV.getText().toString().trim() == "Time") {

                    Intent intent = new Intent(mcontext, TimeCategoryActivity.class);
                    mcontext.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return searchAL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView catimgIV;
        TextView cattitTV;
        LinearLayout catLL;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            catimgIV = itemView.findViewById(R.id.catIV);
            cattitTV = itemView.findViewById(R.id.titTX);
            catLL = itemView.findViewById(R.id.categoryLL);
        }
    }
}
