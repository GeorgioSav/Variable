public class Main {
    public static void main(String[] args) {

        var dog=8.0;
        System.out.println(dog);
        var cat=3.6;
        System.out.println(cat);
        var paper=763789;
        System.out.println(paper);
        dog=dog+4;
        System.out.println(dog);
        cat=cat+4;
        System.out.println(cat);
        paper=paper+4;
        System.out.println(paper);
        dog=dog-3.5;
        System.out.println(dog);
        cat=cat-1.6;
        System.out.println(cat);
        paper=paper-7639;
        System.out.println(paper);

        var frend=19;
        System.out.println(frend);
        frend=frend+2;
        System.out.println(frend);
        frend=frend/7;
        System.out.println(frend);

        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);

        var oneFighter=78.2;
        var twoFighter=82.7;
        var totalWeight=oneFighter+twoFighter;
        System.out.println("Общий вес боцоцов "+totalWeight);
        var weightDifference=twoFighter-oneFighter;
        System.out.println("Разница веса бойцов "+weightDifference);

        var totalTime=640;
        var oneEmployee=8;
        var numberOfEmployees=totalTime/oneEmployee;
        System.out.println("Всего работников в компании "+numberOfEmployees + " человек ");

        var additionalNumberOfEmployees=94;
        var totalNumberOfPeople=additionalNumberOfEmployees+numberOfEmployees;
        System.out.println("Всего колличество человек "+totalNumberOfPeople);

        var timeOfOneEmployee=totalTime/totalNumberOfPeople;
        System.out.println("Если в компании работает "+totalNumberOfPeople+" человек, то всего "+timeOfOneEmployee+" часа работы может быть поделено между сотрудниками ");

    }
}

