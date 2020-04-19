package com.example.tugas.wisatasubmission;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView name, alamat, text_provinsi, provinsi, text_waktu, waktu, text_deskripsi, deskripsi;
    ImageView imageUtama, image1, image2, image3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        name = findViewById(R.id.rv_wisatas);
        deskripsi = findViewById(R.id.deskripsi);

    }
}
