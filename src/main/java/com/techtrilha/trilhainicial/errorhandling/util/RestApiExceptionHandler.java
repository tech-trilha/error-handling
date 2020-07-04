package com.techtrilha.trilhainicial.errorhandling.util;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestApiExceptionHandler {

  @ExceptionHandler(value = {RestApiException.class})
  protected ResponseEntity<ErrorResponse> handleApiException(RestApiException error) {
    final var statusCode = error.getStatusCode();
    final var responseBody = error.getErrorBody();
    return ResponseEntity.status(statusCode)
        .body(responseBody);
  }

}
