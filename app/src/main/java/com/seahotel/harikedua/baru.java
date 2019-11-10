package com.seahotel.harikedua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class baru extends AppCompatActivity {
    EditText et1;
    EditText et2;
    TextView tv2;
    Button bt1;
    int hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String v1,v2;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //eror
        Log.e("TAG","OnCreate");
        //pop up sementara
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();
        EditText et1 = (EditText)findViewById(R.id.et1);
        EditText et2 = (EditText)findViewById(R.id.et2);
        TextView tv2 = (TextView)findViewById(R.id.tv2);
        Button bt1 = (Button)findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "Test Click", Toast.LENGTH_SHORT).show();
                hitung();
            }
        });

    }

    private void hitung() {
        Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show();
        //hasil = Integer.parseInt(et1.getText().toString()) * Integer.parseInt(et2.getText().toString());
        //tv2.setText("Test");
    }


}
