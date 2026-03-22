package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;


public class Progression {

    private static  String[] round() {
        var startRangeProgression = 1;
        var endRangeProgression = 50;
        var startRangeLengthArray = 5;
        var endRangeLengthArray = 10;
        var startRangeStepProgression = 1;
        var endRangeStepProgression = 50;
        var startRangeEnigmaIndex = 0;


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
