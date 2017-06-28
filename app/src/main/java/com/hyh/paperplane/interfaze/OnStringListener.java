package com.hyh.paperplane.interfaze;

import com.android.volley.VolleyError;

/**
 * 作者：hyh on 2017/6/28 16:18
 * github: https://github.com/hanhan1
 * QQ:549551740
 * 邮箱：hyh5878@163.com
 * 作用：
 */
public interface OnStringListener {
    /**
     * 请求成功时的回调
     * @param result
     */
    void onSuccess(String result);
    /**
     * 请求失败时的回调
     * @param error
     */

    void onError(VolleyError error);
}

