package boots.com.fan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by nithinchandran on 31/5/17.
 */

public class ThirdActivityz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.third_activityz);




        TextView textView933 = (TextView) findViewById(R.id.textView933);
        textView933.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivityz.this, Fo1.class));
            }
        });

        TextView textView934 = (TextView) findViewById(R.id.textView934);
        textView934.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivityz.this, Fo2.class));
            }
        });



        TextView textView935 = (TextView) findViewById(R.id.textView935);
        textView935.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivityz.this, Fo3.class));
            }
        });



        TextView textView936 = (TextView) findViewById(R.id.textView936);
        textView936.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivityz.this, Fo4.class));
            }
        });



        TextView textView937 = (TextView) findViewById(R.id.textView937);
        textView937.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivityz.this, Fo5.class));
            }
        });



        TextView textView938 = (TextView) findViewById(R.id.textView938);
        textView938.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivityz.this, Fo6.class));
            }
        });




        TextView textView939 = (TextView) findViewById(R.id.textView939);
        textView939.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivityz.this, Fo7.class));
            }
        });


        TextView textView940 = (TextView) findViewById(R.id.textView940);
        textView940.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivityz.this, Fo8.class));
            }
        });



        TextView textView941 = (TextView) findViewById(R.id.textView941);
        textView941.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivityz.this, Fo9.class));
            }
        });



        TextView textView942 = (TextView) findViewById(R.id.textView942);
        textView942.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivityz.this, Fo10.class));
            }
        });


        TextView textView943 = (TextView) findViewById(R.id.textView943);
        textView943.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivityz.this, Fo11.class));
            }
        });


        TextView textView944 = (TextView) findViewById(R.id.textView944);
        textView944.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivityz.this, Fo12.class));
            }
        });


        TextView textView945 = (TextView) findViewById(R.id.textView945);
        textView945.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivityz.this, Fo13.class));
            }
        });


        TextView textView946 = (TextView) findViewById(R.id.textView946);
        textView946.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivityz.this, Fo14.class));
            }
        });


        TextView textView947 = (TextView) findViewById(R.id.textView947);
        textView947.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivityz.this, Fo15.class));
            }
        });


        TextView textView948 = (TextView) findViewById(R.id.textView948);
        textView948.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivityz.this, Fo16.class));
            }
        });

        TextView textView949 = (TextView) findViewById(R.id.textView949);
        textView949.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(ThirdActivityz.this, Fo17.class));
            }
        });







    }
}
