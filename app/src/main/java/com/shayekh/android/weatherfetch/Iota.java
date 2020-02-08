package com.shayekh.android.weatherfetch;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Iota {

    @SerializedName("Group A")
    @Expose
    private String groupA;
    @SerializedName("Group B")
    @Expose
    private String groupB;
    @SerializedName("Group C")
    @Expose
    private String groupC;
    @SerializedName("Group D")
    @Expose
    private String groupD;
    @SerializedName("Group E")
    @Expose
    private String groupE;
    @SerializedName("Group F")
    @Expose
    private String groupF;
    @SerializedName("Group G")
    @Expose
    private String groupG;

    public String getGroupA() {
        return groupA;
    }

    public void setGroupA(String groupA) {
        this.groupA = groupA;
    }

    public String getGroupB() {
        return groupB;
    }

    public void setGroupB(String groupB) {
        this.groupB = groupB;
    }

    public String getGroupC() {
        return groupC;
    }

    public void setGroupC(String groupC) {
        this.groupC = groupC;
    }

    public String getGroupD() {
        return groupD;
    }

    public void setGroupD(String groupD) {
        this.groupD = groupD;
    }

    public String getGroupE() {
        return groupE;
    }

    public void setGroupE(String groupE) {
        this.groupE = groupE;
    }

    public String getGroupF() {
        return groupF;
    }

    public void setGroupF(String groupF) {
        this.groupF = groupF;
    }

    public String getGroupG() {
        return groupG;
    }

    public void setGroupG(String groupG) {
        this.groupG = groupG;
    }

}
