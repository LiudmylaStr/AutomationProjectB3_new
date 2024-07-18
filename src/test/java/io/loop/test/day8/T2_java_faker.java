package io.loop.test.day8;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class T2_java_faker {
    @Test
    public void java_faker(){
    Faker faker = new Faker();
        System.out.println(faker.name().fullName());
 //faker.numerify("\###-###-###\");
        System.out.println(faker.letterify("???????????"));
        System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());
        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());
    }
}
