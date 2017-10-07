package com.promlert.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BmiResultActivity extends AppCompatActivity {
    private Button ButtonB;
    public void backb(View view) {
        Intent intent = new Intent(BmiResultActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_result);

        // เข้าถึงอินเทนต์ที่ส่งมจากต้นทาง (MainActivity)
        Intent intent = getIntent();
        // อ่านค่าตัวเลข bmi จากอินเทนต์
        Double bmi = intent.getDoubleExtra("bmi_value", 0);
        // อ่านข้อความ (ที่บอกผอม, ปกติ, อ้วน) จากอินเทนต์
        String bmiText = intent.getStringExtra("bmi_text");
        String much = String.valueOf(String.format("%.2f", bmi));

        TextView t = (TextView) findViewById(R.id.BMICal);
        TextView t2 = (TextView) findViewById(R.id.BMIdetail);

        t.setText("ค่า BMI ที่ได้คือ" + much);
        t2.setText("อยู่ในเกณฑ์ " + bmiText);


        // ...
        // นำค่า bmi, bmiText ไปใช้งานตามต้องการ
        // ...
    }
}
