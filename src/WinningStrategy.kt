import kotlin.random.Random

/*
勝ったら次も同じ手を出す戦略を表すクラス
 */
class WinningStrategy: Strategy {
    private var won: Boolean = false
    private var prevHand: Hand = Hand(0)
    override fun nextHand(): Hand {
        prevHand = if (won) prevHand else Hand(Random.nextInt(0,2))
        return prevHand
    }
    override fun study(win: Boolean) {
        won = win
    }

}