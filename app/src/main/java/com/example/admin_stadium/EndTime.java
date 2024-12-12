package com.example.admin_stadium;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.DialogFragment;

public class EndTime extends DialogFragment {

    @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {
        // Tạo View từ layout tùy chỉnh
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.activity_end_time, null); // Đảm bảo layout này trỏ đúng tới file XML của bạn

        // Các nút hành động trong popup

        Button btnCancel = view.findViewById(R.id.btn_cancel);
        Button btnSave = view.findViewById(R.id.btn_save);

        btnCancel.setOnClickListener(v -> {
            // Xử lý hành động Hủy
            dismiss();
        });


        btnSave.setOnClickListener(v -> {
            // Xử lý hành động Lưu
            dismiss();
        });

        // Tạo và trả về Dialog
        return new android.app.AlertDialog.Builder(getActivity())
                .setView(view)
                .create();
    }
}
