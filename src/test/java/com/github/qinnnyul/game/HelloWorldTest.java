package com.github.qinnnyul.game;

import org.junit.Test;

public class HelloWorldTest
{
    @Test
    public void should_be_able_to_say_hello_world() throws Exception
    {
        // given
        HelloWord helloWord = new HelloWord("hello world");
        // when
        helloWord.say();
        // then
    }
}
