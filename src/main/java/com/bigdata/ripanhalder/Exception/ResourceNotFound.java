package com.bigdata.ripanhalder.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException {
    /**
	 * Added a generated serial ID
	 */
	private static final long serialVersionUID = -8143474818619318L;

	private HttpStatus status = HttpStatus.NOT_FOUND;

    private String resourceName;
    private String fieldName;
    private Object fieldValue;

    public ResourceNotFound( String resourceName, String fieldName, Object fieldValue) {
        super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public String getResourceName() {
        return resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
