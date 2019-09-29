package ua.nure.liubchenko.pr0;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LandscapeFragment extends Fragment {

    public LandscapeFragment() {
        // Required empty public constructor
    }

    public static LandscapeFragment newInstance() {
        return new LandscapeFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_landscape, container, false);
    }

}
