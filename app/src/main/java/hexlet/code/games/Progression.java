package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Random;


public class Progression {

    private static final int START_RANGE_STEP = 1;
    private static final int END_RANGE_STEP = 50;
    private static final int START_RANGE_PROGRESSION = 1;
    private static final int END_RANGE_PROGRESSION = 50;
    private static final int START_RANGE_LENGTH_ARRAY = 5;
    private static final int END_RANGE_LENGTH_ARRAY = 10;
    private static final int START_RANGE_ENIGMA_INDEX = 0;

    private static String[] getProgression() {
        var startProgression = Random.getInRange(START_RANGE_PROGRESSION, END_RANGE_PROGRESSION);
        var lengthArray = Random.getInRange(START_RANGE_LENGTH_ARRAY, END_RANGE_LENGTH_ARRAY);
        var stepProgression = Random.getInRange(START_RANGE_STEP, END_RANGE_STEP);
        var arrProgression  = new String[lengthArray];

        for (var i = 0; i < lengthArray; i++) {
            arrProgression[i] = String.valueOf(startProgression + stepProgression * (i + 1));
        }
        return arrProgression;
    }

    private static  String[] round() {

        var progression = getProgression();
        var enigmaIndex = Random.getInRange(START_RANGE_ENIGMA_INDEX, progression.length - 1);
        var correctAnswer =  progression[enigmaIndex];
        progression[enigmaIndex] = "..";

        String question =  String.join(" ", progression);
        return new String[] {question, String.valueOf(correctAnswer)};
    }

    public static void start() {
        String rules = "What number is missing in the progression?";
        Engine.startGame(() -> round(), rules);
    }
}
