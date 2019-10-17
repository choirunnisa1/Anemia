package com.example.anemia;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

import com.example.anemia.Menu.BantuanActivity;
import com.example.anemia.Menu.KuisActivity;
import com.example.anemia.Menu.MateriActivity;
import com.example.anemia.Menu.TentangActivity;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void toMateri(View view) {
        Intent materiIntent = new Intent(MainActivity.this, MateriActivity.class);
        startActivity(materiIntent);
    }

    public void toQuiz(View view){
        Intent moveIntent = new Intent(MainActivity.this, KuisActivity.class);
        startActivity(moveIntent);
    }

    public void toHelp(View view){
        Intent bantuanIntent = new Intent(MainActivity.this, BantuanActivity.class);
        startActivity(bantuanIntent);
    }

    public void toAbout(View view){
        Intent tentangIntent = new Intent(MainActivity.this, TentangActivity.class);
        startActivity(tentangIntent);
    }

    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
                builder.setMessage("Yakin keluar aplikasi?")
                .setPositiveButton("YA", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                       finish();
                       System.exit(0);
                    }
                });
        builder.setNegativeButton("TIDAK", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            //if user select "No", just cancel this dialog and continue with app
            dialog.cancel();
        }
    });
    AlertDialog alert = builder.create();
        alert.show();
}
    }



