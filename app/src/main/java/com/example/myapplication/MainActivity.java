package com.example.myapplication;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button bt;
private EditText age_val,ht_per,sys_bp,dia_bp;
private RadioGroup rg;
private RadioButton rb1,rb2;
String gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt=findViewById(R.id.bt);
        age_val=findViewById(R.id.age_val);
        sys_bp=findViewById(R.id.sys_bp);
        dia_bp=findViewById(R.id.dia_bp);
        ht_per=findViewById(R.id.ht_per);
        rg=findViewById(R.id.rg);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             sys_bp.setText("");
             dia_bp.setText("");
            int a=0;
                sys_bp.setEnabled(false);
                dia_bp.setEnabled(false);
                if(age_val.getText().toString().equals(""))
                   age_val.setError("Enter age between 1 and 12");
                else {
                    a = Integer.parseInt(age_val.getText().toString());
                    if ((a < 1) || (a > 12))
                        age_val.setError("Enter age between 1 and 12");
                }

                if(ht_per.getText().toString().equals(""))
                    ht_per.setError("Enter Height Percentile");
                else {
                    int ht = Integer.parseInt(ht_per.getText().toString());
                    if ((ht != 5) && (ht != 10) && (ht != 25) && (ht != 50) && (ht != 75) && (ht != 90) && (ht != 95)) {
                        ht_per.setError("Invalid Height percentile");
                        Toast.makeText(MainActivity.this, "Valid Percentiles are 5,10,25,50,75,90,95", Toast.LENGTH_LONG).show();
                    } else {
                        int id = rg.getCheckedRadioButtonId();
                        if (id == (R.id.rb1))
                            gender = "male";
                        else if (id == (R.id.rb2))
                            gender = "female";

                        switch (a) {
                            case 1:
                                if (gender.equals("male")) {
                                    if (ht == 5) {
                                        sys_bp.setText("80-94");
                                        dia_bp.setText("34-49");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("81-95");
                                        dia_bp.setText("35-50");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("83-97");
                                        dia_bp.setText("36-51");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("85-99");
                                        dia_bp.setText("37-52");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("87-100");
                                        dia_bp.setText("38-53");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("88-102");
                                        dia_bp.setText("39-53");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("89-103");
                                        dia_bp.setText("39-54");
                                    }


                                } else {
                                    if (ht == 5) {
                                        sys_bp.setText("83-97");
                                        dia_bp.setText("38-52");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("84-97");
                                        dia_bp.setText("39-53");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("85-98");
                                        dia_bp.setText("39-53");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("86-100");
                                        dia_bp.setText("40-54");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("88-101");
                                        dia_bp.setText("41-55");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("89-102");
                                        dia_bp.setText("41-55");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("90-103");
                                        dia_bp.setText("42-56");
                                    }
                                }
                                break;
                            case 2:
                                if (gender.equals("male")) {
                                    if (ht == 5) {
                                        sys_bp.setText("84-97");
                                        dia_bp.setText("39-54");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("85-99");
                                        dia_bp.setText("40-55");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("87-100");
                                        dia_bp.setText("41-56");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("88-102");
                                        dia_bp.setText("42-57");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("90-104");
                                        dia_bp.setText("43-58");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("92-105");
                                        dia_bp.setText("44-58");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("92-106");
                                        dia_bp.setText("44-59");
                                    }
                                } else {
                                    if (ht == 5) {
                                        sys_bp.setText("85-98");
                                        dia_bp.setText("43-57");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("85-99");
                                        dia_bp.setText("44-58");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("87-100");
                                        dia_bp.setText("44-58");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("88-101");
                                        dia_bp.setText("45-59");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("89-103");
                                        dia_bp.setText("46-60");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("91-104");
                                        dia_bp.setText("46-61");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("91-105");
                                        dia_bp.setText("47-61");
                                    }
                                }
                                break;
                            case 3:
                                if (gender.equals("male"))
                                    if (ht == 5) {
                                        sys_bp.setText("86-100");
                                        dia_bp.setText("44-59");
                                    }
                                if (ht == 10) {
                                    sys_bp.setText("87-101");
                                    dia_bp.setText("44-59");
                                }
                                if (ht == 25) {
                                    sys_bp.setText("89-103");
                                    dia_bp.setText("45-60");
                                }
                                if (ht == 50) {
                                    sys_bp.setText("91-105");
                                    dia_bp.setText("46-61");
                                }
                                if (ht == 75) {
                                    sys_bp.setText("93-107");
                                    dia_bp.setText("47-62");
                                }
                                if (ht == 90) {
                                    sys_bp.setText("94-108");
                                    dia_bp.setText("48-63");
                                }
                                if (ht == 95) {
                                    sys_bp.setText("94-109");
                                    dia_bp.setText("48-63");
                                } else {
                                    if (ht == 5) {
                                        sys_bp.setText("86-100");
                                        dia_bp.setText("47-61");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("87-100");
                                        dia_bp.setText("48-62");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("88-102");
                                        dia_bp.setText("48-62");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("89-103");
                                        dia_bp.setText("49-63");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("91-104");
                                        dia_bp.setText("50-64");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("92-106");
                                        dia_bp.setText("50-64");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("93-106");
                                        dia_bp.setText("51-65");
                                    }
                                }
                                break;
                            case 4:
                                if (gender.equals("male")) {
                                    if (ht == 5) {
                                        sys_bp.setText("88-102");
                                        dia_bp.setText("47-62");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("89-103");
                                        dia_bp.setText("48-63");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("91-105");
                                        dia_bp.setText("49-64");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("93-107");
                                        dia_bp.setText("50-65");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("95-109");
                                        dia_bp.setText("51-66");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("96-110");
                                        dia_bp.setText("51-66");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("97-111");
                                        dia_bp.setText("52-67");
                                    }
                                } else {
                                    if (ht == 5) {
                                        sys_bp.setText("88-101");
                                        dia_bp.setText("50-64");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("88-102");
                                        dia_bp.setText("50-64");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("90-103");
                                        dia_bp.setText("51-65");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("91-104");
                                        dia_bp.setText("52-66");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("92-106");
                                        dia_bp.setText("52-67");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("94-107");
                                        dia_bp.setText("53-67");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("94-108");
                                        dia_bp.setText("54-68");
                                    }
                                }
                                break;
                            case 5:
                                if (gender.equals("male")) {
                                    if (ht == 5) {
                                        sys_bp.setText("90-104");
                                        dia_bp.setText("50-65");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("91-105");
                                        dia_bp.setText("51-66");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("93-106");
                                        dia_bp.setText("52-67");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("95-108");
                                        dia_bp.setText("53-68");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("96-110");
                                        dia_bp.setText("54-69");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("98-111");
                                        dia_bp.setText("55-69");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("98-112");
                                        dia_bp.setText("55-70");
                                    }
                                } else {
                                    if (ht == 5) {
                                        sys_bp.setText("89-103");
                                        dia_bp.setText("52-66");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("90-103");
                                        dia_bp.setText("53-67");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("91-105");
                                        dia_bp.setText("53-67");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("93-106");
                                        dia_bp.setText("54-68");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("94-107");
                                        dia_bp.setText("55-69");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("95-109");
                                        dia_bp.setText("55-69");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("96-109");
                                        dia_bp.setText("56-70");
                                    }
                                }
                                break;
                            case 6:
                                if (gender.equals("male")) {
                                    if (ht == 5) {
                                        sys_bp.setText("91-105");
                                        dia_bp.setText("53-68");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("92-106");
                                        dia_bp.setText("53-68");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("94-108");
                                        dia_bp.setText("54-69");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("96-110");
                                        dia_bp.setText("55-70");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("98-111");
                                        dia_bp.setText("56-71");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("99-113");
                                        dia_bp.setText("57-72");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("100-113");
                                        dia_bp.setText("57-72");
                                    }
                                } else {
                                    if (ht == 5) {
                                        sys_bp.setText("91-104");
                                        dia_bp.setText("54-68");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("92-105");
                                        dia_bp.setText("54-68");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("93-106");
                                        dia_bp.setText("55-69");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("94-108");
                                        dia_bp.setText("56-70");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("96-109");
                                        dia_bp.setText("56-70");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("97-110");
                                        dia_bp.setText("57-71");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("98-111");
                                        dia_bp.setText("58-72");
                                    }
                                }
                                break;
                            case 7:
                                if (gender.equals("male")) {
                                    if (ht == 5) {
                                        sys_bp.setText("92-106");
                                        dia_bp.setText("55-70");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("94-107");
                                        dia_bp.setText("55-70");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("95-109");
                                        dia_bp.setText("56-71");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("97-111");
                                        dia_bp.setText("57-72");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("99-113");
                                        dia_bp.setText("58-73");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("100-114");
                                        dia_bp.setText("59-74");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("101-115");
                                        dia_bp.setText("59-74");
                                    }
                                } else {
                                    if (ht == 5) {
                                        sys_bp.setText("93-106");
                                        dia_bp.setText("55-69");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("93-107");
                                        dia_bp.setText("56-70");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("95-108");
                                        dia_bp.setText("56-70");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("96-109");
                                        dia_bp.setText("57-71");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("97-111");
                                        dia_bp.setText("58-72");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("99-112");
                                        dia_bp.setText("58-72");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("99-113");
                                        dia_bp.setText("59-73");
                                    }

                                }
                                break;
                            case 8:
                                if (gender.equals("male")) {
                                    if (ht == 5) {
                                        sys_bp.setText("94-107");
                                        dia_bp.setText("56-71");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("95-109");
                                        dia_bp.setText("57-72");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("97-110");
                                        dia_bp.setText("58-72");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("99-112");
                                        dia_bp.setText("59-73");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("100-114");
                                        dia_bp.setText("60-74");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("102-115");
                                        dia_bp.setText("60-75");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("102-116");
                                        dia_bp.setText("61-76");
                                    }
                                } else {
                                    if (ht == 5) {
                                        sys_bp.setText("95-108");
                                        dia_bp.setText("57-71");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("95-109");
                                        dia_bp.setText("57-71");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("96-110");
                                        dia_bp.setText("57-71");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("98-111");
                                        dia_bp.setText("58-72");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("99-113");
                                        dia_bp.setText("59-73");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("100-114");
                                        dia_bp.setText("60-74");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("101-114");
                                        dia_bp.setText("60-74");
                                    }
                                }
                                break;
                            case 9:
                                if (gender.equals("male")) {
                                    if (ht == 5) {
                                        sys_bp.setText("95-109");
                                        dia_bp.setText("57-72");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("96-110");
                                        dia_bp.setText("58-73");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("98-112");
                                        dia_bp.setText("59-74");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("100-114");
                                        dia_bp.setText("60-75");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("102-115");
                                        dia_bp.setText("61-76");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("103-117");
                                        dia_bp.setText("61-76");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("104-118");
                                        dia_bp.setText("62-77");
                                    }

                                } else {
                                    if (ht == 5) {
                                        sys_bp.setText("96-110");
                                        dia_bp.setText("58-72");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("97-110");
                                        dia_bp.setText("58-72");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("98-112");
                                        dia_bp.setText("58-72");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("100-113");
                                        dia_bp.setText("59-73");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("101-114");
                                        dia_bp.setText("60-74");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("102-116");
                                        dia_bp.setText("61-75");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("103-116");
                                        dia_bp.setText("61-75");
                                    }
                                }
                                break;
                            case 10:
                                if (gender.equals("male")) {
                                    if (ht == 5) {
                                        sys_bp.setText("97-111");
                                        dia_bp.setText("58-73");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("98-112");
                                        dia_bp.setText("59-73");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("100-114");
                                        dia_bp.setText("60-74");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("102-115");
                                        dia_bp.setText("61-75");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("103-117");
                                        dia_bp.setText("61-76");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("105-119");
                                        dia_bp.setText("62-77");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("106-119");
                                        dia_bp.setText("63-78");
                                    }
                                } else {
                                    if (ht == 5) {
                                        sys_bp.setText("98-112");
                                        dia_bp.setText("59-73");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("99-112");
                                        dia_bp.setText("59-73");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("100-114");
                                        dia_bp.setText("59-73");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("102-115");
                                        dia_bp.setText("60-74");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("103-116");
                                        dia_bp.setText("61-75");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("104-118");
                                        dia_bp.setText("62-76");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("105-118");
                                        dia_bp.setText("62-76");
                                    }
                                }
                                break;
                            case 11:
                                if (gender.equals("male")) {
                                    if (ht == 5) {
                                        sys_bp.setText("99-113");
                                        dia_bp.setText("59-74");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("100-114");
                                        dia_bp.setText("59-74");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("102-115");
                                        dia_bp.setText("60-75");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("104-117");
                                        dia_bp.setText("61-76");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("105-119");
                                        dia_bp.setText("62-77");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("107-120");
                                        dia_bp.setText("63-78");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("107-121");
                                        dia_bp.setText("63-78");
                                    }
                                } else {
                                    if (ht == 5) {
                                        sys_bp.setText("100-114");
                                        dia_bp.setText("60-74");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("101-114");
                                        dia_bp.setText("60-74");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("102-116");
                                        dia_bp.setText("60-74");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("103-117");
                                        dia_bp.setText("61-75");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("105-118");
                                        dia_bp.setText("62-76");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("106-119");
                                        dia_bp.setText("63-77");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("107-120");
                                        dia_bp.setText("63-77");
                                    }
                                }
                                break;
                            case 12:
                                if (gender.equals("male")) {
                                    if (ht == 5) {
                                        sys_bp.setText("101-115");
                                        dia_bp.setText("59-74");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("102-116");
                                        dia_bp.setText("60-75");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("104-118");
                                        dia_bp.setText("61-75");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("106-120");
                                        dia_bp.setText("62-76");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("108-121");
                                        dia_bp.setText("63-77");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("109-123");
                                        dia_bp.setText("63-78");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("110-123");
                                        dia_bp.setText("64-79");
                                    }
                                } else {
                                    if (ht == 5) {
                                        sys_bp.setText("102-116");
                                        dia_bp.setText("61-75");
                                    }
                                    if (ht == 10) {
                                        sys_bp.setText("103-116");
                                        dia_bp.setText("61-75");
                                    }
                                    if (ht == 25) {
                                        sys_bp.setText("104-117");
                                        dia_bp.setText("61-75");
                                    }
                                    if (ht == 50) {
                                        sys_bp.setText("105-119");
                                        dia_bp.setText("62-76");
                                    }
                                    if (ht == 75) {
                                        sys_bp.setText("107-120");
                                        dia_bp.setText("63-77");
                                    }
                                    if (ht == 90) {
                                        sys_bp.setText("108-121");
                                        dia_bp.setText("64-78");
                                    }
                                    if (ht == 95) {
                                        sys_bp.setText("109-122");
                                        dia_bp.setText("64-78");
                                    }
                                }
                                break;
                            default:
                                Toast.makeText(MainActivity.this, "Invalid data,Try Again", Toast.LENGTH_LONG).show();

                        }
                    }


                }
            }
        });
    }
}
