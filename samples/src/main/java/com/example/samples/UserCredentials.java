package com.example.samples;

import lombok.Data;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class UserCredentials {

    @NotEmpty(message = "Please provide your name")
    @Size(min=5,max=30)
    private final String userName;

    @NotEmpty(message = "Provide password")
    @Size(min=8,max=25)
    private final String password;

//    @NotEmpty(message = "Provide your mail id")
//    @Email
//    private final String email;
//
//    @NotEmpty(message = "Provide Contact number")
//    @Digits(integer = 10,fraction = 0)
//    private final int contactNumber;
//
//    @NotEmpty(message = "Provide your pan number")
//    @Size(max=10)
//    private final String panNumber;
//
//    @NotEmpty(message = "Provide aadhar number")
//    @Digits(integer = 12, fraction = 0)
//    private final int aadharNumber;
//
//    @NotEmpty(message = "Select the necessary plan")
//    private final String selectedPlan;
//
//    @NotEmpty(message = "Provide your address")
//    private final String address;
//



}
