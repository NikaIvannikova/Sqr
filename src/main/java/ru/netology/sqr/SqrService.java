package ru.netology.sqr;

public class SqrService {
    public static void main(String[] args) {
        for (int j = 0; j < 99; j++) {
            if ( j * j >= 10) if ( j * j <= 99) {
                System.out.println("проход цикла: " + j);
            }
        }
        System.out.println("вышли из цикла");
    }
}


