package com.teksystems.bootcamp.mysterygame.gameobjects;

public class Question {

    String question;
    String[] answerChoices;
    char correctAnswer;

    public Question(String question, String[] answerChoices, char correctAnswer) {
        this.question = question;
        this.answerChoices = answerChoices;
        this.correctAnswer = correctAnswer;
    }


}
