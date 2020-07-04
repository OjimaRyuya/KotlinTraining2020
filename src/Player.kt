/*
じゃんけんをおこなうプレイヤーを表すクラス
 */
class Player(val name: String, val strategy: Strategy) {
    private var winCount: Int = 0
    private var loseCount: Int = 0
    private var gameCount: Int = 0
    fun nextHand(): Hand{
        return strategy.nextHand()
    }
    fun win(){
        strategy.study(true)
        winCount++
        gameCount++
    }
    fun lose(){
        strategy.study(false)
        loseCount++
        gameCount++
    }
    fun even(){
        gameCount++
    }
    fun getResult(): String {
        return "[" + name + ":" + gameCount + " games, " + winCount + " win, " + loseCount + " lose" + "]"
    }


}