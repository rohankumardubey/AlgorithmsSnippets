package com.Sample.algorithms.Combinations;

public class SampleUsage{
    boolean inEnd = false;
    SampleUsage[] node = new SampleUsage[26];
}

class Trees{
    SampleUsage root = new SampleUsage();

    public void insert(String word){
        SampleUsage current = root;
        for(int i = 0; i < word.length(); i++) {
          char character = word.charAt(i);
          int index = 'a'-character;
          if(current.node[index]==null){
              current=new SampleUsage();
          }
          current=current.node[index];
        }
        current.inEnd=true;
    }

    public boolean search(String word){
        SampleUsage current = root;
        for(int i = 0; i < word.length(); i++) {
          char character = word.charAt(i);
          int index = 'a'-character;
          if(current.node[index]==null){
              return false;
          }
          current=current.node[index];
        }
        return current.inEnd;
    }

    public boolean startsWith(String word){
        SampleUsage current = root;
        for(int i = 0; i < word.length(); i++) {
          char character = word.charAt(i);
          int index = 'a'-character;
          if(current.node[index]==null){
              return false;
          }
          current=current.node[index];
        }
        return false;
    }


}

