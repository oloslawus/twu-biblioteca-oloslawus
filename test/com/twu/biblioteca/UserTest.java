package com.twu.biblioteca;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void shouldReturnUserInformationInCorrectFormat(){
        User user = new User("1", "ola", "ola123", "Aleksandra", "Zyto", Role.USER, "aleksandra.zyto@op.pl");
        String expectedResult = "Id: 1\n" +
                "Username: ola\n" +
                "First name: Aleksandra\n" +
                "Last name: Zyto\n" +
                "Role: USER\n" +
                "Email: aleksandra.zyto@op.pl";
        Assert.assertEquals(expectedResult, user.toString());

    }

}
