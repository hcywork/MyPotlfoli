package com.example.hecaiyang.mypotlfoli;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        Button spoitfyButton = (Button) findViewById(R.id.spoitfy_button);
        Button spoitfyButton2 = (Button) findViewById(R.id.spoitfy_app_button);
        Button spoitfyButton3 = (Button) findViewById(R.id.library_app_button);
        Button spoitfyButton4 = (Button) findViewById(R.id.bundle_app_button);
        Button spoitfyButton5 = (Button) findViewById(R.id.My_on_app_button);
        Button spoitfyButton6 = (Button) findViewById(R.id.xyz_app_button);
        spoitfyButton.setOnClickListener(this);
        spoitfyButton2.setOnClickListener(this);
        spoitfyButton3.setOnClickListener(this);
        spoitfyButton4.setOnClickListener(this);
        spoitfyButton5.setOnClickListener(this);
        spoitfyButton6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.spoitfy_button:
                Toast.makeText(this, "spoitfy_button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.spoitfy_app_button:
                Toast.makeText(this, "spoitfy_app_button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.library_app_button:
                Toast.makeText(this, "library_app_button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bundle_app_button:
                Toast.makeText(this, "bundle_app_button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.My_on_app_button:
                Toast.makeText(this, "My_on_app_button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.xyz_app_button:
                Toast.makeText(this, "xyz_app_button", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
