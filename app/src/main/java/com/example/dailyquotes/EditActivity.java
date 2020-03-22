package com.example.dailyquotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dailyquotes.Adapter.BackgroundEditAdapter;
import com.example.dailyquotes.Models.backgroundedit;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;

public class EditActivity extends AppCompatActivity {

    ArrayList<backgroundedit> bg_thumbnailAL = new ArrayList<>();
    ArrayList<backgroundedit> font_thumbnailAL = new ArrayList<>();
    BackgroundEditAdapter adapter;
    RecyclerView thumbnailRV;
    ImageView backIV, bg_changerIV, bgIV,font_changerIV,copytoclipIV,downloadIV,shareIV;
    TextView quoteTV;
    /*int editimg;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }

        initUI();

        final Intent intent=getIntent();
        String qoute = intent.getStringExtra("quote");
        Integer image=intent.getIntExtra("image",0);

        quoteTV.setText(qoute);
        bgIV.setImageResource(image);

        backIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        bg_changerIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bg_thumbnailAL.clear();

                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p95));
                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p96));
                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p97));
                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p98));
                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p99));
                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p100));
                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p101));
                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p102));
                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p103));
                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p104));
                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p105));
                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p106));
                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p107));
                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p108));
                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p109));
                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p110));
                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p111));
                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p112));

                adapter = new BackgroundEditAdapter(getBaseContext(), bg_thumbnailAL, EditActivity.this,1);
                thumbnailRV.setLayoutManager(new LinearLayoutManager(EditActivity.this, RecyclerView.HORIZONTAL, false));
                thumbnailRV.setHasFixedSize(true);
                thumbnailRV.setAdapter(adapter);
            }
        });

        font_changerIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                font_thumbnailAL.clear();

                font_thumbnailAL.add(new backgroundedit(R.drawable.bauhaus));
                font_thumbnailAL.add(new backgroundedit(R.drawable.thum));
                font_thumbnailAL.add(new backgroundedit(R.drawable.thum));
                font_thumbnailAL.add(new backgroundedit(R.drawable.thum));
                font_thumbnailAL.add(new backgroundedit(R.drawable.thum));

                adapter=new BackgroundEditAdapter(getBaseContext(),font_thumbnailAL,EditActivity.this,2);
                thumbnailRV.setLayoutManager(new LinearLayoutManager(EditActivity.this, RecyclerView.HORIZONTAL, false));
                thumbnailRV.setHasFixedSize(true);
                thumbnailRV.setAdapter(adapter);
            }
        });

        copytoclipIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ClipboardManager clipboardManager=(ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip=ClipData.newPlainText("quote",quoteTV.getText());
                clipboardManager.setPrimaryClip(clip);

                Toast.makeText(getBaseContext(),"Quotes Copied",Toast.LENGTH_SHORT).show();
            }
        });

        downloadIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(EditActivity.this,
                            new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                    return;
                } else {

                    BitmapDrawable draw = (BitmapDrawable) bgIV.getDrawable();
                    Bitmap bitmap = draw.getBitmap();

                    if (bitmap != null) {
                        ContextWrapper cw = new ContextWrapper(getApplicationContext());
                        String directory_path = Environment.getExternalStorageDirectory().getPath() + "/DailyQuotes/";
                        File file = new File(directory_path);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        String targetPdf = directory_path + Calendar.getInstance().get(Calendar.MINUTE) + Calendar.getInstance().get(Calendar.SECOND) + ".jpg";
                        File filePath = new File(targetPdf);
                        if (!filePath.exists()) {
                            Log.d("path", filePath.toString());
                            FileOutputStream fos = null;
                            try {
                                fos = new FileOutputStream(filePath);

                                String text = (String) quoteTV.getText();

                               /* Bitmap workingBitmap = Bitmap.createBitmap(bitmap);
                                Bitmap mutableBitmap = workingBitmap.copy(Bitmap.Config.ARGB_8888, true);
                                Canvas canvas = new Canvas(mutableBitmap);
                                Log.i("d1", "onClick: "+canvas);*/

                                Canvas canvas = new Canvas(bitmap);
                                TextPaint paint = new TextPaint();
                                paint.setAntiAlias(true);
                                paint.setColor(Color.WHITE); // Text Color
                                paint.setTypeface(Typeface.createFromAsset(getAssets(), "font/euphoria.otf"));
                                paint.setTextSize(40);

                                int width = 330;
                                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                                float spacingMultiplier = 1;
                                float spacingAddition = 0;
                                boolean includePadding = false;

