package com.seahotel.harikedua;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    TextView tv2;
    Button bt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //eror
        Log.e("TAG","OnCreate");
        //pop up sementara
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        tv2 = (TextView)findViewById(R.id.tv2);
        bt1 = (Button)findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "Test Click", Toast.LENGTH_SHORT).show();
                hitung();
            }
        });

    }

    private void hitung() {
        //Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show();
        String v1,v2;
        v1 = et1.getText().toString();
        v2 = et2.getText().toString();
        int hasil=0;
        if(v1.isEmpty()||v2==null)
            Toast.makeText(this, "Masih Kosong bro", Toast.LENGTH_SHORT).show();
        else {
            hasil = Integer.parseInt(v1) * Integer.parseInt(v2);
            tv2.setText("Hasilnya adalah "+hasil);
            //dialog
            AlertDialog.Builder aD = new AlertDialog.Builder(this);
            aD.setCancelable(false);
            aD.setTitle("Hasil Penjumlahan");
            aD.setMessage("Hasilnya adalah "+hasil);
            //cara membuat buton pada dialog
            aD.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    et1.setText("");
                    et2.setText("");
                    tv2.setText("");
                }
            });
            aD.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    //pindah halaman
                    Intent pindah = new Intent(MainActivity.this,WvActivity.class);
                    startActivity(pindah);

                }
            });
            aD.show();
        }


    }



}
