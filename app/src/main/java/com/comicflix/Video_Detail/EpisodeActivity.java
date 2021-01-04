package com.comicflix.Video_Detail;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.comicflix.comicflix.R;

public class EpisodeActivity extends AppCompatActivity {

    RecyclerView episodeList;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_episode);
        episodeList = findViewById(R.id.episode_recycler);
    }
}
