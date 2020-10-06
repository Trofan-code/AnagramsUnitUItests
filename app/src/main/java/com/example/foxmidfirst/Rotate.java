package com.example.foxmidfirst;

import java.util.ArrayList;

public class Rotate {
    String sentenceFromUser;
    String ignoreSymbols;

    public Rotate(String sentenceFromUser, String ignoreSymbols) {
        this.sentenceFromUser = sentenceFromUser;
        this.ignoreSymbols = ignoreSymbols;
    }

    public String getSentenceFromUser() {
        return sentenceFromUser;
    }

    public void setSentenceFromUser(String sentenceFromUser) {
        this.sentenceFromUser = sentenceFromUser;
    }

    public String getIgnoreSymbols() {
        return ignoreSymbols;
    }

    public void setIgnoreSymbols(String ignoreSymbols) {
        this.ignoreSymbols = ignoreSymbols;
    }

    public Rotate() {
    }

    public String rotateWord(String sentenceFromUser, String ignoreSymbols) {
        String[] strArrStringFromUser = sentenceFromUser.split(" ");
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < strArrStringFromUser.length; i++) {
            String s = strArrStringFromUser[i];
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < ignoreSymbols.length(); k++) {
                    if (s.charAt(j) == ignoreSymbols.charAt(k)) {
                        index.add(j);
                    }
                }
            }
            char[] tempCharArr = new char[s.length()];
            tempCharArr = s.toCharArray();
            int indFirstLetter = 0;
            int indLastLetter = s.length() - 1;
            char tempChar;
            for (int k = 0; k < tempCharArr.length; k++) {
                if (thereIsIgnoreChar(indFirstLetter, index) != true && thereIsIgnoreChar(indLastLetter, index) != true) {
                    tempChar = tempCharArr[indFirstLetter];
                    tempCharArr[indFirstLetter] = tempCharArr[indLastLetter];
                    tempCharArr[indLastLetter] = tempChar;
                    indFirstLetter++;
                    indLastLetter--;
                } else if (thereIsIgnoreChar(indFirstLetter, index) == true && thereIsIgnoreChar(indLastLetter, index) != true) {
                    indFirstLetter++;
                } else if (thereIsIgnoreChar(indFirstLetter, index) != true && thereIsIgnoreChar(indLastLetter, index) == true) {
                    indLastLetter--;
                }
                if (indFirstLetter >= indLastLetter) {
                    k = tempCharArr.length;
                }
            }
             strArrStringFromUser[i] = String.copyValueOf(tempCharArr);
            index.removeAll(index);
        }
        String sentence="";
        for (int i=0;i<strArrStringFromUser.length;i++){
            sentence+=strArrStringFromUser[i]+" ";
        }
        return sentence;
    }
    private boolean thereIsIgnoreChar(int indLetter, ArrayList index) {
        boolean bool = false;
        for (int i = 0; i < index.size(); i++) {
            int x = (int) index.get(i);
            if (x == indLetter) {
                bool = true;
            }
        }
        return bool;
    }
}



