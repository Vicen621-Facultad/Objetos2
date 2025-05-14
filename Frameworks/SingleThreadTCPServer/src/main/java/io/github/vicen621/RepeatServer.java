package io.github.vicen621;

import java.io.PrintWriter;

public class RepeatServer extends SingleThreadTCPServer {

    public static void main(String[] args) {
        new RepeatServer().startLoop(args);
    }

    @Override
    public void handleMessage(String message, PrintWriter out) {
        String[] args = message.split(" ");

        if (args.length < 2) {
            out.println("Usage: <string> <number> [<character>]");
            return;
        }

        int number = 0;
        try {
            number = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            out.println("Invalid number: " + args[1]);
        }
        String delimiter = " ";
        if (args.length > 2) {
            delimiter = args[2];
        }

        String[] strings = args[0].split(delimiter);

        for (String string : strings) {
            out.println(string.repeat(number));
        }
    }
}
