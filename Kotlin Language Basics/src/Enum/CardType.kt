package Enum

enum class CardType(val color: String, val maxLimit: Double=100000.00){
    SILVER("Gray",20000.00),
    GOLD("Gold",50000.00),
    PLATINUM("Black",100000.00)
}