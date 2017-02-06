package com.example.zhangbing.gayhubcontributionview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GitHubContributionView github = (GitHubContributionView) findViewById(R.id.gcbv_gayhub);
        github.setData(2016,12,9,2);
        github.setData(2016,11,9,1);
        github.setData(2016,10,5,10);
        github.setData(2016,8,9,3);
        github.setData(2016,4,20,2);
        github.setData(2016,12,13,3);
        github.setData(2016,12,14,3);
        github.setData(2016,2,15,4);


    }
}
