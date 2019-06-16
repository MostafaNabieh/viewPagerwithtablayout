package com.example.viewpagerwithtablayout;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class adapter extends FragmentPagerAdapter {


    public adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i)
        {
            case 0:
                CallsFragment callsFragment=new CallsFragment();
                return callsFragment;

            case 1:
                chatFragment chatFragment=new chatFragment();
                return chatFragment;
            case 2 :
                GroupFragment groupFragment=new GroupFragment();
                return groupFragment;
             default:
                 return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0:
                return "CALLS";

            case 1:
                return "CHAT";
            case 2 :
               return "GROUP";
            default:
                return null;
        }

    }
}
