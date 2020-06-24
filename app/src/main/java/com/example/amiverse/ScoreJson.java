
package com.example.amiverse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ScoreJson {

    @SerializedName("0")
    @Expose
    private String _0;
    @SerializedName("Departement")
    @Expose
    private String departement;
    @SerializedName("1")
    @Expose
    private String _1;
    @SerializedName("GoldMedal")
    @Expose
    private String goldMedal;
    @SerializedName("2")
    @Expose
    private String _2;
    @SerializedName("SilverMedal")
    @Expose
    private String silverMedal;
    @SerializedName("3")
    @Expose
    private String _3;
    @SerializedName("BronzeMedal")
    @Expose
    private String bronzeMedal;
    @SerializedName("4")
    @Expose
    private String _4;
    @SerializedName("Score")
    @Expose
    private String score;

    public String get0() {
        return _0;
    }

    public void set0(String _0) {
        this._0 = _0;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String get1() {
        return _1;
    }

    public void set1(String _1) {
        this._1 = _1;
    }

    public String getGoldMedal() {
        return goldMedal;
    }

    public void setGoldMedal(String goldMedal) {
        this.goldMedal = goldMedal;
    }

    public String get2() {
        return _2;
    }

    public void set2(String _2) {
        this._2 = _2;
    }

    public String getSilverMedal() {
        return silverMedal;
    }

    public void setSilverMedal(String silverMedal) {
        this.silverMedal = silverMedal;
    }

    public String get3() {
        return _3;
    }

    public void set3(String _3) {
        this._3 = _3;
    }

    public String getBronzeMedal() {
        return bronzeMedal;
    }

    public void setBronzeMedal(String bronzeMedal) {
        this.bronzeMedal = bronzeMedal;
    }

    public String get4() {
        return _4;
    }

    public void set4(String _4) {
        this._4 = _4;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

}
