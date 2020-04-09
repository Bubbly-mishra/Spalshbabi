package com.example.spalshbabi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class Intro extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addSlide(AppIntroFragment.newInstance(getString(R.string.st), getString(R.string.k), R.drawable.idea, ContextCompat.getColor(getApplicationContext(),R.color.first)));
        addSlide(AppIntroFragment.newInstance(getString(R.string.nd), getString(R.string.l), R.drawable.money, ContextCompat.getColor(getApplicationContext(),R.color.second)));
        addSlide(AppIntroFragment.newInstance(getString(R.string.rd), getString(R.string.m), R.drawable.dollar, ContextCompat.getColor(getApplicationContext(),R.color.third)));
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Do something when users tap on Skip button.
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
        finish();
    }


}
