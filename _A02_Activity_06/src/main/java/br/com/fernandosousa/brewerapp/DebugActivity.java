package br.com.fernandosousa.brewerapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by fsousa on 26/02/2017.
 */

public class DebugActivity extends AppCompatActivity {

    protected String DEBUG_TAG = "BrewerApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(DEBUG_TAG, getClassName()+" onCreate() chamado");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(DEBUG_TAG, getClassName()+" onStart() chamado");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(DEBUG_TAG, getClassName()+" onRestart() chamado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(DEBUG_TAG, getClassName()+" onResume() chamado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(DEBUG_TAG, getClassName()+" onPause() chamado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(DEBUG_TAG, getClassName()+" onStop() chamado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(DEBUG_TAG, getClassName()+" onDestroy() chamado");
    }

    private String getClassName() {
        String s  = getClass().getName();
        return s.substring(s.lastIndexOf("."));
    }



}
