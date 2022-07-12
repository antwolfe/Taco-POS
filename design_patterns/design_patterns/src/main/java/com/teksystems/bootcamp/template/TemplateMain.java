package com.teksystems.bootcamp.template;

public class TemplateMain {

    public static void main(String[] args) {
        OriginalStory original = new OriginalStory();
        MadLibStory madLib = new MadLibStory();

        original.tellMeAStory();
        System.out.println();
        System.out.println("-----VS-----");
        System.out.println();
        madLib.tellMeAStory();
    }
}
