package com.example.eect;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardViewTravelAdapter extends RecyclerView.Adapter<CardViewTravelAdapter.CardViewViewHolder> {
    private ArrayList<Travel> travelArrayList;

    CardViewTravelAdapter(ArrayList<Travel> list){
        this.travelArrayList = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card_travel, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {
        Travel travel = travelArrayList.get(position);

        holder.tvName.setText(travel.getName());
        holder.tvDetail.setText(travel.getDetail());
    }

    @Override
    public int getItemCount() {
        return travelArrayList.size();
    }


    class CardViewViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvDetail;

        CardViewViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
