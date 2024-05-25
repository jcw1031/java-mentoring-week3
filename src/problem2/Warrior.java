package problem2;

public class Warrior implements Character {

    private int health;

    // 전사 체력은 100
    public Warrior() {
        this.health = 100;
    }

    // 전사 검 공격은 15데미지
    @Override
    public void attack(Character target) {
        // TODO 구현
    }

    @Override
    public void defend() {
        // TODO 구현
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void takeDamage(int damage) {
        // TODO 구현
    }
}
