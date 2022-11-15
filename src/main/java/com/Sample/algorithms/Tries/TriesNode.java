package com.Sample.algorithms.Tries;

public class TriesUsage {

    boolean isEnd = false;
    TriesUsage[] nodes = new TriesUsage[26];
}

class TriesImpl{
    TriesUsage root = new TriesUsage();

    public void insert(String word){
        TriesUsage current = root;
        for(int i = 0; i < word.length(); i++) {
          //
            char character = word.charAt(i);
            int index = character-'a';
            if(current.nodes[index]==null){
                current.nodes[index]=new TriesUsage();
            }
            current=current.nodes[index];
        }
        current.isEnd=true;
    }

    public boolean search(String word){
        TriesUsage current = root;
        for(int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            int index = character-'a';
            if(current.nodes[index]==null){
                return false;
            }
            current=current.nodes[index];
          //
        }
        return current.isEnd;
    }


    public static void main(String[] args){
      //

        TriesImpl trie = new TriesImpl();
        trie.insert("sample");
        trie.insert("duck");
        trie.insert("elephant");
        trie.insert("sampl");
        System.out.println(trie.search("sampl"));
        System.out.println(trie.search("elephant"));
    }
}
