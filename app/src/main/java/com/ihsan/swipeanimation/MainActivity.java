package com.ihsan.swipeanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ExampleBottomDialog.BottomSheetListener {

    private TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.text_view_button_clicked);
        Button buttonOpenBottomSheet = findViewById(R.id.button_open_bottom_sheet);
        buttonOpenBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ExampleBottomDialog bottomSheet = new ExampleBottomDialog();
                bottomSheet.show(getSupportFragmentManager(), "exampleBottomSheet");
            }
        });

    }

    @Override
    public void onButtonClicked(String text) {

    }
}