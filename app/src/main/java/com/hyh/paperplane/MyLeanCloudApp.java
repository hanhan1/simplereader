package com.hyh.paperplane;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.avos.avoscloud.AVException;
import com.avos.avoscloud.AVOSCloud;
import com.avos.avoscloud.AVObject;
import com.avos.avoscloud.SaveCallback;

/**
 * 作者：hyh on 2017/6/27 15:59
 * github: https://github.com/hanhan1
 * QQ:549551740
 * 邮箱：hyh5878@163.com
 * 作用：
 */
public class MyLeanCloudApp extends AppCompatActivity {
    private static String AppId = "y6BXVQlKPYmiSsTkShFwSjOn-gzGzoHsz";
    private static String AppKey = "AN8eR42JGDrdqgbKShr8o60m";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AVOSCloud.initialize(this,AppId,AppKey);
        //发布前关闭
        AVOSCloud.setDebugLogEnabled(true);
        AVObject testObject = new AVObject("TestObject");
        testObject.put("words","hello world");
        testObject.saveInBackground(new SaveCallback() {
            @Override
            public void done(AVException e) {
                if (e == null){
                    Log.d("saved","success");
                }
            }
        });
    }
}