                                StaticLayout myStaticLayout = new StaticLayout(text, paint, width, alignment, spacingMultiplier, spacingAddition, includePadding);

                                canvas.save();
                                canvas.translate(100, 50);
                                myStaticLayout.draw(canvas);
                                canvas.restore();

                                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fos);
                                fos.flush();
                                fos.close();
                                Toast.makeText(getApplicationContext(), "Download Successful !", Toast.LENGTH_SHORT).show();

                            } catch (Exception e) {
                                Toast.makeText(getApplicationContext(), "Download Failed !", Toast.LENGTH_SHORT).show();
                                e.printStackTrace();
                                Log.i("test1", "saveImage: " + e.toString());

                            }
                        }
                    }
                }
            }
        });

        shareIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BitmapDrawable draw = (BitmapDrawable) bgIV.getDrawable();
                Bitmap bitmap = draw.getBitmap();
                Log.i("t1", "onClick: "+bitmap);

                // save bitmap to cache directory
                try {

                    File cachePath = new File(getCacheDir(), "images");
                    cachePath.mkdirs();
                    FileOutputStream stream = new FileOutputStream(cachePath + "/image.png"); // overwrites this image every time
                    Log.i("t2", "onClick: ");
                    String text = (String) quoteTV.getText();
                    Log.i("t3", "onClick: "+text);

                    Bitmap workingBitmap = Bitmap.createBitmap(bitmap);
                    Bitmap mutableBitmap = workingBitmap.copy(Bitmap.Config.ARGB_8888, true);
                    Canvas canvas = new Canvas(mutableBitmap);
                    Log.i("d1", "onClick: "+canvas);

//                    Canvas canvas = new Canvas(bitmap);
                    TextPaint paint = new TextPaint();
                    paint.setAntiAlias(true);
                    paint.setColor(Color.WHITE); // Text Color
                    paint.setTypeface(Typeface.createFromAsset(getAssets(), "font/euphoria.otf"));
                    paint.setTextSize(40);

                    int width = 330;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    float spacingMultiplier = 1;
                    float spacingAddition = 0;
                    boolean includePadding = false;

                    StaticLayout myStaticLayout = new StaticLayout(text, paint, width, alignment, spacingMultiplier, spacingAddition, includePadding);

                    canvas.save();
                    canvas.translate(100, 50);
                    myStaticLayout.draw(canvas);
                    canvas.restore();

                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                    stream.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }

                File imagePath = new File(getCacheDir(), "images");
                File newFile = new File(imagePath, "image.png");
                /*Add path in manifest file and create filepath xml file in res*/
                Uri imgBitmapUri = FileProvider.getUriForFile(EditActivity.this, BuildConfig.APPLICATION_ID + ".fileprovider", newFile);
                Log.i("t4", "onClick: "+imgBitmapUri);

                if (imgBitmapUri != null) {
                    Log.i("t5", "onClick: ");
                    Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                    sharingIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                    sharingIntent.setType("image/*");
                    sharingIntent.putExtra(Intent.EXTRA_STREAM, imgBitmapUri);
                    startActivity(Intent.createChooser(sharingIntent, "Share via"));

                }
            }
        });

    }

    private void initUI() {
        backIV = findViewById(R.id.backarrowIV);
        thumbnailRV = findViewById(R.id.changerRV);
        bgIV=findViewById(R.id.backgroundIV);
        bg_changerIV = findViewById(R.id.bg_editIV);

        quoteTV=findViewById(R.id.quoteTV);
        font_changerIV=findViewById(R.id.fontchangerIV);

        copytoclipIV=findViewById(R.id.contentcopyIV);

        downloadIV=findViewById(R.id.downloadIV);

        shareIV=findViewById(R.id.shareIV);
    }

    public void OnImageClick(int editimg) {

        bgIV.setImageResource(editimg);
    }

    public void OnFontClick(String fontstyle,int position) {
        switch (position){
            case 0:quoteTV.setTypeface(Typeface.createFromAsset(getAssets(),"font/crimson_bold.ttf"));
            break;
            case 1:quoteTV.setTypeface(Typeface.createFromAsset(getAssets(),"font/disney.ttf"));
            break;
            case 2:quoteTV.setTypeface(Typeface.createFromAsset(getAssets(),"font/arima_madurai_regular.ttf"));
            break;
            case 3:quoteTV.setTypeface(Typeface.createFromAsset(getAssets(),"font/euphoria.otf"));
            break;
        }

    }
}







