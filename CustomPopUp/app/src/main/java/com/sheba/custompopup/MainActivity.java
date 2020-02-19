package com.sheba.custompopup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDialog = new Dialog(this);
    }

    public void showLoading(View v) {
        TextView txtclose;
        Button btnFollow;
        myDialog.setContentView(R.layout.progress_dialog);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void showNoNeTConnection(View view) {
        myDialog.setContentView(R.layout.internet_connection_popup);

        Button noInternetConnectionBtn;
        noInternetConnectionBtn = myDialog.findViewById(R.id.noInternetConnection);
        noInternetConnectionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }


    public void notCapable(View view) {
        myDialog.setContentView(R.layout.you_cant_withdraw_money_popup);
        Button okBtn;
        okBtn = myDialog.findViewById(R.id.okBtn);
        okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void noMoneyInWallet(View view) {
        myDialog.setContentView(R.layout.no_money_popup);

        Button shebaCreditRechargeBtn;
        TextView gotoHomePage;
        gotoHomePage = myDialog.findViewById(R.id.gotoHomePage);
        shebaCreditRechargeBtn = myDialog.findViewById(R.id.shebaCreditRecharge);
        shebaCreditRechargeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });

        gotoHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });






        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }


}
