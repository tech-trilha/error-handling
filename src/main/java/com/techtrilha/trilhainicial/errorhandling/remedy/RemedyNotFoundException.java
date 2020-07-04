package com.techtrilha.trilhainicial.errorhandling.remedy;

import com.techtrilha.trilhainicial.errorhandling.util.RestApiException;
import com.techtrilha.trilhainicial.errorhandling.util.ErrorResponse;
import org.springframework.http.HttpStatus;

public final class RemedyNotFoundException extends RestApiException {

  public static RemedyNotFoundException build(final String correlationId, final String id) {
    final var errorBody = new ErrorResponse(correlationId, "RESOURCE_NOT_FOUND",
        String.format("Remedy with id %s not found.", id));
    return new RemedyNotFoundException(errorBody);
  }

  private RemedyNotFoundException(ErrorResponse errorBody) {
    super(HttpStatus.NOT_FOUND, errorBody);
  }

}
