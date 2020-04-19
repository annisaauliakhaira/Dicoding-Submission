package com.example.tugas.wisatasubmission;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvWisatas;
    private ArrayList<Wisata> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvWisatas = findViewById(R.id.rv_wisatas);
        rvWisatas.setHasFixedSize(true);

        list.addAll(WisatasData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList(){
        rvWisatas.setLayoutManager(new LinearLayoutManager(this));
        ListWisataAdapter listWisataAdapter = new ListWisataAdapter(MainActivity.this,list);
        rvWisatas.setAdapter(listWisataAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode) {
        switch (selectedMode){
            case R.id.action_about:
            break;
        }
    }
}
