package com.ilkiz.webproject.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ErrorType {

    INTERNAL_ERROR(2000, "Internal Server Error", INTERNAL_SERVER_ERROR),
    BAD_REQUEST_ERROR(2001, "Invalid Parameter Error", BAD_REQUEST),
    MUSTERI_BULUNAMADI(1003,"Aradiginiz musteri kayitlarda bulunamadi", INTERNAL_SERVER_ERROR),
    MUSTERI_SILINEMEDI(1004,"Musteri silinemedi", INTERNAL_SERVER_ERROR),
    SATIS_EKLEME_SORUNU(2005,"Satis Eklenirken zorunlu alanlarin bos oldugu goruldu.", INTERNAL_SERVER_ERROR);

    private int code;
    private String message;
    HttpStatus httpStatus;

}
