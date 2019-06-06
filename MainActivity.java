package com.example.david.innova;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bN = findViewById(R.id.btn_nav);
        bN.setOnNavigationItemSelectedListener(nav_listen);
        //inicio
        Fragment a = new home_frag();
        getSupportFragmentManager().beginTransaction().replace(R.id.f_content
                ,a).commit();
    }
    private BottomNavigationView.OnNavigationItemSelectedListener nav_listen =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment select = null;
                    switch (menuItem.getItemId()){
                        case R.id.nav_home:
                            select = new home_frag();
                            break;
                        case R.id.nav_search:
                            select = new busca_frag();
                            break;
                        case R.id.nav_list:
                            select = new lista_frag();
                            break;


                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.f_content
                    ,select).commit();
                    return  true;
                }
            };

}
