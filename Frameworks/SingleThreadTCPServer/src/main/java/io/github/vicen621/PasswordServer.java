package io.github.vicen621;

import java.io.PrintWriter;
import java.util.Random;

public class PasswordServer extends SingleThreadTCPServer {

    public static final int PASSWORD_LENGTH = 8;

    public static void main(String[] args) {
        new PasswordServer().startLoop(args);
    }

    @Override
    public void handleMessage(String message, PrintWriter out) {
        String[] args = message.split(" ");

        if (args.length != 3) {
            out.println("Usage: <letters> <numbers> <specialCharacters>");
            return;
        }

        String letters = args[0];
        String numbers = args[1];
        String special = args[2];
        String alphaNumerical = letters + numbers;

        Random random = new Random();
        StringBuilder builder = new StringBuilder();

        builder.append(numbers.charAt(random.nextInt(numbers.length())));
        builder.append(special.charAt(random.nextInt(special.length())));
        for (int i = 0; i < PASSWORD_LENGTH - 2; i++) {
            builder.append(alphaNumerical.charAt(random.nextInt(alphaNumerical.length())));
        }

        out.println(builder);
    }
}
