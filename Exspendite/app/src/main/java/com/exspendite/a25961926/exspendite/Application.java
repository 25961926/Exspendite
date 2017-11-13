package com.exspendite.a25961926.exspendite;

/**
 * Created by Muller on 2017/11/13.
 */
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.mobile.auth.core.IdentityManager;
import android.support.multidex.MultiDexApplication;

public class Application extends MultiDexApplication
{
    private static final String LOG_TAG = Application.class.getSimpleName();


    @Override
    public void onCreate()
    {
        super.onCreate();
        initializeApplication();
    }

    private void initializeApplication()
    {
        AWSConfiguration awsConfiguration = new AWSConfiguration(getApplicationContext());

        // If IdentityManager is not created, create it
        if (IdentityManager.getDefaultIdentityManager() == null) {
            IdentityManager identityManager =
                    new IdentityManager(getApplicationContext(), awsConfiguration);
            IdentityManager.setDefaultIdentityManager(identityManager);
        }
    }
}
