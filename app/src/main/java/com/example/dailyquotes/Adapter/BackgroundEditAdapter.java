package com.example.dailyquotes.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dailyquotes.EditActivity;
import com.example.dailyquotes.Models.backgroundedit;
import com.example.dailyquotes.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class BackgroundEditAdapter extends RecyclerView.Adapter<BackgroundEditAdapter.ViewHolder> {

    ArrayList<backgroundedit> bgeditAL=new ArrayList<>();
    Context mcontext;
    Activity parentAC;

    public BackgroundEditAdapter( Context mcontext,ArrayList<backgroundedit> bgeditAL,Activity parentAC) {
        this.bgeditAL = bgeditAL;
        this.mcontext = mcontext;
        this.parentAC = parentAC;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mcontext).inflate(R.layout.bg_edit_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        final backgroundedit obj=bgeditAL.get(position);
        Log.i("testtt", "onBindViewHolder: "+obj);
        holder.imgIV.setImageResource(obj.getEditimg());
        holder.imgIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((EditActivity)view.getContext()).OnImageClick(obj.getEditimg());
            }
        });

    }

    @Override
    public int getItemCount() {
        return bgeditAL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imgIV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIV=itemView.findViewById(R.id.bgeditIV);
        }

    }

}
