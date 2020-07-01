/*
数を生成するオブジェクトを表す抽象クラス
 */
abstract class NumberGenerator {
    private var observers: ArrayList<Observer> = ArrayList()
    fun addObserver(observer: Observer){
        observers.add(observer)
    }
    fun deleteObserver(observer: Observer){
        observers.remove(observer)
    }
    fun notifyObservers(){
        val iterator: Iterator<Observer> = observers.iterator()
        while (iterator.hasNext()) {
            val observer: Observer = iterator.next()
            observer.update(this)
        }
    }
    abstract fun getNumber(): Int
    abstract fun execute()
}