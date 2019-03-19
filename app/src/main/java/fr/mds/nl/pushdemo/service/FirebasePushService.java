package fr.mds.nl.pushdemo.service;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class FirebasePushService extends FirebaseMessagingService {

    private static final String TAG = "firebasepushservice";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, "onMessageReceived " + remoteMessage.toString());
    }

    @Override
    public void onNewToken(String s) {
        Log.d(TAG, "onNewToken " + s);
    }
}
