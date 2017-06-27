package com.hyh.paperplane;

import android.view.View;

/**
 * 作者：hyh on 2017/6/16 10:02
 * github: https://github.com/hanhan1
 * QQ:549551740
 * 邮箱：hyh5878@163.com
 * 作用：
 */
public interface BaseView<T> {
    void setPresenter(T presenter);
    void initView(View view);
}
