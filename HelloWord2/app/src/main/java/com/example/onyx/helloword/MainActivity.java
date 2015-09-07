package com.example.onyx.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * ≤‚ ‘π§æﬂ
 */
public class MainActivity extends AppCompatActivity {

     @Override
     protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);
          TextView textView= (TextView) findViewById(R.id.hello_tv);
          textView.setText("Hello ! Wangxu ! Welcome to ONYX !");
     }




}
