package eclectics


class SumArrayZero {

}


//5 int[5]



fun main() {
    solution(5).forEach {
        println(it)
    }
}

fun solution(k: Int) : IntArray {
    return IntArray(k) {
        list -> list
    }.also {
        list -> list[0] = -list.sum()
    }
}