package me.mkhwang.baseball.domain;

import me.mkhwang.baseball.util.BaseballValid;

import java.util.Scanner;

/**
 * Created by mkhwang on 2021/04/25
 * Email : orange2652@gmail.com
 * Github : https://github.com/myeongkwonhwang
 */
public class User {

    private String ballNumber;
    private BaseballValid baseballValid = new BaseballValid();

    public void insertBallNumberForUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");
        addBallCount(scanner.next());
    }

    private void addBallCount(String ballCount) {
        if(!isValid(ballCount)){
            System.out.println("정확한 숫자를 입력해주세요.");
            insertBallNumberForUser();
            return ;
        }
        this.ballNumber = ballCount;
    }

    public boolean isValid(String ballNumber) {
        return baseballValid.isBaseballTextValid(ballNumber)
                && baseballValid.isBaseballLengthValid(ballNumber)
                && baseballValid.isBaseballDuplicateValid(ballNumber);
    }

    public String getBallNumber() {
        return ballNumber;
    }

}
