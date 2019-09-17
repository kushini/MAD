package com.mad.mad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserActitivity extends AppCompatActivity {

    private TextView textViewName;
    private Button buttonProfile;

    private DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);
        getSupportActionBar().hide();

        textViewName =  findViewById(R.id.textViewWelcome);

        databaseHelper = new DatabaseHelper(this);

        Intent intent = getIntent();

        final String nameFromIntent = getIntent().getStringExtra("INDEX");
        textViewName.setText("Welcome " + nameFromIntent);

        buttonProfile = findViewById(R.id.buttonProfile);

        buttonProfile.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                String name =  databaseHelper.getName(nameFromIntent);
                String mail =  databaseHelper.getMail(nameFromIntent);
                String phone =  databaseHelper.getPhone(nameFromIntent);
                String GPA =  databaseHelper.getGPA(nameFromIntent);
                String batch = databaseHelper.getBatch(nameFromIntent);

                Intent accountsIntent = new Intent(UserActitivity.this,ProfileActivity.class);
                accountsIntent.putExtra("INDEX",nameFromIntent);
                accountsIntent.putExtra("NAME",name);
                accountsIntent.putExtra("EMAIL",mail);
                accountsIntent.putExtra("PHONE",phone);
                accountsIntent.putExtra("GPA",GPA);
                accountsIntent.putExtra("BATCH",batch);
                startActivity(accountsIntent);
            }
        });

    }



}

