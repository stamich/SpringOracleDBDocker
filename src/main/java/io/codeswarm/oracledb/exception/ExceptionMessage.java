package io.codeswarm.oracledb.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ExceptionMessage {

    //private int statusCode;
    private LocalDateTime timestamp;
    private String message;
    //private String description;

}
