package com.siyuan.dataobject;

public class ExcelItem {
    private Integer itemType;
    private String itemName;
    private Integer itemNameInteger;

    private String itemQues;
    private String itemAns;
    private Integer itemLevel;
    private String itemAnsA;
    private String itemAnsB;
    private String itemAnsC;
    private String itemAnsD;
    private String itemAnaly;
    private Integer itemShow;

    public ExcelItem() {
    }

    public ExcelItem(Integer itemType, String itemName, String itemQues, String itemAns, Integer itemLevel, String itemAnaly, Integer itemShow) {
        this.itemType = itemType;
        this.itemName = itemName;
        this.itemQues = itemQues;
        this.itemAns = itemAns;
        this.itemLevel = itemLevel;
        this.itemAnaly = itemAnaly;
        this.itemShow = itemShow;
    }

    public ExcelItem(Integer itemType, String itemName, String itemQues, String itemAns, Integer itemLevel, String itemAnsA, String itemAnsB, String itemAnsC, String itemAnsD, String itemAnaly, Integer itemShow) {
        this.itemType = itemType;
        this.itemName = itemName;
        this.itemQues = itemQues;
        this.itemAns = itemAns;
        this.itemLevel = itemLevel;
        this.itemAnsA = itemAnsA;
        this.itemAnsB = itemAnsB;
        this.itemAnsC = itemAnsC;
        this.itemAnsD = itemAnsD;
        this.itemAnaly = itemAnaly;
        this.itemShow = itemShow;
    }

    @Override
    public String toString() {
        return "ExcelItem{" +
                "itemType=" + itemType +
                ", itemName='" + itemName + '\'' +
                ", itemQues='" + itemQues + '\'' +
                ", itemAns='" + itemAns + '\'' +
                ", itemLevel=" + itemLevel +
                ", itemAnsA='" + itemAnsA + '\'' +
                ", itemAnsB='" + itemAnsB + '\'' +
                ", itemAnsC='" + itemAnsC + '\'' +
                ", itemAnsD='" + itemAnsD + '\'' +
                ", itemAnaly='" + itemAnaly + '\'' +
                ", itemShow=" + itemShow +
                '}';
    }

    public Integer getItemType() {
        return itemType;
    }

    public void setItemType(Integer itemType) {
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemQues() {
        return itemQues;
    }

    public void setItemQues(String itemQues) {
        this.itemQues = itemQues;
    }

    public String getItemAns() {
        return itemAns;
    }

    public void setItemAns(String itemAns) {
        this.itemAns = itemAns;
    }

    public Integer getItemLevel() {
        return itemLevel;
    }

    public void setItemLevel(Integer itemLevel) {
        this.itemLevel = itemLevel;
    }

    public String getItemAnsA() {
        return itemAnsA;
    }

    public void setItemAnsA(String itemAnsA) {
        this.itemAnsA = itemAnsA;
    }

    public String getItemAnsB() {
        return itemAnsB;
    }

    public void setItemAnsB(String itemAnsB) {
        this.itemAnsB = itemAnsB;
    }

    public String getItemAnsC() {
        return itemAnsC;
    }

    public void setItemAnsC(String itemAnsC) {
        this.itemAnsC = itemAnsC;
    }

    public String getItemAnsD() {
        return itemAnsD;
    }

    public void setItemAnsD(String itemAnsD) {
        this.itemAnsD = itemAnsD;
    }

    public String getItemAnaly() {
        return itemAnaly;
    }

    public void setItemAnaly(String itemAnaly) {
        this.itemAnaly = itemAnaly;
    }

    public Integer getItemShow() {
        return itemShow;
    }

    public void setItemShow(Integer itemShow) {
        this.itemShow = itemShow;
    }

    public Integer getItemNameInteger() {
        return itemNameInteger;
    }

    public void setItemNameInteger(Integer itemNameInteger) {
        this.itemNameInteger = itemNameInteger;
    }
}
