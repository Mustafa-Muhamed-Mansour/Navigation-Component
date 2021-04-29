package com.Navigation.navigationcomponent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class StartFragment extends Fragment
{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_start, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        NavController navController = Navigation.findNavController(view);

        TextView textView = view.findViewById(R.id.txt_start_game);
        textView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(v.getContext(), textView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        Button buttonStartGame = view.findViewById(R.id.btn_start_game);
        buttonStartGame.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                navController.navigate(R.id.action_startFragment_to_gameFragment);
            }
        });
    }
}