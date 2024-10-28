package com.example.reg;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText nameField, emailField, passwordField;
    private RadioGroup genderGroup;
    private Spinner countrySpinner;
    private CheckBox termsCheckbox;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameField = findViewById(R.id.editTextName);
        emailField = findViewById(R.id.editTextEmail);
        passwordField = findViewById(R.id.editTextPassword);
        genderGroup = findViewById(R.id.radioGroupGender);
        countrySpinner = findViewById(R.id.spinnerCountry);
        termsCheckbox = findViewById(R.id.checkBoxTerms);
        submitButton = findViewById(R.id.buttonSubmit);

        submitButton.setOnClickListener(v -> submitForm());
    }

    private void submitForm() {
        String name = nameField.getText().toString();
        String email = emailField.getText().toString();
        String password = passwordField.getText().toString();

        int selectedGenderId = genderGroup.getCheckedRadioButtonId();
        RadioButton selectedGenderButton = findViewById(selectedGenderId);
        String gender = selectedGenderButton != null ? selectedGenderButton.getText().toString() : "Not specified";

        String country = countrySpinner.getSelectedItem().toString();

        if (!termsCheckbox.isChecked()) {
            Toast.makeText(this, "Please accept the terms and conditions", Toast.LENGTH_SHORT).show();
            return;
        }

        // Display the details in an AlertDialog
        String message = "Name: " + name + "\n" +
                "Email: " + email + "\n" +
                "Password: " + password + "\n" +
                "Gender: " + gender + "\n" +
                "Country: " + country;

        new AlertDialog.Builder(this)
                .setTitle("Registration Details")
                .setMessage(message)
                .setPositiveButton("OK", null)
                .show();
    }
}