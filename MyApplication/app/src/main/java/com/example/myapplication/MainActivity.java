package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
//import androidx.layou
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView recyclerBoxesView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rec_view_1);
        recyclerBoxesView = findViewById(R.id.rec_view_2);

        //установка режима отображения списка (вертикально/горизонтально)
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerBoxesView.setLayoutManager(new LinearLayoutManager(this));
        recyclerBoxesView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        //список со значениями для заполнения
        List<String> names = new ArrayList<>();
        names.add("Пунктик 1");
        names.add("Пункт 2");
        names.add("Пункт 3");
        names.add("Пункт 4");
        names.add("Пункт 5");

        List_adapter adapter0 = new List_adapter(names);

        List<String> boxes = new ArrayList<>();
        boxes.add("Ящик 1");
        boxes.add("Ящик 2");
        boxes.add("Ящик 3");
        boxes.add("Ящик 4");
        boxes.add("Ящик 5");

        List_adapter2 adapter1 = new List_adapter2(boxes);

        recyclerView.setAdapter(adapter0);
        recyclerBoxesView.setAdapter(adapter0);
        //setContentView(R.layout.lay1);

    }
}

