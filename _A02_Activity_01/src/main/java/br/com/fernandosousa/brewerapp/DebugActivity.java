package br.com.fernandosousa.brewerapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by fsousa on 26/02/2017.
 */

public class DebugActivity extends AppCompatActivity {

    private String DEBUG_TAG = "BrewerApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(DEBUG_TAG, " onCreate() chamado");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(DEBUG_TAG, " onStart() chamado");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(DEBUG_TAG, " onRestart() chamado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(DEBUG_TAG, " onResume() chamado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(DEBUG_TAG, " onPause() chamado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(DEBUG_TAG, " onStop() chamado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(DEBUG_TAG, " onDestroy() chamado");
    }


}
