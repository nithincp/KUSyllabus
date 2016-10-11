package boots.com.fan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 22/6/16.
 */
public class FourthActivity7ec extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fourth_activit7ec);


        TextView textView869 = (TextView) findViewById(R.id.textView869);
        textView869.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7ec.this, FifthActivity7ec1.class));
            }
        });



        TextView textView870 = (TextView) findViewById(R.id.textView870);
        textView870.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7ec.this, FifthActivity7ec2.class));
            }
        });



        TextView textView871 = (TextView) findViewById(R.id.textView871);
        textView871.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7ec.this, FifthActivity7ec3.class));
            }
        });



        TextView textView872 = (TextView) findViewById(R.id.textView872);
        textView872.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7ec.this, FifthActivity7ec4.class));
            }
        });



        TextView textView873 = (TextView) findViewById(R.id.textView873);
        textView873.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7ec.this, FifthActivity7ec5.class));
            }
        });



        TextView textView874 = (TextView) findViewById(R.id.textView874);
        textView874.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7ec.this, FifthActivity7ec6.class));
            }
        });



        TextView textView875 = (TextView) findViewById(R.id.textView875);
        textView875.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7ec.this, FifthActivity7ec7.class));
            }
        });



        TextView textView876 = (TextView) findViewById(R.id.textView876);
        textView876.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7ec.this, FifthActivity7ec8.class));
            }
        });


        TextView textView1627 = (TextView) findViewById(R.id.textView1627);
        textView1627.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7ec.this, FifthActivity7ec9.class));
            }
        });


        TextView textView1628 = (TextView) findViewById(R.id.textView1628);
        textView1628.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity7ec.this, FifthActivity7ec10.class));
            }
        });
    }
}
