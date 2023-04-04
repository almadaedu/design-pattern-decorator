package actions;

public abstract class AbstractMoveDecorator implements Move{
    private Move move;

    public AbstractMoveDecorator(Move move) {
        this.move = move;
    }

    public abstract String applyEffect();

    @Override
    public String execute() {
        return this.move.execute() + this.applyEffect();
    }
}
