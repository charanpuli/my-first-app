package com.example.charanpuli.toys;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class toys extends AppCompatActivity {
   TextView toy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toys);
        toy=(TextView) findViewById(R.id.tv_toy_names);
        String[] toyname= ToyBox.getToyNames();
        for(String s:toyname)
        {
           toy.append(s+"\n\n\n");
        }
    }
}
