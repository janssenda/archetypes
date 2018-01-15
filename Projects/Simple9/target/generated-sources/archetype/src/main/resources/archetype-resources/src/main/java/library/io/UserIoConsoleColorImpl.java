#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.io;

import java.io.Console;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author danimaetrix
 */
public class UserIoConsoleColorImpl implements UserIo {

    private static final String INVALIDINPUT = "Invalid input";
    private static final String TRYAGAINMSG = "Please try again: ";

    private void ExceptionResponse() {
        print(INVALIDINPUT);
        printx(TRYAGAINMSG);
    }

    @Override
    public LocalDate readDate() {
        return readDate("");
    }

    @Override
    public LocalDate readDate(String msg) {
        String dateFormat = "MM/dd/yyyy";
        LocalDate date;
        boolean valid = false;

        while (!valid){
        String input = readLine(msg);

        try {            
            date = LocalDate.parse(input, DateTimeFormatter.ofPattern(dateFormat));
            
                    
            return date;            
        } catch (Exception e) {            
            print("${symbol_escape}nBad date format! Please use (MM/dd/yyyy)... ");
        }
        }
        
        return null;

    }

//
//  _____      _       _   
// |  __ ${symbol_escape}    (_)     | |  
// | |__) | __ _ _ __ | |_ 
// |  ___/ '__| | '_ ${symbol_escape}| __|
// | |   | |  | | | | | |_ 
// |_|   |_|  |_|_| |_|${symbol_escape}__|
//                         
//                        
    @Override
    public void line() {
        System.out.println("");
    }

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }

    @Override
    public void print(String msg, String color) {
        System.out.println(color + msg);
    }

    @Override
    public void printx(String msg) {
        System.out.print(msg);
    }

    @Override
    public void printx(String msg, String color) {
        System.out.print(color + msg);
    }

//  _____                _            _      _            
// |  __ ${symbol_escape}              | |          | |    (_)           
// | |__) |___  __ _  __| |  ______  | |     _ _ __   ___ 
// |  _  // _ ${symbol_escape}/ _` |/ _` | |______| | |    | | '_ ${symbol_escape} / _ ${symbol_escape}
// | | ${symbol_escape} ${symbol_escape}  __/ (_| | (_| |          | |____| | | | |  __/
// |_|  ${symbol_escape}_${symbol_escape}___|${symbol_escape}__,_|${symbol_escape}__,_|          |______|_|_| |_|${symbol_escape}___|
//                                                        
//                                                        
    @Override
    public String readLine() {
        return lineReader();
    }

    @Override
    public String readLine(String msg) {
        printx(msg + "");
        return lineReader();
    }

    @Override
    public String readLine(String msg, String color) {
        printx(msg + "", color);
        return lineReader();
    }

//  _____                _            _____                                    _ 
// |  __ ${symbol_escape}              | |          |  __ ${symbol_escape}                                  | |
// | |__) |___  __ _  __| |  ______  | |__) |_ _ ___ _____      _____  _ __ __| |
// |  _  // _ ${symbol_escape}/ _` |/ _` | |______| |  ___/ _` / __/ __${symbol_escape} ${symbol_escape} /${symbol_escape} / / _ ${symbol_escape}| '__/ _` |
// | | ${symbol_escape} ${symbol_escape}  __/ (_| | (_| |          | |  | (_| ${symbol_escape}__ ${symbol_escape}__ ${symbol_escape}${symbol_escape} V  V / (_) | | | (_| |
// |_|  ${symbol_escape}_${symbol_escape}___|${symbol_escape}__,_|${symbol_escape}__,_|          |_|   ${symbol_escape}__,_|___/___/ ${symbol_escape}_/${symbol_escape}_/ ${symbol_escape}___/|_|  ${symbol_escape}__,_|
//                                                                               
//                                                                               
    @Override
    public String readPasswordLn() {
        return passReader();
    }

    @Override
    public String readPasswordLn(String msg) {
        printx(msg + "");
        return passReader();
    }

    @Override
    public String readPasswordLn(String msg, String color) {
        printx(msg + "", color);
        return passReader();
    }

