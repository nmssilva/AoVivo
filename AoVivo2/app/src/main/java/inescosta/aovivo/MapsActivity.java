package inescosta.aovivo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentActivity;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Context mainContext;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        mainContext = this;

        BottomNavigationView bottomNavigationView;
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        bottomNavigationView.setSelectedItemId(R.id.navigation_notifications);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:          // info

                        bundle.putString("1", "info");

                        Intent second = new Intent(mainContext, MainActivity.class);
                        second.putExtras(bundle);

                        startActivity(second);
                        finish();

                        return true;

                    case R.id.navigation_dashboard:     // dash

                        bundle.putString("1", "dashboard");

                        second = new Intent(mainContext, MainActivity.class);
                        second.putExtras(bundle);

                        startActivity(second);
                        finish();

                        return true;
                    case R.id.navigation_notifications: // map
                        return true;
                }
                return false;
            }
        });

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        bundle = new Bundle();
        LatLng centro = new LatLng(41.145739,-8.604061);

        //LOCAIS

        LatLng cave45 = new LatLng(41.149462,-8.614926);
        mMap.addMarker(new MarkerOptions().position(cave45).title("Cave 45").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        LatLng maushabitos = new LatLng(41.146619,-8.605712);
        mMap.addMarker(new MarkerOptions().position(maushabitos).title("Maus Hábitos").icon(BitmapDescriptorFactory.defaultMarker(215)));

        LatLng metalpoint = new LatLng(41.146131,-8.594703);
        mMap.addMarker(new MarkerOptions().position(metalpoint).title("Metalpoint").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng cafeaulait = new LatLng(41.147126,-8.614316);
        mMap.addMarker(new MarkerOptions().position(cafeaulait).title("Cafe Au Lait").icon(BitmapDescriptorFactory.defaultMarker(170))); //light blue (white)

        LatLng planob = new LatLng(41.146518,-8.613899);
        mMap.addMarker(new MarkerOptions().position(planob).title("Plano B").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));

        LatLng armazem = new LatLng(41.149479,-8.614069);
        mMap.addMarker(new MarkerOptions().position(armazem).title("Armazém do Chá").icon(BitmapDescriptorFactory.defaultMarker(30))); // brown

        LatLng hardclub = new LatLng(41.142050,-8.614873);
        mMap.addMarker(new MarkerOptions().position(hardclub).title("Hard Club").icon(BitmapDescriptorFactory.defaultMarker(280))); //roxo


        // METROS

        LatLng sbento = new LatLng(41.145226,-8.610991);
        mMap.addMarker(new MarkerOptions().position(sbento).title("Metro São Bento").icon(BitmapDescriptorFactory.defaultMarker(270)));

        LatLng aliados = new LatLng(41.148460,-8.611311);
        mMap.addMarker(new MarkerOptions().position(aliados).title("Metro Aliados").icon(BitmapDescriptorFactory.defaultMarker(180)));

        LatLng trindade = new LatLng(41.152276,-8.609301);
        mMap.addMarker(new MarkerOptions().position(trindade).title("Metro Trindade").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        LatLng heroismo = new LatLng(41.146696,-8.592981);
        mMap.addMarker(new MarkerOptions().position(heroismo).title("Metro Heroísmo").icon(BitmapDescriptorFactory.defaultMarker(20)));

        // MAP SETTINGS
        mMap.moveCamera(CameraUpdateFactory.newLatLng(centro));
        mMap.setMinZoomPreference(14.0f);


    }
}
