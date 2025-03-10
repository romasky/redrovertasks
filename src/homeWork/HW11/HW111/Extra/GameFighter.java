package homeWork.HW11.HW111.Extra;

public class GameFighter {



    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String winner = "";

        // Проверяем кто первый атакует
        if (firstAttacker.equals(fighter1.name)) {
            while (fighter1.health > 0 && fighter2.health > 0) {
                fighter2.health -= fighter1.damagePerAttack;  // fighter1 атакует fighter2
                if (fighter2.health <= 0) {
                    winner = fighter1.name;
                    break;
                }
                fighter1.health -= fighter2.damagePerAttack;  // fighter2 атакует fighter1
                if (fighter1.health <= 0) {
                    winner = fighter2.name;
                    break;
                }
            }
        } else {
            while (fighter1.health > 0 && fighter2.health > 0) {
                fighter1.health -= fighter2.damagePerAttack;  // fighter2 атакует fighter1
                if (fighter1.health <= 0) {
                    winner = fighter2.name;
                    break;
                }
                fighter2.health -= fighter1.damagePerAttack;  // fighter1 атакует fighter2
                if (fighter2.health <= 0) {
                    winner = fighter1.name;
                    break;
                }
            }
        }

        return winner;
    }


    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Lew", 10, 2);
        Fighter fighter2 = new Fighter("Harry", 5, 4);
        System.out.println("Winner is: " + declareWinner(fighter1, fighter2, "Lew"));
    }

}
