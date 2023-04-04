import actions.attack.FireBall;
import actions.upgrade.Candy;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import actions.attack.Attack;
import actions.Move;
import actions.Damage;
public class FireBallTest {

    @Test
    void mustAttack(){
        FireBall fireBall = new FireBall();
        fireBall.setExecuteAttack(new Damage());

        assertEquals("Attack: dealing 100 base damage",fireBall.executeAttack());
    }

    @Test
    void mustAttackWithCandy(){
         Move fireBallAttack = new Candy(new Damage());

        FireBall fireBall = new FireBall();
        fireBall.setExecuteAttack(fireBallAttack);

        assertEquals("Attack: dealing 100 base damage" + "+ 10 of candy",fireBall.executeAttack());
    }

}
