package racingcar.view;

import racingcar.model.Car;
import racingcar.model.Cars;

import java.util.List;

public class OutputView {
    private static final String RACING_RESULT_PROMPT = "실행결과";
    private static final String MOVE_DISTANCE_MARK = "-";
    private static final String LINE_DIVISION = "\n";
    private static final String WINNER_CONNECTION_SEPARATOR = ", ";

    private OutputView() {
        throw new AssertionError();
    }

    public static void printCarRacingResult() {
        System.out.println(RACING_RESULT_PROMPT);
    }

    public static void printCarRacingIntermediateState(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.println(car.getName() + "\t: " + getDashOnDistanceByCars(car.currentPosition()));
        }
        System.out.print(LINE_DIVISION);
    }

    public static String getDashOnDistanceByCars(int movementDistance) {
        return MOVE_DISTANCE_MARK.repeat(movementDistance);
    }

    public static void printWinner(Cars cars) {
        List<String> winners = cars.getWinnerNames();
        String winnerOutputString = String.join(WINNER_CONNECTION_SEPARATOR, winners) + "가 최종 우승했습니다.";
        System.out.println(winnerOutputString);
    }
}
