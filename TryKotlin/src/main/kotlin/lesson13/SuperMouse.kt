package lesson13

internal class SuperMouse : Mouse() {
    fun funB() {
        print("Super text")
        funA()
    }
}