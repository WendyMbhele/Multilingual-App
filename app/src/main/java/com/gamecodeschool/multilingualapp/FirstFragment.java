package com.gamecodeschool.multilingualapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class FirstFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_first, container, false);

        v.findViewById(R.id.btnEnglish).setOnClickListener(view -> openSecond("en"));
        v.findViewById(R.id.btnZulu).setOnClickListener(view -> openSecond("zu"));
        v.findViewById(R.id.btnAfrikaans).setOnClickListener(view -> openSecond("af"));

        return v;
    }

    private void openSecond(String lang) {

        SecondFragment fragment = new SecondFragment();

        Bundle bundle = new Bundle();
        bundle.putString("lang", lang);

        fragment.setArguments(bundle);

        requireActivity().getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .addToBackStack(null)
                .commit();
    }
}
