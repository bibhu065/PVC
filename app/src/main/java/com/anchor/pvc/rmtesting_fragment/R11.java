package com.anchor.pvc.rmtesting_fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anchor.pvc.R;

/**
 * Created by Bibhuranjan Bihari on 10/4/2016.
 */
public class R11 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.rmtp1,container,false);
        return rootView;
    }
}
