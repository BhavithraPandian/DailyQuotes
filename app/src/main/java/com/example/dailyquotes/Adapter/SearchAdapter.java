package com.example.dailyquotes.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dailyquotes.Models.search;
import com.example.dailyquotes.R;

import java.util.ArrayList;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder> {


    ArrayList<search> searchAL=new ArrayList<>();
    Context mcontext;

    public SearchAdapter(Context mcontext, ArrayList<search> searchAL) {
        this.searchAL = searchAL;
        this.mcontext = mcontext;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View  view= LayoutInflater.from(mcontext).inflate(R.layout.category_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        search obj=searchAL.get(position);
        holder.catimgIV.setImageResource(obj.getImgIV());
        holder.cattitTV.setText(obj.getCaterogyTX());
    }

    @Override
    public int getItemCount()
    {
        return searchAL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView catimgIV;
        TextView cattitTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            catimgIV=itemView.findViewById(R.id.catIV);
            cattitTV=itemView.findViewById(R.id.titTX);

        }
    }
}
