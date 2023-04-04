package actions.upgrade;
import actions.Move;
import actions.AbstractMoveDecorator;

public class Candy extends AbstractMoveDecorator {
    private Integer candyUpgrade = 10;

    public Candy(Move move){
        super(move);
    }

    public String applyEffect(){
        return String.format("" + "+ %d of candy", this.candyUpgrade);
    }
}
