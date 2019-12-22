package com.vogella.android.projet_mobile.View;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.vogella.android.projet_mobile.Model.Anime;
import com.vogella.android.projet_mobile.R;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {
    public TextView title;
    public TextView date;
    public TextView synopsis;
    private ImageView img;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        title = (TextView) findViewById(R.id.titleLine);
        date =(TextView) findViewById(R.id.dateLine);
        synopsis =(TextView) findViewById(R.id.synopsis);
        //img = (ImageView) findViewById(R.id.anime_img);


        //Intent intent = getIntent();
        //int image = intent.getExtras().getInt("Image");

        String json = getIntent().getStringExtra("anime");
        Gson gson = new Gson();
        Anime item = gson.fromJson(json ,Anime.class);

        title.setText(item.getAttributes().getCanonicalTitle());
        date.setText(item.getAttributes().getStartDate());
        synopsis.setText("Synopsis: " + item.getAttributes().getSynopsis());
        //img.setImageResource(image);



    }
}