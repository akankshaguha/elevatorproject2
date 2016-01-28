package com.bitwise.main;

import java.util.ArrayList;
import java.util.Collections;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;


public class Lift {

    private List<Integer> lift = new ArrayList();

    public List getLift() {
        return lift;
    }

    public boolean isButtonInsideLiftExists(SelectButton selectButton) {
        if (selectButton.getButtonno().toString().isEmpty()) {
            return false;
        }

        throw new InvalidLiftConfigurationException();
    }

    public boolean isLiftReachToTheCorrectFloor(SelectButton selectButton) {
        if (Pattern.matches(("([0-9]{1})"), selectButton.getButtonno().toString())) {
            return true;
        }
        throw new InvalidFloorselectionException();
    }


    public void moveTheLift(SelectButton selectButton) {
        if (isLiftReachToTheCorrectFloor(selectButton)) lift.add(selectButton.getButtonno());
    }


    public boolean isLiftMoved(SelectButton selectButton) {
        if (lift.contains(selectButton)) {lift.remove(selectButton);
            return false;
        }
        return true;

    }

    public void itShouldMoveTheLiftToGoUp(SelectButton selectButton) {
        if (isButtonInsideLiftExists(selectButton)) {
            lift.add(selectButton.getButtonno());
        }
    }


    public void isLiftMovedInUpwordDirection() {
        Collections.sort(lift,(s1,s2)->s1.compareTo(s2));

    }



}