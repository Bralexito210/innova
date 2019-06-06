package com.example.david.innova;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class busca_frag extends Fragment {
    private SupportMapFragment mapFragment;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_busca,container,false);
        //ImageView imageView = view.findViewById(R.id.i_1);
        //imageView.setImageDrawable(getResources().getDrawable(R.drawable.a,null));

        if (mapFragment == null) {
            mapFragment = SupportMapFragment.newInstance();
            mapFragment.getMapAsync(new OnMapReadyCallback() {
                @Override
                public void onMapReady(GoogleMap googleMap) {
                    LatLng latLng = new LatLng( -11.9725200, -77.0743900);
                    googleMap.addMarker(new MarkerOptions().position(latLng)
                            .title("cuidad de lima"));
                    googleMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
                }
            });
        }
        getChildFragmentManager().beginTransaction().replace(R.id.map, mapFragment).commit();
        return view;
    }

}
