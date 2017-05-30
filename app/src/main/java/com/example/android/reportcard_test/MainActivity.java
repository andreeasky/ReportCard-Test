package com.example.android.reportcard_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a ReportCard instance
        ReportCard myReportCard = new ReportCard();

        // Use setters to add some values
        myReportCard.setGradeProgramming(ReportCard.GRADE_A);
        myReportCard.setGradeMathematics(ReportCard.GRADE_B);
        myReportCard.setGradeGeography(ReportCard.GRADE_D);
        myReportCard.setGradeReligion(ReportCard.GRADE_A);
        myReportCard.setGradeHistory(ReportCard.GRADE_E);
        myReportCard.setGradeMusic(ReportCard.GRADE_B);
        myReportCard.setGradeArts(ReportCard.GRADE_C);

        String result = myReportCard.getFinalResult();

        Log.v("ReportCard", result);

    }
}
