package com.exspendite.a25961926.exspendite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.*;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.*;

public class ViewReceipts extends AppCompatActivity {

    // Initialize the Amazon Cognito credentials provider
   /* CognitoCachingCredentialsProvider credentialsProvider = new CognitoCachingCredentialsProvider(
            getApplicationContext(),
            "us-east-1:c51b819f-12b7-4478-a19c-c577cf0ca7e5", // Identity pool ID
            Regions.US_EAST_1 // Region
    );
    AmazonDynamoDBClient ddbClient = new AmazonDynamoDBClient(credentialsProvider);
    final DynamoDBMapper mapper = new DynamoDBMapper(ddbClient);*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_receipts);
        defineButtons();



    }
    public void defineButtons()
    {
       // findViewById(R.id.btnTest).setOnClickListener(buttonClickListener);
    }
    /*private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btnTest:

                    Runnable runnable = new Runnable()
                    {
                        public void run()
                        {
                            //DynamoDB calls go here
                            ReceiptMapping receipt = new ReceiptMapping();
                            receipt.setMerchant("TestMerchant");
                            receipt.setItemDesc("TestitemDesc");
                            receipt.setPrice(1299);
                            mapper.save(receipt);
                        }
                    };
                    Thread mythread = new Thread(runnable);
                    mythread.start();
                    break;
            }
        }
    };*/

}
