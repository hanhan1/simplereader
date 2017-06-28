package com.hyh.paperplane.interfaze;

import android.content.Context;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

/**
 * 作者：hyh on 2017/6/28 16:22
 * github: https://github.com/hanhan1
 * QQ:549551740
 * 邮箱：hyh5878@163.com
 * 作用：
 */
public class StringModelImpl {
    private Context context;
    public StringModelImpl(Context context){
        this.context = context;
    }
    public void load(String url,final OnStringListener listener){
        StringRequest request  = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                listener.onSuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onError(error);
            }
        });
        VolleySingleton.getVolleySingleton(context).addToRequestQueue(request);
    }
}
