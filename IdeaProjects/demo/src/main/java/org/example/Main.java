package com.devdaily.javasamples;

/**
 * Demonstrates invalid static references to an instance variables
 * and instance method.
 * Created by Alvin Alexander, http://devdaily.com.
 */
public class StaticReferenceExample
{

    // a sample instance variable
    private String foo = "foo";

    // a sample instance method
    private void doFoo()
    {
    }

    // main is a static method
    public static void main(String[] args)
    {
        // creates this error: Cannot make a static reference to the non-static field foo
        foo = "bar";

        // creates this error: Cannot make a static reference to the non-static method doFoo
        doFoo();
    }
}