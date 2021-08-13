package com.geek.flags;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<Country> list = new ArrayList<>();

    public void addItems(ArrayList<Country> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nameOfCountry, nameOfCity;
        private ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameOfCity = itemView.findViewById(R.id.tv_city);
            nameOfCountry = itemView.findViewById(R.id.tv_country);
            image = itemView.findViewById(R.id.img_flag);
        }

        public void onBind(Country country) {
            nameOfCity.setText(country.getNameOfCity());
            nameOfCountry.setText(country.getNameOfCountry());
            image.setImageResource(country.getImage());
        }
    }
}
