package com.bitwise.test;


import com.bitwise.main.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

public class LiftTest {


   

    @Test(expected = InvalidFloorselectionException.class)
    public void ItShouldReachToTheCorrectFloor() {
        //given
        Floor floor = new Floor();
        Lift lift = new Lift();

        //when
        lift.isLiftReachToTheCorrectFloor(new SelectButton(10));
    }


     @Test
     public void itShouldMoveTheLift(){
        //given
        Lift lift = new Lift();

        //when
        lift.moveTheLift(new SelectButton(1));
        //then
        Assert.assertEquals(true,lift.isLiftMoved(new SelectButton(1)));
    }

   @Test
    public void itShouldMoveTheLiftToGoInTheUpwordDirection(){
        //given
        Lift lift = new Lift();
        //when
        lift.moveTheLift(new SelectButton(0));
        lift.moveTheLift(new SelectButton(1));
        lift.moveTheLift(new SelectButton(3));

Assert.assertEquals(true,lift.isLiftMoved(new SelectButton(3)));




        //then

    }

}

