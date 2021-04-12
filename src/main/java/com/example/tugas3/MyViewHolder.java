package com.example.tugas3;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder
{
    ImageView gambar1;
    TextView tv_header1;
    Button btn;
    public MyViewHolder(@NonNull View itemView)
    {
        super(itemView);
        gambar1=(ImageView)itemView.findViewById(R.id.iv_gambar2);
        tv_header1=(TextView)itemView.findViewById(R.id.tv_header2);
        btn=(Button)itemView.findViewById(R.id.btn);

    }
}

