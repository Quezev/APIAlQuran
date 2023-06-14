package com.example.apilatih;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;

import com.example.apilatih.model.Chapters;
import com.example.apilatih.model.ChaptersItem;
import com.example.apilatih.retrofit.ApiService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private AdapterMain adapter;
    private RecyclerView recyclerView;
    private List<ChaptersItem> results = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDataFromApi();
        setUpView();
        setUpRecycleview();
    }

    private void setUpRecycleview() {
        adapter = new AdapterMain(results);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void setUpView() {
        recyclerView = findViewById(R.id.recycle);
    }

    private void getDataFromApi(){
        ApiService.endpoint().getSurah().enqueue(new Callback<Chapters>() {
            @Override
            public void onResponse(Call<Chapters> call, Response<Chapters> response) {
                if (response.isSuccessful()){
                    List<ChaptersItem> result = response.body().getChapters();
                    Log.d("Main", result.toString());
                    adapter.setData(result);
                }
            }

            @Override
            public void onFailure(Call<Chapters> call, Throwable t) {
                Log.d("ErrorMain", toString());

            }
        });
    }
}