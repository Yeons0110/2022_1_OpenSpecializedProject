package com.example.colorandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout baseLayout;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("배경색 바꾸기");
        baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
        button1 = (Button) findViewById(R.id.button1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflatter();
        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemRed:
                baseLayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.itemBlue:
                baseLayout.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.subRotate:
                button1.setRotation(45);
                return true;
            case R.id.subSize:
                button1.setScaleX(2);
                return true;
        }
        return false;

    }

//    public boolean onCreateOptionsMenu(Menu menu){
//        super.oncreateOptionsMenu(menu);
//
//        menu.add(0,1,0,"배경색(빨강)");
//        menu.add(0,2,0,"배경색(초록)");
//        menu.add(0,3,0,"배경색(파랑)");
//
//        SubMenu sMenu = menu.addSubMenu("버튼 변경 >>");
//        sMenu.add(0,4,0,"버튼 45도 회전");
//        sMenu.add(0,5,0, '버튼 2배 확대');
//
//        return true;
//    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuinfo){
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater mInflater = getMenuInflater();
        if(v==button1){
            menu.setHeaderTitle("배경색 변경");
            mInflater.inflate(R.menu.menu1, menu);
        }
        if(v==button2){
            mInflater.inflate(R.menu.menu2, menu);
        }
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentview(R.layout.activity_main);
        setTitle("토스트 연습");

        final Button button1 = (button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast tMsg = Toast.makeText(MainActivity.this, "토스트연습",
                        Toast.LENGTH_SHORT);

                Display display = ((WindowManager) getSysteSe
            }});
    dig.setSingleChoiceItems(versionArray, 0,
            new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog, int which){
        button1.setText(versionArray[which]);
            }
    });

    public class MainActivity extends Activity{
        Textview tvName, tvemail;
        Button button1;
        EditText dIgEdtName, dIgEditEmail;
        TextView toastText;
        View dialogView, toastView;
    }

    public void onCreate(Bundle savedInstanceState){
        super.oncreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("사용자 정보 입력");

        tvName = (TextView) findViewById(R.id.tvName);
        tvEmail = (TextView) findViewById(R.id.tvemail);
        button1=(Button) findViewById(R.id.button1);
        }

        button1.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
        dialogView=(View)
        }

        });

}

