package com.sheba.basicmvp;

public class MainContract {

    interface View{
        //non return Methods
        void print(String message);
        void showCountNumber(int countNum);
    }

    interface Presenter{
        //return methods
        String getMessage();
        int getCounter();
    }
}
