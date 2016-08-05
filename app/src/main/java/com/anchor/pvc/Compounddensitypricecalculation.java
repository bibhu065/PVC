package com.anchor.pvc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Compounddensitypricecalculation extends AppCompatActivity
{
    EditText d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20,
             p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,
             ph1,ph2,ph3,ph4,ph5,ph6,ph7,ph8,ph9,ph10,ph11,ph12,ph13,ph14,ph15,ph16,ph17,ph18,ph19,ph20;

    TextView Showprice,Showgrvity,Batchsize;
    Button calculate;
    public float num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, num14,
            num15, num16, num17, num18,num19,num20,
            nu1, nu2, nu3, nu4, nu5, nu6, nu7, nu8, nu9, nu10, nu11, nu12, nu13, nu14, nu15, nu16, nu17, nu18,nu19,nu20,
            n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16,n17,n18,n19,n20,result1,result2,result3;
    boolean readyToCalculate = false;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compounddensitypricecalculation);
        initializeAll();
        calculate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                FetchAllValues();
                if (readyToCalculate)
                {
                    result1 = (nu1 + nu2 + nu3 + nu4 + nu5 + nu6 + nu7 + nu8 + nu9 + nu10 + nu11 + nu12 + nu13 + nu14 + nu15 + nu16
                            + nu17 + nu18 + nu19 + nu20) / ((nu1 / num1) + (nu2 / num2) + (nu3 / num3) + (nu4 / num4) + (nu5 / num5) + (nu6 / num6)
                            + (nu7 / num7) + (nu8 / num8) + (nu9 / num9) + (nu10 / num10) + (nu11 / num11) + (nu12 / num12)
                            + (nu13 / num13) + (nu14 / num14) + (nu15 / num15) + (nu16 / num16) + (nu17 / num17) + (nu18 / num18)
                            + (nu19 / num19) + (nu20 / num20));
                    Showgrvity.setText(Float.toString(result1));

                    result2 = ((n1 * nu1) + (n2 * nu2) + (n3 * nu3) + (n4 * nu4) + (n5 * nu5) + (n6 * nu6)
                            + (n7 * nu7) + (n8 * nu8) + (n9 * nu9) + (n10 * nu10) + (n11 * nu11) + (n12 * nu12)
                            + (n13 * nu13) + (n14 * nu14) + (n15 * nu15) + (n16 * nu16) + (n17 * nu17) + (n18 * nu18)
                            + (n19 * nu19) + (n20 * nu20)) / (nu1 + nu2 + nu3 + nu4 + nu5 + nu6 + nu7 + nu8 + nu9 + nu10
                            + nu11 + nu12 + nu13 + nu14 + nu15 + nu16 + nu17 + nu18 + nu19 + nu20);
                    Showprice.setText(getResources().getString(R.string.Rs)+result2);

                    result3 = (nu1 + nu2 + nu3 + nu4 + nu5 + nu6 + nu7 + nu8 + nu9 + nu10 + nu11 + nu12 + nu13 + nu14 + nu15 + nu16
                            + nu17 + nu18 + nu19 + nu20);
                    Batchsize.setText(Float.toString(result3));
                }

            }
        });

    }
    private void initializeAll() {
        d1= (EditText) findViewById(R.id.rd1);  p1= (EditText) findViewById(R.id.rp1);   ph1= (EditText) findViewById(R.id.phr1);
        d2= (EditText) findViewById(R.id.rd2);  p2= (EditText) findViewById(R.id.rp2);   ph2= (EditText) findViewById(R.id.phr2);
        d3= (EditText) findViewById(R.id.rd3);  p3= (EditText) findViewById(R.id.rp3);   ph3= (EditText) findViewById(R.id.phr3);
        d4= (EditText) findViewById(R.id.rd4);  p4= (EditText) findViewById(R.id.rp4);   ph4= (EditText) findViewById(R.id.phr4);
        d5= (EditText) findViewById(R.id.rd5);  p5= (EditText) findViewById(R.id.rp5);   ph5= (EditText) findViewById(R.id.phr5);
        d6= (EditText) findViewById(R.id.rd6);  p6= (EditText) findViewById(R.id.rp6);   ph6= (EditText) findViewById(R.id.phr6);
        d7= (EditText) findViewById(R.id.rd7);  p7= (EditText) findViewById(R.id.rp7);   ph7= (EditText) findViewById(R.id.phr7);
        d8= (EditText) findViewById(R.id.rd8);  p8= (EditText) findViewById(R.id.rp8);   ph8= (EditText) findViewById(R.id.phr8);
        d9= (EditText) findViewById(R.id.rd9);  p9= (EditText) findViewById(R.id.rp9);   ph9= (EditText) findViewById(R.id.phr9);
        d10= (EditText) findViewById(R.id.rd10);  p10= (EditText) findViewById(R.id.rp10);  ph10= (EditText) findViewById(R.id.phr10);
        d11= (EditText) findViewById(R.id.rd11);  p11= (EditText) findViewById(R.id.rp11);  ph11= (EditText) findViewById(R.id.phr11);
        d12= (EditText) findViewById(R.id.rd12);  p12= (EditText) findViewById(R.id.rp12);  ph12= (EditText) findViewById(R.id.phr12);
        d13= (EditText) findViewById(R.id.rd13);  p13= (EditText) findViewById(R.id.rp13);  ph13= (EditText) findViewById(R.id.phr13);
        d14= (EditText) findViewById(R.id.rd14);  p14= (EditText) findViewById(R.id.rp14);  ph14= (EditText) findViewById(R.id.phr14);
        d15= (EditText) findViewById(R.id.rd15);  p15= (EditText) findViewById(R.id.rp15);  ph15= (EditText) findViewById(R.id.phr15);
        d16= (EditText) findViewById(R.id.rd16);  p16= (EditText) findViewById(R.id.rp16);  ph16= (EditText) findViewById(R.id.phr16);
        d17= (EditText) findViewById(R.id.rd17);  p17= (EditText) findViewById(R.id.rp17);  ph17= (EditText) findViewById(R.id.phr17);
        d18= (EditText) findViewById(R.id.rd18);  p18= (EditText) findViewById(R.id.rp18);  ph18= (EditText) findViewById(R.id.phr18);
        d19=(EditText) findViewById(R.id.rd19);   p19= (EditText) findViewById(R.id.rp19);  ph19= (EditText) findViewById(R.id.phr19);
        d20= (EditText) findViewById(R.id.rd20);  p20= (EditText) findViewById(R.id.rp20);  ph20= (EditText) findViewById(R.id.phr20);
        Showprice= (TextView) findViewById(R.id.showprice);
        Showgrvity= (TextView) findViewById(R.id.showgravity);
        calculate= (Button) findViewById(R.id.btcal);
        Batchsize= (TextView) findViewById(R.id.batchsize);
    }

    private void FetchAllValues() {
        try {
            if(  (d1.getText().toString().equals("")) ||d2.getText().toString().equals("")
                    ||d3.getText().toString().equals("")||d4.getText().toString().equals("")
                    ||d5.getText().toString().equals("")||d6.getText().toString().equals("")
                    ||d7.getText().toString().equals("")||d8.getText().toString().equals("")
                    ||d9.getText().toString().equals("")||d10.getText().toString().equals("")
                    ||d11.getText().toString().equals("")||d12.getText().toString().equals("")
                    ||d13.getText().toString().equals("")|d14.getText().toString().equals("")
                    ||d15.getText().toString().equals("")|d16.getText().toString().equals("")
                    ||d17.getText().toString().equals("")|d18.getText().toString().equals("")
                    ||d19.getText().toString().equals("")||d20.getText().toString().equals("") )
            {

                num1 = 1.400f;     num6=1.900f;      num11=3.300f;     num16=1.000f;
                num2=2.700f;       num7=1.350f;      num12=4.600f;     num17=0.992f;
                num3=2.410f;       num8=1.110f;      num13=0.920f;     num18=1.600f;
                num4=2.600f;       num9=1.000f;      num14=0.990f;     num19=2.700f;
                num5=7.200f;       num10=5.500f;     num15=1.300f;     num20=0.900f;

            }
            else
            {
                num1 = Float.parseFloat(d1.getText().toString());num2 = Float.parseFloat(d2.getText().toString());
                num3 = Float.parseFloat(d3.getText().toString());num4 = Float.parseFloat(d4.getText().toString());
                num5 = Float.parseFloat(d5.getText().toString());num6 = Float.parseFloat(d6.getText().toString());
                num7 = Float.parseFloat(d7.getText().toString());num8 = Float.parseFloat(d8.getText().toString());
                num9 = Float.parseFloat(d9.getText().toString());num10 = Float.parseFloat(d10.getText().toString());
                num11 = Float.parseFloat(d11.getText().toString());num12 = Float.parseFloat(d12.getText().toString());
                num13 = Float.parseFloat(d13.getText().toString());num14 = Float.parseFloat(d14.getText().toString());
                num15 = Float.parseFloat(d15.getText().toString());num16 = Float.parseFloat(d16.getText().toString());
                num17 = Float.parseFloat(d17.getText().toString());num18 = Float.parseFloat(d18.getText().toString());
                num19 = Float.parseFloat(d19.getText().toString());num20 = Float.parseFloat(d20.getText().toString());
            }

            if(    (p1.getText().toString().equals(""))||p2.getText().toString().equals("")
                    ||p3.getText().toString().equals("")||p4.getText().toString().equals("")
                    ||p5.getText().toString().equals("")||p6.getText().toString().equals("")
                    ||p7.getText().toString().equals("")||p8.getText().toString().equals("")
                    ||p9.getText().toString().equals("")||p10.getText().toString().equals("")
                    ||p11.getText().toString().equals("")||p12.getText().toString().equals("")
                    ||p13.getText().toString().equals("")||p14.getText().toString().equals("")
                    ||p15.getText().toString().equals("")||p16.getText().toString().equals("")
                    ||p17.getText().toString().equals("")||p18.getText().toString().equals("")
                    ||p19.getText().toString().equals("")||p20.getText().toString().equals(""))
            {
                n1=65.630f;  n2=12.500f;    n3=32.000f;      n4=68.000f;
                n5=139.000f; n6=151.000f;   n7=122.000f;     n8=113.000f;
                n9=155.000f; n10=458.000f;  n11=140.000f;    n12=1325.000f;
                n13=129.000f;  n14=62.000f; n15=34.000f;     n16=74.500f;
                n17=160.000f;  n18=95.000f; n19=24.500f;     n20=72.000f;

            }
            else
            {
                n1=Float.parseFloat(p1.getText().toString());n2=Float.parseFloat(p2.getText().toString());
                n3=Float.parseFloat(p3.getText().toString());n4=Float.parseFloat(p4.getText().toString());
                n5=Float.parseFloat(p5.getText().toString());n6=Float.parseFloat(p6.getText().toString());
                n7=Float.parseFloat(p7.getText().toString());n8=Float.parseFloat(p8.getText().toString());
                n9=Float.parseFloat(p9.getText().toString());n10=Float.parseFloat(p10.getText().toString());
                n11=Float.parseFloat(p11.getText().toString());n12=Float.parseFloat(p12.getText().toString());
                n13=Float.parseFloat(p13.getText().toString());n14=Float.parseFloat(p14.getText().toString());
                n15=Float.parseFloat(p15.getText().toString());n16=Float.parseFloat(p16.getText().toString());
                n17=Float.parseFloat(p17.getText().toString());n18=Float.parseFloat(p18.getText().toString());
                n19=Float.parseFloat(p19.getText().toString());n20=Float.parseFloat(p20.getText().toString());
            }

            nu1 = Float.parseFloat(ph1.getText().toString());nu2 = Float.parseFloat(ph2.getText().toString());
            nu3 = Float.parseFloat(ph3.getText().toString());nu4 = Float.parseFloat(ph4.getText().toString());
            nu5 = Float.parseFloat(ph5.getText().toString());nu6 = Float.parseFloat(ph6.getText().toString());
            nu7 = Float.parseFloat(ph7.getText().toString());nu8 = Float.parseFloat(ph8.getText().toString());
            nu9 = Float.parseFloat(ph9.getText().toString());nu10 = Float.parseFloat(ph10.getText().toString());
            nu11 = Float.parseFloat(ph11.getText().toString());nu12 = Float.parseFloat(ph12.getText().toString());
            nu13 = Float.parseFloat(ph13.getText().toString());nu14 = Float.parseFloat(ph14.getText().toString());
            nu15 = Float.parseFloat(ph15.getText().toString());nu16 = Float.parseFloat(ph16.getText().toString());
            nu17 = Float.parseFloat(ph17.getText().toString());nu18 = Float.parseFloat(ph18.getText().toString());
            nu19 = Float.parseFloat(ph19.getText().toString());nu20 = Float.parseFloat(ph20.getText().toString());
            readyToCalculate = true;
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(),"Oops something went wrong!\n Please enter value properly!",Toast.LENGTH_SHORT).show();
            readyToCalculate=false;
        }


    }
}