package com.tenco.greenShop1.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlerException {

	@ExceptionHandler(LoginException.class)
	public String basicException(LoginException e) {
		StringBuffer sb = new StringBuffer();
		sb.append("<script>");
		// 반드시 마지막에 세미콜론을 붙여서 사용하자
		sb.append("alert('" + e.getMessage() + "');");
		sb.append("history.back();");
		sb.append("</script>");

		return sb.toString();
	}

}
