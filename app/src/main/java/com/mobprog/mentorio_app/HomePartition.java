package com.mobprog.mentorio_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.mobprog.memtorio_app.R;

public class HomePartition extends Fragment {

    @Nullable
    @Override


    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceStates){
        View view = inflater.inflate(R.layout.homepage, container, false);
        return view;




    }
}