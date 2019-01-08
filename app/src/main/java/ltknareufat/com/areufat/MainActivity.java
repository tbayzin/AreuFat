package ltknareufat.com.areufat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button BtnFemale = (Button) findViewById(R.id.btnFemale);
       Button BtnMale = (Button) findViewById(R.id.btnMale);

        BtnFemale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ActivityTwo.class);
                startActivity(intent);
            }
        });

        BtnMale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent intent = new Intent(getApplicationContext(),ActivityThree.class);
                startActivity(intent);
            }
        });

    } }