package com.techtrilha.trilhainicial.errorhandling.util;

import org.springframework.http.HttpStatus;

public abstract class RestApiException extends RuntimeException {

  private final HttpStatus statusCode;
  private final ErrorResponse errorBody;

  protected RestApiException(HttpStatus statusCode,
                             ErrorResponse errorBody) {
    super(errorBody.getMessage());
    this.statusCode = statusCode;
    this.errorBody = errorBody;
  }

  public HttpStatus getStatusCode() {
    return statusCode;
  }

  public ErrorResponse getErrorBody() {
    return errorBody;
  }

}
