package com.example.eva1_14_recycler_view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerTabStrip;

import java.util.List;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.ViewHolder> {

    private String[] aDatos;

    public MiAdaptador(String[] aDatos) {
        this.aDatos = aDatos;
    }

    //Cada VIEWHOLDER Representa un item de la lista
    // Eventos y metodos de cada widget
    public static class ViewHolder extends  RecyclerView.ViewHolder{
        final TextView txtVwFila;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtVwFila = itemView.findViewById(R.id.txtVwFila);
        }

        public TextView getTxtVwFila() {
            return txtVwFila;
        }
    }

    //Crear la pantalla (cada fila) Y crear los objetos VIEWHOLDER


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.texto_fila, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getTxtVwFila().setText(aDatos[position]);
    }

    @Override
    public int getItemCount() {
        return aDatos.length;
    }
}