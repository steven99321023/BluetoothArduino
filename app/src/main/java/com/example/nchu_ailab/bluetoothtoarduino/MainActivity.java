package com.example.nchu_ailab.bluetoothtoarduino;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.widget.Button;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {
    private Button btn_on,btn_off;

    String address = null;
    private ProgressDialog progress;

    private boolean isBtConnected = false;
    static final UUID myUUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

    BluetoothAdapter myBluetooth = null;
    BluetoothSocket btSocket = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent newint = getIntent();
        address = newint.getStringExtra("EXTRA_ADDRESS");

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn_on=(Button) findViewById(R.id.btn_on);
        btn_off=(Button) findViewById(R.id.btn_off);

        btn_on.setOnClickListener(btnTurnOn);
        btn_off.setOnClickListener(btnTurnOff);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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
    private Button.OnClickListener btnTurnOn = new Button.OnClickListener(){
        public void onClick(View v){
            //btSocket.getOutputStream().write("TO".toString().getBytes());

        }
    };
    private Button.OnClickListener btnTurnOff = new Button.OnClickListener(){
        public void onClick(View v){

        }
    };
}
