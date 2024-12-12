package com.example.admin_stadium;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StadiumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_stadium);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageButton btnBack = findViewById(R.id.btn_back);
        ImageButton btnAdd = findViewById(R.id.btn_add);
        CardView cvStadium = findViewById(R.id.stadium_campnou);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             showPopupCreateStadium();
            }
        });

        cvStadium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupStadiumDetail();
            }
        });
}

private void showPopupCreateStadium() {
    // Hiển thị DialogFragment
    CreateStadium dialogFragment = new CreateStadium();
    dialogFragment.show(getSupportFragmentManager(), "createStadium");
}
    private void showPopupStadiumDetail() {
        // Hiển thị DialogFragment
        StadiumDetailActivity dialogFragment = new StadiumDetailActivity();
        dialogFragment.show(getSupportFragmentManager(), "stadiumDetail");
    }

}