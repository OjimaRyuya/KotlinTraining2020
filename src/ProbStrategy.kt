import kotlin.random.Random

/*
1回目の手から次の手を確立的に計算する戦略を表すクラス
 */
class ProbStrategy: Strategy {

    private var prevHandValue: Int = 0
    private var currentHandValue: Int = 0
    var history: Array<Array<Int>> = arrayOf(
            arrayOf(1,1,1), //グーを出した次に出すべき手を表すArray
            arrayOf(1,1,1), //チョキを出した次に出すべき手を表すArray
            arrayOf(1,1,1)  //パーを出した次に出すべき手を表すArray
    )

    override fun nextHand(): Hand {
        val bet: Int = Random.nextInt(getSum(currentHandValue))
        val nextHandValue = when {
            bet < history[currentHandValue][0] -> 0
            bet < history[currentHandValue][0] + history[currentHandValue][1] -> 1
            else -> 2
        }
        prevHandValue = currentHandValue
        currentHandValue = nextHandValue
        return Hand(nextHandValue)
    }

    private fun getSum(hv: Int): Int{
        var sum = 0
        for (i in 0..2) {
            sum += history[hv][i]
        }
        return sum
    }

    override fun study(win: Boolean) {
        if (win) {
            history[prevHandValue][currentHandValue]++
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++
            history[prevHandValue][(currentHandValue + 2) % 3]++
        }
    }

}