package com.example.admin_stadium;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.DialogFragment;

public class StadiumDetailActivity extends DialogFragment {

    @Override
    public android.app.Dialog onCreateDialog(Bundle savedInstanceState) {
        // Tạo View từ layout tùy chỉnh
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.activity_stadium_detail, null); // Đảm bảo layout này trỏ đúng tới file XML của bạn

        Button btnDelete = view.findViewById(R.id.btn_delete);
        Button btnCancel = view.findViewById(R.id.btn_cancel);
        Button btnSave = view.findViewById(R.id.btn_save);


        btnDelete.setOnClickListener(v -> {
            // Xử lý hành động Xóa
            dismiss();
        });

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
