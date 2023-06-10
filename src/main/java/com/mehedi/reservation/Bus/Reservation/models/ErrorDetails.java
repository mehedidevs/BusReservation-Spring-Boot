package com.mehedi.reservation.Bus.Reservation.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetails {

    private int errorCode;
    private String errorMessage;
    private String devErrorMessage;
    private Long timeStamp;


}

