package io.codeswarm.oracledb.exception;

public class PersonNotFoundException extends RuntimeException {

    public PersonNotFoundException() {
        super("Person not found!");
    }
}
