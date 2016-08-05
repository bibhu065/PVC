package com.anchor.pvc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Compounddensitycalculation extends AppCompatActivity
{
    Button dencal;
    EditText d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17, d18 , d19,d20,
            ph1, ph2, ph3, ph4, ph5, ph6, ph7, ph8, ph9, ph10, ph11, ph12, ph13, ph14, ph15, ph16, ph17, ph18, ph19,ph20;
    TextView denresult;
    public float num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, num11, num12, num13, num14,
        num15, num16, num17, num18,num19,num20, result,
        nu1, nu2, nu3, nu4, nu5, nu6, nu7, nu8, nu9, nu10, nu11, nu12, nu13, nu14, nu15, nu16, nu17, nu18,nu19,nu20;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compounddensitycalculation);
        d1 = (EditText) findViewById(R.id.rd1);
        ph1 = (EditText) findViewById(R.id.phr1);
        d2 = (EditText) findViewById(R.id.rd2);
        ph2 = (EditText) findViewById(R.id.phr2);
        d3 = (EditText) findViewById(R.id.rd3);
        ph3 = (EditText) findViewById(R.id.phr3);
        d4 = (EditText) findViewById(R.id.rd4);
        ph4 = (EditText) findViewById(R.id.phr4);
        d5 = (EditText) findViewById(R.id.rd5);
        ph5 = (EditText) findViewById(R.id.phr5);
        d6 = (EditText) findViewById(R.id.rd6);
        ph6 = (EditText) findViewById(R.id.phr6);
        d7 = (EditText) findViewById(R.id.rd7);
        ph7 = (EditText) findViewById(R.id.phr7);
        d8 = (EditText) findViewById(R.id.rd8);
        ph8 = (EditText) findViewById(R.id.phr8);
        d9 = (EditText) findViewById(R.id.rd9);
        ph9 = (EditText) findViewById(R.id.phr9);
        d10 = (EditText) findViewById(R.id.rd10);
        ph10 = (EditText) findViewById(R.id.phr10);
        d11 = (EditText) findViewById(R.id.rd11);
        ph11 = (EditText) findViewById(R.id.phr11);
        d12 = (EditText) findViewById(R.id.rd12);
        ph12 = (EditText) findViewById(R.id.phr12);
        d13 = (EditText) findViewById(R.id.rd13);
        ph13 = (EditText) findViewById(R.id.phr13);
        d14 = (EditText) findViewById(R.id.rd14);
        ph14 = (EditText) findViewById(R.id.phr14);
        d15 = (EditText) findViewById(R.id.rd15);
        ph15 = (EditText) findViewById(R.id.phr15);
        d16 = (EditText) findViewById(R.id.rd16);
        ph16 = (EditText) findViewById(R.id.phr16);
        d17 = (EditText) findViewById(R.id.rd17);
        ph17 = (EditText) findViewById(R.id.phr17);
        d18 = (EditText) findViewById(R.id.rd18);
        ph18 = (EditText) findViewById(R.id.phr18);
        d19= (EditText) findViewById(R.id.rd19);
        ph19= (EditText) findViewById(R.id.phr19);
        d20= (EditText) findViewById(R.id.rd20);
        ph20= (EditText) findViewById(R.id.phr20);
        denresult = (TextView) findViewById(R.id.denres);
        dencal = (Button) findViewById(R.id.denbt);


        dencal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                try {
                    num1 = Float.parseFloat(d1.getText().toString());
                    nu1 = Float.parseFloat(ph1.getText().toString());
                    num2 = Float.parseFloat(d2.getText().toString());
                    nu2 = Float.parseFloat(ph2.getText().toString());
                    num3 = Float.parseFloat(d3.getText().toString());
                    nu3 = Float.parseFloat(ph3.getText().toString());
                    num4 = Float.parseFloat(d4.getText().toString());
                    nu4 = Float.parseFloat(ph4.getText().toString());
                    num5 = Float.parseFloat(d5.getText().toString());
                    nu5 = Float.parseFloat(ph5.getText().toString());
                    num6 = Float.parseFloat(d6.getText().toString());
                    nu6 = Float.parseFloat(ph6.getText().toString());
                    num7 = Float.parseFloat(d7.getText().toString());
                    nu7 = Float.parseFloat(ph7.getText().toString());
                    num8 = Float.parseFloat(d8.getText().toString());
                    nu8 = Float.parseFloat(ph8.getText().toString());
                    num9 = Float.parseFloat(d9.getText().toString());
                    nu9 = Float.parseFloat(ph9.getText().toString());
                    num10 = Float.parseFloat(d10.getText().toString());
                    nu10 = Float.parseFloat(ph10.getText().toString());
                    num11 = Float.parseFloat(d11.getText().toString());
                    nu11 = Float.parseFloat(ph11.getText().toString());
                    num12 = Float.parseFloat(d12.getText().toString());
                    nu12 = Float.parseFloat(ph12.getText().toString());
                    num13 = Float.parseFloat(d13.getText().toString());
                    nu13 = Float.parseFloat(ph13.getText().toString());
                    num14 = Float.parseFloat(d14.getText().toString());
                    nu14 = Float.parseFloat(ph14.getText().toString());
                    num15 = Float.parseFloat(d15.getText().toString());
                    nu15 = Float.parseFloat(ph15.getText().toString());
                    num16 = Float.parseFloat(d16.getText().toString());
                    nu16 = Float.parseFloat(ph16.getText().toString());
                    num17 = Float.parseFloat(d17.getText().toString());
                    nu17 = Float.parseFloat(ph17.getText().toString());
                    num18 = Float.parseFloat(d18.getText().toString());
                    nu18 = Float.parseFloat(ph18.getText().toString());
                    num19 = Float.parseFloat(d19.getText().toString());
                    nu19 = Float.parseFloat(ph19.getText().toString());
                    nu20 = Float.parseFloat(ph20.getText().toString());
                    num20 = Float.parseFloat(d20.getText().toString());

                    result = (nu1 + nu2 + nu3 + nu4 + nu5 + nu6 + nu7 + nu8 + nu9 + nu10 + nu11 + nu12 + nu13 + nu14 + nu15 + nu16
                            + nu17 + nu18 + nu19 + nu20) / ((nu1 / num1) + (nu2 / num2) + (nu3 / num3) + (nu4 / num4) + (nu5 / num5) + (nu6 / num6)
                            + (nu7 / num7) + (nu8 / num8) + (nu9 / num9) + (nu10 / num10) + (nu11 / num11) + (nu12 / num12)
                            + (nu13 / num13) + (nu14 / num14) + (nu15 / num15) + (nu16 / num16) + (nu17 / num17) + (nu18 / num18)
                            + (nu19 / num19) + (nu20 / num20));
                    denresult.setText(Float.toString(result));
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Please Enter all fields",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
