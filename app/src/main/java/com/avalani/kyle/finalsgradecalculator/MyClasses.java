package com.avalani.kyle.finalsgradecalculator;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Kyle on 7/4/2015.
 */
public class MyClasses extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_classes);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = preferences.edit();

        final EditText classOneName = (EditText) findViewById(R.id.ClassOne);
        final EditText classOneGrade = (EditText) findViewById(R.id.ClassOneGrade);

        final EditText classTwoName = (EditText) findViewById(R.id.ClassTwo);
        final EditText classTwoGrade = (EditText) findViewById(R.id.ClassTwoGrade);

        final EditText classThreeName = (EditText) findViewById(R.id.ClassThree);
        final EditText classThreeGrade = (EditText) findViewById(R.id.ClassThreeGrade);

        final EditText classFourName = (EditText) findViewById(R.id.ClassFour);
        final EditText classFourGrade = (EditText) findViewById(R.id.ClassFourGrade);

        final EditText classFiveName = (EditText) findViewById(R.id.ClassFive);
        final EditText classFiveGrade = (EditText) findViewById(R.id.ClassFiveGrade);

        final EditText classSixName = (EditText) findViewById(R.id.ClassSix);
        final EditText classSixGrade = (EditText) findViewById(R.id.ClassSixGrade);



        String savedClassOneName = preferences.getString("ClassOneName","cat");
        String savedClassOneGrade = preferences.getString("ClassOneGrade", "cat");


        String savedClassTwoName = preferences.getString("ClassTwoName", "cat");
        String savedClassTwoGrade = preferences.getString("ClassTwoGrade", "cat");


        String savedClassThreeName = preferences.getString("ClassThreeName", "cat");
        String savedClassThreeGrade = preferences.getString("ClassThreeGrade", "cat");


        String savedClassFourName = preferences.getString("ClassFourName", "cat");
        String savedClassFourGrade = preferences.getString("ClassFourGrade", "cat");


        String savedClassFiveName = preferences.getString("ClassFiveName", "cat");
        String savedClassFiveGrade = preferences.getString("ClassFiveGrade", "cat");


        String savedClassSixName = preferences.getString("ClassSixName", "cat");
        String savedClassSixGrade = preferences.getString("ClassSixGrade","cat");


        classOneName.setText(savedClassOneName);
        classOneGrade.setText(savedClassOneGrade);
        classTwoName.setText(savedClassTwoName);
        classTwoGrade.setText(savedClassTwoGrade);
        classThreeName.setText(savedClassThreeName);
        classThreeGrade.setText(savedClassThreeGrade);
        classFourName.setText(savedClassFourName);
        classFourGrade.setText(savedClassFourGrade);
        classFiveName.setText(savedClassFiveName);
        classFiveGrade.setText(savedClassFiveGrade);
        classSixName.setText(savedClassSixName);
        classSixGrade.setText(savedClassSixGrade);


        ImageButton saveButton = (ImageButton) findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                String savedClassOneName = classOneName.getText().toString();
                    editor.putString("ClassOneName",savedClassOneName);
                String savedClassOneGrade = classOneGrade.getText().toString();
                    editor.putString("ClassOneGrade",savedClassOneGrade);

                String savedClassTwoName = classTwoName.getText().toString();
                    editor.putString("ClassTwoName",savedClassTwoName);
                String savedClassTwoGrade = classTwoGrade.getText().toString();
                    editor.putString("ClassTwoGrade",savedClassTwoGrade);

                String savedClassThreeName = classThreeName.getText().toString();
                    editor.putString("ClassThreeName",savedClassThreeName);
                String savedClassThreeGrade = classThreeGrade.getText().toString();
                    editor.putString("ClassThreeGrade",savedClassThreeGrade);

                String savedClassFourName = classFourName.getText().toString();
                    editor.putString("ClassFourName",savedClassFourName);
                String savedClassFourGrade = classFourGrade.getText().toString();
                    editor.putString("ClassFourGrade",savedClassFourGrade);

                String savedClassFiveName = classFiveName.getText().toString();
                    editor.putString("ClassFiveName",savedClassFiveName);
                String savedClassFiveGrade = classFiveGrade.getText().toString();
                    editor.putString("ClassFiveGrade",savedClassFiveGrade);

                String savedClassSixName = classSixName.getText().toString();
                    editor.putString("ClassSixName",savedClassSixName);
                String savedClassSixGrade = classSixGrade.getText().toString();
                    editor.putString("ClassSixGrade",savedClassSixGrade);

                editor.commit();

                    classOneName.setText(savedClassOneName);
                    classOneGrade.setText(savedClassOneGrade);
                    classTwoName.setText(savedClassTwoName);
                    classTwoGrade.setText(savedClassTwoGrade);
                    classThreeName.setText(savedClassThreeName);
                    classThreeGrade.setText(savedClassThreeGrade);
                    classFourName.setText(savedClassFourName);
                    classFourGrade.setText(savedClassFourGrade);
                    classFiveName.setText(savedClassFiveName);
                    classFiveGrade.setText(savedClassFiveGrade);
                    classSixName.setText(savedClassSixName);
                    classSixGrade.setText(savedClassSixGrade);



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
