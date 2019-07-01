package com.example.android.fragmentexample;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class RatingFragment extends Fragment {


    public RatingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView =
                inflater.inflate(R.layout.fragment_rating, container, false);
        final RatingBar ratingBar = rootView.findViewById(R.id.rating);

// TODO: Set the ratingBar onCheckedChanged listener.
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(getActivity(), "My Rating:" + ratingBar.getRating(),Toast.LENGTH_SHORT).show();
            }
        });
// Return the View for the fragment's UI.
        return rootView;

        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_rating, container, false);
    }

}
