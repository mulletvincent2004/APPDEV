package com.example.shortstorybook;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;


public class page2 extends AppCompatActivity {
    TextView hello;

    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        hello = findViewById(R.id.hello);
        Intent i = getIntent();
        name = i.getStringExtra("name");
        hello.setText(name + " was sad. He didn’t have a nice new tricycle like all the other children. All he had was an old hand-me-down trike. After sulking he decided to do something about it and made a “trick trike” that was the envy of the neighborhood. ");
    }
    public void GotoMainActivity(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }
    public void goToPage3(View v){
        Intent i = new Intent(this, page3.class);
        startActivity(i);
        finish();
    }
}