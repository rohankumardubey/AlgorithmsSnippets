package com.Sample.algorithms.strings;

public class SubString {
    public static void main(String[] args){
      //
        String str1= "wertydhllkllpolicepolicpoliceshgfyrtys";
        String str2="polices";
      System.out.println(findIndex(str1,str2));
    }
    public static int findIndex(String str1,String str2){
        int counter=0;
        int temp=0;
        for(int i=0;i<str1.length();i++){
            if(counter<str2.length()){
                if(str1.charAt(i)==str2.charAt(counter)){
                    temp=i;
                    counter++;
                }
            }
        }
        if(counter==str2.length()){
            return temp-str2.length()+1;
        }
        return -1;
    }
}
