/**
 * Created by Joe on 7/23/2014.
 */
package com.notifications.app;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;

import com.notifications.app.R;

public class NotificationView extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);

        //---look up the notification manager service-----
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        //---cancel the notification that we started ---
        nm.cancel(getIntent().getExtras().getInt("notificationID"));
    }
}
