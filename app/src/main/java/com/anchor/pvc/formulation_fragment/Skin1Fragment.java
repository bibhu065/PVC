package com.anchor.pvc.formulation_fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anchor.pvc.R;

/**
 * Created by Bibhuranjan Bihari on 8/24/2016.
 */
public class Skin1Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragmentskin_1, container, false);
        return rootView;
    }
}
