package com.cocoabuttercoder.luggit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addItem(){
        LinearLayout linearLayout = findViewById(R.id.linearLayout);
        EditText editText = findViewById(R.id.editText);
        String itemName = editText.getText().toString();
        Item item = new Item(itemName);

        linearLayout.addView(item);
    }
}
