package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest
{
    @Test
    void op_test()
    {
        Sample sample = new Sample();
        int a = 19;
        int b = 27;
        int expectedAdd = 46;
        int expectedMul = 513;

        Assertions.assertThat(sample.op(Sample.Operation.ADD, a, b))
            .isEqualTo(expectedAdd);
        Assertions.assertThat(sample.op(Sample.Operation.MULT, a, b))
            .isEqualTo(expectedMul);
    }

    @Test
    void fact_exception()
    {
        Sample sample = new Sample();
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> sample.fact(-1))
            .withMessage("N should be positive");
    }

    @Test
    void fact_operation()
    {
        Sample sample = new Sample();
        Assertions.assertThat(sample.fact(10))
            .isEqualTo(3628800);
    }
}
