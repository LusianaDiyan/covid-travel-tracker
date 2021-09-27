package com.example.eect;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardviewHospitalAdapter extends RecyclerView.Adapter<CardviewHospitalAdapter.CardViewViewHolder> {
    private ArrayList<hospital> listHost;

    CardviewHospitalAdapter(ArrayList<hospital> list) {
        this.listHost = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_hospital, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {
        hospital host = listHost.get(position);

        holder.tvName.setText(host.getNameHos());
        holder.tvAddress.setText(host.getAddress());
        holder.tvCall.setText(host.getCall());
    }

    @Override
    public int getItemCount() {
        return listHost.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvAddress, tvCall;
        Button btnFavorite, btnShare;

        CardViewViewHolder(View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvHospitalname);
            tvAddress = itemView.findViewById(R.id.tvAddress);
            tvCall = itemView.findViewById(R.id.tvCall);
        }
    }
}