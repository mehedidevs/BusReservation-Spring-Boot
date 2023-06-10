package com.mehedi.reservation.Bus.Reservation.models;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.nio.file.AccessDeniedException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ReservationApiException.class)
    public ResponseModel<ErrorDetails> handleReservationApiException
            (
                    ReservationApiException exception,
                    WebRequest webRequest
            ) {

        final ErrorDetails errorDetails = new ErrorDetails();

        errorDetails.setErrorCode(exception.getStatus().value());
        errorDetails.setErrorMessage(exception.getMessage());
        errorDetails.setDevErrorMessage(webRequest.getDescription(false));
        errorDetails.setTimeStamp(System.currentTimeMillis());

        return new ResponseModel<>(HttpStatus.BAD_REQUEST.value(), "Runtime Error", errorDetails);

    }

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseModel<ErrorDetails> handleAccessDeniedApiException
            (
                    AccessDeniedException exception,
                    WebRequest webRequest
            ) {

        final ErrorDetails errorDetails = new ErrorDetails();

        errorDetails.setErrorCode(HttpStatus.FORBIDDEN.value());
        errorDetails.setErrorMessage(exception.getMessage());
        errorDetails.setDevErrorMessage(webRequest.getDescription(false));
        errorDetails.setTimeStamp(System.currentTimeMillis());

        return new ResponseModel<>(HttpStatus.FORBIDDEN.value(), "Access Denied", errorDetails);

    }

    @ExceptionHandler(Exception.class)
    public ResponseModel<ErrorDetails> handleGlobalApiException
            (
                    Exception exception,
                    WebRequest webRequest
            ) {

        final ErrorDetails errorDetails = new ErrorDetails();

        errorDetails.setErrorCode(HttpStatus.FORBIDDEN.value());
        errorDetails.setErrorMessage(exception.getMessage());
        errorDetails.setDevErrorMessage(webRequest.getDescription(false));
        errorDetails.setTimeStamp(System.currentTimeMillis());

        return new ResponseModel<>(HttpStatus.FORBIDDEN.value(), "Not Found", errorDetails);

    }


}
