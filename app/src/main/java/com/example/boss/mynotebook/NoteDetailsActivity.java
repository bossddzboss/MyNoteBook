package com.example.boss.mynotebook;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.boss.mynotebook.model.NoteItem;

import static com.example.boss.mynotebook.NoteListActivity.mNoteList;

public class NoteDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_details);

        Intent i = getIntent();
        int notePosition = i.getIntExtra("note_position",-1);

        NoteItem noteItem = mNoteList.get(notePosition);

        ActionBar ab = getSupportActionBar();
        ab.setTitle(noteItem.title);

        TextView noteDetailTextView = findViewById(R.id.note_details_text_view);
        noteDetailTextView.setText(noteItem.detail);
}
}
