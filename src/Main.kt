/*
動作テスト用のクラス
 */
fun main(args: Array<String>) {
    val generator: NumberGenerator = RandomNumberGenerator()
    val degitObserver = DegitObserver()
    val graphObserver = GraphObserver()
    generator.addObserver(degitObserver)
    generator.addObserver(graphObserver)
    generator.execute()
}