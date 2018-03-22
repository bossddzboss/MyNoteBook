package com.example.boss.mynotebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.boss.mynotebook.model.NoteItem;

import java.util.ArrayList;

public class NoteListActivity extends AppCompatActivity {


    protected static ArrayList<NoteItem> mNoteList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_list);

        NoteItem item = new NoteItem(
                "Title",
                "Detail"
        );
        mNoteList.add(item);

        item = new NoteItem(
                "aaa",
                "bbb"
        );
        mNoteList.add(item);
        ArrayAdapter adapter = new ArrayAdapter<NoteItem>(
                this,
               // android.R.layout.simple_list_item_1//layout ที่androidมี
                R.layout.item_note,//เรียก layout
                R.id.note_title_text_view,//กำหนดให้ข้อมูลลงที่ textview
                mNoteList //เรียกตัวแปรสร้าง array
        );
        ListView noteListView = findViewById(R.id.note_list_view);

        noteListView.setAdapter(adapter);
        noteListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("NoteListActivity","Position" + position);
                Intent i = new Intent(getApplicationContext(),NoteDetailsActivity.class);
                i.putExtra("note_position",position);
                startActivity(i);
            }
        });
    }
}
