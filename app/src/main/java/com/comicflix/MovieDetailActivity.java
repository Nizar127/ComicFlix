package com.comicflix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.comicflix.comicflix.R;

public class MovieDetailActivity extends AppCompatActivity {

    ImageView movieImg;
    TextView movieName;
    Button playBtn;

    String movieId, mName, mImg, movieFileURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        movieImg = findViewById(R.id.movieImg);
        movieName = findViewById(R.id.movieName);
        playBtn = findViewById(R.id.play_button);

        //gt data from intent
        movieId = getIntent().getStringExtra("movieId");
        mName = getIntent().getStringExtra("movieName");
        mImg = getIntent().getStringExtra("movieImageUrl");
        movieFileURL = getIntent().getStringExtra("movieFile");

        //set data to layout
        Glide.with(this).load(mImg).into(movieImg);
        movieName.setText(mName);

        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MovieDetailActivity.this, VideoPlayerActivity.class);
                intent.putExtra("url", movieFileURL);
                startActivity(intent);
            }
        });

    }
}
