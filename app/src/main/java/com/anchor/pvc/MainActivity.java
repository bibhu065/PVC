package com.anchor.pvc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1= (Button) findViewById(R.id.btn1);
        button2= (Button) findViewById(R.id.btn2);
        button3= (Button) findViewById(R.id.btn3);
        button4= (Button) findViewById(R.id.btn4);
        button5= (Button) findViewById(R.id.btn5);
        button6= (Button) findViewById(R.id.btn6);
        button7= (Button) findViewById(R.id.btn7);
        button8= (Button) findViewById(R.id.btn8);
        button9= (Button) findViewById(R.id.btn9);
        button10= (Button) findViewById(R.id.btn10);
    }
    public  void  introduction(View v)
    {
        Intent i= new Intent(this,Introduction.class);
        startActivity(i);
    }
    public void pvcpreparation(View v)
    {
        Intent i=new Intent(this,Pvcpreparation.class);
        startActivity(i);
    }
    public void compositioninpvccompound(View v)
    {
        Intent i=new Intent(this,Compositioninpvccompound.class);
        startActivity(i);
    }

    public void troubleshootingguides(View v)
    {
        Intent i=new Intent(this,Troubleshootingguides.class);
        startActivity(i);
    }
    public void compounddensitycalculation(View v)
    {
        Intent i=new Intent(this,Compounddensitycalculation.class);
        startActivity(i);
    }
    public void compoundpricecalculation (View v)
    {
        Intent i=new Intent(this,Compoundpricecalculation.class);
        startActivity(i);
    }
    public void autobomcalculation(View v)
    {
        Intent i=new Intent(this,Autobomcalculation.class);
        startActivity(i);
    }
    public void compounddensitypricecalculation(View v)
    {
        Intent i=new Intent(this,Compounddensitypricecalculation.class);
        startActivity(i);
    }
    public void basicformulation(View v)
    {
        Intent i=new Intent(this,Basicformulation.class);
        startActivity(i);
    }
    public void aboutme(View v)
    {
        Intent i=new Intent(this,Aboutme.class);
        startActivity(i);
    }


}
