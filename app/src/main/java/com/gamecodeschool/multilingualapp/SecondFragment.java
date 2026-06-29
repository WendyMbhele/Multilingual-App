package com.gamecodeschool.multilingualapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import org.jetbrains.annotations.Nullable;

public class SecondFragment extends Fragment {

    TextView txtWelcome;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_second, container, false);

        txtWelcome = v.findViewById(R.id.txtWelcome);

        String lang = "en"; // default

        if (getArguments() != null) {
            lang = getArguments().getString("lang", "en");
        }

        switch (lang) {
            case "zu":
                txtWelcome.setText("Siyakwamukela");
                break;

            case "af":
                txtWelcome.setText("Welkom");
                break;

            default:
                txtWelcome.setText("Welcome");
                break;
        }

        return v;
    }
}
