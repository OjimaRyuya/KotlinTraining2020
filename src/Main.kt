/*
動作テスト用のクラス
 */
fun main(args: Array<String>) {
    val player1 = Player("Taro", WinningStrategy())
    val player2 = Player("Hana", ProbStrategy())
    for (i in 0 until 10000) {
        val nextHand1: Hand = player1.nextHand()
        val nextHand2: Hand = player2.nextHand()
        when {
            nextHand1.isStrongerThan(nextHand2) -> {
                println("Winner:" + player1.name)
                player1.win()
                player2.lose()
            }
            nextHand1.isWeakerThan(nextHand2) -> {
                println("Winner:" + player2.name)
                player1.lose()
                player2.win()
            }
            else -> {
                println("Even..")
                player1.even()
                player2.even()
            }
        }
    }
    println("Total result:")
    println(player1.getResult())
    println(player2.getResult())
}