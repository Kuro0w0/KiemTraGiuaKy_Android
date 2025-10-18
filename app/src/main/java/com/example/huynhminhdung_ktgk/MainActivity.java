package com.example.huynhminhdung_ktgk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText name_minhdung_2018;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        name_minhdung_2018 = findViewById(R.id.uname);
        Button minhdung_2108 = findViewById(R.id.button);
        minhdung_2108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dl_minhdung_2108 = name_minhdung_2018.getText().toString();
                Intent intent = new Intent (MainActivity.this, ProfileActivity.class);
                intent.putExtra("KEY", dl_minhdung_2108);
                startActivity(intent);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}