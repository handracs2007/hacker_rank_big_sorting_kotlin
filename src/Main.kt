// https://www.hackerrank.com/challenges/big-sorting/problem

fun bigSorting(unsorted: Array<String>): Array<String> {
    unsorted.sortWith(Comparator { o1, o2 -> if (o1.length != o2.length) o1.length - o2.length else o1.compareTo(o2) })

    return unsorted
}

fun main() {
    println(
        bigSorting(
            arrayOf(
                "1",
                "2",
                "100",
                "12303479849857341718340192371",
                "3084193741082937",
                "3084193741082938",
                "111",
                "200"
            )
        ).toList()
    )
}