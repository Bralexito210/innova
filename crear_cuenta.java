package com.example.david.innova;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.david.innova.utilidades.utilidades;


public class crear_cuenta extends AppCompatActivity {
    Button btn_crear;
    TextView t_dni,t_nom,t_ape,t_dir,t_mail,t_user,t_pass,t_cod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crear_cuenta);

        t_dni = findViewById(R.id.txt_dni);
        t_nom = findViewById(R.id.txt_nom);
        t_ape = findViewById(R.id.txt_ape);
        t_dir  = findViewById(R.id.txt_dir);
        t_mail = findViewById(R.id.txt_mail);
        t_user = findViewById(R.id.txt_user);
        t_pass = findViewById(R.id.txt_pass);
        t_cod = findViewById(R.id.txt_secret);
        btn_crear =findViewById(R.id.btn_crear_c);

        btn_crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"registro",Toast.LENGTH_SHORT).show();
                registro();
                //Intent t = new Intent(crear_cuenta.this,login.class);
                //startActivity(t);

            }
        });

    }
    private void registro(){
        qlite conn = new qlite(this,"bd_user",null,1);

        SQLiteDatabase db = conn.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(utilidades.nom_user,t_nom.getText().toString());
        values.put(utilidades.pass_user,t_pass.getText().toString());

        Long id_res = db.insert(utilidades.t_user,utilidades.nom_user,values);
        db.close();
    }

}
