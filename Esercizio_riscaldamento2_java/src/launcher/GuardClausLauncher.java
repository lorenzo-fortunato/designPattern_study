package launcher;

public class GuardClausLauncher {
    public static void main(String[] args) {
        System.out.println(getMessageFromArguments(args));       // cambi la configurazione degli argomenti in Run -> Edit Configuration
    }

    private static String getMessageFromArguments(String[] arguments) {
        if (arguments.length != 2) {
            return "Invalid number of arguments";
        }

        if (arguments[0].equalsIgnoreCase("name")) {
            return "Hello: " + arguments[1];
        }

        if (arguments[0].equalsIgnoreCase("age")) {
            return "Your age is: " + arguments[1];
        }

        if (arguments[0].equalsIgnoreCase("weight")) {
            return "Your weight is: " + arguments[1];
        }

        if (arguments[0].equalsIgnoreCase("height")) {
            return "Your height is: " + arguments[1];
        }

        return "Don't know how to display";
    }
}
