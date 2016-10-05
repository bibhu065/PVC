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


import com.anchor.pvc.formulation_fragment.Base10Fragment;
import com.anchor.pvc.formulation_fragment.Base11Fragment;
import com.anchor.pvc.formulation_fragment.Base12Fragment;
import com.anchor.pvc.formulation_fragment.Base13Fragment;
import com.anchor.pvc.formulation_fragment.Base14Fragment;
import com.anchor.pvc.formulation_fragment.Base15Fragment;
import com.anchor.pvc.formulation_fragment.Base1Fragment;
import com.anchor.pvc.formulation_fragment.Base2Fragment;
import com.anchor.pvc.formulation_fragment.Base3Fragment;
import com.anchor.pvc.formulation_fragment.Base4Fragment;
import com.anchor.pvc.formulation_fragment.Base5Fragment;
import com.anchor.pvc.formulation_fragment.Base6Fragment;
import com.anchor.pvc.formulation_fragment.Base7Fragment;
import com.anchor.pvc.formulation_fragment.Base8Fragment;
import com.anchor.pvc.formulation_fragment.Base9Fragment;
import com.anchor.pvc.formulation_fragment.BaseC1Fragment;
import com.anchor.pvc.formulation_fragment.BaseC2Fragment;
import com.anchor.pvc.formulation_fragment.BaseC3Fragment;
import com.anchor.pvc.formulation_fragment.BasefinoFragment;
import com.anchor.pvc.formulation_fragment.BasepolyFragment;
import com.anchor.pvc.formulation_fragment.FrlshFragment;
import com.anchor.pvc.formulation_fragment.Frlshst2Fragment;
import com.anchor.pvc.formulation_fragment.FrlshstFragment;
import com.anchor.pvc.formulation_fragment.FrstFragment;
import com.anchor.pvc.formulation_fragment.NonfrstFragment;
import com.anchor.pvc.formulation_fragment.Skin1Fragment;
import com.anchor.pvc.formulation_fragment.Skin2Fragment;
import com.anchor.pvc.formulation_fragment.Skin3Fragment;
import com.anchor.pvc.formulation_fragment.SkinFinoFragment;
import com.anchor.pvc.formulation_fragment.SkinPolyFragment;
import com.anchor.pvc.formulation_fragment.TelstFragment;

/**
 * Created by Bibhuranjan Bihari on 8/24/2016.
 */
