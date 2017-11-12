package com.siyuan.utils;

import com.siyuan.dataobject.ExcelItem;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by null on 2017/11/12.
 */

public class ExcelParse {


    public static ArrayList<ExcelItem> parseExcelStream(InputStream stream){
        ArrayList<ExcelItem> items = new ArrayList<ExcelItem>();
        ExcelItem excelItem = null;
        try {
            Workbook bookResource=Workbook.getWorkbook(stream);
            Sheet sheet1=bookResource.getSheet(0);
            int Rows=sheet1.getRows();
            int Colums=sheet1.getColumns();
            for(int i=1;i<Rows;i++){
                excelItem = new ExcelItem();
                Cell type=sheet1.getCell(0,i);
                Cell name=sheet1.getCell(1,i);
                Cell ques=sheet1.getCell(2,i);
                Cell ans=sheet1.getCell(3,i);
                Cell level=sheet1.getCell(4,i);
                Cell ansA=sheet1.getCell(5,i);
                Cell ansB=sheet1.getCell(6,i);
                Cell ansC=sheet1.getCell(7,i);
                Cell ansD=sheet1.getCell(8,i);
                Cell analy=sheet1.getCell(9,i);
                Cell show=sheet1.getCell(10,i);
                Integer typeInteger = Integer.parseInt(type.getContents().toString());
                excelItem.setItemType(typeInteger);
                excelItem.setItemName(name.getContents().toString());
                excelItem.setItemQues(ques.getContents().toString());
                excelItem.setItemAns(ans.getContents().toString());
                excelItem.setItemLevel(Integer.parseInt(level.getContents().toString()));
                excelItem.setItemAnaly(analy.getContents().toString());
                excelItem.setItemShow(Integer.parseInt(show.getContents().toString()));
                if(typeInteger == 1){
                    excelItem.setItemAnsA(ansA.getContents().toString());
                    excelItem.setItemAnsB(ansB.getContents().toString());
                    excelItem.setItemAnsC(ansC.getContents().toString());
                    excelItem.setItemAnsD(ansD.getContents().toString());
                }
                items.add(excelItem);

//                int tmpid = knowledegeServi.findIdByName("集合");
                //System.out.println(tmpid);
//				System.out.print(Ip.getContents()+" "+name.getContents());
//                map.put(Mac.getContents().toString(),name.getContents().toString());

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
        return items;
    }

    public static ArrayList<ExcelItem> parseTest(String excelPath){
//        TextMessageImpl textMessageImp = new TextMessageImpl();
//        KnowledegeImpl knowledegeImp = new KnowledegeImpl();
        ArrayList<ExcelItem> items = new ArrayList<ExcelItem>();
        ExcelItem excelItem = null;
        try {
            Workbook bookResource=Workbook.getWorkbook(new File("test.xls"));
            Sheet sheet1=bookResource.getSheet(0);
            int Rows=sheet1.getRows();
            int Colums=sheet1.getColumns();
            for(int i=1;i<Rows;i++){
                excelItem = new ExcelItem();
                Cell type=sheet1.getCell(0,i);
                Cell name=sheet1.getCell(1,i);
                Cell ques=sheet1.getCell(2,i);
                Cell ans=sheet1.getCell(3,i);
                Cell level=sheet1.getCell(4,i);
                Cell ansA=sheet1.getCell(5,i);
                Cell ansB=sheet1.getCell(6,i);
                Cell ansC=sheet1.getCell(7,i);
                Cell ansD=sheet1.getCell(8,i);
                Cell analy=sheet1.getCell(9,i);
                Cell show=sheet1.getCell(10,i);
                Integer typeInteger = Integer.parseInt(type.getContents().toString());
                excelItem.setItemType(typeInteger);
                excelItem.setItemName(name.getContents().toString());
                excelItem.setItemQues(ques.getContents().toString());
                excelItem.setItemAns(ans.getContents().toString());
                excelItem.setItemLevel(Integer.parseInt(level.getContents().toString()));
                excelItem.setItemAnaly(analy.getContents().toString());
                excelItem.setItemShow(Integer.parseInt(show.getContents().toString()));
                if(typeInteger == 1){
                    excelItem.setItemAnsA(ansA.getContents().toString());
                    excelItem.setItemAnsB(ansB.getContents().toString());
                    excelItem.setItemAnsC(ansC.getContents().toString());
                    excelItem.setItemAnsD(ansD.getContents().toString());
                }
                items.add(excelItem);

//                int tmpid = knowledegeServi.findIdByName("集合");
                //System.out.println(tmpid);
//				System.out.print(Ip.getContents()+" "+name.getContents());
//                map.put(Mac.getContents().toString(),name.getContents().toString());

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
        return items;
    }

    public static void main(String[] args){
        ExcelParse e = new ExcelParse();
//        ArrayList<ExcelItem> itesm  = e.parseTest("path");
//        for(ExcelItem i : itesm){
//            System.out.println(i);
//        }
        File file = new File("test.xls");
        try {
            FileInputStream fis = new FileInputStream(file);
            ArrayList<ExcelItem> items = parseExcelStream(fis);
            for(ExcelItem item : items){
                System.out.println(item);
            }
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }

    }
}
