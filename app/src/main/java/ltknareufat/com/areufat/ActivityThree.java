package ltknareufat.com.areufat;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ActivityThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        final int idealkilo;
        final int left;

        final EditText heightM, weightM;
        final TextView result;
        Button comment;

        heightM = (EditText) findViewById(R.id.heightM);
        weightM = (EditText) findViewById(R.id.weightM);
        comment = (Button) findViewById(R.id.BtnCalculateM);
        result = (TextView) findViewById(R.id.resultM);



        comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                InputMethodManager inputManager = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);

                inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                        InputMethodManager.HIDE_NOT_ALWAYS);
                float height = Float.parseFloat(heightM.getText().toString());
                float weight = Float.parseFloat(weightM.getText().toString());
                float idealkilo;
                float left;
                idealkilo = height-100;

                left = weight-idealkilo;



                if (left  >= -20 && left <= -8 ) {
                    result.setText("u are a skeleton dude.Gain some weight !"); }
                else if (left >= -8 && left <= -6)  {
                    result.setText("u are only some below of ur ideal weight man.Better get some weight"); }
                else if (left >= -6 && left <= 8) {
                    result.setText("Good ! U are on ur ideal weight.Keep going like this.");  }
                else if (left >= 8 && left <= 14) {
                    result.setText("U can be counted as overweight.Stop visiting Mcdonalds such often.");  }
                else if (left >= 14 && left <= 30) {
                    result.setText("U are overweight.Find a gym for urself."); }
                else {
                    result.setText("U are really owerweight man.Do something about it immediately if u dont want to be a Sumo wrestler.");
                }


            }




        });


        }


    }


