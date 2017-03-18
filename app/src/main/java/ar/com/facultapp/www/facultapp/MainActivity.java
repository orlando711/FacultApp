package ar.com.facultapp.www.facultapp;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TabLayout tabLayout=(TabLayout) findViewById(R.id.tabs);
        ViewPager viewPager= (ViewPager) findViewById(R.id.pager);

        viewPager.setAdapter(new SectionPagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
    }

    public class SectionPagerAdapter extends FragmentPagerAdapter{
        public SectionPagerAdapter (FragmentManager fragmentManager){
            super(fragmentManager);

        }

        @Override
        public Fragment getItem(int position) {

            switch (position){
                case 0:
                    return new TransparenteFragment();
                case 1:
                    return new CursadoFragment();
                case 2:
                    return new ThisWeekFragment();
                default:
                    return new ThisWeekFragment();

            }
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position){
            switch (position){
                case 0:
                    return "First Tab";
                case 1:
                    return "Second Tab";
                case 2:
                    return "Tree Tab";
                default:
                    return "Default";
            }
        }
    }
}
