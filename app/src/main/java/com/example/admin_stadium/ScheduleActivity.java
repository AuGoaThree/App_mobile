package com.example.admin_stadium;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule); // Đảm bảo file activity_schedule.xml tồn tại

        // Lấy CardView từ layout
        CardView cardButton = findViewById(R.id.card_campnou);

        // Thiết lập sự kiện click cho CardView
        cardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hiển thị DialogFragment
                showPopup();
            }
        });
    }

    private void showPopup() {
        // Hiển thị DialogFragment
        ScheduleDetailDialogFragment dialogFragment = new ScheduleDetailDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "scheduleDetailDialog");
    }
}
