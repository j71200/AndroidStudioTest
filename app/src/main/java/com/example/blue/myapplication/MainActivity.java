package com.example.blue.myapplication;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private Context context;
    private Button switchButton;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;


        switchButton = (Button) findViewById(R.id.switch_button);
        linearLayout = (LinearLayout) findViewById(R.id.linear_layout);

        switchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("FORTEST", "Removing!!!!!!!");

//                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                LayoutInflater inflater = LayoutInflater.from(context);
                View mView = inflater.inflate(R.layout.input_layout, null, false);

                linearLayout.removeAllViews();


                Log.i("FORTEST", "Attaching!!!!!!!");
                linearLayout.addView(mView);

                doAnything();


            }
        });


    }

    private void doAnything(){
        Log.i("FORTEST", "Do Anything");

        TextView mTV = (TextView) findViewById(R.id.important_text);
        mTV.setText("QQQQQQ");


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
