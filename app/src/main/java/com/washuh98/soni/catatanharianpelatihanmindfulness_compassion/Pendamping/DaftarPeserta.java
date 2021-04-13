package com.washuh98.soni.catatanharianpelatihanmindfulness_compassion.Pendamping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.washuh98.soni.catatanharianpelatihanmindfulness_compassion.R;

public class DaftarPeserta extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_peserta);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {

        }
    }
}
