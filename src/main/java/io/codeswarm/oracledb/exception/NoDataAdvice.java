package io.codeswarm.oracledb.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class NoDataAdvice {

    @ExceptionHandler(NoDataException.class)
    public ResponseEntity<ExceptionMessage> noDataHandler(NoDataException ex) {
        ExceptionMessage em = new ExceptionMessage(LocalDateTime.now(), ex.getMessage());
        return new ResponseEntity<>(em, HttpStatus.NO_CONTENT);
    }
}
