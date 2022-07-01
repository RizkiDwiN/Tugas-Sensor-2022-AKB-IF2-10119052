package com.rizki.a10119052_remaps;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
/**
 * Tanggal Pengerjaan : 01 JULI 2022 , 20.24 WIB
 * NIM : 10119052
 * Nama : Rizki Dwi Nugraha
 * Kelas : IF-2
 **/

public class HomeFragment extends Fragment {
    private OnMapReadyCallback callback = new OnMapReadyCallback() {
        @Override
        public void onMapReady(GoogleMap googleMap) {
            LatLng lokasiSekarang = new LatLng(-6.8396777, 107.6047556);
            googleMap.addMarker(new MarkerOptions().position(lokasiSekarang).title("Current Location").snippet("Lokasi Saat ini").icon(BitmapDescriptorFactory.fromResource(R.drawable.current)));
            LatLng lokasi1 = new LatLng(-6.8900978, 107.6162531);
            googleMap.addMarker(new MarkerOptions().position(lokasi1).title("Waroeng Steak and Shake").snippet("Restoran steak").icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
            LatLng lokasi2 = new LatLng(-6.8875477, 107.6151444);
            googleMap.addMarker(new MarkerOptions().position(lokasi2).title("Richisee Factory").snippet("Resto chiken").icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
            LatLng lokasi3 = new LatLng(-6.8846176, 107.6134857);
            googleMap.addMarker(new MarkerOptions().position(lokasi3).title("Ayam geprek pangeran").snippet("Restoran Ayam Geprek").icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
            LatLng lokasi4 = new LatLng(-6.8784296, 107.597833);
            googleMap.addMarker(new MarkerOptions().position(lokasi4).title("KFC Setiabudhi").snippet("Resto Ayam").icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));
            LatLng lokasi5 = new LatLng(-6.926365, 107.6121235);
            googleMap.addMarker(new MarkerOptions().position(lokasi5).title("Ramen Badjuri").snippet("Resto ramen").icon(BitmapDescriptorFactory.fromResource(R.drawable.pin)));

            googleMap.moveCamera(CameraUpdateFactory.newLatLng(lokasi4));
            googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
            googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(lokasi4,18));
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}