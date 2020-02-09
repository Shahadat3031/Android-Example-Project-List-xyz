package com.sheba.recyclerview.bsaicrecyclerview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sheba.recyclerview.R;

import java.util.ArrayList;

public class BasicRecyclerviewActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BasicAdapter adapter;
    ArrayList<NameModel> nameList;

    //=========================
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_recyclerview);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        btn = findViewById(R.id.addToCart);

        nameList = new ArrayList<>();

        for (int i = 0; i <14 ; i++) {
            NameModel listName = new NameModel("Sheba " + (i+1));
            nameList.add(listName);
        }

        adapter = new BasicAdapter(this,nameList);
        recyclerView.setAdapter(adapter);

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                LinearLayoutManager layoutManager=LinearLayoutManager.class.cast(recyclerView.getLayoutManager());
                int totalItemCount = layoutManager.getItemCount();
                int lastVisible = layoutManager.findLastVisibleItemPosition();

                boolean endHasBeenReached = lastVisible + 1 >= totalItemCount;
                if (totalItemCount > 0 && endHasBeenReached) {
                    //you have reached to the bottom of your recycler view
                   // Toast.makeText(BasicRecyclerviewActivity.this, "Reached to the last position =====" + totalItemCount, Toast.LENGTH_SHORT).show();
                    btn.setVisibility(View.GONE);
                } else {
                    btn.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}
