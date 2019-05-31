package com.example.androidlibvarun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_jokes );
        textView=findViewById( R.id.textview_id );
        Bundle b=getIntent().getExtras();
        String joke=b.getString( "tada" );
        textView.setText( joke );

    }
}
