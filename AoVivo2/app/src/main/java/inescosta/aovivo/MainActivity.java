package inescosta.aovivo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import com.google.android.gms.maps.MapsInitializer;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private ImageView apphome;
    private ImageView info;
    private ImageView cave,maus,armazem,planob,metalpoint,cafeaulait,hardclub;
    private ImageView cavep,mausp,armazemp,planobp,metalpointp,cafeaulaitp,hardclubp;
    private VideoView metalpointv;

    Intent second;
    BottomNavigationView bottomNavigationView;

    public Context mainContext;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            apphome.setVisibility(View.GONE);
            info.setVisibility(View.GONE);
            hidePhotos();
            hideImageButtons();

            switch (item.getItemId()) {
                case R.id.navigation_home:          // info
                    info.setVisibility(View.VISIBLE);
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:     // dash
                    mTextMessage.setText(R.string.title_dashboard);
                    showImageButtons();
                    return true;
                case R.id.navigation_notifications: // map
                    mTextMessage.setText(R.string.title_notifications);
                    startActivity(second);
                    finish();
                    return true;
            }
            return false;
        }

    };

    private void showImageButtons(){
        cave.setVisibility(View.VISIBLE);
        maus.setVisibility(View.VISIBLE);
        armazem.setVisibility(View.VISIBLE);
        planob.setVisibility(View.VISIBLE);
        metalpoint.setVisibility(View.VISIBLE);
        cafeaulait.setVisibility(View.VISIBLE);
        hardclub.setVisibility(View.VISIBLE);
    }

    private void hideImageButtons(){
        cave.setVisibility(View.GONE);
        maus.setVisibility(View.GONE);
        armazem.setVisibility(View.GONE);
        planob.setVisibility(View.GONE);
        metalpoint.setVisibility(View.GONE);
        cafeaulait.setVisibility(View.GONE);
        hardclub.setVisibility(View.GONE);
    }

    private void hidePhotos(){
        cavep.setVisibility(View.GONE);
        mausp.setVisibility(View.GONE);
        armazemp.setVisibility(View.GONE);
        planobp.setVisibility(View.GONE);
        metalpointp.setVisibility(View.GONE);
        cafeaulaitp.setVisibility(View.GONE);
        hardclubp.setVisibility(View.GONE);
    }

    private void photoClick(){
        showImageButtons();
        hidePhotos();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainContext = this;
        second = new Intent(mainContext, MapsActivity.class);

        apphome = (ImageView) findViewById(R.id.imageView3);

        // IMAGE BUTTONS

        cave = (ImageView) findViewById(R.id.cave);
        cave.setVisibility(View.GONE);
        maus = (ImageView) findViewById(R.id.maus);
        maus.setVisibility(View.GONE);
        armazem = (ImageView) findViewById(R.id.armazem);
        armazem.setVisibility(View.GONE);
        planob = (ImageView) findViewById(R.id.planob);
        planob.setVisibility(View.GONE);
        metalpoint = (ImageView) findViewById(R.id.metalpoint);
        metalpoint.setVisibility(View.GONE);
        cafeaulait = (ImageView) findViewById(R.id.cafeaulait);
        cafeaulait.setVisibility(View.GONE);
        hardclub = (ImageView) findViewById(R.id.hardclub);
        hardclub.setVisibility(View.GONE);

        // LOCAL PHOTOS

        cavep = (ImageView) findViewById(R.id.cavep);
        cavep.setVisibility(View.GONE);
        mausp = (ImageView) findViewById(R.id.mausp);
        mausp.setVisibility(View.GONE);
        armazemp = (ImageView) findViewById(R.id.armazemp);
        armazemp.setVisibility(View.GONE);
        planobp = (ImageView) findViewById(R.id.planobp);
        planobp.setVisibility(View.GONE);
        metalpointp = (ImageView) findViewById(R.id.metalpointp);
        metalpointp.setVisibility(View.GONE);
        cafeaulaitp = (ImageView) findViewById(R.id.cafeaulaitp);
        cafeaulaitp.setVisibility(View.GONE);
        hardclubp = (ImageView) findViewById(R.id.hardclubp);
        hardclubp.setVisibility(View.GONE);

        // IMAGE BUTTONS CLICK

        cave.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                hideImageButtons();
                cavep.setVisibility(View.VISIBLE);
            }
        });

        maus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                hideImageButtons();
                mausp.setVisibility(View.VISIBLE);
            }
        });

        armazem.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                hideImageButtons();
                armazemp.setVisibility(View.VISIBLE);
            }
        });

        planob.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                hideImageButtons();
                planobp.setVisibility(View.VISIBLE);
            }
        });

        metalpoint.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                hideImageButtons();
                metalpointp.setVisibility(View.VISIBLE);
            }
        });

        cafeaulait.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                hideImageButtons();
                cafeaulaitp.setVisibility(View.VISIBLE);
            }
        });

        hardclub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                hideImageButtons();
                hardclubp.setVisibility(View.VISIBLE);
            }
        });

        // PHOTO CLICK

        cavep.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                photoClick();
            }
        });

        mausp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                photoClick();
            }
        });

        armazemp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                photoClick();
            }
        });

        planobp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                photoClick();
            }
        });

        metalpointp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                photoClick();
            }
        });

        cafeaulaitp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                photoClick();
            }
        });

        hardclubp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                photoClick();
            }
        });



        // INFO
        info = (ImageView) findViewById(R.id.info);
        info.setVisibility(View.GONE);

        // GET STRING
        String op = getIntent().getStringExtra("1");
        if(op == null){
            op = "";
        }

        // BOTTOM NAV
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.navigation_dashboard);

        if(op.equalsIgnoreCase("info")){
            bottomNavigationView.setSelectedItemId(R.id.navigation_home);
            info.setVisibility(View.VISIBLE);
        }
        if(op.equalsIgnoreCase("dashboard")){
            bottomNavigationView.setSelectedItemId(R.id.navigation_dashboard);
            showImageButtons();
        }

        //TEXT
        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        //APP HOME
        apphome.setVisibility(View.VISIBLE);

        if(!op.equalsIgnoreCase("")){
            apphome.setVisibility(View.GONE);
        }

        apphome.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                apphome.setVisibility(View.GONE);
                BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
                navigation.setSelectedItemId(R.id.navigation_dashboard);
            }
        });


        //MAP ---------

    }

}
