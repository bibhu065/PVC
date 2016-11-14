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

import com.anchor.pvc.rawmaterialfunction_1_fragment.antimonytrioxide;
import com.anchor.pvc.rawmaterialfunction_1_fragment.ath;
import com.anchor.pvc.rawmaterialfunction_1_fragment.calciumcarbonate;
import com.anchor.pvc.rawmaterialfunction_1_fragment.calciumzinc;
import com.anchor.pvc.rawmaterialfunction_1_fragment.cclay;
import com.anchor.pvc.rawmaterialfunction_1_fragment.cs;
import com.anchor.pvc.rawmaterialfunction_1_fragment.dblp;
import com.anchor.pvc.rawmaterialfunction_1_fragment.dbls;
import com.anchor.pvc.rawmaterialfunction_1_fragment.ls;
import com.anchor.pvc.rawmaterialfunction_1_fragment.mdh;
import com.anchor.pvc.rawmaterialfunction_1_fragment.tbls;
import com.anchor.pvc.rawmaterialfunction_2_fragment.cpw;
import com.anchor.pvc.rawmaterialfunction_2_fragment.dop;
import com.anchor.pvc.rawmaterialfunction_2_fragment.epoxy;
import com.anchor.pvc.rawmaterialfunction_2_fragment.fg;
import com.anchor.pvc.rawmaterialfunction_2_fragment.fpt;
import com.anchor.pvc.rawmaterialfunction_2_fragment.gcc10;
import com.anchor.pvc.rawmaterialfunction_2_fragment.molybednum;
import com.anchor.pvc.rawmaterialfunction_2_fragment.pewax;
import com.anchor.pvc.rawmaterialfunction_2_fragment.pwax;
import com.anchor.pvc.rawmaterialfunction_2_fragment.sa;
import com.anchor.pvc.rawmaterialfunction_2_fragment.totm;
import com.anchor.pvc.rawmaterialfunction_2_fragment.zb;


public class Rawmaterialfunction_2 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rawmaterialfunction_2);
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
        tv_email.setText("PVC Raw Material Function Part:2");

        FragmentManager fm= getFragmentManager();
        fm.beginTransaction().replace(R.id.content_frame,new zb()).commit();
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
        getMenuInflater().inflate(R.menu.rawmaterialfunction_2_main, menu);
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
            // Handle the Properties & Function of Zinc Borate
            Toast.makeText(getApplicationContext(),"Properties & Function of Zinc Borate", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new zb()).commit();
        }
        else if (id == R.id.rtf2)

        {
            // Handle the Properties & Function of Stearic Acid
            Toast.makeText(getApplicationContext(),"Properties & Function of Stearic Acid", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new sa()).commit();

        }
        else if (id == R.id.rtf3)

        {
            // Handle the Properties & Function of Paraffin Wax
            Toast.makeText(getApplicationContext(),"Properties & Function of Paraffin Wax", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new pwax()).commit();

        }
        else if (id == R.id.rtf4)

        {
            // Handle the Properties & Function of Polyethylene Wax
            Toast.makeText(getApplicationContext(),"Properties & Function of Polyethylene Wax", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new pewax()).commit();

        }
        else if (id == R.id.rtf5)

        {
            // Handle the Properties & Function of Finalux GCC-10
            Toast.makeText(getApplicationContext(),"Properties & Function of Finalux GCC-10", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new gcc10()).commit();

        }
        else if (id == R.id.rtf6)

        {
            // Handle the Properties & Function of Fina Plastaid-T
            Toast.makeText(getApplicationContext(),"Properties & Function of Fine Plastaid-T", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new fpt()).commit();

        }
        else if (id == R.id.rtf7)

        {
            // Handle the Properties & Function of Molybednum
            Toast.makeText(getApplicationContext(),"Properties & Function of Molybednum Trioxide", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new molybednum()).commit();

        }
        else if (id == R.id.rtf8)

        {
            // Handle the Properties & Function of Flame Guard
            Toast.makeText(getApplicationContext(),"Properties & Function of Flame Guard", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new fg()).commit();

        }
        else if (id == R.id.rtf9)

        {
            // Handle the Properties & Function of DOP
            Toast.makeText(getApplicationContext(),"Properties & Function of DOP", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new dop()).commit();

        }
        else if (id == R.id.rtf10)

        {
            // Handle the Properties & Function of CPW
            Toast.makeText(getApplicationContext(),"Properties & Function of CPW", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new cpw()).commit();

        }
        else if (id == R.id.rtf11)

        {
            // Handle the Properties & Function of Epoxy
            Toast.makeText(getApplicationContext(),"Properties & Function of Epoxy", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new epoxy()).commit();

        }
        else if (id == R.id.rtf12)

        {
            // Handle the Properties & Function of TOTM
            Toast.makeText(getApplicationContext(),"Properties & Function of TOTM", Toast.LENGTH_SHORT).show();
            fm.beginTransaction().replace(R.id.content_frame,new totm()).commit();

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

