package ru.geekbrains.debug;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int arg1;
    private int arg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        final EditText editArg1 = findViewById(R.id.editText1);
        final EditText editArg2 = findViewById(R.id.editText2);
        final TextView textResult = findViewById(R.id.textView);

        button.setOnClickListener(view -> {
            try {
                arg1 = Integer.parseInt(editArg1.getText().toString());
                arg2 = Integer.parseInt(editArg2.getText().toString());
                if (arg1 == arg2) {
                    textResult.setText("Равно!");
                } else {
                    textResult.setText("Не равно!");
                }
            } catch (NumberFormatException e) {
                textResult.setText("Введите число!");
            }
        });
    }
}