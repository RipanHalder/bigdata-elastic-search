package com.bigdata.ripanhalder.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.EXPECTATION_FAILED)
public class ExpectationFailed extends RuntimeException {
    /**
	 * Added a generated serial ID
	 */
	private static final long serialVersionUID = 7336828484720970175L;
	private String message;
    private HttpStatus status = HttpStatus.EXPECTATION_FAILED;
    public ExpectationFailed(String message) {
        super(String.format("%s",message));
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
