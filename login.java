package com.example.david.innova;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.david.innova.entidad.user;
import com.example.david.innova.utilidades.utilidades;

public class login extends AppCompatActivity {
    TextView user,pass;
    qlite conn = new qlite(this,"bd_user",null,1);
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        user=findViewById(R.id.txt_user);
        pass=findViewById(R.id.txt_pass);


        Button btn = findViewById(R.id.btn_login);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Toast.makeText(getApplicationContext(),"hola",Toast.LENGTH_SHORT).show();
                    Intent t = new Intent(login.this,MainActivity.class);
                    startActivity(t);
                    finish();

            }
        });

        TextView t_crear = findViewById(R.id.textView3);

        t_crear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"registrarse",Toast.LENGTH_SHORT).show();
                Intent t = new Intent(login.this,crear_cuenta.class);
                startActivity(t);
            }
        });

        }
private int consulta(){
        com.example.david.innova.entidad.user u = new user();
    SQLiteDatabase db = conn.getReadableDatabase();
    String[] params={user.getText().toString()};
    String[] campo = {utilidades.nom_user,utilidades.pass_user};
try {
    Cursor cursor = db.query(utilidades.t_user,campo,utilidades.nom_user+"=?",params,null,null,null);
    cursor.moveToFirst();

    u.setNombre(cursor.getString(0));
    u.setPass_user(cursor.getString(1));
    cursor.close();
    return 1;
}catch (Exception e){
    return  0;
}

}

}
