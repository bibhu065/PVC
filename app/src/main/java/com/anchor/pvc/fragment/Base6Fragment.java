package com.anchor.pvc.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anchor.pvc.R;

/**
 * Created by Bibhuranjan Bihari on 8/24/2016.
 */
public class Base6Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragmentbase_6, container, false);
        return rootView;
    }
}
