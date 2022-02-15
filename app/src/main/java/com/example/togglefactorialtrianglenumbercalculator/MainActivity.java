package com.example.togglefactorialtrianglenumbercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView ttAnswer;
    Button DisplayButton;
    ToggleButton ToggleB;
    EditText EditNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ttAnswer = findViewById(R.id.ttTotal);
        DisplayButton = findViewById(R.id.button3);
        ToggleB = findViewById(R.id.toggleButton);
        EditNum = findViewById(R.id.editTextNumber);

        DisplayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Cal = 0;
                int temp;
                String Total;
                int count = Integer.parseInt(EditNum.getText().toString());
                int number = count;

                    if(ToggleB.isChecked()){ //Triangle Calculation
                        for(int i = 0; i<count;i++){
                            temp = number;
                            Cal = Cal + temp;
                            number--;
                        }
                        Total = String.valueOf(Cal);
                        ttAnswer.setText(Total);
                    }
                    else{                   //Factorial Calculation
                        Cal++;
                        for(int i = 1;i<=count;i++){
                            temp = i * Cal;
                            Cal = temp;
                        }
                        Total = String.valueOf(Cal);
                        ttAnswer.setText(Total);
                    }
            }
        });

    }
}