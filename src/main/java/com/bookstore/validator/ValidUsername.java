package com.bookstore.validator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({TYPE,FIELD})// ap dung cho cac loai du lieu (class) va cac truong (field)
@Retention(RUNTIME)// cho phep sd runtime kiem tra
@Constraint(validatedBy = ValidUsernameValidator.class)// lop validator can kiem tra

public @interface ValidUsername {
    String message() default "Tên đăng nhập không hợp lệ"; // thong bao khi vi pham rang buoc
    Class<?>[] groups() default {};  //nhom cac rang buoc lien quan lai voi nhau
    Class<? extends Payload>[] payload() default{}; // cung cap them chi tiet ve loi
}
