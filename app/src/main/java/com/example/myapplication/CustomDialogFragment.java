package com.example.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class CustomDialogFragment extends DialogFragment {
    String messageText;

    CustomDialogFragment(String text){
        super();
        messageText = text;
    }

    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        return builder
                    .setTitle("Error during registration.")
                .setIcon(android.R.drawable.ic_dialog_alert)
//                .setView(R.layout.dialog)
                .setMessage(messageText)
                .setPositiveButton("Try again", null)
//                .setNegativeButton("Отмена", null)
                .create();
    }
}
