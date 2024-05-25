package problem2;

public class Main {
    public static void main(String[] args) {

	  Character warrior = new Warrior();
      Character mage = new Mage();

      warrior.attack(mage);
      mage.attack(warrior);
      warrior.defend();
      mage.defend();
    }
}
