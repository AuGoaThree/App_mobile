package com.example.admin_stadium;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.DialogFragment;

public class ChangeStartTime extends DialogFragment {

    @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {
        // Tạo View từ layout tùy chỉnh
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.activity_change_start_time, null); // Đảm bảo layout này trỏ đúng tới file XML của bạn

        // Các nút hành động trong popup

        Button btnCancel = view.findViewById(R.id.btn_cancel);

        btnCancel.setOnClickListener(v -> {
            // Xử lý hành động Hủy
            dismiss();
        });

        Button btnContinue = view.findViewById(R.id.btn_continue);
        btnContinue.setOnClickListener(v -> {
            // Hiển thị popup EndTime
            ChangeEndTime changeEndTime = new ChangeEndTime();
            changeEndTime.show(getParentFragmentManager(), "changeEndTime");
            // Đóng popup StartTime hiện tại
            dismiss();
        });

        // Tạo và trả về Dialog
        return new android.app.AlertDialog.Builder(getActivity())
                .setView(view)
                .create();
    }
}
