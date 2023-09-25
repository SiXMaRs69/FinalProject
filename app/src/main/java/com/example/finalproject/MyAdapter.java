package com.example.finalproject;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import androidx.recyclerview.widget.RecyclerView;

import com.example.gamestu.model.Game;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    //ส่งข้อมูลในlist game มาใช้งาน
    List<Game> values;
    Context context;

    // คอนสตรักเตอร์ของ MyAdapter เพื่อเก็บค่าและคอนเท็กซ์
    public MyAdapter(List<Game> values, Context context) {
        this.values = values;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgView;
        public TextView txtHeader;
        public TextView txtFooter;
        public TextView txtType;
        public View layout;

        //นำข้อมูลเข้ามาแสดงในlayout
        public ViewHolder(View v) {
            super(v);
            layout = v;
            imgView = (ImageView) v.findViewById(R.id.icon);
            txtHeader = (TextView) v.findViewById(R.id.firstLine);
            txtFooter = (TextView) v.findViewById(R.id.secondLine);
            txtType = (TextView) v.findViewById(R.id.Line3);
        }
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.row_layout, parent, false);//อ้างอิงไปยังrow_layoutที่สร้างขึ้นมา เอามาใช้แสดงข้อมูล
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override     //เอาข้อมูลgameในarray listมาใส่เข้าไปในlayout
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final Game game = values.get(position);
        holder.txtHeader.setText(game.getGame_name());
        holder.txtFooter.setText("ราคา: " + game.getGame_price() + " บาท" );
        holder.txtType.setText("ประเภท: " + game.getGame_type());

        Glide.with(context)
                .load(game.getGame_image())
                .into(holder.imgView);

        // ตั้งค่าฟังก์ชันคลิกบน ImageView
        holder.imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // สร้าง Intent เพื่อเปิดหน้า "gamdetail"
                Intent intent = new Intent(context, GamDetail.class);
                // ส่งข้อมูลเกม ไปยังหน้าGameDetail
                intent.putExtra("gameName", game.getGame_name());
                intent.putExtra("gamePrice", game.getGame_price());
                intent.putExtra("gameImage",game.getGame_image());
                intent.putExtra("gameDetail",game.getGame_detail());
                intent.putExtra("gameType",game.getGame_type());
                intent.putExtra("gameDev",game.getGame_Dev());
                // เริ่มต้น Activity ใหม่
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return values.size();
    }
}
