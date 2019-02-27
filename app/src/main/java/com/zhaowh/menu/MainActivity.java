package com.zhaowh.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * 当Activity创建选项菜单时候回调的方法
     * @param menu
     * @return
     *      true:用来显示菜单项
     *      false:无法显示菜单项
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //使用XML文件生成menu

        //获取菜单填充器对象
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);

        //使用java代码生成menu
        //menu.add(Menu.NONE, 4, Menu.NONE, "设置");
        return true;
    }

    /**
     * 当选项菜单中的item被选中时回调的方法
     * @param item 表示菜单项对象
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_honghong:
                allToast("红红");
                break;
            case R.id.menu_huohuo:
                allToast("火火");
                break;
            case R.id.menu_huanghuang:
                allToast("晃晃");
                break;
            case R.id.meun_huhu:
                allToast("乎乎");
                break;
            case R.id.menu_huhu_sub_first:
                allToast("乎乎 1");
                break;
            case R.id.menu_huhu_sub_second:
                allToast("乎乎 2");
                break;
            default:
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    private void allToast(String content){
        Toast.makeText(MainActivity.this, content, Toast.LENGTH_SHORT).show();
    }
}
