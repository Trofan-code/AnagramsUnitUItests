package com.example.foxmidfirst;

import java.util.ArrayList;

public class Rotator {

    public String rotateWord(String sentenceFromUser, String ignoreSymbols) {
        String[] wordsFromIncomingSentence = sentenceFromUser.split(" ");
        for (int i = 0; i < wordsFromIncomingSentence.length; i++) {
            String oneWordFromUserSentence = wordsFromIncomingSentence[i];
            char[] tempCharArr = new char[oneWordFromUserSentence.length()];
            tempCharArr = oneWordFromUserSentence.toCharArray();
            int indFirstLetter = 0;
            int indLastLetter = oneWordFromUserSentence.length() - 1;
            char tempChar;
            for (int k = 0; k < tempCharArr.length; k++) {
                if (thereIsIgnoreChar(oneWordFromUserSentence.charAt(indFirstLetter), ignoreSymbols) != true && thereIsIgnoreChar(oneWordFromUserSentence.charAt(indLastLetter), ignoreSymbols) != true) {
                    tempChar = tempCharArr[indFirstLetter];
                    tempCharArr[indFirstLetter] = tempCharArr[indLastLetter];
                    tempCharArr[indLastLetter] = tempChar;
                    indFirstLetter++;
                    indLastLetter--;
                } else if (thereIsIgnoreChar(oneWordFromUserSentence.charAt(indFirstLetter), ignoreSymbols) == true && thereIsIgnoreChar(oneWordFromUserSentence.charAt(indLastLetter), ignoreSymbols) != true) {
                    indFirstLetter++;
                } else if (thereIsIgnoreChar(oneWordFromUserSentence.charAt(indFirstLetter), ignoreSymbols) != true && thereIsIgnoreChar(oneWordFromUserSentence.charAt(indLastLetter), ignoreSymbols) == true) {
                    indLastLetter--;
                }
                if (indFirstLetter >= indLastLetter) {
                    k = tempCharArr.length;
                }
            }
            wordsFromIncomingSentence[i] = String.copyValueOf(tempCharArr);
            //indexesOfTheIgnoreChars.removeAll(indexesOfTheIgnoreChars);
        }
        String sentence = "";
        for (int i = 0; i < wordsFromIncomingSentence.length; i++) {
            sentence += wordsFromIncomingSentence[i] + " ";
        }
        sentence.trim();
        return sentence;
    }

    private boolean thereIsIgnoreChar(char charFromWord, String ignore) {
        boolean bool = false;
        if (ignore.contains(String.valueOf(charFromWord))) {
            bool = true;
        }
        return bool;
    }
}