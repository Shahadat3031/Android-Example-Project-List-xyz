package com.sheba.customsnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.androidadvance.topsnackbar.TSnackbar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

  View snackbarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void normalToast(View view) {
        TSnackbar.make(findViewById(android.R.id.content),"ইন্টারনেট সংযোগ নেই",TSnackbar.LENGTH_LONG).show();
    }

    public void customSnackBar(View view) {



        //showCustomTextNoInternet(this);


        TSnackbar snackbar = TSnackbar.make(findViewById(android.R.id.content), "", TSnackbar.LENGTH_INDEFINITE);
        snackbar.setText("ইন্টারনেট সংযোগ নেই");
        snackbarView  = snackbar.getView();
        snackbarView.setBackgroundColor(Color.parseColor("#F28F1E"));
        TextView snackMsg = snackbarView.findViewById(com.androidadvance.topsnackbar.R.id.snackbar_text);
        snackMsg.setTextColor(Color.WHITE);
        snackMsg.setTextSize(20);
        snackMsg.setGravity(Gravity.CENTER);
        snackbar.setAction("ঠিক আছে", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbarView.setVisibility(View.GONE);
            }
        });
        snackbar.setActionTextColor(Color.WHITE);
        snackbar.show();
    }

    public void closeSnackBar(View view) {
        snackbarView.setVisibility(View.GONE);
    }

    //CommonUtil Method

   /* public void showCustomTextNoInternet(Context context, final View view){
        final View snackbarInternetView;
        TSnackbar snackbar = TSnackbar.make(view.findViewById(android.R.id.content), "", TSnackbar.LENGTH_INDEFINITE);
        snackbar.setText("ইন্টারনেট সংযোগ নেই");
        snackbarInternetView  = snackbar.getView();
        snackbarInternetView.setBackgroundColor(Color.parseColor("#F28F1E"));
        TextView snackMsg = view.findViewById(com.androidadvance.topsnackbar.R.id.snackbar_text);
        snackMsg.setTextColor(Color.WHITE);
        snackMsg.setTextSize(20);
        snackMsg.setGravity(Gravity.CENTER);
        snackbar.setAction("ঠিক আছে", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbarInternetView.setVisibility(View.GONE);
            }
        });
        snackbar.setActionTextColor(Color.WHITE);
        snackbar.show();
    }*/





}
