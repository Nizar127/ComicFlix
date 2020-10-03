package com.comicflix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toolbar;

import com.comicflix.Adapter.BannerAnimePagerAdapter;
import com.comicflix.Adapter.MainRecyclerAdapter;
import com.comicflix.Model.AllCategory;
import com.comicflix.Model.BannerAnime;
import com.comicflix.Model.CategoryItem;
import com.comicflix.comicflix.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class StartView extends AppCompatActivity {

    BannerAnimePagerAdapter bannerAnimePagerAdapter;
    TabLayout tabIndicator, categoryTab;
    ViewPager bannerAnimeViewPager;
    List<BannerAnime> bannerAnimeList;
    List<BannerAnime> bannerCartoonList;
    List<BannerAnime> bannerMangaList;
    List<BannerAnime> bannerTutorialList;
    List<BannerAnime> bannerGamingList;
    List<BannerAnime> bannerTVShowList;
    List<BannerAnime> bannerMoviesList;
    Timer sliderTimer;
    NestedScrollView nestedScrollView;
    AppBarLayout appbar;
   // Toolbar toolbar;

    List<AllCategory> allCategoryList;
//    List<CategoryItem> categoryItemList;

    MainRecyclerAdapter mainRecyclerAdapter;
    RecyclerView mainrecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_view);

        tabIndicator = findViewById(R.id.tabIndicator);
        categoryTab = findViewById(R.id.tabLayout);
        nestedScrollView = findViewById(R.id.nestedScroll);
        appbar = findViewById(R.id.appbar);
