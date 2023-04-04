package actions;

public class Damage implements Move{
    private Integer initialDamage = 100;
    @Override
    public String execute() {
        return String.format("Attack: dealing %d base damage", this.initialDamage);
    }
}
