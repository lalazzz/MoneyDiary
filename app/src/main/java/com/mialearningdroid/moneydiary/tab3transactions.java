package com.mialearningdroid.moneydiary;

/**
 * Created by Nandhini on 28/8/17.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class tab3transactions extends Fragment {
    //https://stackoverflow.com/questions/27919091/storing-user-input-in-an-array-and-saved-on-sharedpreferences

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab3transactions, container, false);
        return rootView;
    }
}
