package com.example.demointent.demointent;

import android.content.Intent;
import android.os.PersistableBundle;
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

    public static final int REQUEST_CODE_USUARIO = 0;

    @BindView(R.id.tilUsuario) EditText edtUsuario;
    @BindView(R.id.tilSenha) EditText edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnConectar)
    public void conectar() {

    }

    @OnClick(R.id.txtNovoUsuario)
    public void novousuario() {
        Intent intent = new Intent(this, NovoUsuarioActivity.class);
        startActivityForResult(intent, REQUEST_CODE_USUARIO);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case REQUEST_CODE_USUARIO:
                edtUsuario.setText(data.getStringExtra("nome"));
                break;
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        outState.putString("nome", edtUsuario.getText().toString());
        super.onSaveInstanceState(outState, outPersistentState);

    }
}
