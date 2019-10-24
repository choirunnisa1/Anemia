package com.example.anemia.Menu;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.anemia.DataSoal;
import com.example.anemia.MainActivity;
import com.example.anemia.R;
import com.example.anemia.SkorActivity;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class KuisActivity extends AppCompatActivity {

    DataSoal dataSoal;
    int skor, benar;
    CountDownTimer countDownTimer;
    Button optiona, optionb, optionc, optiond;
    TextView no_soal, tv_soal, tv_time;
    String jawaban;
    ArrayList<Integer> randomSoal;
    int indexKuis;
    Dialog notifDialog;
    Button btn_benar, btn_salah, btn_timeout,btn_mulai;
    TextView title_tv, message_tv;

    private static final long COUNTDOWN_IN_MILLIS = 15000;
    private long timeLeftInMillis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuis);

        notifDialog = new Dialog(this);
        randomSoal = new ArrayList<>();

        indexKuis = 0;

        tv_time = findViewById(R.id.time);
        tv_soal = findViewById(R.id.soal);
        no_soal = findViewById(R.id.no);
        optiona = findViewById(R.id.optiona);
        optionb = findViewById(R.id.optionb);
        optionc = findViewById(R.id.optionc);
        optiond = findViewById(R.id.optiond);

        dataSoal = new DataSoal();

        MulaiKuis();

    }

    public void endQuis() {
        indexKuis = indexKuis + 1;
    }


    public void lcm() {
        int i;
        int n = 20;
        int a = 13;
        int m = 23;
        int c = 5;
        int Xn0;
        int[] Xn = new int[n];

        Random b = new Random();
        Xn0 = b.nextInt(10 - 1) + 1;
        Log.d("LCM Xn0 = ", String.valueOf(Xn0));

        for (i = 1; i <= 11; i++) {

            if (i == 1) {
                Xn[i] = (a * Xn0 + c) % m;
            } else if (i > 1 && i <= 10) {
                Xn[i] = (a * Xn[i - 1] + c) % m;
            } else {
                Log.d("Algoritma LCM", "LCM Selesai");
                break;
            }

            if (Xn[i] == 0) Xn[i] = 1;
            randomSoal.add(Xn[i]);
        }

        updateSoal();

        Log.d("RANDOMSOAL", randomSoal.toString());
    }


    public void cekJawaban() {
        optiona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();
                endQuis();
                if (optiona.getText() == jawaban) {
                    BenarPopUp();
                } else {
                    SalahPopUp();

                }

            }
        });

        optionb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();
                endQuis();

                if (optionb.getText() == jawaban) {
                    BenarPopUp();
                } else {
                    SalahPopUp();

                }

            }
        });

        optionc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();
                endQuis();
                if (optionc.getText() == jawaban) {
                    BenarPopUp();
                } else {
                    SalahPopUp();

                }

            }
        });

        optiond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                countDownTimer.cancel();
                endQuis();
                if (optiond.getText() == jawaban) {
                    BenarPopUp();
                } else {
                    SalahPopUp();

                }

            }
        });

    }


    public void updateSoal() {
        if (indexKuis == 10) {
            skor = (benar * 10);
            String skorx = String.valueOf(skor);
            Intent i = new Intent(KuisActivity.this, SkorActivity.class);
            i.putExtra("skorakhir", skorx);
            startActivity(i);
        } else {
            no_soal.setText("" + (indexKuis + 1));
            Log.w("Algoritma LCM","X"+String.valueOf(indexKuis + 1)+"="+String.valueOf(randomSoal.get(indexKuis)));
            tv_soal.setText(dataSoal.getSoal(randomSoal.get(indexKuis) - 1));
            optiona.setText(dataSoal.getOpsi1(randomSoal.get(indexKuis) - 1));
            optionb.setText(dataSoal.getOpsi2(randomSoal.get(indexKuis) - 1));
            optionc.setText(dataSoal.getOpsi3(randomSoal.get(indexKuis) - 1));
            optiond.setText(dataSoal.getOpsi4(randomSoal.get(indexKuis) - 1));
            jawaban = dataSoal.getJawaban(randomSoal.get(indexKuis) - 1);
            timeLeftInMillis = COUNTDOWN_IN_MILLIS;
            startCountDown();
        }
    }

    public void MulaiKuis(){
        notifDialog.setContentView(R.layout.kuis_awal);
        btn_mulai = notifDialog.findViewById(R.id.button_mulai);
        title_tv = notifDialog.findViewById(R.id.title_mulai);
        message_tv = notifDialog.findViewById(R.id.message_benar);
        btn_mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notifDialog.dismiss();
                lcm();
                cekJawaban();
            }
        });

        notifDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        notifDialog.show();
    }

    public void BenarPopUp() {
        benar = benar + 1;
        notifDialog.setContentView(R.layout.pop_benar_layout);
        btn_benar = notifDialog.findViewById(R.id.button_benar);
        title_tv = notifDialog.findViewById(R.id.title_benar);
        message_tv = notifDialog.findViewById(R.id.t_mulai);
        onBackPressed();
        btn_benar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notifDialog.dismiss();
                updateSoal();
            }
        });

        notifDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        notifDialog.show();
    }

    public void SalahPopUp() {
        benar = benar + 0;
        notifDialog.setContentView(R.layout.pop_salah_layout);
        btn_salah = notifDialog.findViewById(R.id.button_salah);
        title_tv = notifDialog.findViewById(R.id.title_salah);
        message_tv = notifDialog.findViewById(R.id.message_salah);
        onBackPressed();
        btn_salah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notifDialog.dismiss();
                updateSoal();
            }
        });

        notifDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        notifDialog.show();

    }

    public void TimeoutPopUp() {
        benar = benar + 0;
        notifDialog.setContentView(R.layout.timeout_layout);
        btn_timeout = notifDialog.findViewById(R.id.button_timeout);
        title_tv = notifDialog.findViewById(R.id.title_timeout);
        message_tv = notifDialog.findViewById(R.id.message_timeout);

        btn_timeout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notifDialog.dismiss();
                updateSoal();
            }
        });

        notifDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        notifDialog.show();
    }

    private void startCountDown() {
        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                endQuis();
                TimeoutPopUp();
            }
        }.start();

    }

    private void updateCountDownText() {
        int minutes = (int) (timeLeftInMillis / 1000) / 60;
        int seconds = (int) (timeLeftInMillis / 1000) % 60;

        String timeFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

        tv_time.setText(timeFormatted);
    }

    public void toHome(View view) {
        countDownTimer.cancel();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Yakin keluar dari kuis?")
                .setPositiveButton("YA", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        countDownTimer.cancel();
                        Intent closeIntent = new Intent(KuisActivity.this, MainActivity.class);
                        closeIntent.addCategory(Intent.CATEGORY_HOME);
                        closeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(closeIntent);
                    }
                });
        builder.setNegativeButton("TIDAK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startCountDown();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override
    public void onBackPressed() {
    }

}
