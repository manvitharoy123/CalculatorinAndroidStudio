/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.Editable
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 *  android.widget.EditText
 *  androidx.appcompat.app.AppCompatActivity
 *  java.lang.CharSequence
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.example.datta;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity
extends AppCompatActivity {
    boolean Addition;
    boolean Division;
    EditText EditText;
    boolean Multiplication;
    Button button0;
    Button button1;
    Button button10;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonAdd;
    Button buttonC;
    Button buttonDivision;
    Button buttonEqual;
    Button buttonMul;
    Button buttonSub;
    boolean mSubtract;
    float mValueOne;
    float mValueTwo;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(2131361820);
        this.button0 = (Button)this.findViewById(2131165250);
        this.button1 = (Button)this.findViewById(2131165251);
        this.button2 = (Button)this.findViewById(2131165253);
        this.button3 = (Button)this.findViewById(2131165254);
        this.button4 = (Button)this.findViewById(2131165255);
        this.button5 = (Button)this.findViewById(2131165256);
        this.button6 = (Button)this.findViewById(2131165257);
        this.button7 = (Button)this.findViewById(2131165258);
        this.button8 = (Button)this.findViewById(2131165259);
        this.button9 = (Button)this.findViewById(2131165260);
        this.button10 = (Button)this.findViewById(2131165252);
        this.buttonAdd = (Button)this.findViewById(2131165263);
        this.buttonSub = (Button)this.findViewById(2131165267);
        this.buttonMul = (Button)this.findViewById(2131165266);
        this.buttonDivision = (Button)this.findViewById(2131165264);
        this.buttonC = (Button)this.findViewById(2131165261);
        this.buttonEqual = (Button)this.findViewById(2131165265);
        this.EditText = (EditText)this.findViewById(2131165285);
        this.button1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                EditText editText = MainActivity.this.EditText;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)MainActivity.this.EditText.getText());
                stringBuilder.append("1");
                editText.setText((CharSequence)stringBuilder.toString());
            }
        });
        this.button2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                EditText editText = MainActivity.this.EditText;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)MainActivity.this.EditText.getText());
                stringBuilder.append("2");
                editText.setText((CharSequence)stringBuilder.toString());
            }
        });
        this.button3.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                EditText editText = MainActivity.this.EditText;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)MainActivity.this.EditText.getText());
                stringBuilder.append("3");
                editText.setText((CharSequence)stringBuilder.toString());
            }
        });
        this.button4.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                EditText editText = MainActivity.this.EditText;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)MainActivity.this.EditText.getText());
                stringBuilder.append("4");
                editText.setText((CharSequence)stringBuilder.toString());
            }
        });
        this.button5.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                EditText editText = MainActivity.this.EditText;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)MainActivity.this.EditText.getText());
                stringBuilder.append("5");
                editText.setText((CharSequence)stringBuilder.toString());
            }
        });
        this.button6.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                EditText editText = MainActivity.this.EditText;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)MainActivity.this.EditText.getText());
                stringBuilder.append("6");
                editText.setText((CharSequence)stringBuilder.toString());
            }
        });
        this.button7.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                EditText editText = MainActivity.this.EditText;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)MainActivity.this.EditText.getText());
                stringBuilder.append("7");
                editText.setText((CharSequence)stringBuilder.toString());
            }
        });
        this.button8.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                EditText editText = MainActivity.this.EditText;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)MainActivity.this.EditText.getText());
                stringBuilder.append("8");
                editText.setText((CharSequence)stringBuilder.toString());
            }
        });
        this.button9.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                EditText editText = MainActivity.this.EditText;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)MainActivity.this.EditText.getText());
                stringBuilder.append("9");
                editText.setText((CharSequence)stringBuilder.toString());
            }
        });
        this.button0.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                EditText editText = MainActivity.this.EditText;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)MainActivity.this.EditText.getText());
                stringBuilder.append("0");
                editText.setText((CharSequence)stringBuilder.toString());
            }
        });
        this.buttonAdd.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                if (MainActivity.this.EditText == null) {
                    MainActivity.this.EditText.setText((CharSequence)"");
                    return;
                }
                MainActivity mainActivity = MainActivity.this;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)MainActivity.this.EditText.getText());
                stringBuilder.append("");
                mainActivity.mValueOne = Float.parseFloat((String)stringBuilder.toString());
                MainActivity.this.Addition = true;
                MainActivity.this.EditText.setText(null);
            }
        });
        this.buttonSub.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                MainActivity mainActivity = MainActivity.this;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)MainActivity.this.EditText.getText());
                stringBuilder.append("");
                mainActivity.mValueOne = Float.parseFloat((String)stringBuilder.toString());
                MainActivity.this.mSubtract = true;
                MainActivity.this.EditText.setText(null);
            }
        });
        this.buttonMul.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                MainActivity mainActivity = MainActivity.this;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)MainActivity.this.EditText.getText());
                stringBuilder.append("");
                mainActivity.mValueOne = Float.parseFloat((String)stringBuilder.toString());
                MainActivity.this.Multiplication = true;
                MainActivity.this.EditText.setText(null);
            }
        });
        this.buttonDivision.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                MainActivity mainActivity = MainActivity.this;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)MainActivity.this.EditText.getText());
                stringBuilder.append("");
                mainActivity.mValueOne = Float.parseFloat((String)stringBuilder.toString());
                MainActivity.this.Division = true;
                MainActivity.this.EditText.setText(null);
            }
        });
        this.buttonEqual.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                MainActivity mainActivity = MainActivity.this;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)MainActivity.this.EditText.getText());
                stringBuilder.append("");
                mainActivity.mValueTwo = Float.parseFloat((String)stringBuilder.toString());
                if (MainActivity.this.Addition) {
                    EditText editText = MainActivity.this.EditText;
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(MainActivity.this.mValueOne + MainActivity.this.mValueTwo);
                    stringBuilder2.append("");
                    editText.setText((CharSequence)stringBuilder2.toString());
                    MainActivity.this.Addition = false;
                }
                if (MainActivity.this.mSubtract) {
                    EditText editText = MainActivity.this.EditText;
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(MainActivity.this.mValueOne - MainActivity.this.mValueTwo);
                    stringBuilder3.append("");
                    editText.setText((CharSequence)stringBuilder3.toString());
                    MainActivity.this.mSubtract = false;
                }
                if (MainActivity.this.Multiplication) {
                    EditText editText = MainActivity.this.EditText;
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append(MainActivity.this.mValueOne * MainActivity.this.mValueTwo);
                    stringBuilder4.append("");
                    editText.setText((CharSequence)stringBuilder4.toString());
                    MainActivity.this.Multiplication = false;
                }
                if (MainActivity.this.Division) {
                    EditText editText = MainActivity.this.EditText;
                    StringBuilder stringBuilder5 = new StringBuilder();
                    stringBuilder5.append(MainActivity.this.mValueOne / MainActivity.this.mValueTwo);
                    stringBuilder5.append("");
                    editText.setText((CharSequence)stringBuilder5.toString());
                    MainActivity.this.Division = false;
                }
            }
        });
        this.buttonC.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                MainActivity.this.EditText.setText((CharSequence)"");
            }
        });
        this.button10.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                EditText editText = MainActivity.this.EditText;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((Object)MainActivity.this.EditText.getText());
                stringBuilder.append(".");
                editText.setText((CharSequence)stringBuilder.toString());
            }
        });
    }

}

