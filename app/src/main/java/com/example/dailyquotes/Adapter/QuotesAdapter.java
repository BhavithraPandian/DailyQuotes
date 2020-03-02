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
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {

        final mainfeed obj=feedAL.get(position);
        holder.quotesTV.setText(obj.getQuotes());

        holder.editIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcontext, EditActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mcontext.startActivity(intent);

            }
        });
/*
        holder.favB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (obj.getFav()){
                    holder.favB.setImageResource(R.drawable.heart_red);
                }
                else {
                    holder.favB.setImageResource(R.drawable.heartblack);
                }
            }
        });*/
        Blurry.with(mcontext).radius(2).from( BitmapFactory.decodeResource(mcontext.getResources(), obj.getBgimg())).into(holder.bgimIV);
    }

    @Override
    public int getItemCount() {

        return feedAL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView quotesTV;
        ImageView bgimIV,editIV;
        /*RelativeLayout imageRL;*/
        /*ImageView favB;*/

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            quotesTV=itemView.findViewById(R.id.quoteTV);
            bgimIV=itemView.findViewById(R.id.bgIV);
            editIV=itemView.findViewById(R.id.editIV);
           /* favB=itemView.findViewById(R.id.favIV);*/
        }
    }
}