//  _____                _            _____              _     _      
// |  __ ${symbol_escape}              | |          |  __ ${symbol_escape}            | |   | |     
// | |__) |___  __ _  __| |  ______  | |  | | ___  _   _| |__ | | ___ 
// |  _  // _ ${symbol_escape}/ _` |/ _` | |______| | |  | |/ _ ${symbol_escape}| | | | '_ ${symbol_escape}| |/ _ ${symbol_escape}
// | | ${symbol_escape} ${symbol_escape}  __/ (_| | (_| |          | |__| | (_) | |_| | |_) | |  __/
// |_|  ${symbol_escape}_${symbol_escape}___|${symbol_escape}__,_|${symbol_escape}__,_|          |_____/ ${symbol_escape}___/ ${symbol_escape}__,_|_.__/|_|${symbol_escape}___|
//                                                                    
    @Override
    public double readDouble() {
        double max = Double.MAX_VALUE;
        double min = -max;
        return userDoubleRecieve(min, max);
    }

    @Override
    public double readDouble(String msg) {
        printx(msg + "");
        double max = Double.MAX_VALUE;
        double min = -max;
        return userDoubleRecieve(min, max);
    }

    @Override
    public double readDouble(String msg, String color) {
        printx(msg + "", color);
        double max = Double.MAX_VALUE;
        double min = -max;
        return userDoubleRecieve(min, max);
    }

    @Override
    public double readDouble(double min, double max) {
        return userDoubleRecieve(min, max);
    }

    @Override
    public double readDouble(String msg, double min, double max) {
        printx(msg + "");
        return userDoubleRecieve(min, max);
    }

    @Override
    public double readDouble(String msg, double min, double max, String color) {
        printx(msg + "", color);
        return userDoubleRecieve(min, max);
    }

//
//  _____                _            _____       _   
// |  __ ${symbol_escape}              | |          |_   _|     | |  
// | |__) |___  __ _  __| |  ______    | |  _ __ | |_ 
// |  _  // _ ${symbol_escape}/ _` |/ _` | |______|   | | | '_ ${symbol_escape}| __|
// | | ${symbol_escape} ${symbol_escape}  __/ (_| | (_| |           _| |_| | | | |_ 
// |_|  ${symbol_escape}_${symbol_escape}___|${symbol_escape}__,_|${symbol_escape}__,_|          |_____|_| |_|${symbol_escape}__|
//                                                    
//                                                   
    @Override
    public int readInt() {
        int max = Integer.MAX_VALUE;
        int min = -max;
        return userIntRecieve(min, max);
    }

    @Override
    public int readInt(String msg) {
        printx(msg + "");
        int max = Integer.MAX_VALUE;
        int min = -max;
        return userIntRecieve(min, max);
    }

    @Override
    public int readInt(String msg, String color) {
        printx(msg + "", color);
        int max = Integer.MAX_VALUE;
        int min = -max;
        return userIntRecieve(min, max);
    }

    @Override
    public int readInt(int min, int max) {
        return userIntRecieve(min, max);
    }

    @Override
    public int readInt(String msg, int min, int max) {
        printx(msg + "");
        return userIntRecieve(min, max);
    }

    @Override
    public int readInt(String msg, int min, int max, String color) {
        printx(msg + "", color);
        return userIntRecieve(min, max);
    }

//
//  _____                _                                                 
// |  __ ${symbol_escape}              | |              /${symbol_escape}                                
// | |__) |___  __ _  __| |  ______     /  ${symbol_escape}   _ __  _____      _____ _ __ 
// |  _  // _ ${symbol_escape}/ _` |/ _` | |______|   / /${symbol_escape} ${symbol_escape} | '_ ${symbol_escape}/ __${symbol_escape} ${symbol_escape} /${symbol_escape} / / _ ${symbol_escape} '__|
// | | ${symbol_escape} ${symbol_escape}  __/ (_| | (_| |           / ____ ${symbol_escape}| | | ${symbol_escape}__ ${symbol_escape}${symbol_escape} V  V /  __/ |   
// |_|  ${symbol_escape}_${symbol_escape}___|${symbol_escape}__,_|${symbol_escape}__,_|          /_/    ${symbol_escape}_${symbol_escape}_| |_|___/ ${symbol_escape}_/${symbol_escape}_/ ${symbol_escape}___|_|   
//                                                                         
//                                                                      
    @Override
    public boolean readAnswer() {
        return readAnswerBody("", ColorIO.RESET);
    }

    @Override
    public boolean readAnswer(String msg) {
        return readAnswerBody(msg, ColorIO.RESET);
    }

    @Override
    public boolean readAnswer(String msg, String color) {
        return readAnswerBody(msg, color);
    }

