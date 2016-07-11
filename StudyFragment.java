package com.nichetech.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Pratik on 23/5/16.
 */
public class StudyFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.study_fragment, container, false);
        TextView textView=(TextView) view.findViewById(R.id.title_all);
        textView.setText("study");
        return view;

    }
}
