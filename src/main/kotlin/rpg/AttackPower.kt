package rpg
const val MIN: Int = 0
class AttackPower(_value: Int) {
    var value = _value
    init {
        require(value > MIN){"NG"}
    }
}