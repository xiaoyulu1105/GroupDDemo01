package com.lu.groupddemo01;

/**
 * Created by dllo on 16/11/19.
 */

public class SingleView {
    private static  SingleView singleView = getInstence();
    private static SingleView getInstence(){
        if (singleView == null){
            synchronized (SingleView.class){
                if (singleView == null){
                    singleView = new SingleView();
                }
            }
        }
        return singleView;
    }
}
