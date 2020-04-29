package com.example.praktikum5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.SearchView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    GoogleMap mapAPI;
    SupportMapFragment mapFragment;
    SearchView searchView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.mapAPI);

        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mapAPI = googleMap;

        LatLng spbutuban = new LatLng(-6.906269, 112.072535);
        mapAPI.addMarker(new MarkerOptions().position(spbutuban).title("SPBU Pertamina 54.623.05 (POM SLEKO)")
                .snippet("Gang Buntu No.10, Kec.Semanding, Kabupaten Tuban, Jawa Timur"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(spbutuban));

        LatLng spbutuban2 = new LatLng(-6.894423, 112.039312);
        mapAPI.addMarker(new MarkerOptions().position(spbutuban2).title("SPBU Pertamina 53.623.21 (POM PATUNG)")
                .snippet("Latsari, Kec.Tuban, Kabupaten Tuban, Jawa Timur"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(spbutuban2));

        LatLng spbutuban3 = new LatLng(-6.903315, 112.080250);
        mapAPI.addMarker(new MarkerOptions().position(spbutuban3).title("SPBU Pertamina 54.623.17 (POM MANUNGGAL)")
                .snippet("Jl. Manunggal, Keduran, Panyuran, Kec.Palang, Kabupaten Tuban, Jawa Timur"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(spbutuban3));

        LatLng spbutuban4 = new LatLng(-6.900081, 112.115736);
        mapAPI.addMarker(new MarkerOptions().position(spbutuban4).title("SPBU Pertamina 53.623.23 (POM KRADENAN)")
                .snippet("Jl. Nasional No.17, Karangrejo, Keradenan, Kec.Palang, Kabupaten Tuban, Jawa Timur"));
        mapAPI.moveCamera(CameraUpdateFactory.newLatLng(spbutuban4));

    }
}
