package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int month, day;
        Scanner input = new Scanner(System.in);

        System.out.print("your birth month (as a number): ");
        month = input.nextInt();
        System.out.print("your birth day (as a number): ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("your zodiac sign: Capricorn");
                    } else {
                        System.out.println("your zodiac sign: Aquarius");
                    }
                } else {
                    System.out.println("you entered an invalid day.");
                }
                break;
            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        System.out.println("your zodiac sign: Aquarius");
                    } else {
                        System.out.println("your zodiac sign: Pisces");
                    }
                } else {
                    System.out.println("you entered an invalid day.");
                }
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        System.out.println("your zodiac sign: Pisces");
                    } else {
                        System.out.println("your zodiac sign: Aries");
                    }
                } else {
                    System.out.println("you entered an invalid day.");
                }
                break;
            case 4:
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        System.out.println("your zodiac sign: Aries");
                    } else {
                        System.out.println("your zodiac sign: Taurus");
                    }
                } else {
                    System.out.println("you entered an invalid day.");
                }
                break;
            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        System.out.println("your zodiac sign: Taurus");
                    } else {
                        System.out.println("your zodiac sign: Gemini");
                    }
                } else {
                    System.out.println("you entered an invalid day.");
                }
                break;
            case 6:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        System.out.println("your zodiac sign: Gemini");
                    } else {
                        System.out.println("your zodiac sign: Cancer");
                    }
                } else {
                    System.out.println("you entered an invalid day.");
                }
                break;
            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("your zodiac sign: Cancer");
                    } else {
                        System.out.println("your zodiac sign: Leo");
                    }
                } else {
                    System.out.println("you entered an invalid day.");
                }
                break;
            case 8:
                if (day >= 1 && day <= 31) {
                    if (day < 24) {
                        System.out.println("your zodiac sign: Leo");
                    } else {
                        System.out.println("your zodiac sign: Virgo");
                    }
                } else {
                    System.out.println("you entered an invalid day.");
                }
                break;
            case 9:
                if (day >= 1 && day <= 31) {
                    if (day < 24) {
                        System.out.println("your zodiac sign: Virgo");
                    } else {
                        System.out.println("your zodiac sign: Libra");
                    }
                } else {
                    System.out.println("you entered an invalid day.");
                }
                break;
            case 10:
                if (day >= 1 && day <= 31) {
                    if (day < 24) {
                        System.out.println("your zodiac sign: Libra");
                    } else {
                        System.out.println("your zodiac sign: Scorpio");
                    }
                } else {
                    System.out.println("you entered an invalid day.");
                }
                break;
            case 11:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("your zodiac sign: Scorpio");
                    } else {
                        System.out.println("your zodiac sign: Sagittarius");
                    }
                } else {
                    System.out.println("you entered an invalid day.");
                }
                break;
            case 12:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        System.out.println("your zodiac sign: Sagittarius");
                    } else {
                        System.out.println("your zodiac sign: Capricorn");
                    }
                } else {
                    System.out.println("you entered an invalid day.");
                }
                break;
            default:
                System.out.println("you entered an invalid month.");
        }
    }
}