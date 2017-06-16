package inescosta.aovivo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.MapView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private ImageView apphome;
    private ImageView info;
    private MapView map;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            apphome.setVisibility(View.GONE);
            info.setVisibility(View.GONE);
            map.setVisibility(View.GONE);

            switch (item.getItemId()) {
                case R.id.navigation_home: // info
                    info.setVisibility(View.VISIBLE);
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard: // dash
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications: // map
                    map.setVisibility(View.VISIBLE);
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        apphome = (ImageView) findViewById(R.id.imageView3);

        info = (ImageView) findViewById(R.id.info);
        info.setVisibility(View.GONE);

        map = (MapView) findViewById(R.id.mapView);
        map.setVisibility(View.GONE);


    }
}
