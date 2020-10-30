package io.codeswarm.oracledb.exception;

public class NoDataException extends Exception {

    public NoDataException(Long id) {
        super("No data found!" + id);
    }
}
