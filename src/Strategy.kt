/*
じゃんけんの戦略を表すインターフェース
 */
interface Strategy {
    fun nextHand(): Hand
    fun study(win: Boolean)
}