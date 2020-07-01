/*
数字で数を表示するクラス
 */
class DegitObserver: Observer {
    override fun update(generator: NumberGenerator) {
        println("DegitObserver:" + generator.getNumber())
        Thread.sleep(100)
    }


}