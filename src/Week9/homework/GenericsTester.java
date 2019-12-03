package Week9.homework;

public class GenericsTester {

    public static void main(String[] args) {

        Book neuromancer = new BookSciFi("Neuromancer");
        Book jurrassicPark = new BookSciFi("JurrassicPark");
        Book theWitcher = new BookFantasy("TheWitcher");
        Book twoTowers = new BookFantasy("TwoTowers");

        Food snickers = new Food("Snickers");
        Food sandwich = new Food("Sandwich");
        Food lays = new Food("Lay's");

        Toy heMan = new Toy("He-Man");
        Toy tRex = new Toy("T-Rex");
        Toy soldier = new Toy("Soldier");

        Box<Book> bookBox = new Box<>("Book Box");
        bookBox.addItemToBox(neuromancer);
        bookBox.addItemToBox(jurrassicPark);
        bookBox.addItemToBox(theWitcher);
        bookBox.addItemToBox(twoTowers);
        System.out.println(bookBox);

        Box<Food> foodBox = new Box<>("Food Box");
        foodBox.addItemToBox(snickers);
        foodBox.addItemToBox(sandwich);
        foodBox.addItemToBox(lays);
        System.out.println(foodBox);

        Box<Toy> toyBox = new Box<>("Toy Box");
        toyBox.addItemToBox(heMan);
        toyBox.addItemToBox(tRex);
        toyBox.addItemToBox(soldier);
        System.out.println(toyBox);

        UniversalShelf universalShelf = new UniversalShelf<>("Universal Shelf");
        universalShelf.addBoxToShelf(toyBox);
        universalShelf.addBoxToShelf(bookBox);
        universalShelf.addBoxToShelf(foodBox);
        System.out.println(universalShelf);

        BookShelf bookShelf = new BookShelf("Book Shelf");
        bookShelf.addBoxToShelf(toyBox);
        bookShelf.addBoxToShelf(bookBox);
        System.out.println(bookShelf);
    }


}
