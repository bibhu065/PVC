package com.anchor.pvc;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class Basicformulation extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicformulation);
        // Set a Toolbar to replace the ActionBar.
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initNavigationDrawer();
    }

    private void initNavigationDrawer()
    {

        NavigationView navigationView = (NavigationView)findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem)
            {

                int id = menuItem.getItemId();
                // Create a new fragment and specify the fragment to show based on nav item clicked


                switch (id)
                {
                    case R.id.base1:
                        Toast.makeText(getApplicationContext(),"FR Base 1.48 Sp.Gravity",Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.base2:
                        Toast.makeText(getApplicationContext(),"FR Base 1.51 Sp.Gravity",Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.base3:
                        Toast.makeText(getApplicationContext(),"FR Base LLS 1.52 Sp.Gravity(700 mpm)",Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.base4:
                        Toast.makeText(getApplicationContext(),"FR BaseFR Base HLS 1.52 Sp.Gravity(900 mpm)",Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.base5:
                        Toast.makeText(getApplicationContext(),"Non FR Base Type D 1.52 Sp.Gravity",Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.skin1:
                        Toast.makeText(getApplicationContext(),"SKIN High Line Speed(700 mpm)",Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.skin2:
                        Toast.makeText(getApplicationContext(),"SKIN Low Line Speed(300 mpm)",Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.skin3:
                        Toast.makeText(getApplicationContext(),"Transparent SKIN",Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.telehphonest:
                         Toast.makeText(getApplicationContext(),"Telephone ST",Toast.LENGTH_SHORT).show();
                         drawerLayout.closeDrawers();
                        break;
                    case R.id.frst:
                        Toast.makeText(getApplicationContext(),"FR Sheathing",Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.nfrst:
                        Toast.makeText(getApplicationContext(),"Non FR Sheathing",Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.frlsh:
                        Toast.makeText(getApplicationContext(),"FRLSH",Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.frlshst:
                        Toast.makeText(getApplicationContext(),"FRLSH Sheathing",Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.return_menu:
                        Toast.makeText(getApplicationContext(),"Return to Main Menu",Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        finish();

                }
                return true;

            }
        });

        // Insert the fragment by replacing any existing fragment


        View header = navigationView.getHeaderView(0);
        TextView tv_email = (TextView)header.findViewById(R.id.compound_details);
        tv_email.setText("PVC Compounds Name");
        // Find our drawer view
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer);
        // Highlight the selected item has been done by NavigationView


        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close)
        {

            @Override
            public void onDrawerClosed(View v)
            {
                super.onDrawerClosed(v);
            }

            @Override
            public void onDrawerOpened(View v)
            {
                super.onDrawerOpened(v);
            }
        };
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }
}
