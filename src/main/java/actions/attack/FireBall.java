package actions.attack;

import actions.Move;

public class FireBall implements Attack {
    private String typeOfAttack;
    private Move executeAttack;

    public String getTypeOfAttack() {
        return typeOfAttack;
    }

    public void setTypeOfAttack(String typeOfAttack) {
        this.typeOfAttack = typeOfAttack;
    }

    public Move getExecuteAttack() {
        return executeAttack;
    }

    public void setExecuteAttack(Move executeAttack) {
        this.executeAttack = executeAttack;
    }

    @Override
    public String executeAttack() {
        return executeAttack.execute();
    }
}
