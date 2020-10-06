package com.example.json1;

import com.google.gson.annotations.SerializedName;

public class Company {
    @SerializedName("name")
    public String companyName;
    @SerializedName("year")
    public int companyYear;
    @SerializedName("recentUpdate")
    public String companyRecentUpdate;

    public String getCompanyName() {return companyName;}

    public int getCompanyYear(){return companyYear;}

    public String getCompanyRecentUpdate(){return companyRecentUpdate;}

    public Company(String name, int year, String update){
        companyName = name;
        companyYear = year;
        companyRecentUpdate = update;
    }
}
