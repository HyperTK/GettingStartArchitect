import java.util.*

fun main(args: Array<String>) {
    val yen = Currency.getInstance(Locale.JAPAN)
    println(yen)

    val money = Money(100, yen)
    val addedMoney = money.add(Money(400, yen))
    println(addedMoney)

}