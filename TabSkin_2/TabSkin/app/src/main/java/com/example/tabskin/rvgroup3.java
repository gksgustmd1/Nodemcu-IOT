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

public class rvgroup3 extends AppCompatActivity {

    private int mbtn1;
    private int Mgroup1;

    Button[] gbtn = new Button[1];
    Button[] btn = new Button[13];

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rvgroup3);

        final LinearLayout mgroup1 = (LinearLayout) findViewById(R.id.btns);

        Button ALL = findViewById(R.id.rvgroup_all);
        Button group1 = findViewById(R.id.rvgroup1);
        Button group2 = findViewById(R.id.rvgroup2);
        Button group3 = findViewById(R.id.rvgroup3);
        Button group4 = findViewById(R.id.rvgroup4);

        btn[0] = (Button)findViewById(R.id.button1);
        btn[1] = (Button)findViewById(R.id.button2);
        btn[2] = (Button)findViewById(R.id.button3);

        ALL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(rvgroup3.this, Skin1.class);
                startActivity(intent);
            }
        });

        group1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(rvgroup3.this, rvgroup1.class);
                startActivity(myintent);
                finish();
            }
        });

        group2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(rvgroup3.this, rvgroup2.class);
                        startActivity(intent);
                    }
                });

        group3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(rvgroup3.this, rvgroup3.class);
                startActivity(intent);
            }
        });

        group4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(rvgroup3.this, rvgroup4.class);
                startActivity(intent);
            }
        });

        mgroup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (Mgroup1 == 1) {

                    AlertDialog.Builder ad = new AlertDialog.Builder(rvgroup3.this);
                    ad.setMessage("group3??? ???????????????????"); //?????? ??????

                    // ?????? ?????? ??????
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            long Button_start = System.currentTimeMillis();
                            //Log.v(TAG, "Yes btn Click");
                            off7 process7 = new off7();
                            process7.execute();
                            off8 process8 = new off8();
                            process8.execute();

                            dialog.dismiss();   // ??????

                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {-android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.skin1_btn_sub));
                            btn[0].setBackgroundDrawable(states);
                            btn[1].setBackgroundDrawable(states);

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
                    AlertDialog.Builder ad = new AlertDialog.Builder(rvgroup3.this);
                    ad.setMessage("group3??? ???????????????????"); //?????? ??????

                    // ?????? ?????? ??????
                    ad.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            long Button_start = System.currentTimeMillis();
                            //Log.v(TAG, "Yes btn Click");
                            on7 process7 = new on7();
                            process7.execute();
                            on8 process8 = new on8();
                            process8.execute();

                            dialog.dismiss();   // ??????

                            StateListDrawable states = new StateListDrawable();
                            states.addState(new int[] {android.R.attr.state_selected},
                                    getResources().getDrawable(R.drawable.skin1_btn_sub));
                            btn[0].setBackgroundDrawable(states);
                            btn[1].setBackgroundDrawable(states);

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

    // end ?????? ??????
    public void end(final View v) {
        End_Dialog end_dialog;
        end_dialog = new End_Dialog(this);
        end_dialog.show();
    }
}