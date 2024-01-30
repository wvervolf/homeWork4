public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1"); //Задание 1
        int age = 20 ;
        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний");
        }
        if (age < 18){
            System.out.println("Если возраст человека равен " + age + " до совершеннолетия нужно еще немного подождать");
        }
        System.out.println("Задание 2"); //Задание 2
        int temperature = 3;
        if (temperature >= 5){
            System.out.println("На улице " + temperature + " градусов, значит можно идти гулять легко одетым");
        }
        if (temperature < 5) {
            System.out.println("На улице меньше " + temperature + " градусов, значит нужно надеть шапку");
        }
        System.out.println("Задание 3"); //Задание 3
        int speed = 50;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно");
        }
        if (speed > 60){
            System.out.println("Если скорость " + speed + " то придется заплатить штрафф");
        }
        System.out.println("Задание 4"); //Задание 4
        int old = 1;
        boolean kinder = old >= 2 && old <= 6;
        if (kinder){
            System.out.println("Если человеку " + old + " лет, значит ему нужно в десткий сад");
        }
        boolean pupil = old >= 7 && old <= 17;
        if (pupil) {
            System.out.println("Если человеку " + old + " лет, значит ему нужно в школу");
        }
        boolean student = old >= 18 && old <= 24;
        if (student) {
            System.out.println("Если человеку " + old + " лет, значит ему нужно в университет");
        }
        boolean seasoned = old > 24;
        if (seasoned) {
            System.out.println("Если человеку " + old + " лет, значит ему нужно на работу");
        } else if (old<2) {
            System.out.println("Если человеку " + old + " лет, значит ему пора сосать титьку");
        }
        System.out.println("Задание 5"); //Задание 5
        int yearsOld = 10; //Возраст ребенка
        boolean elder = false; //Наличие взрослых
        boolean years1 = yearsOld < 5;
        boolean years2 = yearsOld >= 5 && yearsOld < 14 && elder;
        boolean years2_0 = yearsOld >= 5 && yearsOld < 14;
        boolean years3 = yearsOld >= 14;
        if (years1){
            System.out.println("Если ребенку " + yearsOld + " лет, то ему запрещено кататься на атракционе");
        }
        if (years2){
            System.out.println("Если ребенку " + yearsOld + " лет, то ему можно кататься на атракционе только в сопровождении взрослых");
        }else if (years2_0){
            System.out.println("Если ребенку " + yearsOld + " лет, то ему нельзя кататься на атракционе без сопровождения взрослых");
        }
        if (years3){
            System.out.println("Если ребенку " + yearsOld + " лет, то ему запрещено кататься на атракционе самостоятельно");
        }
        System.out.println("Задание 6"); //Задание 6
        int occupiedSeats = 60; //Занятые сидячие места
        int occupiedStanding = 42; // Занятые стоячие места
        int totalPlaces = 102;
        int sittingPlaces = 60;
        int standingPlaces = totalPlaces - sittingPlaces;
        if (occupiedSeats < sittingPlaces){
            System.out.println("Если в вагоне сидит " + occupiedSeats + " человек, то в вагоне еще есть сидячие места");
        }else{
            System.out.println("Если в вагоне сидит " + occupiedSeats + " человек, то в вагоне сидячих мест больше нет");
        }
        if (occupiedStanding < standingPlaces){
            System.out.println("Если в вагоне стоит " + occupiedStanding + " человек, то в вагоне еще есть стоячие места");
        }else{
            System.out.println("Если в вагоне стоит " + occupiedStanding + " человек, то в вагоне стоячих мест больше нет");
        }
        if ((occupiedSeats + occupiedStanding) >= totalPlaces){
            System.out.println("Если в вагоне сидит " + occupiedSeats + " и стоит " + occupiedStanding + " человек, то в вагоне мест больше нет");
        }
        System.out.println("Задание 7"); //Задание 7
        int one = 1;
        int two = 2;
        int three = 3;
        //Выдвигаем все возможные гиппотезы
        boolean a = one > two;
        boolean b = one > three;
        boolean c = two > one;
        boolean d = two > three;
        boolean e = three > one;
        boolean i = three > two;
        //Выясняем истину с помощью условного оператора
        if (a && b){
            System.out.println(one + " является самым большим числом");
        }else if (a || b){
            System.out.println(one + " является вторым по величине числом");
        }else{
            System.out.println(one + " является третьим по величине числом");
        }
        if (c && d){
            System.out.println(two + " является самым большим числом");
        }else if (c || d){
            System.out.println(two + " является вторым по величине числом");
        }else{
            System.out.println(two + " является третьим по величине числом");
        }
        if (e && i){
            System.out.println(three + " является самым большим числом");
        }else if (e && i){
            System.out.println(three + " является вторым по величине числом");
        }else{
            System.out.println(three + " является третьим по величине числом");
        }
    }
}