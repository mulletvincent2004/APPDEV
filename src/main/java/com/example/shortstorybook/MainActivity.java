package com.example.shortstorybook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText Pangalan;
    String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pangalan = findViewById(R.id.Pangalan);
    }
    public void goToPage2(View view){
        name = Pangalan.getText() .toString();
        Toast.makeText(this, "Hello this is the story of the main character name, "+name+"!", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, page2.class);
            i.putExtra("name", name);
            startActivity(i);
    }
}