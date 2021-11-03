package com.bdlz.LamdaExpression;

import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class ExceptionUserRegistretionTest {
    ExceptionUserRegistretion exceptionUserRegistration = new ExceptionUserRegistretion();

    @Test
    public void givenFirstName_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.firstName("Priyanka");
        assertEquals(true, actualResult);
    }

    @Test
    public void givenFirstName_IsProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.firstName("Priyanka");
        Assert.assertEquals(false, actualResult);
    }

    @Test
    public void givenLastName_IsProper_ReturnTrue() {
        boolean actualResult = exceptionUserRegistration.lastName("Chouhan");
        Assert.assertEquals(true, actualResult);
    }

    @Test
    public void givenLastName_IsProper_ReturnFalse() {
        boolean actualResult = exceptionUserRegistration.lastName("Chouhan");
        Assert.assertEquals(false, actualResult);
    }

}