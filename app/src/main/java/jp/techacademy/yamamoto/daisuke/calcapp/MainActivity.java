package jp.techacademy.yamamoto.daisuke.calcapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText text1 = findViewById(R.id.editText1);
    EditText text2 = findViewById(R.id.editText2);
    Double val1 = Double.parseDouble(text1.getText().toString());
    Double val2 = Double.parseDouble(text2.getText().toString());

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
        switch (v.getId()) {
            case R.id.button1:

                break;
            case R.id.button2:

                break;
            case R.id.button3:

                break;
            case R.id.button4:

        }
    }
}
