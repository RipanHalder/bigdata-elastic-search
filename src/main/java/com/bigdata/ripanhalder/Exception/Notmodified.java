package com.bigdata.ripanhalder.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value= HttpStatus.NOT_MODIFIED)
public class Notmodified extends RuntimeException {
        /**
	 * Added a generated serial ID
	 */
	private static final long serialVersionUID = -1181285126890024116L;
		private String message;
    private HttpStatus status = HttpStatus.NOT_MODIFIED;
        public Notmodified(String message) {
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
