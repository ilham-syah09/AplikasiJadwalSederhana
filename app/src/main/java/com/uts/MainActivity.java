package com.uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.view.View;
import android.widget.DigitalClock;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView monday,thursday,wednesday,tuesday,friday,user,about;
    private ImageView ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inisialisasi
        monday = (CardView) findViewById(R.id.mon);
        thursday = (CardView) findViewById(R.id.thu);
        wednesday = (CardView) findViewById(R.id.wed);
        tuesday = (CardView) findViewById(R.id.tue);
        friday = (CardView) findViewById(R.id.fri);
        user = (CardView) findViewById(R.id.profile);
        about = (CardView) findViewById(R.id.info);
        ImageView = (ImageView) findViewById(R.id.imgView1);

        //onclick
        monday.setOnClickListener(this);
        thursday.setOnClickListener(this);
        wednesday.setOnClickListener(this);
        tuesday.setOnClickListener(this);
        friday.setOnClickListener(this);
        user.setOnClickListener(this);
        about.setOnClickListener(this);
        ImageView.setOnClickListener(this);

        //DigitalClock
        DigitalClock dc = (DigitalClock) findViewById(R.id.digitalClock1);

        //Date
        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());

        TextView textView = findViewById(R.id.date);
        textView.setText(currentDate);
    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()) {
            case R.id.mon : i = new Intent(this,Monday.class); startActivity(i); break;
            case R.id.thu : i = new Intent(this,Thursday.class); startActivity(i); break;
            case R.id.wed : i = new Intent(this,Wednesday.class); startActivity(i); break;
            case R.id.tue : i = new Intent(this,Tuesday.class); startActivity(i); break;
            case R.id.fri : i = new Intent(this,Friday.class); startActivity(i); break;
            case R.id.profile : i = new Intent(this,Profile.class); startActivity(i); break;
            case R.id.info : i = new Intent(this,About.class); startActivity(i); break;
            case R.id.imgView1 : i = new Intent(this,Profile.class); startActivity(i); break;
            default:break;

        }
    }
}
