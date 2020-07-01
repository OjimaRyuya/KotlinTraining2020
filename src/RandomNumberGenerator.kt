import kotlin.random.Random

/*
ランダムに数を生成するクラス
 */

class RandomNumberGenerator : NumberGenerator(){
    private var number: Int = 0
    override fun getNumber(): Int {
        return number
    }

    override fun execute() {
        for (i in 0..20) {
            number = Random.nextInt(50)
            notifyObservers()
        }
    }

}