package com.hyh.paperplane.homepage;

import com.hyh.paperplane.BasePresenter;
import com.hyh.paperplane.BaseView;

/**
 * 作者：hyh on 2017/6/28 15:43
 * github: https://github.com/hanhan1
 * QQ:549551740
 * 邮箱：hyh5878@163.com
 * 作用：
 */
public class DouBanMomentContract {
    interface View extends BaseView<Presenter>{
        void showError();
        void showLoading();
        void stopLoading();
        void showResults();
        void showPickDialog();
    }

    interface Presenter extends BasePresenter {
        void  loadPosts(long date, boolean clearing);
        void  refresh();
        void  loadMore(long date);

    }
}
