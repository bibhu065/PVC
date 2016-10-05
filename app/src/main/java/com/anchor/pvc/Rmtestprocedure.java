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
            Toast.makeText(getApplicationContext(),"Testing Equipment List", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R3()).commit();

        }
        else if (id == R.id.rmtp1)

        {
            // Handle the Acid value of Plasticizer
            Toast.makeText(getApplicationContext(),"Test Method for Acid Value of Plasticizer", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R4()).commit();

        }
        else if (id == R.id.rmtp2)

        {
            // Handle the Acidity of CPW
            Toast.makeText(getApplicationContext(),"Test Method for Acidity of CPW", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R5()).commit();

        }
        else if (id == R.id.rmtp3)

        {
            // Handle the Acidity of Stearic Acid
            Toast.makeText(getApplicationContext(),"Test Method for Acidity of Stearic Acid", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R6()).commit();

        }
        else if (id == R.id.rmtp4)

        {
            // Handle the Assay as Al2O3
            Toast.makeText(getApplicationContext(),"Test Method for Assay as Alluminium Trioxide", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R7()).commit();

        }else if (id == R.id.rmtp5)

        {
            // Handle the Bisphenol-A in DOP
            Toast.makeText(getApplicationContext(),"Test Method for Bisphenol-A in DOP", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R8()).commit();

        }else if (id == R.id.rmtp6)

        {
            // Handle the Bulk Density
            Toast.makeText(getApplicationContext(),"Test Method for Bulk Density", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R9()).commit();

        }
        else if (id == R.id.rmtp7)

        {
            // Handle the CaCO3 & MgCO3
            Toast.makeText(getApplicationContext(),"Test Method for Calcium Carbonate & Magnesium Carbonate", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R10()).commit();

        }
        else if (id == R.id.rmtp8)

        {
            // Handle the Color of Plasticizers
            Toast.makeText(getApplicationContext(),"Test Method for Determining Color of Plasticizers", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R11()).commit();

        }
        else if (id == R.id.rmtp9)

        {
            // Handle the Conductivity of Resin
            Toast.makeText(getApplicationContext(),"Test Method for Conductivity of Resin", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R12()).commit();

        }else if (id == R.id.rmtp10)

        {
            // Handle the Ester Value &amp; Ester Content
            Toast.makeText(getApplicationContext(),"Test Method for Ester Value & Ester Content", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R13()).commit();

        }else if (id == R.id.rmtp11)

        {
            // Handle the Heat Stability
            Toast.makeText(getApplicationContext(),"Test Method for Heat Stability", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R14()).commit();

        }else if (id == R.id.rmtp12)

        {
            // Handle the Iodine Value
            Toast.makeText(getApplicationContext(),"Test Method for Iodine Value", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R15()).commit();

        }else if (id == R.id.rmtp13)

        {
            // Handle the K-value
            Toast.makeText(getApplicationContext(),"Test Method for K-value", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R16()).commit();

        }else if (id == R.id.rmtp14)

        {
            // Handle the Lead Content(PbO)
            Toast.makeText(getApplicationContext(),"Test Method for Lead Content(PbO)", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R17()).commit();

        }else if (id == R.id.rmtp15)

        {
            // Handle the Loss of Ignition
            Toast.makeText(getApplicationContext(),"Test Method for Loss of Ignition", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R18()).commit();

        }else if (id == R.id.rmtp16)

        {
            // Handle the Melting Point
            Toast.makeText(getApplicationContext(),"Test Method for Melting Point", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R19()).commit();

        }
        else if (id == R.id.rmtp17)

        {
            // Handle the Moisture Content
            Toast.makeText(getApplicationContext(),"Test Method for Moisture Content", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R20()).commit();

        }else if (id == R.id.rmtp18)

        {
            // Handle the Oxirene Oxygen
            Toast.makeText(getApplicationContext(),"Test Method for Oxirene Oxygen", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R21()).commit();

        }else if (id == R.id.rmtp19)

        {
            // Handle the Plasticizer Absorption Number
            Toast.makeText(getApplicationContext(),"Test Method for Plasticizer Absorption Number", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R22()).commit();

        }else if (id == R.id.rmtp20)

        {
            // Handle the Purity of Sb2O3
            Toast.makeText(getApplicationContext(),"Test Method for Purity of Antimony Trioxide", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R23()).commit();

        }else if (id == R.id.rmtp21)

        {
            // Handle the Seive Residue
            Toast.makeText(getApplicationContext(),"Test Method for Determining Seive Residue", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R24()).commit();

        }else if (id == R.id.rmtp22)

        {
            // Handle the Specific Gravity
            Toast.makeText(getApplicationContext(),"Test Method for Specific Gravity", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R25()).commit();

        }else if (id == R.id.rmtp23)

        {
            // Handle the Thermal Stability
            Toast.makeText(getApplicationContext(),"Test Method for Thermal Stability", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R26()).commit();

        }else if (id == R.id.rmtp24)

        {
            // Handle the Total Fatty Matters
            Toast.makeText(getApplicationContext(),"Test Method for Total Fatty Matters", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R27()).commit();

        }else if (id == R.id.rmtp25)

        {
            // Handle the Viscosity
            Toast.makeText(getApplicationContext(),"Test Method for Determining Viscosity", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R28()).commit();

        }else if (id == R.id.rmtp26)

        {
            // Handle the Volatile Loss
            Toast.makeText(getApplicationContext(),"Test Method for Determining Volatile Loss", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R29()).commit();

        }else if (id == R.id.rmtp27)

        {
            // Handle the Halogen Acid Gas
            Toast.makeText(getApplicationContext(),"Test Method for Determining Halogen Acid Gas", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R30()).commit();

        }else if (id == R.id.rmtp28)

        {
            // Handle the Limiting Oxygen Index
            Toast.makeText(getApplicationContext(),"Test Method for Determining Limiting Oxygen Index", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R31()).commit();

        }else if (id == R.id.rmtp29)

        {
            // Handle the Smoke Density Rating
            Toast.makeText(getApplicationContext(),"Test Method for Determining Smoke Density Rating", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R32()).commit();

        }else if (id == R.id.rmtp30)

        {
            // Handle the Cell Resitance of CPW
            Toast.makeText(getApplicationContext(),"Test Method for Determining Cell Resitance of CPW", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new R33()).commit();

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

