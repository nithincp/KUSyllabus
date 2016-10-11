package boots.com.fan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 22/6/16.
 */
public class FourthActivity6ci extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.fourth_activity6ci);

        TextView textView893 = (TextView) findViewById(R.id.textView893);
        textView893.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ci.this, FifthActivity6c1.class));
            }
        });



        TextView textView894 = (TextView) findViewById(R.id.textView894);
        textView894.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ci.this, FifthActivity6c2.class));
            }
        });



        TextView textView895 = (TextView) findViewById(R.id.textView895);
        textView895.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ci.this, FifthActivity6c3.class));
            }
        });



        TextView textView896 = (TextView) findViewById(R.id.textView896);
        textView896.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ci.this, FifthActivity6c4.class));
            }
        });



        TextView textView897 = (TextView) findViewById(R.id.textView897);
        textView897.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ci.this, FifthActivity6c5.class));
            }
        });



        TextView textView898 = (TextView) findViewById(R.id.textView898);
        textView898.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ci.this, FifthActivity6c6.class));
            }
        });



        TextView textView899 = (TextView) findViewById(R.id.textView899);
        textView899.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ci.this, FifthActivity6c7.class));
            }
        });



        TextView textView900 = (TextView) findViewById(R.id.textView900);
        textView900.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(FourthActivity6ci.this, FifthActivity6c8.class));
            }
        });
    }
}
