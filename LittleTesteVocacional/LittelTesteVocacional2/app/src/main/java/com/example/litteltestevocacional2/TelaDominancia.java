package com.example.litteltestevocacional2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;


public class TelaDominancia extends AppCompatActivity {

    ViewPager2 pageD;
    TabLayout tabD;
    AdaptadorD adapD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_dominancia);
        getWindow().setStatusBarColor(Color.BLACK);
        getSupportActionBar().hide();

        pageD = findViewById(R.id.pageD);
        tabD = findViewById(R.id.tabD);
        FragmentManager fm = getSupportFragmentManager();
        adapD = new AdaptadorD(fm, getLifecycle());
        pageD.setAdapter(adapD);
        tabD.addTab(tabD.newTab().setText("Resultado"));
        tabD.addTab(tabD.newTab().setText("Cursos"));
        tabD.addTab(tabD.newTab().setText("Famosos"));
        tabD.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pageD.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        pageD.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabD.selectTab(tabD.getTabAt(position));
            }
        });
    }
}