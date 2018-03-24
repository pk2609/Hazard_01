package com.appexample.hazard_01;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

///ffffff//
public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "Please Wait...", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(Home.this, Splash3.class);
                Home.this.startActivity(myIntent);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.about) {
            Intent myIntent = new Intent(Home.this, About.class);
            Home.this.startActivity(myIntent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.Home) {
            // Handle the camera action
        } else if (id == R.id.Top) {
            Intent myIntent = new Intent(Home.this, Top.class);
            Home.this.startActivity(myIntent);

        } else if (id == R.id.Gaming) {
            Intent myIntent = new Intent(Home.this, Gaming.class);
            Home.this.startActivity(myIntent);

        } else if (id == R.id.Education) {
            Intent myIntent = new Intent(Home.this, Education.class);
            Home.this.startActivity(myIntent);

        } else if (id == R.id.Entertainment) {
            Intent myIntent = new Intent(Home.this, Entertainment.class);
            Home.this.startActivity(myIntent);

        } else if (id == R.id.Music) {
            Intent myIntent = new Intent(Home.this, Music.class);
            Home.this.startActivity(myIntent);

        } else if (id == R.id.world) {
            Intent myIntent = new Intent(Home.this, World.class);
            Home.this.startActivity(myIntent);

        } else if (id == R.id.Tech) {
            Intent myIntent = new Intent(Home.this, Tech.class);
            Home.this.startActivity(myIntent);

        } else if (id == R.id.Sports) {
            Intent myIntent = new Intent(Home.this, Sports.class);
            Home.this.startActivity(myIntent);

        } else if (id == R.id.Finance) {
            Intent myIntent = new Intent(Home.this, Finance.class);
            Home.this.startActivity(myIntent);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
