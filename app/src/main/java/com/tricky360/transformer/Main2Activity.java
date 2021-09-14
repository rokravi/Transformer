package com.tricky360.transformer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView result;
    EditText num1,num2,num3;
    Button cal;
    double a,b,c,d;
    double x,y,z,k,m,n,o,p,q;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        result = (TextView)findViewById(R.id.result);

        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText)findViewById(R.id.num2);
        num3 = (EditText)findViewById(R.id.num3);

        cal = (Button)findViewById(R.id.cal);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                a=Double.parseDouble(num1.getText().toString());
                x=a*1.732;
                y=x/11000*100;
                b=Double.parseDouble(num2.getText().toString());
                z=b/160;
                c=Double.parseDouble(num3.getText().toString());
                k=c/160;
                m=Math.pow(y,2)-Math.pow(z,2);
                n=Math.sqrt(m);
                o=Math.pow(n,2)+Math.pow(k,2);
                q=Math.sqrt(o);
                result.setText(" "+q);
            }
        });

    }
}
