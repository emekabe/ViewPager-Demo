package com.emekachukwulobe.viewpagerdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class RoastedYamPageFragment extends Fragment {

    private Button agreeButton;
    private TextView coolText;

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_roasted_yam_page, container, false);

        agreeButton = rootView.findViewById(R.id.agree_button);
        coolText = rootView.findViewById(R.id.cool_text);
        agreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Fufu is really nice", Toast.LENGTH_SHORT).show();
                coolText.setText(getString(R.string.lorem_ipsum));
            }
        });

        return rootView;

    }
}