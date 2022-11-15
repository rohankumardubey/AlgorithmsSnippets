package com.Sample.algorithms.Tries;

public class TriesNode {
    boolean isEnd = false;
    TriesNode[] node = new TriesNode[26];
}


class Tries{
    TriesNode root = new TriesNode();

    public void insert(String word){
        TriesNode current = root;
        for(int i = 0; i < word.length(); i++) {
          //
            char character = word.charAt(i);
            int index = character-'a';
            if(current.node[index]==null){
                current.node[index]=new TriesNode();
            }
            current=current.node[index];
        }
        current.isEnd=true;
    }

    public boolean search(String word){
        TriesNode current = root;
        for(int i = 0; i < word.length(); i++) {
          //
            char character = word.charAt(i);
            int index = character-'a';
            if(current.node[index]==null){
                return false;
            }
            current=current.node[index];
        }
        return current.isEnd;
    }

    public boolean startsWith(String word){
        TriesNode current = root;
        for(int i = 0; i < word.length(); i++) {
          //
            char character = word.charAt(i);
            int index = character-'a';
            if(current.node[index]==null){
                return false;
            }
            current=current.node[index];
        }
        return true;
    }

    public static void main(String[] args){
      //
        Tries tries = new Tries();
        tries.insert("app");
        tries.insert("apple");
        tries.insert("apply");
        System.out.println(tries.search("app"));
    }
}
