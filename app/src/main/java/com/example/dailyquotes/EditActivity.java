package com.example.dailyquotes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
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
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;

public class EditActivity extends AppCompatActivity {

    ArrayList<backgroundedit> bg_thumbnailAL = new ArrayList<>();
    ArrayList<backgroundedit> font_thumbnailAL = new ArrayList<>();
    BackgroundEditAdapter adapter;
    RecyclerView thumbnailRV;
    ImageView backIV, bg_changerIV, bgIV,font_changerIV,copytoclipIV,downloadIV;
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

                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p10));
                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p70));
                bg_thumbnailAL.add(new backgroundedit(R.mipmap.p40));

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

                font_thumbnailAL.add(new backgroundedit(R.drawable.sans_serif_thumbnail));
                font_thumbnailAL.add(new backgroundedit(R.drawable.sans_serif_thumbnail));
                font_thumbnailAL.add(new backgroundedit(R.drawable.sans_serif_thumbnail));
                font_thumbnailAL.add(new backgroundedit(R.drawable.sans_serif_thumbnail));
                font_thumbnailAL.add(new backgroundedit(R.drawable.sans_serif_thumbnail));

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
    }

    public void OnImageClick(int editimg) {

        bgIV.setImageResource(editimg);
    }

    public void OnFontClick(String fontstyle,int position) {
        switch (position){
            case 0:quoteTV.setTypeface(Typeface.MONOSPACE);
            break;
            case 1:quoteTV.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD_ITALIC));
            break;
            case 2:quoteTV.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
            break;
            case 3:quoteTV.setTypeface(Typeface.SANS_SERIF);
            break;
        }

    }
}







