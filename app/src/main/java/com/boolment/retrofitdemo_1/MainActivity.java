package com.boolment.retrofitdemo_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    private List<CategoryBeans> catNames;

    private ApiInterface apiInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);


        //in this create method we have to pass the interface class name;
        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);

        Call<List<CategoryBeans>> call = apiInterface.getCategory();

        call.enqueue(new Callback<List<CategoryBeans>>() {

            //these 2 methods are executed on main ui thread.
//we can publish the result to the recycler view from this method.
            @Override
            public void onResponse(Call<List<CategoryBeans>> call, Response<List<CategoryBeans>> response) {

//this will return result to list called catNames;
                catNames = response.body();

                //now here we will call our custom adapter from here.
                adapter = new CategoryAdaptor(catNames);

                //now set adaptor for recycler view
                recyclerView.setAdapter(adapter);



            }

            @Override
            public void onFailure(Call<List<CategoryBeans>> call, Throwable t) {



            }
        });

    }
}
