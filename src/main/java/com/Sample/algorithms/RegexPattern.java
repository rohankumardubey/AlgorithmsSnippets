package com.Sample.algorithms;

import java.util.HashMap;
import java.util.Set;

public class RegexPattern {
    public static void main(String[] args){
      //

        HashMap<String,String> map = new HashMap<>();

        map.put("struct_column","StructField(struct_column,StructType(StructField(key1,StringType,true), StructField(key2,StringType,true), StructField(keyn,StringType,true)),true)");
        map.put("struct_column2","StructField(struct_column2,StructType(StructField(key1,StringType,true), StructField(key2,IntegerType,true)),true)");
        Set<String> keyValues = map.keySet();
        for(String field:keyValues){

        }
    }

    public static String parse(String value){

    }
}
