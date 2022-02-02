package com.gtecnologia.appStore.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.gtecnologia.appStore.services.exceptions.DatabaseIntegrityException;
import com.gtecnologia.appStore.services.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resouceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
		String error = "Recurso não encontrado";
		HttpStatus status = HttpStatus.NOT_FOUND;

		StandardError resp = new StandardError();
		resp.setTimestamp(Instant.now());
		resp.setStatus(status.value());
		resp.setError(error);
		resp.setMessage(e.getMessage());
		resp.setPath(request.getRequestURI());

		return ResponseEntity.status(status).body(resp);
	}
	
	@ExceptionHandler(DatabaseIntegrityException.class)
	public ResponseEntity<StandardError> dataBaseIntegrity(DatabaseIntegrityException e, HttpServletRequest request) {
		String error = "Database error";
		HttpStatus status = HttpStatus.BAD_REQUEST;

		StandardError resp = new StandardError();
		resp.setTimestamp(Instant.now());
		resp.setStatus(status.value());
		resp.setError(error);
		resp.setMessage(e.getMessage());
		resp.setPath(request.getRequestURI());

		return ResponseEntity.status(status).body(resp);
	}

}
