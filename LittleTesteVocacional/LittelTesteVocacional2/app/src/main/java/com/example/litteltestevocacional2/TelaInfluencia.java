package com.example.litteltestevocacional2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;


public class TelaInfluencia extends AppCompatActivity {

    ViewPager2 pageI;
    TabLayout tabI;
    AdaptadorI adapI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_influencia);
        getWindow().setStatusBarColor(Color.BLACK);
        getSupportActionBar().hide();

        pageI = findViewById(R.id.pageI);
        tabI = findViewById(R.id.tabI);
        FragmentManager fm = getSupportFragmentManager();
        adapI = new AdaptadorI(fm, getLifecycle());
        pageI.setAdapter(adapI);
        tabI.addTab(tabI.newTab().setText("Resultado"));
        tabI.addTab(tabI.newTab().setText("Cursos"));
        tabI.addTab(tabI.newTab().setText("Famosos"));
        tabI.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pageI.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        pageI.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabI.selectTab(tabI.getTabAt(position));
            }
        });
    }

}