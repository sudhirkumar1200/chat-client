package com.paulina.chatclient;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by pramos on 2/18/15.
 */
public class ChatApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models here
        ParseObject.registerSubclass(Message.class);

        // Add your initialization code here
        Parse.initialize(this, "RL9fw6QDltcua2bQdmTaj8NdXPXtn0gmQYzXSmjN", "dcwCP8bj9OqpTvpjDle3ld1qTjuTRDdSb51Ot5QK");

        // Test creation of object
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }
}