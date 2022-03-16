package com.example.cw4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cw4.databinding.ActivityMainBinding;
import com.example.cw4.fragments.FirstFragment;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if ((savedInstanceState == null)){
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container_fragment, FirstFragment.class,null)
                    .commit();
        }

    }

}