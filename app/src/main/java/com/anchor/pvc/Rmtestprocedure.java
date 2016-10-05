package com.anchor.pvc;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.anchor.pvc.rmtesting_fragment.R1;
import com.anchor.pvc.rmtesting_fragment.R2;
import com.anchor.pvc.rmtesting_fragment.R3;


public class Rmtestprocedure extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rmtestprocedure);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Snackbar.make(view, "Send Request for New Test Methods", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        View header = navigationView.getHeaderView(0);
        TextView tv_email = (TextView)header.findViewById(R.id.rmtestprocedure_details);
        tv_email.setText("PVC RM Test Procedures");

        FragmentManager fm= getFragmentManager();
        fm.beginTransaction().replace(R.id.content_frame,new R1 ()).commit();
    }

    @Override
    public void onBackPressed()
    {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.rmtestprocedure_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager fm=getFragmentManager();

        if (id == R.id.rmtp31)
        {
            // Handle the Chemical Reagent Lists
            Toast.makeText(getApplicationContext(),"Chemical Reagents List", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R1()).commit();
        }
        else if (id == R.id.rmtp32)

        {
            // Handle the Chemical Glassware Lists
            Toast.makeText(getApplicationContext(),"Chemical Glassware List", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R2()).commit();

        }
        else if (id == R.id.rmtp33)

        {
            // Handle the Equipment_Testing Lists
            Toast.makeText(getApplicationContext(),"Chemical Glassware List", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R3()).commit();

        }
        else if (id == R.id.rmtp1)

        {

        }
        else if (id == R.id.rmtp2)

        {

        }
        else if (id == R.id.rmtp3)

        {

        }
        else if (id == R.id.rmtp4)

        {

        }else if (id == R.id.rmtp5)

        {

        }else if (id == R.id.rmtp6)

        {

        }
        else if (id == R.id.rmtp7)

        {

        }
        else if (id == R.id.rmtp8)

        {

        }
        else if (id == R.id.rmtp9)

        {

        }else if (id == R.id.rmtp10)

        {

        }else if (id == R.id.rmtp11)

        {

        }else if (id == R.id.rmtp12)

        {

        }else if (id == R.id.rmtp13)

        {

        }else if (id == R.id.rmtp14)

        {

        }else if (id == R.id.rmtp15)

        {

        }else if (id == R.id.rmtp16)

        {

        }
        else if (id == R.id.rmtp17)

        {

        }else if (id == R.id.rmtp18)

        {

        }else if (id == R.id.rmtp19)

        {

        }else if (id == R.id.rmtp20)

        {

        }else if (id == R.id.rmtp21)

        {

        }else if (id == R.id.rmtp22)

        {

        }else if (id == R.id.rmtp23)

        {

        }else if (id == R.id.rmtp24)

        {

        }else if (id == R.id.rmtp25)

        {

        }else if (id == R.id.rmtp26)

        {

        }else if (id == R.id.rmtp27)

        {

        }else if (id == R.id.rmtp28)

        {

        }else if (id == R.id.rmtp29)

        {

        }else if (id == R.id.rmtp30)

        {

        }

        else if (id == R.id.return_menu)
        {
            // Handle the Return Menu
            Toast.makeText(getApplicationContext(),"Return to Main Menu", Toast.LENGTH_SHORT).show();
            finish();

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

