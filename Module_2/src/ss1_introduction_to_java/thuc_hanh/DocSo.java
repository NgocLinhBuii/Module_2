package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class DocSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number >= 0 && number < 10) {
            switch (number) {
                case 0: System.out.println("zero"); break;
                case 1: System.out.println("one"); break;
                case 2: System.out.println("two"); break;
                case 3: System.out.println("three"); break;
                case 4: System.out.println("four"); break;
                case 5: System.out.println("five"); break;
                case 6: System.out.println("six"); break;
                case 7: System.out.println("seven"); break;
                case 8: System.out.println("eight"); break;
                case 9: System.out.println("nine"); break;
                default: System.out.println("out of ability"); break;
            }
        }

        else if (number >= 10 && number < 20) {
            switch (number) {
                case 10: System.out.println("ten"); break;
                case 11: System.out.println("eleven"); break;
                case 12: System.out.println("twelve"); break;
                case 13: System.out.println("thirteen"); break;
                case 14: System.out.println("fourteen"); break;
                case 15: System.out.println("fifteen"); break;
                case 16: System.out.println("sixteen"); break;
                case 17: System.out.println("seventeen"); break;
                case 18: System.out.println("eighteen"); break;
                case 19: System.out.println("nineteen"); break;
                default: System.out.println("out of ability"); break;
            }
        }

        else if (number >= 20 && number < 100) {
            int tens = number / 10;
            int ones = number % 10;
            String result = "";

            switch (tens) {
                case 2: result += "twenty"; break;
                case 3: result += "thirty"; break;
                case 4: result += "forty"; break;
                case 5: result += "fifty"; break;
                case 6: result += "sixty"; break;
                case 7: result += "seventy"; break;
                case 8: result += "eighty"; break;
                case 9: result += "ninety"; break;
                default: System.out.println("out of ability"); return;
            }

            if (ones != 0) {
                result += " ";
                switch (ones) {
                    case 1: result += "one"; break;
                    case 2: result += "two"; break;
                    case 3: result += "three"; break;
                    case 4: result += "four"; break;
                    case 5: result += "five"; break;
                    case 6: result += "six"; break;
                    case 7: result += "seven"; break;
                    case 8: result += "eight"; break;
                    case 9: result += "nine"; break;
                }
            }
            System.out.println(result);
        }

        else if (number >= 100 && number < 1000) {
            int hundreds = number / 100;
            int remainder = number % 100;
            String result = "";

            switch (hundreds) {
                case 1: result += "one hundred"; break;
                case 2: result += "two hundred"; break;
                case 3: result += "three hundred"; break;
                case 4: result += "four hundred"; break;
                case 5: result += "five hundred"; break;
                case 6: result += "six hundred"; break;
                case 7: result += "seven hundred"; break;
                case 8: result += "eight hundred"; break;
                case 9: result += "nine hundred"; break;
                default: System.out.println("out of ability"); return;
            }

            if (remainder != 0) {
                result += " and ";
                if (remainder < 10) {
                    switch (remainder) {
                        case 1: result += "one"; break;
                        case 2: result += "two"; break;
                        case 3: result += "three"; break;
                        case 4: result += "four"; break;
                        case 5: result += "five"; break;
                        case 6: result += "six"; break;
                        case 7: result += "seven"; break;
                        case 8: result += "eight"; break;
                        case 9: result += "nine"; break;
                    }
                } else if (remainder < 20) {
                    switch (remainder) {
                        case 10: result += "ten"; break;
                        case 11: result += "eleven"; break;
                        case 12: result += "twelve"; break;
                        case 13: result += "thirteen"; break;
                        case 14: result += "fourteen"; break;
                        case 15: result += "fifteen"; break;
                        case 16: result += "sixteen"; break;
                        case 17: result += "seventeen"; break;
                        case 18: result += "eighteen"; break;
                        case 19: result += "nineteen"; break;
                    }
                } else {
                    int tens = remainder / 10;
                    int ones = remainder % 10;

                    switch (tens) {
                        case 2: result += "twenty"; break;
                        case 3: result += "thirty"; break;
                        case 4: result += "forty"; break;
                        case 5: result += "fifty"; break;
                        case 6: result += "sixty"; break;
                        case 7: result += "seventy"; break;
                        case 8: result += "eighty"; break;
                        case 9: result += "ninety"; break;
                    }

                    if (ones != 0) {
                        result += " ";
                        switch (ones) {
                            case 1: result += "one"; break;
                            case 2: result += "two"; break;
                            case 3: result += "three"; break;
                            case 4: result += "four"; break;
                            case 5: result += "five"; break;
                            case 6: result += "six"; break;
                            case 7: result += "seven"; break;
                            case 8: result += "eight"; break;
                            case 9: result += "nine"; break;
                        }
                    }
                }
            }
            System.out.println(result);
        }

        else {
            System.out.println("out of ability");
        }
    }
    }
