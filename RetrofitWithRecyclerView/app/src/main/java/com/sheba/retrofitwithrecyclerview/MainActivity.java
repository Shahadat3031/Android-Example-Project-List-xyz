package com.sheba.retrofitwithrecyclerview;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.sheba.retrofitwithrecyclerview.api.Api;
import com.sheba.retrofitwithrecyclerview.model.CategoryItem;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    TextView textView;
    RecyclerView recyclerView;
    ArrayList<CategoryItem> cItem = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        recyclerView = findViewById(R.id.recyclerView);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Api api = retrofit.create(Api.class);
        Call<CategoryItem> call = api.getCategories();

        call.enqueue(new Callback<CategoryItem>() {
            @Override
            public void onResponse(Call<CategoryItem> call, Response<CategoryItem> response) {

                CategoryItem c = response.body();

                if (response.body() != null) {
                    if (response.body().getCode() == 200) {
                        Toast.makeText(MainActivity.this, "OK", Toast.LENGTH_SHORT).show();

                        //Log.d(TAG, "onResponse: " + response.body().getCategory().getOverview().getTitle());
                        //Log.d(TAG, "onResponse: " + response.body().getCategory().getPartnership().getTitle());
                        // Log.d(TAG, "onResponse: " + response.body().getCategory().getFaqs().get(response.body().getCategory().getId()));
                        //Log.i(TAG, "onResponse: " + response.body().getCategory().getOverview().getTitle());
                        // Log.i(TAG, "onResponse: " + response.body().getCategory().getPartnership().getTitle());

//                        recyclerView.setHasFixedSize(true);
//                        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
//
//                        RecyclerAdapter adapter = new RecyclerAdapter(getApplicationContext(), cItem);


//                        assert c != null;
//                        int length = c.getCategory().getOverview().getTitle().length();
//
//                        for (int i = 0; i < length; i++) {
//                            if (response.body().getCategory().getOverview().getTitle().isEmpty()){
//
//                            } else {
//                                Log.d(TAG, "onResponse: "+ c.getCategory().getOverview().getTitle() );
//                            }
//                        }

                    }
                }
            }

            @Override
            public void onFailure(Call<CategoryItem> call, Throwable t) {
                Toast.makeText(MainActivity.this, "No", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
