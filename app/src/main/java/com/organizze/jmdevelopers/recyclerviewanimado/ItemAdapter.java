package com.organizze.jmdevelopers.recyclerviewanimado;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import de.hdodenhof.circleimageview.CircleImageView;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    public Context mcontext;
    public ArrayList<Item> mlista;

    public ItemAdapter(Context mcontext, ArrayList<Item> mlista) {
        this.mcontext = mcontext;
        this.mlista = mlista;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View layout= LayoutInflater.from(mcontext).inflate(R.layout.items_view,viewGroup,false);
        return new ItemViewHolder(layout);

    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder itemViewHolder, int i) {
        itemViewHolder.titulo.setText(mlista.get(i).getTitulo());
        itemViewHolder.data.setText(mlista.get(i).getData());
        itemViewHolder.conteudo.setText(mlista.get(i).getConteudo());
        itemViewHolder.imagem_user.setImageResource(mlista.get(i).getUserfoto());



    }

    @Override
    public int getItemCount() {
        return mlista.size();
    }


    public class ItemViewHolder extends RecyclerView.ViewHolder{
        // recuperar os ids
        CircleImageView imagem_user;
        TextView conteudo,data,titulo;


        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            imagem_user=itemView.findViewById(R.id.imagem_user);
            conteudo=itemView.findViewById(R.id.conteudo);
            data=itemView.findViewById(R.id.data);
            titulo=itemView.findViewById(R.id.titulo);
        }
    }

}
