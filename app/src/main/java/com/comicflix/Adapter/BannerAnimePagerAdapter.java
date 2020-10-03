package com.comicflix.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;
import com.comicflix.Model.BannerAnime;
import com.comicflix.MovieDetailActivity;
import com.comicflix.comicflix.R;

import java.util.List;

public class BannerAnimePagerAdapter extends PagerAdapter {

    Context context;
    List<BannerAnime> bannerAnimeList;

    public BannerAnimePagerAdapter(Context context, List<BannerAnime> bannerAnimeList) {
        this.context = context;
        this.bannerAnimeList = bannerAnimeList;
    }

    @Override
    public int getCount() {
        return bannerAnimeList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.banner_anime_layout, null);

        ImageView bannerImage1 = view.findViewById(R.id.bannerImg1);
        Glide.with(context).load(bannerAnimeList.get(position).getImgUrl()).into(bannerImage1);
        container.addView(view);

        bannerImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MovieDetailActivity.class);
                intent.putExtra("movieId", bannerAnimeList.get(position).getId());
                intent.putExtra("movieName", bannerAnimeList.get(position).getAnimeMovies());
                intent.putExtra("movieImageUrl", bannerAnimeList.get(position).getImgUrl());
                intent.putExtra("movieFile", bannerAnimeList.get(position).getFileUrl());
                context.startActivity(intent);
            }
        });
        return view;
    }
}
