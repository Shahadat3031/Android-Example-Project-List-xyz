package com.sheba.retrofitwithrecyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sheba.retrofitwithrecyclerview.R;
import com.sheba.retrofitwithrecyclerview.model.CategoryItem;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {


    private Context context;
    private ArrayList<CategoryItem> categoryItems = new ArrayList<>();

    public RecyclerAdapter(Context context, ArrayList<CategoryItem> categoryItems) {
        this.context = context;
        this.categoryItems = categoryItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        CategoryItem categoryItem = new CategoryItem();
        holder.overViewTextView.setText(categoryItem.getCategory().getOverview().getTitle());
    }

    @Override
    public int getItemCount() {
        return categoryItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView overViewTextView;
        ViewHolder(@NonNull View itemView) {
            super(itemView);
            overViewTextView = itemView.findViewById(R.id.overviewId);
        }
    }
}
