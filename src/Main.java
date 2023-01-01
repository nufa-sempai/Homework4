public class Main {
    public static void main(String[] args) {
        hw4();
    }
    public static void hw4() {
//Задание 1
        System.out.println("Задание 1");
        int age = 17;
        int requiredAge = 18;
        if (age >= requiredAge) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        }
        if (age < requiredAge) {
            System.out.println("Если возраст человека равен " + age +
                    " то он не достиг совершеннолетия, нужно немного подождать");
        }
//Задание 2
        System.out.println("\nЗадание 2");
        int temperature = 7;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
//Задание 3
        System.out.println("\nЗадание 3");
        int speed = 70;
        int speedLimit = 60;
        if (speed >= speedLimit) {
        System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
//Задание 4
        System.out.println("\nЗадание 4");
        int yearsOld = 16;
        if (yearsOld >= 2 && yearsOld <= 6) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в детский сад.");
        } else if (yearsOld >= 7 && yearsOld <= 18) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему нужно ходить в школу.");
        } else if (yearsOld >= 19 && yearsOld <= 24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то его место в университете.");
        } else if (yearsOld > 24) {
            System.out.println("Если возраст человека равен " + yearsOld + ", то ему пора ходить на работу.");
        }
//Задание 5
        System.out.println("\nЗадание 5");
        int humanAge = 7;
        if (humanAge < 5) {
            System.out.println("Если возраст ребенка равен, " + humanAge + " то ему нельзя кататься на аттракционе");
        } else if (humanAge < 14) {
            System.out.println("Если возраст ребенка равен, " + humanAge +
                    " то ему можно кататься на аттракционе в сопровождении");
        } else {
            System.out.println("Если возраст ребенка равен, " + humanAge +
                    " то ему можно кататься на аттракционе без сопровождения взрослого");
        }
//Задание 6
        System.out.println("\nЗадание 6");
        int passengers = 70;
        if (passengers < 60) {
            System.out.println("Пассажиров в вагоне " + passengers + ", есть сидячие места");
        } else if (passengers >= 60 && passengers < 102) {
            System.out.println("Пассажиров в вагоне " + passengers + ", остались только стоячие места");
        } else if (passengers >= 102) {
            System.out.println("Пассажиров в вагоне " + passengers + ", свободных мест нет");
        }
//Задание 7
        System.out.println("\nЗадание 7");
        int one = 7;
        int two = -13;
        int three = 69;
        if (one >= two && one >= three) {
            System.out.println(one);
        } else if (two >= one && two >= three) {
            System.out.println(two);
        } else if (three >= one && three >= one) {
            System.out.println(three);
        }
    }
}