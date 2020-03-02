package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class List_adapter extends RecyclerView.Adapter<List_adapter.List_ViewHolder>
{
    //объявление списка
    List<String> names;

    //передача списка в конструктиор как аргумент
    public List_adapter(List<String> names)
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
            desc = view.findViewById(R.id.desc);
        }

        public void bind(String data)
        {
            this.desc.setText(data);
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
    public void onBindViewHolder(@NonNull List_ViewHolder holder, int position) {
        holder.bind(names.get(position));
    }

    @Override
    public int getItemCount()
    {
        return names.size();
    }
}
