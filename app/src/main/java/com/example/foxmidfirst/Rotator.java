package com.example.foxmidfirst;


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
                if (!ignoreSymbols.contains(String.valueOf(oneWordFromUserSentence.charAt(indFirstLetter))) && !ignoreSymbols.contains(String.valueOf(oneWordFromUserSentence.charAt(indLastLetter)))) {
                    tempChar = tempCharArr[indFirstLetter];
                    tempCharArr[indFirstLetter] = tempCharArr[indLastLetter];
                    tempCharArr[indLastLetter] = tempChar;
                    indFirstLetter++;
                    indLastLetter--;
                } else if (ignoreSymbols.contains(String.valueOf(oneWordFromUserSentence.charAt(indFirstLetter))) && !ignoreSymbols.contains(String.valueOf(oneWordFromUserSentence.charAt(indLastLetter)))) {
                    indFirstLetter++;
                } else if (!ignoreSymbols.contains(String.valueOf(oneWordFromUserSentence.charAt(indFirstLetter))) && ignoreSymbols.contains(String.valueOf(oneWordFromUserSentence.charAt(indLastLetter)))) {
                    indLastLetter--;
                }
                if (indFirstLetter >= indLastLetter) {
                    k = tempCharArr.length;
                }
            }
            wordsFromIncomingSentence[i] = String.copyValueOf(tempCharArr);
        }
        String sentence = "";
        for (int i = 0; i < wordsFromIncomingSentence.length; i++) {
            sentence += wordsFromIncomingSentence[i] + " ";
        }
        sentence.trim();
        return sentence;
    }
}

