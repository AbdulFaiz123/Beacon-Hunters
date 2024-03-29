//package com.example.beacon_hunters;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.Fragment;
//import androidx.fragment.app.FragmentManager;
//import androidx.fragment.app.FragmentStatePagerAdapter;
//import androidx.viewpager.widget.ViewPager;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.os.Handler;
//import android.view.WindowManager;
//import android.view.animation.Animation;
//import android.view.animation.AnimationUtils;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//public class MainActivity extends AppCompatActivity {
//    private static  int SPLASH_SCREEN = 5000;
//    //variables
//    Animation topAnim,bottomAnim;
//    ImageView image;
//    TextView logo,slogan;
//
//    private static final int NUM_PAGES =3;
//    private ViewPager viewPager;
//    private ScreenSlidePagerAdapter pagerAdapter;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        setContentView(R.layout.activity_main);
//
//        //Animations
//
//        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
//        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
//
//        //hooks
//        image = findViewById(R.id.imageView);
//        logo = findViewById(R.id.textView);
//        slogan = findViewById(R.id.textView4);
//
//        //Assigning
//        image.setAnimation(topAnim);
//        logo.setAnimation(bottomAnim);
//        slogan.setAnimation(bottomAnim);
//
//        viewPager = findViewById(R.id.pager);
//        pagerAdapter = new ScreenSlidePagerAdapter((getSupportFragmentManager()));
//        viewPager.setAdapter(pagerAdapter);
//
////        //call the intent
////        new Handler().postDelayed(new Runnable() {
////            @Override
////            public void run() {
////                Intent intent = new Intent(MainActivity.this,login.class);
////                startActivity(intent);
////                finish();
////            }
////        },SPLASH_SCREEN);
//
//    }
//    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter{
//
//        public ScreenSlidePagerAdapter(FragmentManager fm) {
//            super(fm);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            switch (position){
//                case 0:
//                    OnBoardingFragment1 tab1 = new OnBoardingFragment1();
//                    return tab1;
//
//                case 1:
//                    OnBoardingFragment2 tab2 = new OnBoardingFragment2();
//                    return tab2;
//
//                case 2:
//                    OnBoardingFragment3 tab3 = new OnBoardingFragment3();
//                    return tab3;
//            }
//            return null;
//        }
//
//        @Override
//        public int getCount() {
//            return NUM_PAGES;
//        }
//    }
//}
