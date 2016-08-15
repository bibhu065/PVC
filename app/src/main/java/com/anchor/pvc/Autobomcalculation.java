package com.anchor.pvc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Autobomcalculation extends AppCompatActivity
{

    EditText et1,et2,et3,et4,et5,et6,et7,et8,et9,et10,et11,et12,et13,et14,et15,et16,et17,et18,et19,et20;
    TextView bc1,bc2,bc3,bc4,bc5,bc6,bc7,bc8,bc9,bc10,bc11,bc12,bc13,bc14,bc15,bc16,bc17,bc18,bc19,bc20,
             b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;

    public float num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, num14,
            num15, num16, num17, num18,num19,num20,
            nu1, nu2, nu3, nu4, nu5, nu6, nu7, nu8, nu9, nu10, nu11, nu12, nu13, nu14, nu15, nu16, nu17, nu18,nu19,nu20,
            n1=100,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16,n17,n18,n19,n20,result1,result2,result3,result4;

    TextView bomsum;
    TextView bomsize;
    Button calculate;
    boolean readyToCalculate=false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autobomcalculation);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        initializeAll();
        calculate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                FecalValues();
                if(readyToCalculate) {
                    result1 = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10 + num11 + num12 + num13 + num14
                            + num15 + num16 + num17 + num18 + num19 + num20);

                    nu1 = (num1 / result1);
                    nu2 = (num2 / result1);
                    nu3 = (num3 / result1);
                    nu4 = (num4 / result1);
                    nu5 = (num5 / result1);
                    nu6 = (num6 / result1);
                    nu7 = (num7 / result1);
                    nu8 = (num8 / result1);
                    nu9 = (num9 / result1);
                    nu10 = (num10 / result1);
                    nu11 = (num11 / result1);
                    nu12 = (num12 / result1);
                    nu13 = (num13 / result1);
                    nu14 = (num14 / result1);
                    nu15 = (num15 / result1);
                    nu16 = (num16 / result1);
                    nu17 = (num17 / result1);
                    nu18 = (num18 / result1);
                    nu19 = (num19 / result1);
                    nu20 = (num20 / result1);

                    bc1.setText(Float.toString(nu1));
                    bc2.setText(Float.toString(nu2));
                    bc3.setText(Float.toString(nu3));
                    bc4.setText(Float.toString(nu4));
                    bc5.setText(Float.toString(nu5));
                    bc6.setText(Float.toString(nu6));
                    bc7.setText(Float.toString(nu7));
                    bc8.setText(Float.toString(nu8));
                    bc9.setText(Float.toString(nu9));
                    bc10.setText(Float.toString(nu10));
                    bc11.setText(Float.toString(nu11));
                    bc12.setText(Float.toString(nu12));
                    bc13.setText(Float.toString(nu13));
                    bc14.setText(Float.toString(nu14));
                    bc15.setText(Float.toString(nu15));
                    bc16.setText(Float.toString(nu16));
                    bc17.setText(Float.toString(nu17));
                    bc18.setText(Float.toString(nu18));
                    bc19.setText(Float.toString(nu19));
                    bc20.setText(Float.toString(nu20));

                    result2 = (nu1 + nu2 + nu3 + nu4 + nu5 + nu6 + nu7 + nu8 + nu9 + nu10 + nu11 + nu12 + nu13 + nu14 + nu15 + nu16 + nu17 + nu18 + nu19 + nu20);
                    bomsum.setText(Float.toString(result2));

                    result3 = (n1 / nu1);
                    n2 = (result3 * nu2);
                    n3 = (result3 * nu3);
                    n4 = (result3 * nu4);
                    n5 = (result3 * nu5);
                    n6 = (result3 * nu6);
                    n7 = (result3 * nu7);
                    n8 = (result3 * nu8);
                    n9 = (result3 * nu9);
                    n10 = (result3 * nu10);
                    n11 = (result3 * nu11);
                    n12 = (result3 * nu12);
                    n13 = (result3 * nu13);
                    n14 = (result3 * nu14);
                    n15 = (result3 * nu15);
                    n16 = (result3 * nu16);
                    n17 = (result3 * nu17);
                    n18 = (result3 * nu18);
                    n19 = (result3 * nu19);
                    n20 = (result3 * nu20);

                    b1.setText(Float.toString(n1));
                    b2.setText(Float.toString(n2));
                    b3.setText(Float.toString(n3));
                    b4.setText(Float.toString(n4));
                    b5.setText(Float.toString(n5));
                    b6.setText(Float.toString(n6));
                    b7.setText(Float.toString(n7));
                    b8.setText(Float.toString(n8));
                    b9.setText(Float.toString(n9));
                    b10.setText(Float.toString(n11));
                    b12.setText(Float.toString(n12));
                    b13.setText(Float.toString(n13));
                    b14.setText(Float.toString(n14));
                    b15.setText(Float.toString(n15));
                    b16.setText(Float.toString(n16));
                    b17.setText(Float.toString(n17));
                    b18.setText(Float.toString(n18));
                    b19.setText(Float.toString(n19));
                    b11.setText(Float.toString(n11));
                    b20.setText(Float.toString(n20));

                    result4 = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10 + n11 + n12 + n13 + n14 + n15 + n16 + n17 + n18 + n19 + n20);
                    bomsize.setText(Float.toString(result4));
                }

            }


        });
    }

    private void FecalValues()
    {
        try
        {
            if(  (et1.getText().toString().equals("")) ||et2.getText().toString().equals("")
                    ||et3.getText().toString().equals("")||et4.getText().toString().equals("")
                    ||et5.getText().toString().equals("")||et6.getText().toString().equals("")
                    ||et7.getText().toString().equals("")||et8.getText().toString().equals("")
                    ||et9.getText().toString().equals("")||et10.getText().toString().equals("")
                    ||et11.getText().toString().equals("")||et12.getText().toString().equals("")
                    ||et13.getText().toString().equals("")|et14.getText().toString().equals("")
                    ||et15.getText().toString().equals("")|et16.getText().toString().equals("")
                    ||et17.getText().toString().equals("")|et18.getText().toString().equals("")
                    ||et19.getText().toString().equals("")||et20.getText().toString().equals("") )
            {

                Toast.makeText(getApplicationContext(),"Please Fill all the Values",Toast.LENGTH_SHORT).show();

            }
            else
            {
                num1 = Float.parseFloat(et1.getText().toString());num2 = Float.parseFloat(et2.getText().toString());
                num3 = Float.parseFloat(et3.getText().toString());num4 = Float.parseFloat(et4.getText().toString());
                num5 = Float.parseFloat(et5.getText().toString());num6 = Float.parseFloat(et6.getText().toString());
                num7 = Float.parseFloat(et7.getText().toString());num8 = Float.parseFloat(et8.getText().toString());
                num9 = Float.parseFloat(et9.getText().toString());num10 = Float.parseFloat(et10.getText().toString());
                num11 = Float.parseFloat(et11.getText().toString());num12 = Float.parseFloat(et12.getText().toString());
                num13 = Float.parseFloat(et13.getText().toString());num14 = Float.parseFloat(et14.getText().toString());
                num15 = Float.parseFloat(et15.getText().toString());num16 = Float.parseFloat(et16.getText().toString());
                num17 = Float.parseFloat(et17.getText().toString());num18 = Float.parseFloat(et18.getText().toString());
                num19 = Float.parseFloat(et19.getText().toString());num20 = Float.parseFloat(et20.getText().toString());
                readyToCalculate=true;
            }



        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext()," Please enter value properly!",Toast.LENGTH_SHORT).show();
            readyToCalculate=false;
        }
    }

    private void initializeAll()
    {
        et1= (EditText) findViewById(R.id.rd1); et2= (EditText) findViewById(R.id.rd2);
        et3= (EditText) findViewById(R.id.rd3); et4= (EditText) findViewById(R.id.rd4);
        et5= (EditText) findViewById(R.id.rd5); et6= (EditText) findViewById(R.id.rd6);
        et7= (EditText) findViewById(R.id.rd7); et8= (EditText) findViewById(R.id.rd8);
        et9= (EditText) findViewById(R.id.rd9); et10= (EditText) findViewById(R.id.rd10);
        et11= (EditText) findViewById(R.id.rd11); et12= (EditText) findViewById(R.id.rd12);
        et13= (EditText) findViewById(R.id.rd13); et14= (EditText) findViewById(R.id.rd14);
        et15= (EditText) findViewById(R.id.rd15); et16= (EditText) findViewById(R.id.rd16);
        et17= (EditText) findViewById(R.id.rd17); et18= (EditText) findViewById(R.id.rd18);
        et19= (EditText) findViewById(R.id.rd19); et20= (EditText) findViewById(R.id.rd20);

        bc1= (TextView) findViewById(R.id.rp1);bc2= (TextView) findViewById(R.id.rp2);
        bc3= (TextView) findViewById(R.id.rp3);bc4= (TextView) findViewById(R.id.rp4);
        bc5= (TextView) findViewById(R.id.rp5);bc6= (TextView) findViewById(R.id.rp6);
        bc7= (TextView) findViewById(R.id.rp7);bc8= (TextView) findViewById(R.id.rp8);
        bc9= (TextView) findViewById(R.id.rp9);bc10= (TextView) findViewById(R.id.rp10);
        bc11= (TextView) findViewById(R.id.rp11);bc12= (TextView) findViewById(R.id.rp12);
        bc13= (TextView) findViewById(R.id.rp13);bc14= (TextView) findViewById(R.id.rp14);
        bc15= (TextView) findViewById(R.id.rp15);bc16= (TextView) findViewById(R.id.rp16);
        bc17= (TextView) findViewById(R.id.rp17);bc18= (TextView) findViewById(R.id.rp18);
        bc19= (TextView) findViewById(R.id.rp19);bc20= (TextView) findViewById(R.id.rp20);

        b1= (TextView) findViewById(R.id.phr1);b2= (TextView) findViewById(R.id.phr2);
        b3= (TextView) findViewById(R.id.phr3);b4= (TextView) findViewById(R.id.phr4);
        b5= (TextView) findViewById(R.id.phr5);b6= (TextView) findViewById(R.id.phr6);
        b7= (TextView) findViewById(R.id.phr7);b8= (TextView) findViewById(R.id.phr8);
        b9= (TextView) findViewById(R.id.phr9);b10= (TextView) findViewById(R.id.phr10);
        b11= (TextView) findViewById(R.id.phr11);b12= (TextView) findViewById(R.id.phr12);
        b13= (TextView) findViewById(R.id.phr13);b14= (TextView) findViewById(R.id.phr14);
        b15= (TextView) findViewById(R.id.phr15);b16= (TextView) findViewById(R.id.phr16);
        b17= (TextView) findViewById(R.id.phr17);b18= (TextView) findViewById(R.id.phr18);
        b19= (TextView) findViewById(R.id.phr19);b20= (TextView) findViewById(R.id.phr20);

        bomsum = (TextView) findViewById(R.id.bom_sum);
        bomsize= (TextView) findViewById(R.id.bom_size);
        calculate= (Button) findViewById(R.id.btcal);
    }
}
