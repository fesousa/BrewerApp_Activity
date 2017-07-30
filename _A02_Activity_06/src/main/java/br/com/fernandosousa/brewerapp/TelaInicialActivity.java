package br.com.fernandosousa.brewerapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class TelaInicialActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        Intent intent = getIntent();
        Bundle params = intent.getExtras();
        String nome = params.getString("nome");

        Log.d(DEBUG_TAG, "Nome do usuário: " + nome);
        Toast.makeText(TelaInicialActivity.this, "Nome do usuário: " + nome, Toast.LENGTH_LONG).show();

        TextView texto = (TextView) findViewById(R.id.textoInicial);
        texto.setText(nome);
    }
}
