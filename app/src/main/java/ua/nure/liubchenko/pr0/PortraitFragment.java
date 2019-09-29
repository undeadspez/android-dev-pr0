package ua.nure.liubchenko.pr0;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;

public class PortraitFragment extends Fragment {

    public PortraitFragment() {
        // Required empty public constructor
    }

    public static PortraitFragment newInstance() {
        return new PortraitFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_portrait, container, false);

//        TableLayout tableLayout = view.findViewById(R.id.colorTable);
//        tableLayout.setBackground(new ColorDrawable(Color.LTGRAY));
//
//        Log.i("table", "" + tableLayout);
//
//        for (int i = 0; i < 3; ++i) {
//            TableRow row = new TableRow(getActivity());
//            row.setLayoutParams(new LinearLayout.LayoutParams(
//                    0,
//                    ViewGroup.LayoutParams.MATCH_PARENT,
//                    1
//            ));
//
//            for (int j = 0; j < 3; ++j) {
//                View cell = new View(getActivity());
//                cell.setLayoutParams(new LinearLayout.LayoutParams(
//                        ViewGroup.LayoutParams.MATCH_PARENT,
//                        ViewGroup.LayoutParams.MATCH_PARENT,
//                        1f
//                ));
//
//                int colorId = getResources().getIdentifier("cell" + (i + j + 2), "color",
//                        getContext().getPackageName());
//
//                ColorDrawable color = new ColorDrawable(colorId);
//                Log.i("color", "id = " + colorId);
//
//                cell.setBackground(color);
//
//                row.addView(cell);
//            }
//            tableLayout.addView(row);
//
//            int cellCount= row.getChildCount();
//            Log.i("row", "cols = " + cellCount);
//        }
//
//        int rowCount = tableLayout.getChildCount();
//        Log.i("table", "rows = " + rowCount);
        // Inflate the layout for this fragment
        return view;
    }

}
