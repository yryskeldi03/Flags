package com.geek.flags;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Country> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initList();
        createList();
    }

    private void initList() {
        recyclerView = findViewById(R.id.rv_flags);
        adapter = new Adapter();
        recyclerView.setAdapter(adapter);
    }

    private void createList() {
        list.add(new Country(" Brasil", " Brasilia", R.drawable.brasil));
        list.add(new Country(" China", " Beijing", R.drawable.china));
        list.add(new Country(" Canada", " Ottava", R.drawable.canada));
        list.add(new Country(" Korea", " Seoul", R.drawable.korea));
        list.add(new Country(" Germany", " Berlin", R.drawable.germany));
        list.add(new Country(" Israel", " Jerusalem", R.drawable.israel));
        list.add(new Country(" Italy", " Rome", R.drawable.italy));
        list.add(new Country(" Kazakhstan", " Astana", R.drawable.kazakhstan));
        list.add(new Country(" Turkey", " Ankara", R.drawable.turkey));
        list.add(new Country(" Ukraine", " Keiv", R.drawable.ukraine));
        list.add(new Country(" United state of America", " Washington DC", R.drawable.usa));
        list.add(new Country(" Vietnam", " Hanoi", R.drawable.vietnam));
        list.add(new Country(" Japan", " Tokyo", R.drawable.japan));
        list.add(new Country(" Czech", " Prague", R.drawable.chech));
        list.add(new Country(" India", " Deli", R.drawable.india));
        adapter.addItems(list);
    }

}