package com.example.boss.mynotebook.model;

/**
 * Created by Boss$ on 21-Mar-18.
 */

public class NoteItem {
    public final String title;
    public final String detail;

    public NoteItem(String title, String detail) {
        this.title = title;
        this.detail = detail;

    }

    @Override
    public String toString() {
        return title;
    }
}
