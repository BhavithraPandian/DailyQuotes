package com.example.dailyquotes.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dailyquotes.EditActivity;
import com.example.dailyquotes.Fragments.HomeFeedFragment;
import com.example.dailyquotes.MainActivity;
import com.example.dailyquotes.Models.mainfeed;
import com.example.dailyquotes.R;

import java.util.ArrayList;

import jp.wasabeef.blurry.Blurry;

public class QuotesAdapter extends RecyclerView.Adapter<QuotesAdapter.ViewHolder>{

    ArrayList<mainfeed> feedAL=new ArrayList<>();
    Context mcontext;

    public QuotesAdapter(Context mcontext, ArrayList<mainfeed> feedAL) {
        this.feedAL = feedAL;
        this.mcontext = mcontext;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mcontext).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        mainfeed obj=feedAL.get(position);
        holder.quotesTV.setText(obj.getQuotes());
        holder.imageRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcontext, EditActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mcontext.startActivity(intent);
            }
        });
        Blurry.with(mcontext).radius(4).from( BitmapFactory.decodeResource(mcontext.getResources(), obj.getBgimg())).into(holder.bgimIV);
    }

    @Override
    public int getItemCount() {

        return feedAL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView quotesTV;
        ImageView bgimIV;
        RelativeLayout imageRL;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            quotesTV=itemView.findViewById(R.id.quoteTV);
            bgimIV=itemView.findViewById(R.id.bgIV);
            imageRL=itemView.findViewById(R.id.imageRL);
        }
    }
}

