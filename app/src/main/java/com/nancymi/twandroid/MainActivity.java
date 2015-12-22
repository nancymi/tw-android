package com.nancymi.twandroid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

import service.RetrofitExecutor;
import service.TaskCallback;

public class MainActivity extends AppCompatActivity {

    private static String URL = "http://www.pm25.in";

    private TextView areaText;

    private Button chooseAreaBtn;

    private Button refreshBtn;

    private RetrofitExecutor executor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        executor.execute(new TaskCallback() {
            @Override
            public void onCompleted(Object param) {
                    areaText.setText(param.toString());
            }
        });
    }

    private void init() {
        areaText = (TextView) findViewById(R.id.text_view);
        chooseAreaBtn = (Button) findViewById(R.id.choose_area_btn);
        refreshBtn = (Button) findViewById(R.id.refresh_btn);
        executor = new RetrofitExecutor(URL);
    }

    @Override
    protected void onStart() {
        super.onStart();
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
}
