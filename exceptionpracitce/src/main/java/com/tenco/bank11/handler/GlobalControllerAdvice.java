package com.tenco.bank11.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
//@ControllerAdvice
public class GlobalControllerAdvice {


	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> exception(Exception e){
		
//		System.out.println("====================");
//		System.out.println(e.getClass().getName());
//		System.out.println(e.getMessage());
//		System.out.println("====================");
		
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage()); 
	}
	
	@ExceptionHandler(MissingServletRequestParameterException.class)
	public String basicException(MissingServletRequestParameterException e) {
		String message = e.getMessage().replace("\"", "'");
		StringBuffer sb = new StringBuffer();
		sb.append("<script>");
//		sb.append("alert('"+e.getMessage()+"');");
		sb.append("alert(\""+ e.getMessage() +"\");");
		sb.append("</script>");
		System.out.println("===========================");
		System.out.println(sb.toString());
		return sb.toString();
	}
	
}
