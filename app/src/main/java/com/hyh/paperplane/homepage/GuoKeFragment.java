package com.hyh.paperplane.homepage;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 作者：hyh on 2017/6/28 15:49
 * github: https://github.com/hanhan1
 * QQ:549551740
 * 邮箱：hyh5878@163.com
 * 作用：
 */
public class GuoKeFragment extends Fragment implements GuoKeContract.View{

    public GuoKeFragment(){}

    public static GuoKeFragment newInstance(){
        return new GuoKeFragment();
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
    public void showErroe() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void showPickDialog() {

    }

    @Override
    public void setPresenter(GuoKeContract.Presenter presenter) {

    }

    @Override
    public void initView(View view) {

    }
}
