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

public class GameFragment extends Fragment
{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment_game, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        NavController navController = Navigation.findNavController(view);

        Button buttonFinishGame = view.findViewById(R.id.btn_finish_game);
        buttonFinishGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                navController.navigate(R.id.action_gameFragment_to_endGameFragment);
            }
        });
    }
}