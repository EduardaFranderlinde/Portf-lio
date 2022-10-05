package com.example.litteltestevocacional2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;


public class TelaConformidade extends AppCompatActivity {

    ViewPager2 pageC;
    TabLayout tabC;
    AdaptadorC adapC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_conformidade);
        getWindow().setStatusBarColor(Color.BLACK);
        getSupportActionBar().hide();

        pageC = findViewById(R.id.pageC);
        tabC = findViewById(R.id.tabC);
        FragmentManager fm = getSupportFragmentManager();
        adapC = new AdaptadorC(fm, getLifecycle());
        pageC.setAdapter(adapC);
        tabC.addTab(tabC.newTab().setText("Resultado"));
        tabC.addTab(tabC.newTab().setText("Cursos"));
        tabC.addTab(tabC.newTab().setText("Famosos"));
        tabC.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pageC.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        pageC.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabC.selectTab(tabC.getTabAt(position));
            }
        });
    }
}