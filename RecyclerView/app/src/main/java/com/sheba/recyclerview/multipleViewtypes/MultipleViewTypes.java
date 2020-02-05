package com.sheba.recyclerview.multipleViewtypes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.sheba.recyclerview.R;
import com.sheba.recyclerview.multipleViewtypes.adapter.MultipleTypeAdapter;
import com.sheba.recyclerview.multipleViewtypes.model.MultiEmployee;

import java.util.ArrayList;

public class MultipleViewTypes extends AppCompatActivity implements MultipleViewContract.View {

    RecyclerView recyclerView;
    MultipleViewContract.Presenter multiplePresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_view_types);

        multiplePresenter = new MultipleViewPresenter();

        initView();

    }

    @Override
    public void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        createList();
    }

    @Override
    public void createList() {

        /*ArrayList<MultiEmployee> employees = new ArrayList<>();

        MultiEmployee employee = new MultiEmployee();
        employee.setName("Robert");
        employee.setAddress("New York");
        employee.setPhone("+61234456");
        employees.add(employee);

        employee = new MultiEmployee();
        employee.setName("Tom");
        employee.setAddress("California");
        employee.setEmail("tom_frank@gmail.com");
        employees.add(employee);

        employee = new MultiEmployee();
        employee.setName("Smith");
        employee.setAddress("Philadelphia");
        employee.setEmail("smith_carrol@gmail.com");
        employees.add(employee);

        employee = new MultiEmployee();
        employee.setName("Ryan");
        employee.setAddress("Canada");
        employee.setPhone("+612001456");
        employees.add(employee);

        employee = new MultiEmployee();
        employee.setName("Mark");
        employee.setAddress("Boston");
        employee.setEmail("mark_walmerd@gmail.com");
        employees.add(employee);

        employee = new MultiEmployee();
        employee.setName("Adam");
        employee.setAddress("Brooklyn");
        employee.setPhone("+61211780");
        employees.add(employee);

        employee = new MultiEmployee();
        employee.setName("Kevin");
        employee.setAddress("New Jersey");
        employee.setPhone("+94221035");
        employees.add(employee);
*/
        ArrayList<MultiEmployee> em = multiplePresenter.getMultipleEmployee();

        // set adapter
        MultipleTypeAdapter adapter = new MultipleTypeAdapter(this, em);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }
}
