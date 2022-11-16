import rpg.AttackPower
import rpg.Weapon
import java.util.*

fun main(args: Array<String>) {
    val attackPower = AttackPower(20)
    val reinforced = attackPower.reinForce(AttackPower(20))

    println("attack power : ${reinforced.value}")
}