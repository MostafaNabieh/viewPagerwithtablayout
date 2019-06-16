package com.example.viewpagerwithtablayout;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=findViewById(R.id.tabs);
        viewPager=(ViewPager) findViewById(R.id.view_page);
        FragmentManager fragmentManager=getSupportFragmentManager();
        adapter adapter=new adapter(fragmentManager);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
