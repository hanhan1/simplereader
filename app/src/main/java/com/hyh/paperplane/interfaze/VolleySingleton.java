package com.hyh.paperplane.interfaze;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * 作者：hyh on 2017/6/28 16:12
 * github: https://github.com/hanhan1
 * QQ:549551740
 * 邮箱：hyh5878@163.com
 * 作用：
 */
public class VolleySingleton {

    private static VolleySingleton volleySingleton;
    private RequestQueue requestQueue;
    private VolleySingleton(Context context){
        requestQueue = Volley.newRequestQueue(context.getApplicationContext());
    }

    public static synchronized VolleySingleton getVolleySingleton(Context context){
        if(volleySingleton == null){
            volleySingleton = new VolleySingleton(context);
        }
        return volleySingleton;
    }
    public RequestQueue getRequestQueue(){
        return this.requestQueue;
    }

    public <T> void addToRequestQueue(Request<T> req){
        getRequestQueue().add(req);
    }
}
