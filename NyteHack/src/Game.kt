fun main() {
    val name = "용가리"
    var healthPoints = 89
    val isBlessed = true
    val isImmortal = false
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"

    val healthStatus = when (healthPoints) {
        100 -> "상태 조아용"
        in 90..99 -> "약간의 찰과상만 있음."
        in 75..89 -> if (isBlessed) {
            "경미한 상처가 있지만 빨리 치유됨!"
        }   else {
            "경미한 상처만 있음."
        }
        in 15..74 -> "많이 다친 것 같음."
        else -> "나빠용 상태!"
    }

    println("(Aura: $auraColor) " +
            "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")

    var arrowsInQuiver = 2
    if (arrowsInQuiver >= 5)
        println("화살이 충분함")
        println("더 이상의 화살을 가질 수 없음")

    println("test")
}