public class Basicformulation extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicformulation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Send Request for New Formulation", Snackbar.LENGTH_LONG)
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
        TextView tv_email = (TextView)header.findViewById(R.id.compound_details);
        tv_email.setText("PVC Compounds Name");

        FragmentManager fm= getFragmentManager();
        fm.beginTransaction().replace(R.id.content_frame,new Base1Fragment()).commit();

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
        getMenuInflater().inflate(R.menu.formulation_main, menu);
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
        if (id == R.id.base12) {
            // Handle the Base1 i.e 1.42 specific gravity
            fm.beginTransaction().replace(R.id.content_frame,new Base12Fragment()).commit();
            Toast.makeText(getApplicationContext(),"FR Base 1.42 Sp.Gravity",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.base11) {
            // Handle the Base1 i.e 1.43 specific gravity
            fm.beginTransaction().replace(R.id.content_frame,new Base11Fragment()).commit();
            Toast.makeText(getApplicationContext(),"FR Base 1.43 Sp.Gravity",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.base1) {
            // Handle the Base1 i.e 1.44 specific gravity
            fm.beginTransaction().replace(R.id.content_frame,new Base1Fragment()).commit();
            Toast.makeText(getApplicationContext(),"FR Base 1.44 Sp.Gravity",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.base13) {
            // Handle the Base1 i.e 1.45 specific gravity
            fm.beginTransaction().replace(R.id.content_frame,new Base13Fragment()).commit();
            Toast.makeText(getApplicationContext(),"FR Base 1.45 Sp.Gravity",Toast.LENGTH_SHORT).show();
        } else if (id == R.id.base2) {
            // Handle the Base1 i.e 1.46 specific gravity
            fm.beginTransaction().replace(R.id.content_frame,new Base2Fragment()).commit();
            Toast.makeText(getApplicationContext(),"FR Base 1.46 Sp.Gravity",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.base8) {
            // Handle the Base1 i.e 1.47 specific gravity
            fm.beginTransaction().replace(R.id.content_frame,new Base8Fragment()).commit();
            Toast.makeText(getApplicationContext(),"FR Base 1.47 Sp.Gravity",Toast.LENGTH_SHORT).show();
        }else if (id == R.id.base3) {
            // Handle the Base1 i.e 1.48 specific gravity
            fm.beginTransaction().replace(R.id.content_frame,new Base3Fragment()).commit();
            Toast.makeText(getApplicationContext(),"FR Base 1.48 Sp.Gravity",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.base14) {
            // Handle the Base1 i.e 1.49 specific gravity
            fm.beginTransaction().replace(R.id.content_frame,new Base14Fragment()).commit();
            Toast.makeText(getApplicationContext(),"FR Base 1.49 Sp.Gravity",Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.base15) {
            // Handle the Base1 i.e 1.50 specific gravity
            fm.beginTransaction().replace(R.id.content_frame,new Base15Fragment()).commit();
            Toast.makeText(getApplicationContext(),"FR Base 1.50 Sp.Gravity",Toast.LENGTH_SHORT).show();
        }else if (id == R.id.base4) {
            // Handle the Base1 i.e 1.51 specific gravity
            fm.beginTransaction().replace(R.id.content_frame,new Base4Fragment()).commit();
            Toast.makeText(getApplicationContext(),"FR Base 1.51 Sp.Gravity up to 700 Line Speed",Toast.LENGTH_SHORT).show();

        } else if (id == R.id.base5) {
            // Handle the Base1 i.e 1.52  specific gravity Low Speed 700 Line Speed
            fm.beginTransaction().replace(R.id.content_frame,new Base5Fragment()).commit();
            Toast.makeText(getApplicationContext(),"FR Base 1.52 Sp.Gravity up to 700 Line Speed",Toast.LENGTH_SHORT).show();

        } else if (id == R.id.base6) {
            // Handle the Base1 i.e 1.52  specific gravity High Line Speed 900
            fm.beginTransaction().replace(R.id.content_frame,new Base6Fragment()).commit();
            Toast.makeText(getApplicationContext(),"FR Base 1.52 Sp.Gravity up to 900 Line Speed",Toast.LENGTH_SHORT).show();

        }else if (id == R.id.base7) {
            // Handle the Base1 i.e 1.52  specific gravity Non FR Base Type D
            fm.beginTransaction().replace(R.id.content_frame,new Base7Fragment()).commit();
            Toast.makeText(getApplicationContext(),"Non FR Base Type D 1.52 Sp.Gravity up to 700 Line Speed",Toast.LENGTH_SHORT).show();


        }else if (id == R.id.finolex) {
            // Handle the Base1 i.e Finolex Base specific gravity
            fm.beginTransaction().replace(R.id.content_frame,new BasefinoFragment()).commit();
            Toast.makeText(getApplicationContext(),"Finolex Base 1.52 Sp.Gravity",Toast.LENGTH_SHORT).show();

        }
        else if (id == R.id.polycab) {
            // Handle the Base1 i.e Polycab Base specific gravity
            fm.beginTransaction().replace(R.id.content_frame,new BasepolyFragment()).commit();
            Toast.makeText(getApplicationContext(),"Polycab Base1.48 Sp.Gravity",Toast.LENGTH_SHORT).show();
        }else if (id == R.id.base9) {
            // Handle the Base1 i.e 1.52  specific gravity FR Base Type D
            fm.beginTransaction().replace(R.id.content_frame, new Base9Fragment()).commit();
            Toast.makeText(getApplicationContext(), "FR Base Type D 1.52 Sp.Gravity", Toast.LENGTH_SHORT).show();
        }else if (id == R.id.base10) {
                // Handle the Base1 i.e 1.52  specific gravity FR Base Type D
                fm.beginTransaction().replace(R.id.content_frame,new Base10Fragment()).commit();
                Toast.makeText(getApplicationContext(),"FR Base Type A 1.52 Sp.Gravity without Zinc Borate & Flame Guard",Toast.LENGTH_SHORT).show();

        }
        else if (id == R.id.typec1) {
            // Handle the Base1 FR Base Type C(1)
            fm.beginTransaction().replace(R.id.content_frame,new BaseC1Fragment()).commit();
            Toast.makeText(getApplicationContext(),"FR Base Type C Trial 1",Toast.LENGTH_SHORT).show();

        }
        else if (id == R.id.typec2) {
            // Handle the Base1 FR Base Type C(2)
            fm.beginTransaction().replace(R.id.content_frame,new BaseC2Fragment()).commit();
            Toast.makeText(getApplicationContext(),"FR Base Type C Trial 2",Toast.LENGTH_SHORT).show();

        }
        else if (id == R.id.typec3) {
            // Handle the Base1 FR Base Type C(3)
            fm.beginTransaction().replace(R.id.content_frame,new BaseC3Fragment()).commit();
            Toast.makeText(getApplicationContext(),"FR Base Type C Trial 3",Toast.LENGTH_SHORT).show();

        }else if (id == R.id.skin1) {
            // Handle the skin1 i.e Line Speed 300
            fm.beginTransaction().replace(R.id.content_frame,new Skin1Fragment()).commit();
            Toast.makeText(getApplicationContext(),"Skin 1.32 Specific gravity up to 300 Line Speed",Toast.LENGTH_SHORT).show();


        }else if (id == R.id.skin2) {
            // Handle the skin1 i.e Line Speed 700
            fm.beginTransaction().replace(R.id.content_frame,new Skin2Fragment()).commit();
            Toast.makeText(getApplicationContext(),"Skin 1.32 Specific gravity up to 700Line Speed",Toast.LENGTH_SHORT).show();

        }else if (id == R.id.skin3) {
            // Handle the Transparent SKIN
            fm.beginTransaction().replace(R.id.content_frame,new Skin3Fragment()).commit();
            Toast.makeText(getApplicationContext(),"Transparent Skin",Toast.LENGTH_SHORT).show();

        }
        else if (id == R.id.finolexskin) {
            // Handle the Finolex SKIN
            fm.beginTransaction().replace(R.id.content_frame, new SkinFinoFragment()).commit();
            Toast.makeText(getApplicationContext(), "Finolex Skin 1.30 Sp.Gravity", Toast.LENGTH_SHORT).show();
        }else if (id == R.id.polycabskin) {
                // Handle the Polycab SKIN
                fm.beginTransaction().replace(R.id.content_frame, new SkinPolyFragment()).commit();
                Toast.makeText(getApplicationContext(), "Polycab Skin 1.31 Sp.Gravity", Toast.LENGTH_SHORT).show();
        }else if (id == R.id.telehphonest) {
             // Handle the Telephone Sheathing
            fm.beginTransaction().replace(R.id.content_frame,new TelstFragment()).commit();
            Toast.makeText(getApplicationContext(),"Telephone Sheathing",Toast.LENGTH_SHORT).show();

        }else if (id == R.id.frst) {
            // Handle the  FR Sheathing
            fm.beginTransaction().replace(R.id.content_frame,new FrstFragment()).commit();
            Toast.makeText(getApplicationContext(),"FR Sheathing",Toast.LENGTH_SHORT).show();

        }else if (id == R.id.nfrst) {
            // Handle the Non FR Sheathing
            fm.beginTransaction().replace(R.id.content_frame,new NonfrstFragment()).commit();
            Toast.makeText(getApplicationContext(),"Non FR Sheathing",Toast.LENGTH_SHORT).show();

        }else if (id == R.id.frlsh) {
            // Handle the FRLSH Insulation
            fm.beginTransaction().replace(R.id.content_frame,new FrlshFragment()).commit();
            Toast.makeText(getApplicationContext(),"FRLSH Insulation",Toast.LENGTH_SHORT).show();

        }
        else if (id == R.id.frlshst) {
            // Handle the FRLSH Sheathing ST3
            fm.beginTransaction().replace(R.id.content_frame,new FrlshstFragment()).commit();
            Toast.makeText(getApplicationContext(),"FRLSH Sheathing ST3",Toast.LENGTH_SHORT).show();

        }
        else if (id == R.id.frlshst2) {
            // Handle the FRLSH Sheathing ST2
            fm.beginTransaction().replace(R.id.content_frame,new Frlshst2Fragment()).commit();
            Toast.makeText(getApplicationContext(),"FRLSH Sheathing ST2",Toast.LENGTH_SHORT).show();

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
