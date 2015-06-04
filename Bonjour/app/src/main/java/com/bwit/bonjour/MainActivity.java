package com.bwit.bonjour;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) this.findViewById(R.id.bouton1);
        EditText edit = (EditText) this.findViewById(R.id.edit1);
        button.setOnClickListener(this);
        if(this.getIntent().getExtras() != null){
            String s = this.getIntent().getExtras().getString("madonnee");
            edit.setText(s);
        }

        Log.i("DansBonjour", "oncreate");
    }

    @Override
    protected void onStart() {
        Log.i("DansBonjour", "onStart");
        super.onStart();
    }

    @Override
    protected void onPause() {
        Log.i("DansBonjour", "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("DansBonjour", "onstop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("DansBonjour","onDestroye");
        super.onDestroy();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("madonnee", "Bonjour");
        this.startActivityForResult(intent, 1000);

    }
}
