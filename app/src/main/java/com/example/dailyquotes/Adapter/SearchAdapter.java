package com.example.dailyquotes.Adapter;

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

import com.example.dailyquotes.CategoryActivity;
import com.example.dailyquotes.Models.search;
import com.example.dailyquotes.R;

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

                    Intent intent = new Intent(mcontext, CategoryActivity.class);
                    intent.putExtra("key","Angry");
                    mcontext.startActivity(intent);

                } else if (holder.cattitTV.getText().toString().trim() == "Birthday") {

                    Intent intent = new Intent(mcontext, CategoryActivity.class);
                    intent.putExtra("key","Birthday");
                    mcontext.startActivity(intent);

                } else if (holder.cattitTV.getText().toString().trim() == "Break up") {

                    Intent intent = new Intent(mcontext, CategoryActivity.class);
                    intent.putExtra("key","Break up");
                    mcontext.startActivity(intent);

                } else if (holder.cattitTV.getText().toString().trim() == "Brother-Sister") {

                    Intent intent = new Intent(mcontext, CategoryActivity.class);
                    intent.putExtra("key","Brother-Sister");
                    mcontext.startActivity(intent);

                } else if (holder.cattitTV.getText().toString().trim() == "College") {

                    Intent intent = new Intent(mcontext, CategoryActivity.class);
                    intent.putExtra("key","College");
                    mcontext.startActivity(intent);

                } else if (holder.cattitTV.getText().toString().trim() == "Failure") {

                    Intent intent = new Intent(mcontext, CategoryActivity.class);
                    intent.putExtra("key","Failure");
                    mcontext.startActivity(intent);

                } else if (holder.cattitTV.getText().toString().trim() == "Family") {

                    Intent intent = new Intent(mcontext, CategoryActivity.class);
                    intent.putExtra("key","Family");
                    mcontext.startActivity(intent);

                } else if (holder.cattitTV.getText().toString().trim() == "Father's Day") {

                    Intent intent = new Intent(mcontext, CategoryActivity.class);
                    intent.putExtra("key","Father's Day");
                    mcontext.startActivity(intent);

                } else if (holder.cattitTV.getText().toString().trim() == "Friends") {

                    Intent intent = new Intent(mcontext, CategoryActivity.class);
                    intent.putExtra("key","Friends");
                    mcontext.startActivity(intent);

                } else if (holder.cattitTV.getText().toString().trim() == "Happy") {

                    Intent intent = new Intent(mcontext, CategoryActivity.class);
                    intent.putExtra("key","Happy");
                    mcontext.startActivity(intent);

                } else if (holder.cattitTV.getText().toString().trim() == "Life") {

                    Intent intent = new Intent(mcontext, CategoryActivity.class);
                    intent.putExtra("key","Life");
                    mcontext.startActivity(intent);

                }else if (holder.cattitTV.getText().toString().trim() == "Love") {

                    Intent intent = new Intent(mcontext, CategoryActivity.class);
                    intent.putExtra("key","Love");
                    mcontext.startActivity(intent);

                }else if (holder.cattitTV.getText().toString().trim() == "Motivational") {

                    Intent intent = new Intent(mcontext, CategoryActivity.class);
                    intent.putExtra("key","Motivational");
                    mcontext.startActivity(intent);

                }else if (holder.cattitTV.getText().toString().trim() == "Sad") {

                    Intent intent = new Intent(mcontext, CategoryActivity.class);
                    intent.putExtra("key","Sad");
                    mcontext.startActivity(intent);

                }else if (holder.cattitTV.getText().toString().trim() == "School") {

                    Intent intent = new Intent(mcontext, CategoryActivity.class);
                    intent.putExtra("key","School");
                    mcontext.startActivity(intent);

                }else if (holder.cattitTV.getText().toString().trim() == "Success") {

                    Intent intent = new Intent(mcontext, CategoryActivity.class);
                    intent.putExtra("key","Success");
                    mcontext.startActivity(intent);

                }else if (holder.cattitTV.getText().toString().trim() == "Time") {

                    Intent intent = new Intent(mcontext, CategoryActivity.class);
                    intent.putExtra("key","Time");
                    mcontext.startActivity(intent);

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return searchAL.size();
    }

    public void filterList(ArrayList<search> filteredAL) {
        searchAL=filteredAL;
        notifyDataSetChanged();
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
