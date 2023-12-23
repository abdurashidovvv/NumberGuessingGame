package uz.abdurashidov.numberguessing

data class GuessingGameState(
    var userNumber: String = "",
    var noOfGuessLeft: Int = 8,
    var guessedNumbersList: List<Int> = emptyList(),
    var mysteryNumber: Int = (1..99).random(),
    var hintDescription: String = "Guess\nthe mystery number between\n0 and 100.",
    var gameStage: GameStage = GameStage.PLAYING
)

enum class GameStage {
    WON,
    LOSE,
    PLAYING
}