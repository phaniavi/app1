package com.phaniavi.phani.app1;

import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView firstTextView = findViewById(R.id.textView);

        Button detectButton = findViewById(R.id.detectButton);
        detectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstTextView.setText(R.string.updatedText);
            }
        });

        Button clearButton = findViewById(R.id.clearButton);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstTextView.setText(R.string.clearedText);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.exit_the_app){
            finish();
            return true;
        }
        else if(id == R.id.refresh){
            finish();
            startActivity(getIntent());
            return true;
        }
        else if(id == R.id.action_settings){
            // redirect to another activity or fragment
            DialogFragment myFragment = new MyDialogFragment();
            myFragment.show(getFragmentManager(), "The Dialog");
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
