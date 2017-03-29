package com.company;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.System.in;

public class Main {
    private static List<Integer> list1 = new LinkedList<Integer>();

    public static void main(String[] args) {
        //1
        System.out.println("1st(Поприветствовать человека): ");
        Scanner in = new Scanner(System.in);
        String hl = in.nextLine();
        System.out.println("Hello " + hl + "!");
        //2
        System.out.println("2nd(Строка в обратном порядке): ");
        hl = in.nextLine();
        System.out.println(new StringBuilder(hl).reverse().toString());
        //3
        System.out.println("3rd(Вывести числа с переход строки и без): ");
        for (int i = 0; i < 10; i++) {
            Random rm = new Random();
            int rn = rm.nextInt(10) + 1;
            if (rn % 2 == 0) {
                System.out.print("new:" + rn);
            } else {
                System.out.println("new:" + rn);
            }
        }
        System.out.println();
        //4
        System.out.println("4th(Сравнить пароль): ");
        String past = in.nextLine();
        String pas2 = "asd1234";
        if (Objects.equals(pas2, past)) {
            System.out.println("Пароль верный ");
        } else {
            System.out.println("Пароль неверный(asd1234) ");
        }
        //5
        System.out.println("5th(По очереди ввести числа и посчитать сумму и произведения): ");
        int a, b, c, d;
        a = Integer.parseInt(in.nextLine());
        b = Integer.parseInt(in.nextLine());
        c = Integer.parseInt(in.nextLine());
        d = Integer.parseInt(in.nextLine());
        System.out.println("SUM: " + (a + b + c + d));
        System.out.println("MULT: " + (a * b * c * d));
        //6
        System.out.println("6rd(): ");
        int mx = 0, mn = 0;
        String ch = "", nch = "", fs = "";
        String trd = "";
        System.out.println("введите размер массива");
        int k = in.nextInt();
        int[] arr = new int[k];
        System.out.println("введите масив");
        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                ch = ch + arr[i] + ", ";
            } else {
                nch = nch + arr[i] + ", ";
            }
            if ((arr[i] % 3 == 0) | (arr[i] % 9 == 0)) {
                trd = trd + arr[i] + ", ";
            }
            if ((arr[i] % 5 == 0) && (arr[i] % 7 == 0)) {
                fs = fs + arr[i] + ", ";
            }

            if (mx < arr[i]) {
                mx = arr[i];
            } else {
                mx = mx;
            }
            if (i == 0) {
                mn = arr[i];
            } else {
                if (mn > arr[i]) {
                    mn = arr[i];
                } else {
                    mn = mn;
                }
            }

        }
        String num;
        for (int i = 0; i < arr.length; i++) {
            num = String.valueOf(arr[i]);
            if (num.length() == 3 && num.charAt(0) != num.charAt(1)
                    && num.charAt(1) != num.charAt(2)
                    && num.charAt(0) != num.charAt(2))
                list1.add(arr[i]);
        }
        System.out.println("Все трехзначные числа, в десятичной записи которых нет одинаковых цифр: " + list1);
        list1.clear();
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr.length < 3)
                break;
            if (arr[i] == (arr[i - 1] + arr[i + 1]) / 2)
                list1.add(arr[i]);
        }
        System.out.println("Элементы, которые равны полусумме соседних элементов: " + list1);
        System.out.println("Делятся на 3 или 9: " + trd);
        System.out.println("Делятся на 5 и 7: " + fs);
        System.out.println("Чётные: " + ch + "; Нечётные: " + nch);
        System.out.println("MAX: " + mx);
        System.out.println("MIN: " + mn);

    }
}

