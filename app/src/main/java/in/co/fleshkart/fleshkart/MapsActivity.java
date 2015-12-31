package in.co.fleshkart.fleshkart;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.GoogleMap;


public class MapsActivity extends FragmentActivity {

    private MapPickerFragment mMapFragment;
    private GoogleMap mMap;
    private float mZoomLevel = 0f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        mMapFragment = (MapPickerFragment) getFragmentManager().findFragmentById(R.id.map);
    }




}
