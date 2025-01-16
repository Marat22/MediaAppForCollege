package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityWithFragment extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_with_fragment);
    }

    public void register(View view) {
        String name = ((EditText) findViewById(R.id.name)).getText().toString();
        String email = ((EditText) findViewById(R.id.email)).getText().toString();
        String password = ((EditText) findViewById(R.id.password)).getText().toString();

        if (name.isEmpty()) {
            CustomDialogFragment dialog = new CustomDialogFragment("Name field is not specified!");
            dialog.show(getSupportFragmentManager(), "custom");
            return;
        }

        if (email.isEmpty()) {
            CustomDialogFragment dialog = new CustomDialogFragment("E-mail field is not specified!");
            dialog.show(getSupportFragmentManager(), "custom");
            return;
        }

        if (password.isEmpty()) {
            CustomDialogFragment dialog = new CustomDialogFragment("Password field is not specified!");
            dialog.show(getSupportFragmentManager(), "custom");
            return;
        }

        registerNewUser(name, email, password);
    }


    private void registerNewUser( String name, String email, String password) {
        return;
    }
//    public void showDialog(View v) {
//
//    }


}