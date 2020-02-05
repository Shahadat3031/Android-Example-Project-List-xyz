package com.sheba.basicmvp;

public class MainPresenter implements MainContract.Presenter {

    //Return Data From Presenter

    //Logical Part
    private int count = 0;

    @Override
    public String getMessage() {
        return "This is a message for this application.";
    }

    @Override
    public int getCounter() {
        count+=1;
        return count;
    }
}
