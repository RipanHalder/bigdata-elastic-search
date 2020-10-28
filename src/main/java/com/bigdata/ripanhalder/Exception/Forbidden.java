package com.bigdata.ripanhalder.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.FORBIDDEN)
public class Forbidden extends RuntimeException {
     /**
	 * Added a generated serial ID
	 */
	private static final long serialVersionUID = -7665516155654666153L;
		private String message;
    private HttpStatus status = HttpStatus.FORBIDDEN;
        public Forbidden(String message) {
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
