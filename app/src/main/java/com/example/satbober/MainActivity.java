package com.example.satbober;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    String sDown, sUp;
    TextView textCounter;
    TextView textHeader;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        textCounter = findViewById(R.id.counter);
        textHeader = findViewById(R.id.tap);
    }

    public void taptap(View view) {
        counter += 1;
        sDown = "Осталось: " + counter + ok(counter);
        sUp = "Потрогай";
        if (counter == 10) {
            sUp = "Продоложай пж1!11!";
        }
        if (counter >= 20 & counter <= 25) {
            sUp = "КРАСАВА ПРОДОЛЖАЙ";
        }
        textHeader.setText(sUp);
        textCounter.setText(sDown);
        if (counter % 10 < 1 & counter % 10 < 5 & counter / 10 % counter != 1) {
            sDown = "Осталось" + counter + ok(counter);
        }
    }

    String ok(int x) {
        String str = " раз";
        if(x%10>1 & x%10<5 & x/10%10 != 1) {
            str = " раза"; {
            }
        }
        return str;
    }
}