package com.example.dailyquotes.Adapter;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dailyquotes.EditActivity;
import com.example.dailyquotes.Fragments.HomeFeedFragment;
import com.example.dailyquotes.MainActivity;
import com.example.dailyquotes.Models.mainfeed;
import com.example.dailyquotes.R;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import jp.wasabeef.blurry.Blurry;

import static java.lang.System.in;
import static java.lang.System.out;

public class QuotesAdapter extends RecyclerView.Adapter<QuotesAdapter.ViewHolder> {

    ArrayList<mainfeed> feedAL = new ArrayList<>();
    Context mcontext;
    Activity parentAC;

    public QuotesAdapter(Context mcontext, ArrayList<mainfeed> feedAL) {
        this.feedAL = feedAL;
        this.mcontext = mcontext;
    }

    public QuotesAdapter(Context mcontext, ArrayList<mainfeed> feedAL, Activity parentAC) {
        this.feedAL = feedAL;
        this.mcontext = mcontext;
        this.parentAC = parentAC;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mcontext).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {

        final mainfeed obj = feedAL.get(position);
        holder.quotesTV.setText(obj.getQuotes());
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

        holder.saveIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                saveImage(holder);
            }
        });

        holder.shareIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("test10", "onClick: " + obj.getQuotes());

                BitmapDrawable draw = (BitmapDrawable) holder.bgimIV.getDrawable();
                Bitmap bitmap = draw.getBitmap();
                String imgBitmapPath = MediaStore.Images.Media.insertImage(mcontext.getContentResolver(), bitmap, "title", null);
                Uri imgBitmapUri = Uri.parse(imgBitmapPath);

                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("image/*");
//                sharingIntent.putExtra(Intent.EXTRA_TEXT,obj.getQuotes());
//                Canvas canvas=new Canvas(bitmap);
//                Paint paint=new Paint();
//                canvas.drawBitmap(bitmap,0,0,paint);
//                canvas.drawText(obj.getQuotes(),10,10,paint);
//                bitmap.compress(Bitmap.CompressFormat.JPEG,90,out);
//                String staticLayout= StaticLayout.Builder.obtain(obj.getQuotes(),0,0,);
                sharingIntent.putExtra(Intent.EXTRA_STREAM, imgBitmapUri);

                mcontext.startActivity(Intent.createChooser(sharingIntent, "Share via"));
            }
        });

        holder.editIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcontext, EditActivity.class);
                intent.putExtra("quote", obj.getQuotes());
                intent.putExtra("image", obj.getBgimg());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                mcontext.startActivity(intent);

            }
        });

        Blurry.with(mcontext).radius(2).from(BitmapFactory.decodeResource(mcontext.getResources(), obj.getBgimg())).into(holder.bgimIV);
    }

    private void saveImage(ViewHolder holder) {

        Log.i("test1", "saveImage: " + holder.bgimIV.getDrawable());

        //ActivityCompat.requestPermissions(parentAC, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
        if (ActivityCompat.checkSelfPermission(mcontext, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(parentAC,
                    new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
            return;
        } else {

            BitmapDrawable draw = (BitmapDrawable) holder.bgimIV.getDrawable();
            Bitmap bitmap = draw.getBitmap();

            if (bitmap != null) {
                ContextWrapper cw = new ContextWrapper(mcontext);
                String directory_path = Environment.getExternalStorageDirectory().getPath() + "/DailyQuotes/";
                File file = new File(directory_path);
                if (!file.exists()) {
                    file.mkdirs();
                }
                String targetDir = directory_path + Calendar.getInstance().get(Calendar.MINUTE) + Calendar.getInstance().get(Calendar.SECOND) + ".jpg";
                File filePath = new File(targetDir);
                if (!filePath.exists()) {
                    Log.d("path", filePath.toString());
                    FileOutputStream fos = null;
                    try {
                        Log.i("save1", "saveImage: ");
                        fos = new FileOutputStream(filePath);

                        String text= (String) holder.quotesTV.getText();
                        Log.i("save2", "saveImage: "+text);

                        Canvas canvas = new Canvas(bitmap);

                        TextPaint paint = new TextPaint();
                        paint.setAntiAlias(true);
                        paint.setColor(Color.WHITE); // Text Color
                        paint.setTypeface(Typeface.createFromAsset(mcontext.getAssets(),"font/disney.ttf"));
                        paint.setTextSize(10* mcontext.getResources().getDisplayMetrics().density); // Text Size
                        Log.i("paint", "saveImage: "+paint.getTextSize());

                        int width = 200;
                        Log.i("save3", "saveImage: "+width);
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                        float spacingMultiplier = 1;
                        float spacingAddition = 0;
                        boolean includePadding = false;

                        StaticLayout myStaticLayout = new StaticLayout(text, paint, width, alignment, spacingMultiplier, spacingAddition, includePadding);

//                        float height = myStaticLayout.getHeight();
                        float height=50;
                        Log.i("save4", "saveImage: "+height);

                        canvas.save();
                        canvas.translate(width, height);
                        myStaticLayout.draw(canvas);
                        Log.i("save4", "saveImage: "+canvas);
                        canvas.restore();

                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fos);
                        fos.flush();
                        fos.close();
                        Toast.makeText(mcontext, "Download Successful !", Toast.LENGTH_SHORT).show();


                    } catch (Exception e) {
                        Toast.makeText(mcontext, "Download Failed !", Toast.LENGTH_SHORT).show();
                        e.printStackTrace();
                        Log.i("test2", "saveImage: " + e.toString());

                    }
                }
            }
        }


    }

    private File getDir() {

        Log.i("test2", "getDir: ");
        File file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        return new File(file, "Daily Quotes");
    }

    private void refreshGallery(File new_file) {

        Log.i("test3", "refreshGallery: ");
        Intent intent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
        intent.setData(Uri.fromFile(new_file));
        mcontext.sendBroadcast(intent);
    }

    @Override
    public int getItemCount() {

        return feedAL.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView quotesTV;
        ImageView bgimIV, editIV, saveIV, shareIV;
        /*RelativeLayout imageRL;*/
        /*ImageView favB;*/

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            quotesTV = itemView.findViewById(R.id.quoteTV);
            bgimIV = itemView.findViewById(R.id.bgIV);
            editIV = itemView.findViewById(R.id.editIV);
            saveIV = itemView.findViewById(R.id.saveIV);
            shareIV = itemView.findViewById(R.id.shareIV);
            /* favB=itemView.findViewById(R.id.favIV);*/
        }
    }
}

