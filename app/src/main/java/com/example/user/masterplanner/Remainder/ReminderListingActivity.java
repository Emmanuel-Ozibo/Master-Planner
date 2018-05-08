package com.example.user.masterplanner.Remainder;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import com.example.user.masterplanner.R;

import java.util.Calendar;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by emmanuel on 2018-04-20.
 */

public class ReminderListingActivity extends AppCompatActivity implements ReminderListingFragment.OnRemainderFragmentAttach{


    @BindView(R.id.nav_drawer)
    private NavigationView navigationView;
    @BindView(R.id.drawer_layout)
    private DrawerLayout drawer_layout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);
        ButterKnife.bind(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.settings:
                //todo:perform this later
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onAddReminderClicked() {

    }

}