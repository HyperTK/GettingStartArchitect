import java.util.*

class Money(private val amount: Int, private val currency: Currency ) {

    init {
        require(amount > 0) { "金額には0以上を指定してください。" }
        require(currency != null) {"通貨単位を指定してください。"}
    }

    fun add(other: Money): Money {
        require(currency == other.currency) {"通貨単位が違います"}
        val added = amount + other.amount
        return Money(added, currency)
    }

    fun currentMoneyInfo() {
        println("money:$amount, currency:$currency")
    }

}