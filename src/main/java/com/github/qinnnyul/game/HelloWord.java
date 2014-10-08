package com.github.qinnnyul.game;

public class HelloWord
{
    private final String words;

    public HelloWord(String words)
    {
        this.words = words;
    }

    public void say()
    {
        System.out.println(this.words);
    }
}
