package com.example.david.innova.frag;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.david.innova.R;

public class imagen_inicio extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_imagen_inicio,container,false);
        //ImageView imageView = view.findViewById(R.id.i_1);
        //imageView.setImageDrawable(getResources().getDrawable(R.drawable.a,null));
        return view;
    }
}
