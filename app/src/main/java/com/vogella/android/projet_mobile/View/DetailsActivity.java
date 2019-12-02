package com.vogella.android.projet_mobile.View;

import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;
import com.vogella.android.projet_mobile.Model.Anime;
import com.vogella.android.projet_mobile.R;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {
    public TextView title;
    public TextView date;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        title = (TextView) findViewById(R.id.titleLine);
        date =(TextView) findViewById(R.id.dateLine);


        String json = getIntent().getStringExtra("anime");
        Gson gson = new Gson();
        Anime item = gson.fromJson(json ,Anime.class);

        title.setText("Title: " + item.getAttributes().getCanonicalTitle());
        date.setText("Date: " + item.getAttributes().getStartDate());



    }
}
