package com.sheba.recyclerview.bsaicrecyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sheba.recyclerview.R;

import java.util.ArrayList;

public class BasicRecyclerviewActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BasicAdapter adapter;
    ArrayList<NameModel> nameList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_recyclerview);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        nameList = new ArrayList<>();

        for (int i = 0; i <10 ; i++) {
            NameModel listName = new NameModel("Sheba " + (i+1));
            nameList.add(listName);
        }

        adapter = new BasicAdapter(this,nameList);
        recyclerView.setAdapter(adapter);

    }
}
