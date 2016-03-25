package com.example.hacker.myappprotfolio;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button Streamer , ScoreApp , LibraryApp , Buildbigger , Backonreader , Capstone ;
    TextView text ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        text.setTextSize(16 * getResources().getDisplayMetrics().density);

        Streamer =   (Button) findViewById(R.id.streamer);
        ScoreApp=    (Button) findViewById(R.id.duo1);
        LibraryApp = (Button) findViewById(R.id.duo2);
        Buildbigger =(Button) findViewById(R.id.terminator);
        Backonreader = (Button) findViewById(R.id.materialize);
        Capstone = (Button) findViewById(R.id.capston);


        Streamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"This button will launch Spotify Streamer",Toast.LENGTH_LONG).show();
            }
        });

        ScoreApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"This button will launch Scores App",Toast.LENGTH_LONG).show();
            }
        });

        LibraryApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"This button will launch Library App",Toast.LENGTH_LONG).show();
            }
        });
        Buildbigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "This button will launch Build It Bigger", Toast.LENGTH_LONG).show();
            }
        });

        Backonreader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "This button will launch BACKON READER", Toast.LENGTH_LONG).show();
            }
        });
        Capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"This button will launch my capstone app!",Toast.LENGTH_LONG).show();
            }
        });


    }
}
