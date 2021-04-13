package com.washuh98.soni.catatanharianpelatihanmindfulness_compassion.Peserta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.washuh98.soni.catatanharianpelatihanmindfulness_compassion.R;
import com.washuh98.soni.catatanharianpelatihanmindfulness_compassion.SesiTraining;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Peserta extends AppCompatActivity implements View.OnClickListener {

    private Calendar calendar;
    private SimpleDateFormat dateFormat;

    private ImageView guide, chat;
    private TextView date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peserta);

        date = findViewById(R.id.datePeserta);
        guide = findViewById(R.id.guidePeserta);
        chat = findViewById(R.id.chatPeserta);

        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        date.setText(dateFormat.format(calendar.getTime()));

        guide.setOnClickListener(this);
        chat.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.chatPeserta :
                break;
            case R.id.guidePeserta :
                break;
        }
    }
}
