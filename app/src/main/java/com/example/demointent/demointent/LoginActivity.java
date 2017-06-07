package com.example.demointent.demointent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.tilUsuario) EditText edtUsuario;
    @BindView(R.id.tilSenha) EditText edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnConectar)
    public void conectar(View v) {

    }

    @OnClick(R.id.txtNovoUsuario)
    public void novousuario(View v) {

    }
}
