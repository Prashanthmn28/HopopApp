package com.hopop.hopopv10.activities;

import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.NotificationCompat;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.TextView;

import com.afollestad.materialdialogs.MaterialDialog;

public class PaymentActivty extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener  {

    TextView MePlus, MePlus1,MePlus2,MePlus3,numofSeats,rideshareCalc,rideshareAmt;
    Button Pay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.PaymentHeader);
        setContentView(R.layout.activity_payment);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        MePlus = (TextView)findViewById(R.id.textView_justme);
        MePlus1 = (TextView)findViewById(R.id.textView_justme1);
        MePlus2 = (TextView)findViewById(R.id.textView_justme2);
        MePlus3 = (TextView)findViewById(R.id.textView_justme3);
        Pay = (Button)findViewById(R.id.button_Pay);

        MePlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numofSeats = (TextView)findViewById(R.id.textView_NumofSeats);
                numofSeats.setText("01");
                rideshareCalc = (TextView)findViewById(R.id.textView_rideshareCalc);
                rideshareCalc.setText("1X30");
                rideshareAmt = (TextView)findViewById(R.id.textView_rideshareAmt);
                rideshareAmt.setText("30Rs");
            }
        });
        MePlus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numofSeats = (TextView)findViewById(R.id.textView_NumofSeats);
                numofSeats.setText("02");
                rideshareCalc = (TextView)findViewById(R.id.textView_rideshareCalc);
                rideshareCalc.setText("2X30");
                rideshareAmt = (TextView)findViewById(R.id.textView_rideshareAmt);
                rideshareAmt.setText("60Rs");
            }
        });
        MePlus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numofSeats = (TextView)findViewById(R.id.textView_NumofSeats);
                numofSeats.setText("03");
                rideshareCalc = (TextView)findViewById(R.id.textView_rideshareCalc);
                rideshareCalc.setText("3X30");
                rideshareAmt = (TextView)findViewById(R.id.textView_rideshareAmt);
                rideshareAmt.setText("90Rs");
            }
        });
        MePlus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numofSeats = (TextView)findViewById(R.id.textView_NumofSeats);
                numofSeats.setText("04");
                rideshareCalc = (TextView)findViewById(R.id.textView_rideshareCalc);
                rideshareCalc.setText("4X30");
                rideshareAmt = (TextView)findViewById(R.id.textView_rideshareAmt);
                rideshareAmt.setText("120Rs");
            }
        });
        Pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(
                        PaymentActivty.this).create();

                // Setting Dialog Title
                alertDialog.setTitle("Ticket Confirmed");

                // Setting Dialog Message
                alertDialog.setMessage("Booking Id: 772");

                // Setting Icon to Dialog
                alertDialog.setIcon(R.drawable.tick);

                // Setting OK Button
                alertDialog.setButton("OK",
                        new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog,
                                                int which) {
                                // Write your code here to execute after dialog
                                // closed
                                // Toast.makeText(getApplicationContext(),
                                //       "You clicked on OK", Toast.LENGTH_SHORT)
                                //     .show();


                                Intent intent_1 = new Intent(PaymentActivty.this, SearchActivity.class);
                                startActivity(intent_1);
                            }
                        });

                // Showing Alert Message
                alertDialog.show();





                showNotification(PaymentActivty.this);
            }});

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

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.payment_activty, menu);
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
    }*/

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.profile) {

        } else if (id == R.id.booking) {

        } else if (id == R.id.wallet) {

        } else if (id == R.id.route) {

        } else if (id == R.id.notification) {

        } else if (id == R.id.feedback) {

        } else if (id == R.id.about) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    private void showConfirmationDialog(){
        new MaterialDialog.Builder(this)
                .title("Ticket Confirmed")
                .content("Booking Id: 772")
                .positiveText("ok")
                .show();
    }

    public static void showNotification(Context ctx) {
        String msg = "Its time to be there in boarding Point."
                + "\nBoarding pass:- KA0103020830AZH" + "\nSeat position:- 3S-W\n" +
                "Happy Journey!!!.Have a nice day.";

        Intent intent = new Intent(ctx, LoginActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(ctx, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder b = new NotificationCompat.Builder(ctx);

        // Add Big View Specific Configuration
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
        bigTextStyle.bigText(msg).setBigContentTitle("Hopper").setSummaryText("Ticket confirmed");

        b.setAutoCancel(true)
                .setDefaults(Notification.DEFAULT_ALL)
                .setWhen(System.currentTimeMillis())
                .setSmallIcon(R.mipmap.ic_launcher)
                .setTicker("Ticket confirmed")
                .setContentTitle("Hopper")
                .setContentText(msg)
                .setDefaults(Notification.DEFAULT_LIGHTS | Notification.DEFAULT_SOUND)
                        //.setContentIntent(contentIntent)
                .setStyle(bigTextStyle);
        //.setContentInfo("Info");

        NotificationManager notificationManager = (NotificationManager) ctx.getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(1, b.build());
    }


    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen for landscape and portrait and set portrait mode always
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
    }
}
