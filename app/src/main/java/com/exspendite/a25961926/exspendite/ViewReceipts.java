package com.exspendite.a25961926.exspendite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.*;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.*;

public class ViewReceipts extends AppCompatActivity {

    /*
    AmazonDynamoDBClient ddbClient = new AmazonDynamoDBClient(credentialsProvider);
    final DynamoDBMapper mapper = new DynamoDBMapper(ddbClient);*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_receipts);
    }


}
