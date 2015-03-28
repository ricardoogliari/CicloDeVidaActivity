package com.box.personal.ricardo.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    private final String LOG = "CICLO DE VIDA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(LOG, "OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(LOG, "OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(LOG, "OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(LOG, "OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(LOG, "OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(LOG, "OnDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(LOG, "OnRestart");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
