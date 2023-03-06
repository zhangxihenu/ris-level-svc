package com.hk.rislevelsvc.core.a;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class jiekou {
    public class Circle implements Shape{

        @Override
        public String name() {
            return "this is circle";
        }
    }
    public class Square implements Shape{

        @Override
        public String name() {
            return "this is Square";
        }
    }


    @Test
    public void test(){
        Shape circleShape = new Circle();
        Shape squareShape = new Square();
        List<Shape> list = new ArrayList<>();
        list.add(circleShape);
        list.add(squareShape);
        for (Shape shape : list) {
            System.out.println("shape.name() = " + shape.name());;
        }
    }
}
