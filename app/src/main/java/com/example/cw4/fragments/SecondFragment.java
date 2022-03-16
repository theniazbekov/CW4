
package com.example.cw4.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.cw4.R;
import com.example.cw4.databinding.FragmentFirstBinding;
import com.example.cw4.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {
    private  FragmentSecondBinding binding;
    Animation endToStart;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        endToStart= AnimationUtils.loadAnimation(requireContext(), R.anim.end_to_start);
        binding.secondFragment.setAnimation(endToStart);
        data();
    }

    private void data() {
        binding.btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                    }
                }, 3000);
                FirstFragment firstFragment = new FirstFragment();
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.container_fragment,firstFragment).commit();
            }

        });
    }


}