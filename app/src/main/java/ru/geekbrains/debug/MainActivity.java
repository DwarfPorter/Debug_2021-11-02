package ru.geekbrains.debug;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Integer arg1;
    private Integer arg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        final EditText editArg1 = findViewById(R.id.editText1);
        final EditText editArg2 = findViewById(R.id.editText2);
        final TextView textResult = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    arg1 = Integer.valueOf(editArg1.getText().toString());
                    arg2 = Integer.valueOf(editArg2.getText().toString());
                    if (arg1.equals(arg2)) {
                        textResult.setText("Равно!");
                    } else {
                        textResult.setText("Не равно!");
                    }
                } catch (NumberFormatException e) {
                    textResult.setText("Введите число!");
                }
            }
        });
    }
}