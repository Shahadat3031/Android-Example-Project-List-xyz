package com.sheba.recyclerview.multipleViewtypes.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sheba.recyclerview.R;
import com.sheba.recyclerview.multipleViewtypes.model.MultiEmployee;

import java.util.ArrayList;

public class MultipleTypeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static int TYPE_CELL = 1;
    private static int TYPE_EMAIL = 2;
    private Context context;
    private ArrayList<MultiEmployee> employees;

    public MultipleTypeAdapter(Context context, ArrayList<MultiEmployee> employees) {
        this.context = context;
        this.employees = employees;
    }

    //Making decision that which layout will be loaded
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        if (viewType == TYPE_CELL) { //For call Layout
            view = LayoutInflater.from(context).inflate(R.layout.item_call, parent, false);
            return new CallViewHolder(view);
        } else { // for email Layout
            view = LayoutInflater.from(context).inflate(R.layout.item_email, parent, false);
            return new EmailViewHolder(view);
        }
    }

    //Deciding which data will be loaded
    @Override
    public int getItemViewType(int position) {
        if (TextUtils.isEmpty(employees.get(position).getEmail())){
            return TYPE_CELL;
        } else {
                return TYPE_EMAIL;
            }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        if (getItemViewType(position)==TYPE_CELL){
            ((CallViewHolder) holder).setCallDetails(employees.get(position));
        } else {
            ((EmailViewHolder) holder).setEmailDetails(employees.get(position));
        }

    }

    @Override
    public int getItemCount() {
        return employees.size();
    }

    class CallViewHolder extends RecyclerView.ViewHolder {

        private TextView txtName;
        private TextView txtAddress;

        CallViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtAddress = itemView.findViewById(R.id.txtAddress);
        }

        void setCallDetails(MultiEmployee employee) {
            txtName.setText(employee.getName());
            txtAddress.setText(employee.getAddress());
        }
    }

    class EmailViewHolder extends RecyclerView.ViewHolder {

        private TextView txtName;
        private TextView txtAddress;

        EmailViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtAddress = itemView.findViewById(R.id.txtAddress);
        }

        void setEmailDetails(MultiEmployee employee) {
            txtName.setText(employee.getName());
            txtAddress.setText(employee.getAddress());

        }
    }

}
