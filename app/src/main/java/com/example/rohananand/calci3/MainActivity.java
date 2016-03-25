package com.example.rohananand.calci3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button add,sub,mul,div;
    EditText eOp1,eOp2;
    TextView tvResult;
    double op1,op2;
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button)findViewById(R.id.btnAdd);
        sub = (Button)findViewById(R.id.btnSub);
        mul = (Button)findViewById(R.id.btnMul);
        div = (Button)findViewById(R.id.btnDiv);
        eOp1 = (EditText)findViewById(R.id.op1);
        eOp2 = (EditText)findViewById(R.id.op2);
        tvResult = (TextView)findViewById(R.id.result);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op1 = Double.parseDouble(eOp1.getText().toString());
                op2 = Double.parseDouble(eOp2.getText().toString());
                result = op1 + op2;
                tvResult.setText("Result : " + result);
            }
        });


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op1 = Double.parseDouble(eOp1.getText().toString());
                op2 = Double.parseDouble(eOp2.getText().toString());
                result = op1 - op2;
                tvResult.setText("Result : " + result);
            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op1 = Double.parseDouble(eOp1.getText().toString());
                op2 = Double.parseDouble(eOp2.getText().toString());
                result = op1 * op2;
                tvResult.setText("Result : " + result);
            }
        });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op1 = Double.parseDouble(eOp1.getText().toString());
                op2 = Double.parseDouble(eOp2.getText().toString());
                result = op1 / op2;
                tvResult.setText("Result : " + result);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
