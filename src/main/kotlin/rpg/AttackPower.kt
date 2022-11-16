package rpg
const val MIN: Int = 0
class AttackPower(val value: Int) {
    init {
        require(value > MIN){"NG"}
    }

    /**
     * 攻撃力を強化する
     * @param increment 攻撃力の増加分
     * @return 強化された攻撃力
     */
    fun reinForce(increment: AttackPower): AttackPower {
        return AttackPower(value + increment.value)
    }

    /**
     * 無力化する
     * @return 無効化された攻撃力
     */
    fun disable(): AttackPower {
        return AttackPower(MIN)
    }
}