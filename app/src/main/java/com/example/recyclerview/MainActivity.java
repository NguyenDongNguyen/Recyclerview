package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvComputer;
    private ComputerAdapter computerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvComputer = findViewById(R.id.rcv_user);
        computerAdapter = new ComputerAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvComputer.setLayoutManager(linearLayoutManager);

        computerAdapter.setData(getListUser());
        rcvComputer.setAdapter(computerAdapter);
    }

    private List<Computer> getListUser() {
        List<Computer> list = new ArrayList<>();
        list.add(new Computer(R.drawable.macbook1, "computer name 1"));
        list.add(new Computer(R.drawable.macbook2, "computer name 1"));
        list.add(new Computer(R.drawable.macbook3, "computer name 1"));
        list.add(new Computer(R.drawable.macbook4, "computer name 1"));

        list.add(new Computer(R.drawable.macbook1, "computer name 1"));
        list.add(new Computer(R.drawable.macbook2, "computer name 1"));
        list.add(new Computer(R.drawable.macbook3, "computer name 1"));
        list.add(new Computer(R.drawable.macbook4, "computer name 1"));

        list.add(new Computer(R.drawable.macbook1, "computer name 1"));
        list.add(new Computer(R.drawable.macbook2, "computer name 1"));
        list.add(new Computer(R.drawable.macbook3, "computer name 1"));
        list.add(new Computer(R.drawable.macbook4, "computer name 1"));

        return list;
    }
}