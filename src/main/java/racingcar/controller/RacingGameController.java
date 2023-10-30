package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.CarName;
import racingcar.model.RacingNumber;
import racingcar.view.InputView;

public class RacingGameController {
    private final InputView inputView;
    public RacingGameController(InputView inputView) {
        this.inputView = inputView;
    }

    public void startGame() {
        String names = inputView.inputCarNames();
        String attempts = inputView.inputAttempts();
        System.out.println("자동차 이름: " + names + "시도할 회수: " + attempts);

        Car car = Car.makeCar(new CarName(names), new RacingNumber());
        car.generateRandomNumber();
        System.out.println(car.toString());
    }
}
