package com.example.vishal_dhaware.day_zore;

import android.database.CursorJoiner;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText p,r,t;
    TextView res;
    Button button;
    String ps,rs,ts;
    int pv,rv,tv;
    double rsv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ContetingToxmlobject();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ps=String.valueOf(p.getText());
                pv=Integer.valueOf(ps);
                rs=String.valueOf(r.getText());
                rv=Integer.valueOf(rs);
                ts=String.valueOf(t.getText());
                tv=Integer.valueOf(ts);
                rsv=((pv*rv*tv)/100);
                String s=String.valueOf(rsv);
                res.setText(s);
                Toast.makeText(MainActivity.this, "Result is= "+s,Toast.LENGTH_LONG).show();
            }
        });
    }

    private void ContetingToxmlobject() {
        p=findViewById(R.id.P_editText);
        r=findViewById(R.id.R_editText2);
        t=findViewById(R.id.T_editText3);
        button=findViewById(R.id.button);
        res=findViewById(R.id.result);
    }
}
