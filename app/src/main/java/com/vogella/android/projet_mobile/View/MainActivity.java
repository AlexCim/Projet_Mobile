package com.vogella.android.projet_mobile.View;

import android.content.Intent;
import android.os.Bundle;

import com.google.gson.Gson;
import com.vogella.android.projet_mobile.Controller.Controller;
import com.vogella.android.projet_mobile.Model.Anime;
import com.vogella.android.projet_mobile.R;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private Controller controller;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain);
        recyclerView = findViewById(R.id.my_recycler_view);
        controller = new Controller(this, getBaseContext());
        controller.start();

    }

    public void showList(List<Anime> input){
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new MyAdapter(input, new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Anime item) {
                detailsFilms(item);
            }
        });
        recyclerView.setAdapter(mAdapter);
    }

    public void detailsFilms(Anime anime){
        Gson gson = new Gson();
        String json = gson.toJson(anime);
        Intent detailsIntent = new Intent(this, DetailsActivity.class);
        detailsIntent.putExtra("anime", json);
        startActivity(detailsIntent);
    }
}
