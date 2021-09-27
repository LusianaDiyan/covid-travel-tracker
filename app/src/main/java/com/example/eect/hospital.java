package com.example.eect;

import android.os.Parcel;
import android.os.Parcelable;

public class hospital implements Parcelable {
    private String nameHos, address, call;

    protected hospital(Parcel in) {
        this.nameHos = in.readString();
        this.address = in.readString();
        this.call = in.readString();
    }

    public static final Creator<hospital> CREATOR = new Creator<hospital>() {
        @Override
        public hospital createFromParcel(Parcel in) {
            return new hospital(in);
        }

        @Override
        public hospital[] newArray(int size) {
            return new hospital[size];
        }
    };

    public hospital() {

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nameHos);
        dest.writeString(this.address);
        dest.writeString(this.call);
        //dest.writeString(this.photo);
    }

    /*public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }*/

    public String getCall() {
        return call;
    }

    public void setCall(String other) {
        this.call = other;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNameHos() {
        return nameHos;
    }

    public void setNameHos(String nameHos) {
        this.nameHos = nameHos;
    }
}
