package com.teksystems.bootcamp.mysterygame.gameobjects;

public class Quiz {

 final Question[] questions;
  final String[] answerChoices = new String[]{"the butler", "the bookkeeper", "mac", "the dog"};

  public Quiz() {
    questions = new Question[]{
            new Question("Who tracked in the dirt?",
                    answerChoices,
                    'D'),

            new Question("Who made the mysterious phone call?",
                    answerChoices,
                    'B'),

            new Question("Who is trying to change their career?",
                    answerChoices,
                    'A'),

            new Question("Who's real name is unknown?",
                    answerChoices,
                    'C'),

            new Question("Who stole the maze?",
                    answerChoices,
                    'D')
    };
  }

  public static Question[] getQuestions() {
    return questions;
  }

  public String[] getAnswerChoices() {
    return answerChoices;
  }


}