//         Toolbar toolbar = findViewById(R.id.toolbar);
//         setSupportActionBar(toolbar);
        //tabIndicator = findViewById(R.id.tabIndicator);



        //create test data using array
        //anime
        bannerAnimeList = new ArrayList<>();
        bannerAnimeList.add(new BannerAnime(1, "Sora No Otashimono","https://www.thecinemaholic.com/wp-content/uploads/2019/05/maxresdefault-1-15-1280x550.jpg",""));
        bannerAnimeList.add(new BannerAnime(2,"One Piece", "https://mangaplus.shueisha.co.jp/drm/title/100020/title_thumbnail_main/10687.jpg?key=fa1dc906a7c36ab4222bbabc4b17f532&duration=86400","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/video/One+piece/Yakitate+Japan.mp4"));
        bannerAnimeList.add(new BannerAnime(3,"Attack On Titan", "https://cdn.vox-cdn.com/thumbor/Jf4iGIcgO910Cxl5Sam1WVdf57M=/0x36:852x515/1600x900/cdn.vox-cdn.com/uploads/chorus_image/image/50015235/titan.0.0.jpg",""));
        bannerAnimeList.add(new BannerAnime(4,"Rosario Vampire","https://m.media-amazon.com/images/M/MV5BMjA4NzYzOWItYzA2MC00ZDQwLWExODYtMWYzNjNlNTc2N2M0XkEyXkFqcGdeQXVyMTA3OTEyODI1._V1_.jpg","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/video/Rosario+Vampire/Rosario+Season+Episode+4.mkv"));


        //manga
        bannerMangaList = new ArrayList<>();
        bannerMangaList.add(new BannerAnime(1, "Yuragi Sou No Yuuna San","https://avt.mkklcdnv6.com/39/y/13-1583489233.jpg",""));
        bannerMangaList.add(new BannerAnime(2,"World's End Harem", "https://avt.mkklcdnv6.com/45/j/13-1583489422.jpg",""));
        bannerMangaList.add(new BannerAnime(3,"Black Clover", "https://avt.mkklcdnv6.com/12/p/1-1583464155.jpg",""));
        bannerMangaList.add(new BannerAnime(4, "Aikagi-kun to Shiawase Gohan","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/aikawa.png",""));

        //Cartoon
        bannerCartoonList = new ArrayList<>();
        bannerCartoonList.add(new BannerAnime(1, "Justice League Unlimited", "https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Justice+league+unlimited.png", ""));
        bannerCartoonList.add(new BannerAnime(2,"Doraemon", "https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/doraemon.png",""));
        bannerCartoonList.add(new BannerAnime(3,"Courage The Cowardly Dog", "https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/courage.png",""));
        bannerCartoonList.add(new BannerAnime(4,"Thunder Cats","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/thundercats.png",""));

        //TV Show
        bannerTVShowList = new ArrayList<>();
        bannerTVShowList.add(new BannerAnime(1, "Counting Cars","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Counting+cars.png",""));
        bannerTVShowList.add(new BannerAnime(2,"Pawn Stars", "https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/pawn+stars.png",""));
        bannerTVShowList.add(new BannerAnime(3,"Running Man: Korean TV Show", "https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/running+man.png",""));
        bannerTVShowList.add(new BannerAnime(4,"Waterfront Cities of The World","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Waterfront+cities.jpg",""));

        //Tutorial
        bannerTutorialList = new ArrayList<>();
        bannerTutorialList.add(new BannerAnime(1, "Code Nest","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/code+nest.png",""));
        bannerTutorialList.add(new BannerAnime(2,"Tuning Engine", "https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/tuning+car.png",""));
        bannerTutorialList.add(new BannerAnime(3,"Graphic Design", "https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Graphic-Design-Download-PNG.png",""));
        bannerTutorialList.add(new BannerAnime(4,"Business Analyst","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Business-Analyst-Tutorial-2.png",""));

        //Movies
        bannerMoviesList = new ArrayList<>();
        bannerMoviesList.add(new BannerAnime(1, "Hackers","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/One+Piece.png",""));
        bannerMoviesList.add(new BannerAnime(2,"Avengers: EndGame", "https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/avengers.png",""));
        bannerMoviesList.add(new BannerAnime(3,"Hobbits Collection", "https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/hobbits.png",""));
        bannerMoviesList.add(new BannerAnime(4,"Harry Potter Collection","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/harry+potter.png",""));

        //gaming
        bannerGamingList = new ArrayList<>();
        bannerGamingList.add(new BannerAnime(1, "Sora No Otashimono","https://www.thecinemaholic.com/wp-content/uploads/2019/05/maxresdefault-1-15-1280x550.jpg",""));
        bannerGamingList.add(new BannerAnime(2,"One Piece", "https://mangaplus.shueisha.co.jp/drm/title/100020/title_thumbnail_main/10687.jpg?key=fa1dc906a7c36ab4222bbabc4b17f532&duration=86400",""));
        bannerGamingList.add(new BannerAnime(3,"Attack On Titan", "https://cdn.vox-cdn.com/thumbor/Jf4iGIcgO910Cxl5Sam1WVdf57M=/0x36:852x515/1600x900/cdn.vox-cdn.com/uploads/chorus_image/image/50015235/titan.0.0.jpg",""));
        bannerGamingList.add(new BannerAnime(4,"Rosario Vampire","https://m.media-amazon.com/images/M/MV5BMjA4NzYzOWItYzA2MC00ZDQwLWExODYtMWYzNjNlNTc2N2M0XkEyXkFqcGdeQXVyMTA3OTEyODI1._V1_.jpg",""));

        setBannerAnimePagerAdapter(bannerAnimeList);

        categoryTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch(tab.getPosition()){
                    case 1:
                        setScrollDefaultState();
                        setBannerAnimePagerAdapter(bannerMangaList);
                        return;
                    case 2:
                        setScrollDefaultState();
                        setBannerAnimePagerAdapter(bannerCartoonList);
                        return;
                    case 3:
                        setScrollDefaultState();
                        setBannerAnimePagerAdapter(bannerTutorialList);
                        return;
                    case 4:
                        setScrollDefaultState();
                        setBannerAnimePagerAdapter(bannerGamingList);
                        return;
                    case 5:
                        setScrollDefaultState();
                        setBannerAnimePagerAdapter(bannerMoviesList);
                        return;
                    case 6:
                        setScrollDefaultState();
                        setBannerAnimePagerAdapter(bannerTVShowList);
                        return;
                    default:
                        setScrollDefaultState();
                        setBannerAnimePagerAdapter(bannerAnimeList);

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });




        //harem category
        List<CategoryItem> categoryItemListAnime1 = new ArrayList<>();
        categoryItemListAnime1.add(new CategoryItem(1,"Asu No Yoichi","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Asu+No+Yoichi.png","", "Harem"));
        categoryItemListAnime1.add(new CategoryItem(2,"Campione","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Campione.png","","Harem"));
        categoryItemListAnime1.add(new CategoryItem(3,"HighSchool DxD Series","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Highschool+dxd.png","","Harem"));
        categoryItemListAnime1.add(new CategoryItem(4,"Hyakka Ryouran Samurai","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/hyakka+ryouran+samurai.png","","Harem"));
        categoryItemListAnime1.add(new CategoryItem(5,"Isekai No Seikishi Monogatari","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Isekai+No+Seikishi+Monogatari.jpg","","Harem"));
        categoryItemListAnime1.add(new CategoryItem(6,"Inou Battle Wa Nichijou Ke No Naka De","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Inou+battel.png","","Harem"));
        categoryItemListAnime1.add(new CategoryItem(7,"Ichigo 100%","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Ichigo+100.png","","Harem"));
        categoryItemListAnime1.add(new CategoryItem(8,"Rosario Vampire","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Rosario+Vampire.png","","Harem"));
        categoryItemListAnime1.add(new CategoryItem(9,"Infinite Stratos","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Infinite+Stratos.png","","Harem"));
        categoryItemListAnime1.add(new CategoryItem(10,"Koi Senkyo to Chocolate","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Koi+to+Senkyo+Chocolate.png","","Harem"));


        //romance category
        List<CategoryItem> categoryItemListAnime2 = new ArrayList<>();
        categoryItemListAnime2.add(new CategoryItem(1,"Hajimete No Gal","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/hajimete+no+gal.png","", "Romance"));
        categoryItemListAnime2.add(new CategoryItem(2,"Isuca","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/isuca.png","", "Romance"));
        categoryItemListAnime2.add(new CategoryItem(3,"Futakoi Alternative","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Futakoi+Alternative.png","", "Romance"));
        categoryItemListAnime2.add(new CategoryItem(4,"Hundred","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Hundred.png","", "Romance"));
        categoryItemListAnime2.add(new CategoryItem(5,"Kiss x sis","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/kiss+x+sis.png","", "Romance"));
        categoryItemListAnime2.add(new CategoryItem(6,"Mayoi Neko Overun!","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Mayoi+Neko.png","", "Romance"));
        categoryItemListAnime2.add(new CategoryItem(7,"Rakudai Kishi No Rivalry","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Rakudai+kishi.png","", "Romance"));

        //shonen category
        List<CategoryItem> categoryItemListAnime3 = new ArrayList<>();
        categoryItemListAnime3.add(new CategoryItem(1,"One Piece","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/One+Piece.png","", "Shonen"));
        categoryItemListAnime3.add(new CategoryItem(2,"Naruto Shipudden","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Naruto+Shippudden.png","", "Shonen"));
        categoryItemListAnime3.add(new CategoryItem(3,"Dragon Ball","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Dragon+ball.png","", "Shonen"));
        categoryItemListAnime3.add(new CategoryItem(4,"One Punch Man","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/One+Punch+Man.png","", "Shonen"));
        categoryItemListAnime3.add(new CategoryItem(5,"Bleach","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Bleach.png","", "Shonen"));
        categoryItemListAnime3.add(new CategoryItem(6,"Fairy Tall","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Fairy+Tail.png","", "Shonen"));
        categoryItemListAnime3.add(new CategoryItem(7,"Attack of Titan","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/attack+on+the+titan.png","", "Shonen"));

        //manga
        List<CategoryItem> categoryItemListManga = new ArrayList<>();
        categoryItemListManga.add(new CategoryItem(1,"Yuragi Sou No Yuuna San","https://avt.mkklcdnv6.com/39/y/13-1583489233.jpg","", "Harem"));
        categoryItemListManga.add(new CategoryItem(2,"World's End Harem","https://avt.mkklcdnv6.com/45/j/13-1583489422.jpg","", "Harem"));
        categoryItemListManga.add(new CategoryItem(3,"Black Clover","https://avt.mkklcdnv6.com/12/p/1-1583464155.jpg","", "Shonen"));
        categoryItemListManga.add(new CategoryItem(4,"Toumei Ningen No Tsukurikata","https://avt.mkklcdnv6.com/3/f/1-1583463792.jpg","", "Romance"));

        //shonen category
        //cartoon
        List<CategoryItem> categoryItemListCartoon = new ArrayList<>();
        categoryItemListCartoon.add(new CategoryItem(1,"Courage The Cowardly Dog","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/courage.png","", "English"));
        categoryItemListCartoon.add(new CategoryItem(2,"Spongebob Squarepants","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Spongebob.png","", "English"));
        categoryItemListCartoon.add(new CategoryItem(3,"Hey Arnold","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/hey+arnold.png","", "English"));

        //cartoon
        List<CategoryItem> categoryItemListCartoon1 = new ArrayList<>();
        categoryItemListCartoon1.add(new CategoryItem(1,"Batman","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Batman.png","", "DC Comic"));
        categoryItemListCartoon1.add(new CategoryItem(2,"X-Men","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/xmen.png","", "Marvel Comic"));
        categoryItemListCartoon1.add(new CategoryItem(3,"Justice League Unlimited","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Justice+league+unlimited.png","", "DC Comic"));

        //cartoon
        List<CategoryItem> categoryItemListCartoon2 = new ArrayList<>();
        categoryItemListCartoon2.add(new CategoryItem(1,"ThunderCats","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/thundercats.png","", "80's"));
        categoryItemListCartoon2.add(new CategoryItem(2,"He-Man","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/He+man.png","", "80's"));
        categoryItemListCartoon2.add(new CategoryItem(3,"She-Ra: Princess of Power","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/She+ra.png","", "80's"));

        //cartoon
        List<CategoryItem> categoryItemListCartoon3 = new ArrayList<>();
        categoryItemListCartoon3.add(new CategoryItem(1,"Doraemon","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/doraemon.png","", "Malay"));
        categoryItemListCartoon3.add(new CategoryItem(2,"Spongebob Squarepants","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Spongebob.png","", "Malay"));
        categoryItemListCartoon3.add(new CategoryItem(3,"Bola Kampung","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/bola+kampung.png","", "Malay"));

        //cartoon
        List<CategoryItem> categoryItemListTVShow = new ArrayList<>();
        categoryItemListTVShow.add(new CategoryItem(1,"Waterfront Cities of The World","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Waterfront+cities.jpg","", "English"));
        categoryItemListTVShow.add(new CategoryItem(2,"Counting Cars","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Counting+cars.png","", "English"));
        categoryItemListTVShow.add(new CategoryItem(3,"Pawn Stars","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/pawn+stars.png","", "English"));


        //tutorial
        //android
        List<CategoryItem> categoryItemListTutorial = new ArrayList<>();
        categoryItemListTutorial.add(new CategoryItem(1,"Code Nest","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/code+nest.png","", "Android"));
        categoryItemListTutorial.add(new CategoryItem(2,"Adrian Twarog","","", "React Native"));
        categoryItemListTutorial.add(new CategoryItem(3,"Free Code Camp","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/freecode.png","", "Laravel"));



        //mechanical
        List<CategoryItem> categoryItemListTutorial3 = new ArrayList<>();
        categoryItemListTutorial3.add(new CategoryItem(1,"Learn Engineering","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/learn+engineering.png","", "Mechanical"));
        categoryItemListTutorial3.add(new CategoryItem(2,"Crash Course: Mechanical Engineering","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/Crash+Course.png","", "Mechanical"));
        categoryItemListTutorial3.add(new CategoryItem(3,"Zach Star","https://animez.s3-ap-southeast-1.amazonaws.com/anime_pic/ZachStar.png","", "Mechanical"));



        List<CategoryItem> categoryItemList = new ArrayList<>();

        allCategoryList = new ArrayList<>();
        allCategoryList.add(new AllCategory(1, "Harem Anime",categoryItemListAnime1));
        allCategoryList.add(new AllCategory(2, "Romance Anime", categoryItemListAnime2));
        allCategoryList.add(new AllCategory(3,"Manga", categoryItemListManga));
        allCategoryList.add(new AllCategory(4, "English Cartoon",categoryItemListCartoon ));
        allCategoryList.add(new AllCategory(5, "Comic Cartoon", categoryItemListCartoon1));
        allCategoryList.add(new AllCategory(6, "80's Cartoon", categoryItemListCartoon2));
        allCategoryList.add(new AllCategory(7, "Malay Cartoon", categoryItemListCartoon3));
        allCategoryList.add(new AllCategory(8,"TV Show", categoryItemListTVShow));
        allCategoryList.add(new AllCategory(9, "Programming Tutorial", categoryItemListTutorial));
        allCategoryList.add(new AllCategory(10, "Mechanical Tutorial", categoryItemListTutorial3));


        setMainRecyclerAdapter(allCategoryList);
    }

    private void setBannerAnimePagerAdapter(List<BannerAnime> bannerAnimeList){
           bannerAnimeViewPager = findViewById(R.id.bannerViewPager);
           bannerAnimePagerAdapter = new BannerAnimePagerAdapter(this, bannerAnimeList);
           bannerAnimeViewPager.setAdapter(bannerAnimePagerAdapter);
           tabIndicator.setupWithViewPager(bannerAnimeViewPager);


        Timer sliderTime = new Timer();
        sliderTime.scheduleAtFixedRate(new AutoSlider(), 6000, 8000);
        tabIndicator.setupWithViewPager(bannerAnimeViewPager, true);


    }

    class AutoSlider extends TimerTask{

        @Override
        public void run() {
            StartView.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if(bannerAnimeViewPager.getCurrentItem() < bannerAnimeList.size() - 1){

                        bannerAnimeViewPager.setCurrentItem(bannerAnimeViewPager.getCurrentItem() + 1);
                    }else{
                        bannerAnimeViewPager.setCurrentItem(0);
                    }
                }
            }

            );
        }
    }

    public void setMainRecyclerAdapter(List<AllCategory> allCategoryList ){
        mainrecyclerView = findViewById(R.id.mainRecyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        mainrecyclerView.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this, allCategoryList);
        mainrecyclerView.setAdapter(mainRecyclerAdapter);
    }

    private void setScrollDefaultState(){
        nestedScrollView.fullScroll(View.FOCUS_UP);
        nestedScrollView.scrollTo(0,0);
        appbar.setExpanded(true);
    }
}
