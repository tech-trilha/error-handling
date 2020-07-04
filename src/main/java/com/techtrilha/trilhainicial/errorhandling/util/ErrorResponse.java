package com.techtrilha.trilhainicial.errorhandling.util;

import java.time.Instant;

public class ErrorResponse {

  private final String correlationId;
  private final String errorCode;
  private final Instant timestamp = Instant.now();
  private final String message;

  public ErrorResponse(String correlationId, String errorCode, String message) {
    this.correlationId = correlationId;
    this.errorCode = errorCode;
    this.message = message;
  }

  public String getCorrelationId() {
    return correlationId;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public Instant getTimestamp() {
    return timestamp;
  }

  public String getMessage() {
    return message;
  }

}
