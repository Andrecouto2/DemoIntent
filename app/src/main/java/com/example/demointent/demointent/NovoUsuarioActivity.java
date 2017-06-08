package com.example.demointent.demointent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NovoUsuarioActivity extends AppCompatActivity {

    @BindView(R.id.tilUsuario)
    EditText edtUsuario;
    @BindView(R.id.tilNome)
    EditText edtNome;
    @BindView(R.id.tilSenha)
    EditText edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_usuario);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnCriar)
    public void criar() {
        Intent i = new Intent();
        i.putExtra("nome", edtUsuario.getText().toString());
        setResult(RESULT_OK, i);
        finish();
    }
}
