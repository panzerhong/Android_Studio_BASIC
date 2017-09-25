package com.example.yinma.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent i ;
        switch (item.getItemId()){
            case R.id.about:
                Toast.makeText(this, "About Us is clicked", Toast.LENGTH_SHORT).show();
                i = new Intent(MainActivity.this,about_us.class);
                startActivity(i);
                return true;
            case R.id.contact:
                Toast.makeText(this,"Contact Us is clicked",Toast.LENGTH_SHORT).show();
                i = new Intent(MainActivity.this,contact_us.class);
                startActivity(i);
                return true;
            case R.id.settingid:
                Toast.makeText(this,"Setting is clicked",Toast.LENGTH_SHORT).show();
                i = new Intent(MainActivity.this,setting.class);
                startActivity(i);
            }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
