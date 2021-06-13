package laxminro.playground.playground_java;

import java.util.ArrayList;
import java.util.Arrays;

import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;

public class LineReaderExample {
    
    public static String prompt = "playground:lr> ";
    public static ArrayList<String> quitters = new ArrayList<String>(Arrays.asList("exit", "quit", "done", "bye"));


    public static void execute() {
        LineReader reader = LineReaderBuilder.builder().build();

        String cmd;

        do {
            cmd = reader.readLine(prompt);
            if (quitters.contains(cmd)) break;

            System.out.println("Input is: " + cmd);

        } while (true);
    }
}
