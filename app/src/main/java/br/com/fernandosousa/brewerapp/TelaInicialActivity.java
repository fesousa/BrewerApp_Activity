package br.com.fernandosousa.brewerapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

        Button botaoSair = (Button)findViewById(R.id.botaoSair);
        botaoSair.setOnClickListener(clickSair());
    }

    public View.OnClickListener clickSair() {
        return new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent returnIntent = new Intent();
                returnIntent.putExtra("result","Saída do BrewerApp");
                setResult(Activity.RESULT_OK,returnIntent);
                finish();
            }
        };
    }
}
