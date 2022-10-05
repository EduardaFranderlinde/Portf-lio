package com.example.litteltestevocacional2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;


public class TelaEstabilidade extends AppCompatActivity {

    ViewPager2 pageE;
    TabLayout tabE;
    AdaptadorE adapE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_estabilidade);
        getWindow().setStatusBarColor(Color.BLACK);
        getSupportActionBar().hide();

        pageE = findViewById(R.id.pageE);
        tabE = findViewById(R.id.tabE);
        FragmentManager fm = getSupportFragmentManager();
        adapE = new AdaptadorE(fm, getLifecycle());
        pageE.setAdapter(adapE);
        tabE.addTab(tabE.newTab().setText("Resultado"));
        tabE.addTab(tabE.newTab().setText("Cursos"));
        tabE.addTab(tabE.newTab().setText("Famosos"));
        tabE.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pageE.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        pageE.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabE.selectTab(tabE.getTabAt(position));
            }
        });
    }
}