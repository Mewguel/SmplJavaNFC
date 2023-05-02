package com.example.smpljavanfc;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.smpljavanfc.databinding.FragmentSplashScreenBinding;


public class SplashScreenFragment extends Fragment {

    private FragmentSplashScreenBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSplashScreenBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Thread thread = new Thread()
        {
            @Override
            public void run()
            {
                try {
                    sleep(3000);
                    // buggy needs testing
                    NavHostFragment.findNavController(SplashScreenFragment.this)
                            .navigate(R.id.action_SplashScreenFragment_to_SignInFragment);
                }
                catch (Exception e)
                {

                }
            }
        }; thread.start();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}