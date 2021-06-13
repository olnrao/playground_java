package laxminro.playground.playground_java;

import java.io.IOException;

import laxminro.playground.playground_java.ReadLineExample;
import laxminro.playground.playground_java.LineReaderExample;

public class App 
{
    public static void main( String[] args ) {
        System.out.println("Playground: Loading ..." );

        try {
            LineReaderExample.execute();
        }
        catch(RuntimeException ex) {
            System.out.println("Playground: Failed ~ " + ex);
        }
        finally {
            
        }
    }
}
