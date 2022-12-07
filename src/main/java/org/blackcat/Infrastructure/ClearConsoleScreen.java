package org.blackcat.Infrastructure;

public class ClearConsoleScreen {
    public static void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
