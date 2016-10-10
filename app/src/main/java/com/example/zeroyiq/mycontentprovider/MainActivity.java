package com.example.zeroyiq.mycontentprovider;

import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cursor c=getContentResolver().query(ContactsContract.Contacts.CONTENT_URI,null,null,null,null);
        while(c.moveToNext()){
            System.out.println(">>>>>>>>>" +c.getString(c.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME)));
        }


    }
}
