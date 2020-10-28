package com.bigdata.ripanhalder.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.PRECONDITION_FAILED)
public class PreconditionFailed extends RuntimeException {
    /**
	 * Added a generated serial ID
	 */
	private static final long serialVersionUID = 7351971058199945147L;
	private String message;
    private HttpStatus status = HttpStatus.PRECONDITION_FAILED;
    public PreconditionFailed(String message) {
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
