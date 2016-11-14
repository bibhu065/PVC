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
import com.anchor.pvc.rmtesting_fragment.R10;
import com.anchor.pvc.rmtesting_fragment.R11;
import com.anchor.pvc.rmtesting_fragment.R12;
import com.anchor.pvc.rmtesting_fragment.R13;
import com.anchor.pvc.rmtesting_fragment.R14;
import com.anchor.pvc.rmtesting_fragment.R15;
import com.anchor.pvc.rmtesting_fragment.R16;
import com.anchor.pvc.rmtesting_fragment.R17;
import com.anchor.pvc.rmtesting_fragment.R18;
import com.anchor.pvc.rmtesting_fragment.R19;
import com.anchor.pvc.rmtesting_fragment.R2;
import com.anchor.pvc.rmtesting_fragment.R20;
import com.anchor.pvc.rmtesting_fragment.R21;
import com.anchor.pvc.rmtesting_fragment.R22;
import com.anchor.pvc.rmtesting_fragment.R23;
import com.anchor.pvc.rmtesting_fragment.R24;
import com.anchor.pvc.rmtesting_fragment.R25;
import com.anchor.pvc.rmtesting_fragment.R26;
import com.anchor.pvc.rmtesting_fragment.R27;
import com.anchor.pvc.rmtesting_fragment.R28;
import com.anchor.pvc.rmtesting_fragment.R29;
import com.anchor.pvc.rmtesting_fragment.R3;
import com.anchor.pvc.rmtesting_fragment.R30;
import com.anchor.pvc.rmtesting_fragment.R31;
import com.anchor.pvc.rmtesting_fragment.R32;
import com.anchor.pvc.rmtesting_fragment.R33;
import com.anchor.pvc.rmtesting_fragment.R4;
import com.anchor.pvc.rmtesting_fragment.R5;
import com.anchor.pvc.rmtesting_fragment.R6;
import com.anchor.pvc.rmtesting_fragment.R7;
import com.anchor.pvc.rmtesting_fragment.R8;
import com.anchor.pvc.rmtesting_fragment.R9;


public class Rawmaterialfunction_1 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rawmaterialfunction_1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Snackbar.make(view, "Feedback for any correction of the functionality of Raw Materials", Snackbar.LENGTH_LONG)
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
        TextView tv_email = (TextView)header.findViewById(R.id.aboutadditives_details);
        tv_email.setText("PVC Raw Material Function Part:1");

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

        if (id == R.id.rtf1)
        {
            // Handle the Properties & Function of ATH
            Toast.makeText(getApplicationContext(),"Properties & Function of ATH", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R1()).commit();
        }
        else if (id == R.id.rtf2)

        {
            // Handle the Properties & Function of MDH
            Toast.makeText(getApplicationContext(),"Properties & Function of MDH", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R2()).commit();

        }
        else if (id == R.id.rtf3)

        {
            // Handle the Properties & Function of C-caly
            Toast.makeText(getApplicationContext(),"Properties & Function of Calcined Clay", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R3()).commit();

        }
        else if (id == R.id.rtf4)

        {
            // Handle the Properties & Function of CaCO3
            Toast.makeText(getApplicationContext(),"Properties & Function of Calcium Carbonate", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R4()).commit();

        }
        else if (id == R.id.rtf5)

        {
            // Handle the Properties & Function of TBLS
            Toast.makeText(getApplicationContext(),"Properties & Function of Tribasic Lead Stearate", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R5()).commit();

        }
        else if (id == R.id.rtf6)

        {
            // Handle the Properties & Function of DBLP
            Toast.makeText(getApplicationContext(),"Properties & Function of Dibasic Lead Phosphate", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R6()).commit();

        }
        else if (id == R.id.rtf7)

        {
            // Handle the Properties & Function of Lead Stearate
            Toast.makeText(getApplicationContext(),"Properties & Function of Lead Stearate", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R6()).commit();

        }
        else if (id == R.id.rtf8)

        {
            // Handle the Properties & Function of Calcium Stearate
            Toast.makeText(getApplicationContext(),"Properties & Function of Calcium Stearate", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R6()).commit();

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

