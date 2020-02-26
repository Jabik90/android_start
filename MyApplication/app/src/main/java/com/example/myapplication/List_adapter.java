package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class List_adapter extends RecyclerView.Adapter
{
    //объявление списка
    ArrayList<String> names;

    //передача списка в конструктиор как аргумент
    public List_adapter(ArrayList<String> names)
    {
        this.names = names;
    }

    //т.к. ViewHolder абстрактный, приходится наследовать от него
    public class List_ViewHolder extends RecyclerView.ViewHolder
    {
        TextView desc;
        public List_ViewHolder(View view)
        {
            super(view);
            desc = (TextView) view.findViewById(R.id.desc);
        }

    }

    @NonNull
    @Override
    public List_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lay1, parent, false);
        return new List_ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position)
    {

    }

    @Override
    public int getItemCount()
    {
        return 5;
    }
}
