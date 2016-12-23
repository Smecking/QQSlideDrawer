package com.smecking.qqslidedrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Smecking on 2016/12/23.
 */

public class BaseFragment extends Fragment {
    public static final String ARGS_PAGE = "args_page";
    private String contents;

    public static BaseFragment newInstance(String string) {
        Bundle args = new Bundle();
        args.putString(ARGS_PAGE, string);
        BaseFragment fragment = new BaseFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        contents = getArguments().getString(ARGS_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView textView = new TextView(getActivity());
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(17);
        textView.setText(contents + " Fragment");
        return textView;
    }
}
