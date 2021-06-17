package com.raghu.algorithms.problemsolving;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = {Sample.class})
public class SampleTest {

    Sample sample = new Sample();

    @Test
    void sampleMethod(){
        int result = sample.sampleMethod();
        assertThat(result).isEqualTo(5);
    }
}
