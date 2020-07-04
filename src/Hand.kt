/*
じゃんけんの手を表すクラス
 */
class Hand(val handValue: Int) {
    /*
    handValue
        グー　: 0
        チョキ: 1
        パー　: 2
     */
    fun isStrongerThan(otherHand: Hand): Boolean{
        return fight(otherHand) == 1
    }
    fun isWeakerThan(otherHand: Hand): Boolean{
        return fight(otherHand) == -1
    }
    private fun fight(otherHand: Hand): Int{
        return when {
            this.handValue == otherHand.handValue -> 0  //あいこ
            (this.handValue + 1) % 3 == otherHand.handValue -> 1    //勝ち
            else -> -1  //負け
        }
    }
}