package com.example.valdir.tourguideapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Defina o conteúdo da atividade para usar o arquivo de layout activity_main.xml
        setContentView(R.layout.activity_main);

        // Encontre o pager de visualização que permita ao usuário deslizar entre fragmentos
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Crie um adaptador que saiba qual fragmento deve ser mostrado em cada página
        SimpleFragmentPagerAdapter adapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());

        // Defina o adaptador no pager da vista
        viewPager.setAdapter(adapter);

        // Dê o TabLayout ao ViewPager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);

    }
}
