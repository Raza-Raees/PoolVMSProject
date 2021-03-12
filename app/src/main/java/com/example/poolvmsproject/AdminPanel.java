package com.example.poolvmsproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class AdminPanel extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mdrawerlayout;
    private Button b;
    private NavigationView nv;
    private TextView adminname,info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_panel);

        mdrawerlayout = (DrawerLayout) findViewById(R.id.drawer);
        b = (Button) findViewById(R.id.b);


        nv = (NavigationView) findViewById(R.id.nv1);
        nv.setNavigationItemSelectedListener(this);


        View header = nv.getHeaderView(0);
        adminname = (TextView) header.findViewById(R.id.name);
        info = (TextView) header.findViewById(R.id.info);

        adminname.setText(getString(R.string.Admin_Name));
        info.setText(getString(R.string.Admin_info));

    }


    public void btc(View view) {

        mdrawerlayout.openDrawer(Gravity.LEFT);
    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Do you Want To Exit")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                        finish();

                        System.exit(0);

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }).show();

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {


       int id = item.getItemId();

        if (id == R.id.allocatebus) {

            mdrawerlayout.closeDrawers();
        }

        if (id == R.id.registerdriver) {
//            Intent i = new Intent(this, SignUp.class);
//            startActivity(i);
        }


        if (id == R.id.registerbus) {

//            Intent i = new Intent(this, SignIn.class);
//            startActivity(i);

        }
        if (id == R.id.managedriver) {

//            Intent i = new Intent(this, SignIn.class);
//            startActivity(i);

        }


        if (id == R.id.logout) {
            finish();
            System.exit(0);

        }


        return false;
    }
}