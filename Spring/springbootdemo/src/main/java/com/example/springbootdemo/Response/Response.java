package com.example.springbootdemo.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Data
public class Response {
    public Response(int i, String string, Object object) {
    }
    int code;
    String message;
    Object data;
}
