package com.company;

public class DataBase {
    public String Kaydet(Object obj){
        String Sql = "Ekleniyor" + obj.getClass().getSimpleName()+" values(" +obj.toString()+ ")";
        System.out.println(Sql);
        return Sql;
    }
}
