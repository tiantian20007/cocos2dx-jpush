package org.cocos2dx.hellocpp;

import cn.jpush.android.api.JPushInterface;
import android.app.Application;
import android.util.Log;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
    	 Log.i("ssjjsy", "MyApplication onCreate");
         super.onCreate();
         JPushInterface.setDebugMode(true);
         JPushInterface.init(this);
    }
}
