package com.example.tugas.wisatasubmission;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;


public class ListWisataAdapter extends RecyclerView.Adapter<ListWisataAdapter.ListViewHolder>{

    Context c;
    ArrayList<Wisata>listWisata;


    public ListWisataAdapter(Context c, ArrayList<Wisata> list){
        this.c = c;
        this.listWisata=list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_wisata, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Wisata wisata = listWisata.get(position);

        Glide.with(holder.itemView.getContext())
                .load(wisata.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(wisata.getName());
        holder.tvDetail.setText(wisata.getDetail());
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {


                Intent intent = new Intent(c, DetailActivity.class);
                c.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {

        return listWisata.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        ItemClickListener itemClickListener;

        public ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            this.itemClickListener.onItemClickListener(v, getLayoutPosition());
        }

        public void setItemClickListener(ItemClickListener ic){
            this.itemClickListener = ic;
        }
    }


}
