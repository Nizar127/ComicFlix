package com.comicflix.Profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.comicflix.Drawer.DrawerActivity;
import com.comicflix.PlanSubscription;
import com.comicflix.Video_Detail.MerchandiseActivity;
import com.comicflix.comicflix.R;

public class ProfileActivity extends AppCompatActivity {

    Toolbar toolbarProfile;
    ImageView dropdown, userImg;
    TextView userNameProfile;
    ViewPager viewProfileData;
    RecyclerView histroyRecyclerview;
    Button download,my_list,shop_merchandise, menuDrawer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        toolbarProfile = findViewById(R.id.toolbar_profile);
        menuDrawer = findViewById(R.id.drawer_open);
        dropdown = findViewById(R.id.dropdown);
        userImg = findViewById(R.id.userImgProfile);
        userNameProfile = findViewById(R.id.userNameProfile);
        viewProfileData = findViewById(R.id.bannerViewPagerprofile);
        histroyRecyclerview = findViewById(R.id.historyRecyclerview);
        download = findViewById(R.id.watchDwnldBtn);
        my_list = findViewById(R.id.mylistBtn);
        shop_merchandise = findViewById(R.id.shopMerchandiseBtn);




        //drawer button
        menuDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, DrawerActivity.class);
                startActivity(intent);
            }
        });


        //open button to these button
        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, DownloadActivity.class);
                startActivity(intent);
            }
        });

        my_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, FavouriteActivity.class);
                startActivity(intent);
            }
        });

        shop_merchandise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, MerchandiseActivity.class);
                startActivity(intent);
            }
        });


    }
}
