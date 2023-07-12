// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее Задание 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var allWeightBoxers = firstBoxer + secondBoxer;
        System.out.println("Обший вес бойцов = " + allWeightBoxers);
        var differenceWeightBoxers = secondBoxer -
                firstBoxer;
        System.out.println("Разница между весами бойцов = " + differenceWeightBoxers);

        var differenceWeightBoxers1 = secondBoxer -
                firstBoxer;
        System.out.println("Разницу весов спортсменов = " + differenceWeightBoxers1 + " (1 способ)");
        var differenceWeightBoxers2 = secondBoxer%firstBoxer;
        System.out.println("Разницу весов спортсменов = " + differenceWeightBoxers2 + " (2 способ)");

        var allTime = 640;
        var oneEmployeeTime = 8;
        var allEmloyees = allTime/oneEmployeeTime;
        System.out.println("Всего работников в компании — " + allEmloyees + " человек");

        var addEmloyees = 94;
        var allEmloyeesWithAddEmloyees = allEmloyees + addEmloyees;
        var allTimeAllEmloyeesWithAddEmployees = allEmloyeesWithAddEmloyees * oneEmployeeTime;
        System.out.println("Если в компании работает " + allEmloyeesWithAddEmloyees + " человек, то всего " + allTimeAllEmloyeesWithAddEmployees + " часов работы может быть поделено между сотрудниками");

    }
}