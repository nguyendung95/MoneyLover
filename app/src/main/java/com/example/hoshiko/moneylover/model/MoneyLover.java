package com.example.hoshiko.moneylover.model;


import android.os.Parcel;
import android.os.Parcelable;

import java.math.BigDecimal;

/**
 * Created by DUNG on 4/6/2018.
 */

public class MoneyLover implements Parcelable {

    private  int id;
    private String title;
    private double amount;
    private int classify;
    private String description;


    public int getId() {return  id; }
    public void setId(int id) {this.id = id; }
    //
    public String getTitle() { return title;}
    public void setTitle(String title) {
        this.title = title;
    }
    //
    //
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    //
    public int getClassify() {return classify;}
    public void setClassify (int classify) {
        this.classify = classify;
    }
    //
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.title);
        dest.writeDouble(this.amount);
        dest.writeInt(this.classify);
        dest.writeString(this.description);
    }

    public MoneyLover() {
    }

    protected MoneyLover(Parcel in) {
        this.id = in.readInt();
        this.title = in.readString();
        this.amount = in.readDouble();
        this.classify = in.readInt();
        this.description = in.readString();

    }

    public static final Parcelable.Creator<MoneyLover> CREATOR = new Parcelable.Creator<MoneyLover>() {
        @Override
        public MoneyLover createFromParcel(Parcel source) {
            return new MoneyLover(source);
        }

        @Override
        public MoneyLover[] newArray(int size) {
            return new MoneyLover[size];
        }
    };
}
