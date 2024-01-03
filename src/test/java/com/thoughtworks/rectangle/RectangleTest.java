package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;


public class RectangleTest {
    @Test
    void shouldReturnAreaOf10WhenLengthIs5AndBreathIs2() {
        int length = 5;
        int breadth = 2;
        Rectangle rectangle = new Rectangle(length,breadth);
        int area = rectangle.area();
        assertThat(area,equalTo(10));
    }
}