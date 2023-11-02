package com.tms.spring.boot.client;

import com.tms.spring.boot.dto.StudentNotFoundException;
import feign.Response;
import feign.codec.ErrorDecoder;


public class CustomErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        int status = response.status();
        if (status == 404) {
            try {
                String errorMessage = new String(response.body().asInputStream().readAllBytes());
                return new StudentNotFoundException(errorMessage);
            } catch (Exception e) {
                return new RuntimeException();
            }
        }
        return new RuntimeException();
    }
}
