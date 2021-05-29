package com.example.bai1;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {
    RelativeLayout relativeLayoutButtonSheet;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayoutButtonSheet = findViewById(R.id.layoutFood1);
        relativeLayoutButtonSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                relativeLayoutButtonSheet = findViewById(R.id.layoutFood1);
                relativeLayoutButtonSheet.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        relativeLayoutButtonSheet.setVisibility(View.GONE);
                        FragmentManager fragmentManager = getSupportFragmentManager();
                        FragmentMore fragmentMore = new FragmentMore();
                        fragmentManager.beginTransaction().replace(R.id.mainActivityContainer, fragmentMore).commit();
                    }
                });
            }
        });

        imageView = findViewById(R.id.filterIcon);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialog bottomSheetDialog = new bottomSheetDialog();
                bottomSheetDialog.show(getSupportFragmentManager(), "Bottom Sheet Dialog");
            }
        });
    }
}