package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
//import androidx.layou
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rec_view_1);
        //установка режима отображения списка (вертикально/горизонтально)
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //список со значениями для заполнения
        ArrayList<String> names = new ArrayList<String>();
        names.add("Пункт 1");
        names.add("Пункт 2");
        names.add("Пункт 3");
        names.add("Пункт 4");
        names.add("Пункт 5");

        List_adapter adapter0 = new List_adapter(names);

        recyclerView.setAdapter(adapter0);
        //setContentView(R.layout.lay1);

    }
}

