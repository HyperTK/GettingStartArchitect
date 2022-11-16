import rpg.AttackPower
import rpg.Weapon
import java.util.*

fun main(args: Array<String>) {
    val attackPower = AttackPower(20)
    val weaponA = Weapon(attackPower)
    val weaponB = Weapon(attackPower)

    println(weaponA.attackPower.value)
    println(weaponB.attackPower.value)

    weaponA.attackPower.value = 25

    println(weaponA.attackPower.value)
    println(weaponB.attackPower.value)
}