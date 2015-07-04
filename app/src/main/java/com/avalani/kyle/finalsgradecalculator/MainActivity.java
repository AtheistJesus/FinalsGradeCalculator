package com.avalani.kyle.finalsgradecalculator;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

private static final int RESULT_SETTINGS = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //testing3

        ImageButton submitbutton = (ImageButton) findViewById(R.id.submitbutton);
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //
                InputMethodManager inputManager = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);

                inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                        InputMethodManager.HIDE_NOT_ALWAYS);
                // Above this makes it so the keyboard closes when the button is clicked.

                EditText editText1 = (EditText) findViewById(R.id.editText);

                EditText editText2 = (EditText) findViewById(R.id.editText2);

                EditText editText3 = (EditText) findViewById(R.id.editText3);


                String z = editText1.getText().toString();
                String y = editText2.getText().toString();
                String w = editText3.getText().toString();


                if (z.equalsIgnoreCase("") || y.equalsIgnoreCase("") || w.equalsIgnoreCase("")){
                    Context context = getApplicationContext();
                    Toast.makeText(context,"You need to enter a number in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    double currentGrade = Double.valueOf(editText1.getText().toString());
                    double gradeWanted = Double.valueOf(editText2.getText().toString());
                    double finalWeight = Double.valueOf(editText3.getText().toString());




                    double finalCalculation = ((100 * gradeWanted - (100-finalWeight) * currentGrade) / finalWeight);   //This is the new formula, added at 2:30 AM, so accuracy may be a little off (It's good)
                    finalCalculation = (double)Math.round(finalCalculation *100) / 100;
                    //This is for rounding to two decimal places.

                    String neededPercent = Double.toString(finalCalculation);

                    TextView textView1 = (TextView) findViewById(R.id.calculatedgrade);
                    textView1.setText("You need to get at least " + neededPercent + "% on your final. Good luck!");
                }



            }
        });

        //This is the code for the reset button
        ImageButton resetbutton = (ImageButton) findViewById(R.id.resetButton);
        resetbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {

                EditText editText1 = (EditText) findViewById(R.id.editText);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                EditText editText3 = (EditText) findViewById(R.id.editText3);

                editText1.getText().clear();
                editText2.getText().clear();
                editText3.getText().clear();
                //above clears the text the user entered into the edittext fields


                TextView textView1 = (TextView) findViewById(R.id.calculatedgrade);
                textView1.setText("");

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent i = new Intent(this,SettingsActivity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
