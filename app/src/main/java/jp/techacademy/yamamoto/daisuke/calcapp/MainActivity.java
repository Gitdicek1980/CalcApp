package jp.techacademy.yamamoto.daisuke.calcapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button1) { result = val1 + val2;
        } else if (v.getId() == R.id.button2) { result = val1 - val2;
        } else if (v.getId() == R.id.button3) { result = val1 * val2;
        } else if (v.getId() == R.id.button4) { result = val1 / val2;
        }


                EditText text1 = findViewById(R.id.editText1);
                EditText text2 = findViewById(R.id.editText2);
                Double val1 = Double.parseDouble(text1.getText().toString());
                Double val2 = Double.parseDouble(text2.getText().toString());


                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);


    }
}
