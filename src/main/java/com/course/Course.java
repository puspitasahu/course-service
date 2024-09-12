package com.course;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Course {
    String courseId;
    String name;
    Double price;
}
