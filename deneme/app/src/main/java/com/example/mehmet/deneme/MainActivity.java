package com.example.mehmet.deneme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void changeImage(View view){
    ImageView ımageView = (ImageView) findViewById(R.id.imagine);
    Button button =findViewById(R.id.change);
    ımageView.setImageResource(R.drawable.dragons);



    }
}
