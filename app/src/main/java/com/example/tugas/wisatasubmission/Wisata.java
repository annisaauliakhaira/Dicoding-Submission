package com.example.tugas.wisatasubmission;

import android.os.Parcel;
import android.os.Parcelable;

public class Wisata implements Parcelable {
    private String name;
    private String detail;
    private int photo;

    public  Wisata(){

    }

    protected Wisata(Parcel in) {
        name = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Wisata> CREATOR = new Creator<Wisata>() {
        @Override
        public Wisata createFromParcel(Parcel in) {
            return new Wisata(in);
        }

        @Override
        public Wisata[] newArray(int size) {
            return new Wisata[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.photo);
        dest.writeString(this.detail);
        dest.writeString(this.name);
    }


}
