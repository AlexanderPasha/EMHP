package com.mannydev.exmohelper.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mannydev.exmohelper.model.Coins.Bitcoin;

import java.util.ArrayList;

/**
 * Created by manny on 19.01.18.
 */

public class Rates {
    @SerializedName("list")
    @Expose
    private ArrayList<Coin> list;

    public ArrayList<Coin> getList() {
        return list;
    }

    public void setList(ArrayList<Coin> list) {
        this.list = list;
    }
}
