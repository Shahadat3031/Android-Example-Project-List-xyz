package com.sheba.recyclerview.multipleViewtypes;

import com.sheba.recyclerview.multipleViewtypes.model.MultiEmployee;

import java.util.ArrayList;

class MultipleViewContract {

    interface View {
        void initView();

        void createList();
    }

    interface Presenter {
        ArrayList<MultiEmployee> getMultipleEmployee();
    }

}
