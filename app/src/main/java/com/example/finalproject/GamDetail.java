package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class GamDetail extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gam_detail);

        // รับข้อมูลที่ส่งมาจากหน้าMyAdapter
        Intent intent = getIntent();
        String gameName = intent.getStringExtra("gameName");
        String gameImage = intent.getStringExtra("gameImage");
        String gamePrice = intent.getStringExtra("gamePrice");
        String gameDetail = intent.getStringExtra("gameDetail");
        String gameType = intent.getStringExtra("gameType");
        String gameDevtxt = intent.getStringExtra("gameDev");


        // อ้างอิงไปยัง View ใน Layout ของหน้า "gamdetail"
        ImageView gameImageView = findViewById(R.id.imageView);
        TextView gameNameTextView = findViewById(R.id.nameView);
        TextView gamePricetxt = findViewById(R.id.priceView);
        TextView gameDetailtxt = findViewById(R.id.textdetail);
        TextView TypeGame = findViewById(R.id.typeView);
        TextView Developer = findViewById(R.id.DevView);

        //แสดงข้อมูลรูปภาพ
        Glide.with(this)
                .load(gameImage)
                .into(gameImageView);
        // แสดงข้อมูลใน View
        gameNameTextView.setText(gameName);
        gameDetailtxt.setText(gameDetail);
        Developer.setText("Developer: "+gameDevtxt);
        TypeGame.setText("ประเภท: "+gameType);
        gamePricetxt.setText("ราคา: "+gamePrice +" บาท");


    }
}
