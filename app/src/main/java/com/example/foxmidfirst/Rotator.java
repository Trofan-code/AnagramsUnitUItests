package com.example.foxmidfirst;

import java.util.ArrayList;

public class Rotator {

    public String rotateWord(String sentenceFromUser, String ignoreSymbols) {
        String[] wordsFromIncomingSentence = sentenceFromUser.split(" ");
        ArrayList<Integer> indexesOfTheIgnoreChars = new ArrayList<>();
        for (int i = 0; i < wordsFromIncomingSentence.length; i++) {
            String s = wordsFromIncomingSentence[i];
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < ignoreSymbols.length(); k++) {
                    if (s.charAt(j) == ignoreSymbols.charAt(k)) {
                        indexesOfTheIgnoreChars.add(j);
                    }
                }
            }
            char[] tempCharArr = new char[s.length()];
            tempCharArr = s.toCharArray();
            int indFirstLetter = 0;
            int indLastLetter = s.length() - 1;
            char tempChar;
            for (int k = 0; k < tempCharArr.length; k++) {
                if (thereIsIgnoreChar(indFirstLetter, indexesOfTheIgnoreChars) != true && thereIsIgnoreChar(indLastLetter, indexesOfTheIgnoreChars) != true) {
                    tempChar = tempCharArr[indFirstLetter];
                    tempCharArr[indFirstLetter] = tempCharArr[indLastLetter];
                    tempCharArr[indLastLetter] = tempChar;
                    indFirstLetter++;
                    indLastLetter--;
                } else if (thereIsIgnoreChar(indFirstLetter, indexesOfTheIgnoreChars) == true && thereIsIgnoreChar(indLastLetter, indexesOfTheIgnoreChars) != true) {
                    indFirstLetter++;
                } else if (thereIsIgnoreChar(indFirstLetter, indexesOfTheIgnoreChars) != true && thereIsIgnoreChar(indLastLetter, indexesOfTheIgnoreChars) == true) {
                    indLastLetter--;
                }
                if (indFirstLetter >= indLastLetter) {
                    k = tempCharArr.length;
                }
            }
             wordsFromIncomingSentence[i] = String.copyValueOf(tempCharArr);
            indexesOfTheIgnoreChars.removeAll(indexesOfTheIgnoreChars);
        }
        String sentence="";
        for (int i=0;i<wordsFromIncomingSentence.length;i++){
            sentence+=wordsFromIncomingSentence[i]+" ";

        }
        sentence.trim();
        return  sentence;
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



