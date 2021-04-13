package com.washuh98.soni.catatanharianpelatihanmindfulness_compassion.Login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.washuh98.soni.catatanharianpelatihanmindfulness_compassion.Pendamping.Pendamping;
import com.washuh98.soni.catatanharianpelatihanmindfulness_compassion.Peserta.Peserta;
import com.washuh98.soni.catatanharianpelatihanmindfulness_compassion.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private String kUsername;
    private String kPassword;
    private EditText username,password;

    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.lUsername);
        password = findViewById(R.id.lPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(this);
    }

    private void LoginPeserta(final String username, final String password)
    {
        if(username.equals("peserta") && password.equals("peserta"))
        {
            startActivity(new Intent(LoginActivity.this, Peserta.class));
            finish();
        }
        else if (username.equals("admin") && password.equals("admin"))
        {
            LoginPengurus(username, password);
        }
    }

    private void LoginPengurus(final String username, final String password)
    {
        startActivity(new Intent(LoginActivity.this, Pendamping.class));
        finish();
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnLogin:
                kUsername = username.getText().toString();
                kPassword = password.getText().toString();
                LoginPeserta(kUsername,kPassword);
                clearEdit();
                break;
        }
    }

    public void clearEdit() {
        username.getText().clear();
        password.getText().clear();
    }
}