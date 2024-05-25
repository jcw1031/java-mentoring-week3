package problem2;

public class Mage implements Character {

    private int health;

    // 마법사 체력은 80
    public Mage() {
        this.health = 80;
    }

    // 마법사 파이어볼 공격은 20 데미지
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

