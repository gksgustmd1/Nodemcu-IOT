package com.example.tabskin;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class adgroup2 extends AppCompatActivity {

    private int mbtn1;
    private int Mgroup1;

    Button[] gbtn = new Button[1];
    Button[] btn = new Button[13];

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adgroup2);

        final LinearLayout mgroup1 = (LinearLayout) findViewById(R.id.btns);
        Button ALL = findViewById(R.id.adgroup_all);
        Button group1 = findViewById(R.id.adgroup1);
        Button group2 = findViewById(R.id.adgroup2);
        Button group3 = findViewById(R.id.adgroup3);
        Button group4 = findViewById(R.id.adgroup4);

        btn[0] = (Button)findViewById(R.id.button1);
        btn[1] = (Button)findViewById(R.id.button2);
        btn[2] = (Button)findViewById(R.id.button3);

        ALL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(adgroup2.this, Skin2.class);
                startActivity(intent);
            }
        });

        group1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(adgroup2.this, adgroup1.class);
                startActivity(myintent);
                finish();
            }
        });

        group2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(adgroup2.this, adgroup2.class);
                        startActivity(intent);
                    }
                });

        group3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(adgroup2.this, adgroup3.class);
                startActivity(intent);
            }
        });

        group4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(adgroup2.this, adgroup4.class);
                startActivity(intent);
            }
        });

        mgroup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Mgroup1 == 1) {

                    AlertDialog.Builder ad = new AlertDialog.Builder(adgroup2.this);
                    ad.setMessage("group2??? ???????????????????"); //?????? ??????

                    // ?????? ?????? ??????
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            long Button_start = System.currentTimeMillis();
                            //Log.v(TAG, "Yes btn Click");
                            off4 process4 = new off4();
                            process4.execute();
                            off5 process5 = new off5();
                            process5.execute();
                            off6 process6 = new off6();
                            process6.execute();
                            dialog.dismiss();   // ??????

                            btn[0].setSelected(false);
                            btn[1].setSelected(false);

                            Mgroup1 = 0;
                            mgroup1.setSelected(false);

                        }

                    });

                    //?????? ?????? ??????
                    ad.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // Log.v(TAG, "No Btn Click");
                            dialog.dismiss(); // ??????

                            //Event
                            dialog.cancel();
                        }
                    });

                    // ??? ?????????
                    ad.show();

                } else{
                    AlertDialog.Builder ad = new AlertDialog.Builder(adgroup2.this);
                    ad.setMessage("group2??? ???????????????????"); //?????? ??????

                    // ?????? ?????? ??????
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            long Button_start = System.currentTimeMillis();
                            //Log.v(TAG, "Yes btn Click");
                            on4 process4 = new on4();
                            process4.execute();
                            on5 process5 = new on5();
                            process5.execute();
                            on6 process6 = new on6();
                            process6.execute();

                            dialog.dismiss();   // ??????

                            btn[0].setSelected(true);
                            btn[1].setSelected(true);

                            //Event
                            Mgroup1 = 1;
                            mgroup1.setSelected(true);
                        }
                    });

                    //?????? ?????? ??????
                    ad.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Log.v(TAG, "No Btn Click");
                            dialog.dismiss(); // ??????

                            //Event
                            dialog.cancel();
                        }
                    });

                    // ??? ?????????
                    ad.show();
                }
            }
        });
    }

    public void skin_btn(final View v) {
        Skin_Dialog skin_dialog;
        skin_dialog = new Skin_Dialog(this);
        skin_dialog.show();
    }
}