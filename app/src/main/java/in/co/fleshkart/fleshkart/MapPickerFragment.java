package in.co.fleshkart.fleshkart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.google.android.gms.maps.MapFragment;


public class MapPickerFragment extends MapFragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mapView = super.onCreateView(inflater, container, savedInstanceState);
        ViewGroup view = new FrameLayout(getActivity());

        view.addView(mapView, new FrameLayout.LayoutParams(-1, -1));
        view.addView(inflater.inflate(R.layout.fragment_map_picker, null), new FrameLayout.LayoutParams(-1, -1));
        return view;
    }


}
