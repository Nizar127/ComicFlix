package com.comicflix.Drawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.comicflix.Community.HomeCommunity;
import com.comicflix.Manga_Stream.MangaStreamActivity;
import com.comicflix.Model.User;
import com.comicflix.PlanSubscription;
import com.comicflix.Profile.DownloadActivity;
import com.comicflix.Profile.FavouriteActivity;
import com.comicflix.Profile.SettingActivity;
import com.comicflix.StartView;
import com.comicflix.Video_Detail.MerchandiseActivity;
import com.comicflix.comicflix.R;
import com.google.android.material.navigation.NavigationView;

public class DrawerActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    User users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);


        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Home");
        setSupportActionBar(toolbar);




        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_viewDrawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);






    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id= item.getItemId();

        if(id == R.id.nav_home){
            Intent intent = new Intent(DrawerActivity.this, StartView.class);
            startActivity(intent);
        } else if(id == R.id.nav_community){
            Intent intent = new Intent(DrawerActivity.this, HomeCommunity.class);
            startActivity(intent);
        }
        else if(id == R.id.nav_manga){
            Intent intent = new Intent(DrawerActivity.this, MangaStreamActivity.class);
            startActivity(intent);
        } else if(id == R.id.nav_merchandise){
            Intent intent = new Intent(DrawerActivity.this, MerchandiseActivity.class);
            startActivity(intent);
        } else if(id == R.id.nav_watchlist){
            Intent intent = new Intent(DrawerActivity.this, FavouriteActivity.class);
            startActivity(intent);
        } else if(id == R.id.nav_download){
            Intent intent = new Intent(DrawerActivity.this, DownloadActivity.class);
            startActivity(intent);
        } else if(id == R.id.nav_changePlan){
            Intent intent = new Intent(DrawerActivity.this, PlanSubscription.class);
            startActivity(intent);
        } else if(id == R.id.nav_settings){
            Intent intent = new Intent(DrawerActivity.this, SettingActivity.class);
            startActivity(intent);
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
