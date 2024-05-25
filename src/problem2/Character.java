package problem2;

public interface Character {

    void attack(Character target); // 다른 캐릭터를 공격하는 메소드

    void defend(); // 방어하는 메소드

    int getHealth(); // 현재 건강 상태(체력)을 반환하는 메소드

    void takeDamage(int damage); // 피해를 받을 때 호출되는 메소드

}
