package com.example.android.password;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

private EditText password;
private Button button;
private  EditText login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButton();





    }
    public  void  addButton() {

        password = (EditText) findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.button2);
        login = (EditText) findViewById(R.id.editText3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, password.getText(), Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, login.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }









    }


