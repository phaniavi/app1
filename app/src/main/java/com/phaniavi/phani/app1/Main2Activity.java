package com.phaniavi.phani.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    //private Button answerYesButton, answerNoButton;
    private EditText usersNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //answerYesButton = findViewById(R.id.answer_yes_button);
        //answerNoButton = findViewById(R.id.answer_no_button);
        usersNameEditText = findViewById(R.id.users_name_edit_text);

    }

    public void onYesButtonClick(View view) {

        String usersName = String.valueOf(usersNameEditText.getText());
        String yourYesResponse = "That is great " + usersName;
        Toast.makeText(this, yourYesResponse, Toast.LENGTH_SHORT).show();

    }

    public void onNoButtonClick(View view) {

        String usersName = String.valueOf(usersNameEditText.getText());
        String yourNoResponse = "Too Bad " + usersName;
        Toast.makeText(this, yourNoResponse, Toast.LENGTH_LONG).show();

    }
}
