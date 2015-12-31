package in.co.fleshkart.fleshkart;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.GoogleMap;


public class MapsActivity extends AppCompatActivity {

    private MapPickerFragment mMapFragment;
    private GoogleMap mMap;
    private float mZoomLevel = 0f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        final ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        mMapFragment = (MapPickerFragment) getFragmentManager().findFragmentById(R.id.map);
    }




}
