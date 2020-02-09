package com.sheba.recyclerview.bsaicrecyclerview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sheba.recyclerview.R;

import java.util.ArrayList;

public class BasicAdapter extends RecyclerView.Adapter<BasicAdapter.ViewHolder> {

    private Context context;
    private ArrayList<NameModel> names = new ArrayList<>();

    public BasicAdapter(Context context, ArrayList<NameModel> names) {
        this.context = context;
        this.names = names;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        NameModel nameModel =  names.get(position);
        holder.name.setText(nameModel.getName());

        if(position==(getItemCount()-1)){
            // here goes some code
            //  callback.sendMessage(Message);
            Log.i("Second ***", "onBindViewHolder: " + position);
        }


    }

    @Override
    public int getItemCount() {
        return names.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.items);
        }
    }
}
