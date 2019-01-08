package ltknareufat.com.areufat;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        final int idealkilo;
       final int left;

        final EditText heightF, weightF;
        final TextView result;
        Button comment;

        heightF = (EditText) findViewById(R.id.heightF);
        weightF = (EditText) findViewById(R.id.weightM);
        comment = (Button) findViewById(R.id.BtnCalculateF);
        result = (TextView) findViewById(R.id.resultF);


        comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager inputManager = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);

                inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                        InputMethodManager.HIDE_NOT_ALWAYS);
                float height = Float.parseFloat(heightF.getText().toString());
                float weight = Float.parseFloat(weightF.getText().toString());
                float idealkilo;
                float left;
                idealkilo = height-108;

                left = weight-idealkilo;

                if (left  >= -20 && left <= -6 ) {
                    result.setText("u are a very  skinny.U should gain weight."); }
                else if (left >= -6 && left <= -1)  {
                    result.setText("u are some below of ur ideal weight.I advise to gain some weight"); }
                else if (left >= 0 && left <= 4) {
                    result.setText("Its good ! U are on ur ideal weight.Keep going like this.");  }
                else if (left >= 4 && left <= 8) {
                    result.setText("U are some overweight.Time to think about a diet.");  }
                else if (left >= 8 && left <= 30) {
                    result.setText("U are overweight.Diet and sport is a must for u."); }
                else {
                    result.setText("U are certainly overweight.");
                }

            }




        });


    }
}
