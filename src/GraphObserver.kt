/*
簡易グラフで数を表示するクラス
 */
class GraphObserver: Observer {
    override fun update(generator: NumberGenerator) {
        println("GraphObserver:")
        val count: Int = generator.getNumber()
        for (i in 0 until count) {
            println("*")
        }
        println("")
        Thread.sleep(100)
    }
}