//  _____                _            ____  _       _____            _                 _ 
// |  __ ${symbol_escape}              | |          |  _ ${symbol_escape}(_)     |  __ ${symbol_escape}          (_)               | |
// | |__) |___  __ _  __| |  ______  | |_) |_  __ _| |  | | ___  ___ _ _ __ ___   __ _| |
// |  _  // _ ${symbol_escape}/ _` |/ _` | |______| |  _ <| |/ _` | |  | |/ _ ${symbol_escape}/ __| | '_ ` _ ${symbol_escape} / _` | |
// | | ${symbol_escape} ${symbol_escape}  __/ (_| | (_| |          | |_) | | (_| | |__| |  __/ (__| | | | | | | (_| | |
// |_|  ${symbol_escape}_${symbol_escape}___|${symbol_escape}__,_|${symbol_escape}__,_|          |____/|_|${symbol_escape}__, |_____/ ${symbol_escape}___|${symbol_escape}___|_|_| |_| |_|${symbol_escape}__,_|_|
//                                             __/ |                                     
//                                            |___/                                      
    @Override
    public BigDecimal readBigDecimal() {
        return userBDRecieve("-1e100", "1e100");
    }

    @Override
    public BigDecimal readBigDecimal(String msg) {
        printx(msg + "");
        return userBDRecieve("-1e100", "1e100");
    }

    @Override
    public BigDecimal readBigDecimal(String msg, String color) {
        printx(msg + "", color);
        return userBDRecieve("-1e100", "1e100");
    }

    @Override
    public BigDecimal readBigDecimal(String msg, String min, String max) {
        printx(msg + "");
        return userBDRecieve(min, max);
    }

    @Override
    public BigDecimal readBigDecimal(String msg, String min, String max, String color) {
        printx(msg + "", color);
        return userBDRecieve(min, max);
    }

//  _____      _            _         __  __      _   _               _     
// |  __ ${symbol_escape}    (_)          | |       |  ${symbol_escape}/  |    | | | |             | |    
// | |__) | __ ___   ____ _| |_ ___  | ${symbol_escape}  / | ___| |_| |__   ___   __| |___ 
// |  ___/ '__| ${symbol_escape} ${symbol_escape} / / _` | __/ _ ${symbol_escape} | |${symbol_escape}/| |/ _ ${symbol_escape} __| '_ ${symbol_escape} / _ ${symbol_escape} / _` / __|
// | |   | |  | |${symbol_escape} V / (_| | ||  __/ | |  | |  __/ |_| | | | (_) | (_| ${symbol_escape}__ ${symbol_escape}
// |_|   |_|  |_| ${symbol_escape}_/ ${symbol_escape}__,_|${symbol_escape}__${symbol_escape}___| |_|  |_|${symbol_escape}___|${symbol_escape}__|_| |_|${symbol_escape}___/ ${symbol_escape}__,_|___/
//                                                                          
//                  
    private boolean readAnswerBody(String msg, String color) {
        Scanner sc = new Scanner(System.in);
        boolean valid = false, answer = true;
        String userinput;

        printx(msg + "", color);
        while (valid == false) {
            try {

                userinput = sc.nextLine();

                switch (userinput.toLowerCase()) {
                    case "y":
                    case "yes":
                        answer = true;
                        valid = true;
                        break;
                    case "n":
                    case "no":
                        answer = false;
                        valid = true;
                        break;
                    default:
                        ExceptionResponse();
                        break;
                }

            } catch (Exception e) {
                ExceptionResponse();
                sc.next();

            }

        }
        return answer;
    }

    private double userDoubleRecieve(double min, double max) {
        //Safely returns a double within range min to max
        Scanner sc = new Scanner(System.in);
        boolean valid = false;

        while (!valid) {
            try {
                double choice = sc.nextDouble();
                if (choice < min || choice > max) {
                    ExceptionResponse();
                } else {
                    return choice;
                }
            } catch (Exception e) {
                ExceptionResponse();
                sc.next();
            }

        }
        return 0;
    }

    private int userIntRecieve(int min, int max) {
        //Safely returns an Integer within range min to max
        Scanner sc = new Scanner(System.in);
        boolean valid = false;

        while (!valid) {
            try {
                int choice = sc.nextInt();

                if (choice < min || choice > max) {
                    ExceptionResponse();
                } else {
                    return choice;
                }
            } catch (Exception e) {
                ExceptionResponse();
                sc.next();

            }

        }
        return 0;
    }

    private BigDecimal userBDRecieve(String minStr, String maxStr) {
        Scanner sc = new Scanner(System.in);
        boolean valid = false;

        BigDecimal min = new BigDecimal(minStr);
        BigDecimal max = new BigDecimal(maxStr);

        while (!valid) {

            try {
                BigDecimal input = new BigDecimal(sc.nextLine());
                if (input.compareTo(min) < 0 || input.compareTo(max) > 0) {
                    ExceptionResponse();
                } else {
                    return input;
                }
            } catch (Exception e) {
                ExceptionResponse();
            }
        }
        return BigDecimal.ZERO;

    }

    private String lineReader() {
        String userinput;
        Scanner sc = new Scanner(System.in);
        userinput = sc.nextLine();
        return userinput;
    }

    private String passReader() {
        Scanner sc = new Scanner(System.in);
        Console console = System.console();
        try {
            String userinput = new String(console.readPassword());
            return userinput;

        } catch (Exception e) {
            String userinput = sc.nextLine();
            return userinput;
        }
    }

}
