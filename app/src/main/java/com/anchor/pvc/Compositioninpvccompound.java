package com.anchor.pvc;

import android.app.FragmentManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.anchor.pvc.fillers_fragment.Filler;
import com.anchor.pvc.fillers_fragment.Filler1;
import com.anchor.pvc.fillers_fragment.Filler2;
import com.anchor.pvc.lubricants_fragment.Lubricants;
import com.anchor.pvc.lubricants_fragment.Lubricants1;
import com.anchor.pvc.lubricants_fragment.Lubricants2;
import com.anchor.pvc.plasticizer_fragment.plasticizer;
import com.anchor.pvc.plasticizer_fragment.plasticizer1;
import com.anchor.pvc.plasticizer_fragment.plasticizer2;
import com.anchor.pvc.resin_fragment.Resin;
import com.anchor.pvc.resin_fragment.Resin1;
import com.anchor.pvc.resin_fragment.Resin2;
import com.anchor.pvc.resin_fragment.Resin3;
import com.anchor.pvc.resin_fragment.Resin4;
import com.anchor.pvc.resin_fragment.k_value;
import com.anchor.pvc.specialadditives_fragment.Flameretardant;
import com.anchor.pvc.specialadditives_fragment.Flameretardant1;
import com.anchor.pvc.specialadditives_fragment.Smokesuppresant;
import com.anchor.pvc.specialadditives_fragment.Smokesuppresant1;
import com.anchor.pvc.stabilizer_fragment.stabilizer;
import com.anchor.pvc.stabilizer_fragment.stabilizer1;
import com.anchor.pvc.stabilizer_fragment.stabilizer2;

public class Compositioninpvccompound extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compositioninpvccompound);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Give Feedback for additional info on Additives", Snackbar.LENGTH_LONG)
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
        TextView tv_email = (TextView)header.findViewById(R.id.rmname_details);
        tv_email.setText("PVC Compounding Additives");

        FragmentManager fm= getFragmentManager();
        fm.beginTransaction().replace(R.id.content_frame,new Resin()).commit();

    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.additives_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        FragmentManager fm=getFragmentManager();
        int id = item.getItemId();

        if (id == R.id.resin) {

            fm.beginTransaction().replace(R.id.content_frame,new Resin()).commit();

        } else if (id == R.id.resin1) {

            fm.beginTransaction().replace(R.id.content_frame,new Resin1()).commit();


        } else if (id == R.id.resin2) {

            fm.beginTransaction().replace(R.id.content_frame,new Resin2()).commit();


        } else if (id == R.id.resin3) {

            fm.beginTransaction().replace(R.id.content_frame,new Resin3()).commit();



        } else if (id == R.id.resin4) {

            fm.beginTransaction().replace(R.id.content_frame, new Resin4()).commit();
        } else if (id == R.id.kvalue) {

                fm.beginTransaction().replace(R.id.content_frame,new k_value()).commit();



        }else if (id == R.id.plasticizer) {

            fm.beginTransaction().replace(R.id.content_frame,new plasticizer()).commit();



        }else if (id == R.id.plasticizer1) {

            fm.beginTransaction().replace(R.id.content_frame, new plasticizer1()).commit();

        }else if (id == R.id.plasticizer2) {

            fm.beginTransaction().replace(R.id.content_frame, new plasticizer2()).commit();

        }else if (id == R.id.stabilizer) {

            fm.beginTransaction().replace(R.id.content_frame,new stabilizer()).commit();


        }else if (id == R.id.stabilizer1) {

            fm.beginTransaction().replace(R.id.content_frame,new stabilizer1()).commit();



        }else if (id == R.id.stabilizer2) {

            fm.beginTransaction().replace(R.id.content_frame,new stabilizer2()).commit();


        }else if (id == R.id.filler) {

            fm.beginTransaction().replace(R.id.content_frame,new Filler()).commit();


        }else if (id == R.id.filler1) {

            fm.beginTransaction().replace(R.id.content_frame,new Filler1()).commit();


        }else if (id == R.id.filler2) {

            fm.beginTransaction().replace(R.id.content_frame,new Filler2()).commit();


        }else if (id == R.id.lubricants) {

            fm.beginTransaction().replace(R.id.content_frame,new Lubricants()).commit();


        }else if (id == R.id.primarylubricants) {

            fm.beginTransaction().replace(R.id.content_frame,new Lubricants1()).commit();


        }
        else if (id == R.id.secondarylubricants) {

            fm.beginTransaction().replace(R.id.content_frame,new Lubricants2()).commit();


        }
        else if (id == R.id.smokesuppresant) {

            fm.beginTransaction().replace(R.id.content_frame,new Smokesuppresant()).commit();


        }
        else if (id == R.id.smokesuppresant1) {

            fm.beginTransaction().replace(R.id.content_frame,new Smokesuppresant1()).commit();


        }
        else if (id == R.id.flamereatardent) {

            fm.beginTransaction().replace(R.id.content_frame,new Flameretardant()).commit();


        }
        else if (id == R.id.flameretardent1) {

            fm.beginTransaction().replace(R.id.content_frame,new Flameretardant1()).commit();


        }
        else if (id == R.id.return_menu) {

            finish();

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}



