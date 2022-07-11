package com.teksystems.bootcamp.template;

public class TemplateMain {

    public static void main(String[] args) {
        OriginalStory original = new OriginalStory();
        MadLibStory madLib = new MadLibStory();

        madLib.tellMeAStory();
    }
}
