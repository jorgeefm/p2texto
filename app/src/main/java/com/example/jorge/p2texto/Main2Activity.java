package com.example.jorge.p2texto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView recibido,recibido2,recibido3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        recibido=(TextView)findViewById(R.id.recibir1);
        recibido2=(TextView)findViewById(R.id.recibir2);
        recibido3=(TextView)findViewById(R.id.recibir3);

        Bundle recibir=getIntent().getExtras();
        recibido.setText(recibir.getString("texto1"));
        recibido2.setText(recibir.getString("texto2"));
        recibido3.setText(recibir.getString("texto3"));

    }
}
