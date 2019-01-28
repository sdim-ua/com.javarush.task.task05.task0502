
/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        if (this.strength < anotherCat.strength)
            return true;
        return false;
        
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat ();
        Cat cat2 = new Cat ();
        cat1.strength = 56;
        cat2.strength = 5111;
    }
}
