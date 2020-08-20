package com.example.jackknife.bean;

import androidx.databinding.BaseObservable;

public class Menu extends BaseObservable {

    int id;
    String title;
    String path;

    public Menu(int id, String title, String path) {
        this.id = id;
        this.title = title;
        this.path = path;
    }

    /**
     * {@link android.widget.TextView#setText(int)} )}时，如果给这个id，会招不到值，报错，因为这个id不是资
     * 源id。
     *
     * @return
     */
    public String getId() {
        return String.valueOf(id);
    }

    public String getTitle() {
        return title;
    }

    public String getPath() {
        return path;
    }
}
