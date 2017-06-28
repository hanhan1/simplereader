package com.hyh.paperplane.homepage;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 作者：hyh on 2017/6/28 15:50
 * github: https://github.com/hanhan1
 * QQ:549551740
 * 邮箱：hyh5878@163.com
 * 作用：
 */
public class DouBanMomentFragment extends Fragment implements DouBanMomentContract.View{

    public DouBanMomentFragment(){}

    public static DouBanMomentFragment newInstance(){
        return new DouBanMomentFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return null;
    }

    @Override
    public void showError() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void showResults() {

    }

    @Override
    public void showPickDialog() {

    }

    @Override
    public void setPresenter(DouBanMomentContract.Presenter presenter) {

    }

    @Override
    public void initView(View view) {

    }
}
