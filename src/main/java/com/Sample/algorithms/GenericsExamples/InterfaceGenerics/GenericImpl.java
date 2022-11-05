package com.Sample.algorithms.GenericsExamples.InterfaceGenerics;

public class GenericImpl implements GenericSample<String,Integer> {

    @Override
    public Integer genericValOne(String str){
        if(str.equals(null)){
            return 1;
        }
        else{
            return 0;
        }

    }

    @Override
    public String genericValTwo(Integer val){
        if(val!=0){
            return "not zero";
        }
        else{
            return "may be zero";
        }
    }

    public static void main(String[] args){
      //
        GenericImpl impl = new GenericImpl();
        Integer intval =impl.genericValOne("hi");
        String str =impl.genericValTwo(2);

        System.out.println(str);
        System.out.println(intval);
    }
}
