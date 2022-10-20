fun main()
{
    val a = 15
    val b = 1

    val res = !(a >= b && b > 21 || a != b && !(a == 7) || b % a <= a)

    println(res)

}