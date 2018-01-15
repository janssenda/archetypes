#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.io;

public class ConsoleColors {
    // Reset
    public static final String RESET = "${symbol_escape}033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "${symbol_escape}033[0;30m";   // BLACK
    public static final String RED = "${symbol_escape}033[0;31m";     // RED
    public static final String GREEN = "${symbol_escape}033[0;32m";   // GREEN
    public static final String YELLOW = "${symbol_escape}033[0;33m";  // YELLOW
    public static final String BLUE = "${symbol_escape}033[0;34m";    // BLUE
    public static final String PURPLE = "${symbol_escape}033[0;35m";  // PURPLE
    public static final String CYAN = "${symbol_escape}033[0;36m";    // CYAN
    public static final String WHITE = "${symbol_escape}033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "${symbol_escape}033[1;30m";  // BLACK
    public static final String RED_BOLD = "${symbol_escape}033[1;31m";    // RED
    public static final String GREEN_BOLD = "${symbol_escape}033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "${symbol_escape}033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "${symbol_escape}033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "${symbol_escape}033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "${symbol_escape}033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "${symbol_escape}033[1;37m";  // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "${symbol_escape}033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "${symbol_escape}033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "${symbol_escape}033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "${symbol_escape}033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "${symbol_escape}033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "${symbol_escape}033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "${symbol_escape}033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "${symbol_escape}033[4;37m";  // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "${symbol_escape}033[40m";  // BLACK
    public static final String RED_BACKGROUND = "${symbol_escape}033[41m";    // RED
    public static final String GREEN_BACKGROUND = "${symbol_escape}033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "${symbol_escape}033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "${symbol_escape}033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "${symbol_escape}033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "${symbol_escape}033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "${symbol_escape}033[47m";  // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "${symbol_escape}033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "${symbol_escape}033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "${symbol_escape}033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "${symbol_escape}033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "${symbol_escape}033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "${symbol_escape}033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "${symbol_escape}033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "${symbol_escape}033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "${symbol_escape}033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "${symbol_escape}033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "${symbol_escape}033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "${symbol_escape}033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "${symbol_escape}033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "${symbol_escape}033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "${symbol_escape}033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "${symbol_escape}033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "${symbol_escape}033[0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT = "${symbol_escape}033[0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT = "${symbol_escape}033[0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "${symbol_escape}033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "${symbol_escape}033[0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "${symbol_escape}033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "${symbol_escape}033[0;106m";  // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "${symbol_escape}033[0;107m";   // WHITE
}