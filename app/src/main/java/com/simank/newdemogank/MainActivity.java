package com.simank.newdemogank;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.simank.newdemogank.Bean.GankBean;
import com.simank.newdemogank.adapter.MainRecycleAdapter;
import com.simank.newdemogank.presenter.MainPresenter;
import com.simank.newdemogank.presenter.MainPresenterImpl;
import com.simank.newdemogank.view.MainView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainView{

    private MainPresenter presenter;

    @BindView(R.id.recycleView)
    RecyclerView recyclerView;
    @BindView(R.id.myTool)
    Toolbar toolbar;
    @BindView(R.id.listView)
    ListView listView;
    @BindView(R.id.myDrawer)
    DrawerLayout drawerLayout;

    private ActionBarDrawerToggle mToggle;
    private LinearLayoutManager layoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

       initToolBar();

        initMenu();
        presenter = new MainPresenterImpl(this);

        presenter.getGankBean();


    }

    /**
     * 初始化侧滑菜单
     */
    private void initMenu() {
        //listview
        String[] str = new String[]{"meni01","menu02","menu03"};
        listView.setAdapter(new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_activated_1,str));
    }

    /**
     * 初始化toolbar
     */
    private void initToolBar() {

        toolbar.setTitle("Gank News");
        toolbar.setTitleTextColor(Color.BLUE);

        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mToggle = new ActionBarDrawerToggle(MainActivity.this,drawerLayout,toolbar,R.string.open,R.string.close){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };

        mToggle.syncState();
        drawerLayout.addDrawerListener(mToggle);
    }

    @Override
    public void getMesSuccess(GankBean bean) {

        List<GankBean.ResultsBean> list = new ArrayList<>();
        list = bean.getResults();
        Toast.makeText(MainActivity.this,list.get(1).getImages().get(0),Toast.LENGTH_SHORT).show();
        MainRecycleAdapter mAdapter = new MainRecycleAdapter(list,MainActivity.this);
        recyclerView.setAdapter(mAdapter);
        layoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

    }

    @Override
    public void getMesError(String errorMes) {
        Toast.makeText(MainActivity.this,"error"+errorMes,Toast.LENGTH_SHORT).show();
    }
}
