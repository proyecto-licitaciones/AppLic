package com.happybox.applic.adaptador;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Toast;

import com.happybox.applic.R;
import com.happybox.applic.modelo.Categoria;

import java.util.List;


public class CategoriaAdapter extends RecyclerView.Adapter<CategoriaAdapter.ViewHolder> {
    List<Categoria> categorias;

    public void setCategorias(List<Categoria> categorias) { this.categorias = categorias;}
    @Override
    public CategoriaAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.card_categoria, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CategoriaAdapter.ViewHolder holder, int position) {
        holder.chkCategoria.setText(categorias.get(position).getDesCat());
        holder.chkCategoria.setChecked(categorias.get(position).getEstaSeleccionado());
        final int pos = position;

        holder.chkCategoria.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                CheckBox cb = (CheckBox) v;
                categorias.get(pos).setEstaSeleccionado(cb.isChecked());
                /*
                Toast.makeText(
                        v.getContext(),
                        "Clicked on Checkbox: " + cb.getText() + " is "
                                + cb.isChecked(), Toast.LENGTH_SHORT).show();
                                */


            }

        });

    }

    @Override
    public int getItemCount() {
        return categorias.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CheckBox chkCategoria;

        public ViewHolder(View itemView) {
            super(itemView);
            chkCategoria = (CheckBox) itemView.findViewById(R.id.chkCategoria);

        }
    }
}
