package com.example.smpljavanfc;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.smpljavanfc.databinding.FragmentSignInBinding;


public class SignInFragment extends Fragment {


    private FragmentSignInBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSignInBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // Placeholder credentials
        String adminUserName = "admin";
        String adminPassword = "password";

        binding.buttonSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.username.getText().toString().equals(adminUserName)
                        && binding.password.getText().toString().equals(adminPassword)){
                    // insert sign in action
                    Toast.makeText(binding.getRoot().getContext(), "Signed in successfully", Toast.LENGTH_SHORT).show();
                    NavHostFragment.findNavController(SignInFragment.this)
                            .navigate(R.id.action_SignInFragment_to_FirstFragment);
                }
                else{
                    Toast.makeText(binding.getRoot().getContext(), "Wrong credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}