package rpg

class Weapon(private val attackPower: AttackPower) {
    /**
     * 武器を強化する
     * @param increment 攻撃力の増加分
     * @return 強化した武器
     */
    fun reinForce(increment: AttackPower): Weapon {
        val reinForced = attackPower.reinForce(increment)
        return Weapon(reinForced)
    }
}