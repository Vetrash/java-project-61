package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;


public class Progression {
    private static int startRangeProgression = 1;
    private static int endRangeProgression = 50;
    private static int startRangeLengthArray = 5;
    private static int endRangeLengthArray = 10;
    private static int startRangeStepProgression = 1;
    private static int endRangeStepProgression = 50;
    private static int startRangeEnigmaIndex = 0;

    private static  String[] round() {

        var startProgression = Random.getInRange(startRangeProgression, endRangeProgression);
        var lengthArray = Random.getInRange(startRangeLengthArray, endRangeLengthArray);
        var enigmaIndex = Random.getInRange(startRangeEnigmaIndex, lengthArray - 1);
        var stepProgression = Random.getInRange(startRangeStepProgression, endRangeStepProgression);

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
