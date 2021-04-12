package com.example.tugas3;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity
{
    ImageView ivGambar;
    TextView tvHeader,tvLirik;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        ivGambar=(ImageView)findViewById(R.id.iv_gambar);
        tvHeader=(TextView)findViewById(R.id.tv_header);
        tvLirik=(TextView)findViewById(R.id.tv_lirik);

        ivGambar.setImageResource(getIntent().getIntExtra("gambar",0));
        tvHeader.setText(getIntent().getStringExtra("header"));
        tvLirik.setText(getIntent().getStringExtra("lirik"));
    }
}

