package com.washuh98.soni.catatanharianpelatihanmindfulness_compassion.Pendamping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.washuh98.soni.catatanharianpelatihanmindfulness_compassion.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Pendamping extends AppCompatActivity implements View.OnClickListener{
    ImageView regist,chat;
    private TextView datePendamping;
    private Calendar calendar;
    private SimpleDateFormat dateFormat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendamping);

        datePendamping = findViewById(R.id.datePendamping);
        regist = findViewById(R.id.registerPeserta);
        chat = findViewById(R.id.chatPendamping);

        regist.setOnClickListener(this);
        chat.setOnClickListener(this);

        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        datePendamping.setText(dateFormat.format(calendar.getTime()));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.registerPeserta:
                startActivity(new Intent(Pendamping.this,DaftarPeserta.class));
                break;
            case R.id.chatPendamping:
                break;
        }
    }
}
