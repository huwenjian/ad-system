package com.createtom.ad.advice;

import com.createtom.ad.exception.AdException;
import com.createtom.ad.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: hwj
 * @Date: 2019/1/25 14:41
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handlerAdException(HttpServletRequest request, AdException ex) {

        CommonResponse<String> commonResponse = new CommonResponse<>(-1, "business error");
        commonResponse.setData(ex.getMessage());
        return commonResponse;
    }
}
