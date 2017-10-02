package com.promlert.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class BmiResultActivity extends AppCompatActivity {

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

        // ...
        // นำค่า bmi, bmiText ไปใช้งานตามต้องการ
        // ...
    }
}
