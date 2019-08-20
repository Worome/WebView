package com.trianacodes.script.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        url = findViewById(R.id.bt_Navegar);

    }

    public void Navegar(View view){

        Intent i = new Intent(this, ActivityWeb.class);
        i.putExtra("url", url.getText().toString());
        startActivity(i);

    }

}
