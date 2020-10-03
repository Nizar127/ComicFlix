package com.comicflix.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.comicflix.Model.CategoryItem;
import com.comicflix.comicflix.R;

import java.util.List;

public class ItemRecyclerAdapter extends RecyclerView.Adapter<ItemRecyclerAdapter.AnimeItemViewHolder> {
    @NonNull

    Context context;
    List<CategoryItem> categoryItemList;

    public ItemRecyclerAdapter(@NonNull Context context, List<CategoryItem> categoryItemList) {
        this.context = context;
        this.categoryItemList = categoryItemList;
    }

    public ItemRecyclerAdapter.AnimeItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AnimeItemViewHolder((LayoutInflater.from(context).inflate(R.layout.category_item_layout, parent,false)));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemRecyclerAdapter.AnimeItemViewHolder holder, int position) {
        Glide.with(context).load(categoryItemList.get(position).getImgUrl()).into(holder.item_image);
    }

    @Override
    public int getItemCount() {
        return categoryItemList.size();
    }

    public static final class AnimeItemViewHolder extends RecyclerView.ViewHolder {

        ImageView item_image;

        public AnimeItemViewHolder(@NonNull View itemView) {
            super(itemView);

            item_image = itemView.findViewById(R.id.item_image);
        }
    }
}
