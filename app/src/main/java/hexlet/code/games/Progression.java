package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;


public class Progression {

    private static  String[] round() {
        var startProgression = Random.getInRange(1, 50);
        var lengthArray = Random.getInRange(5, 10);
        var enigmaIndex = Random.getInRange(0, lengthArray - 1);
        var stepProgression = Random.getInRange(1, 50);
        var arrProgression  = new String[lengthArray];
        for (var i = 0; i < lengthArray; i++) {
            arrProgression[i] = String.valueOf(startProgression + stepProgression * (i + 1));
        }
        var correctAnswer =  arrProgression[enigmaIndex];
        arrProgression[enigmaIndex] = "..";

        String question = "Question: " + String.join(" ", arrProgression);
        return new String[] {question, String.valueOf(correctAnswer)};
    }

    public static void start() {
        String rules = "What number is missing in the progression?";
        Engine.startGame(() -> round(), rules);
    }
}
