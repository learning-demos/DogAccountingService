package com.github.doge;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CanaryTest {


    @Test
    public void should_be_able_to_run_tests_with_given_dependency() {
        assertThat("ok").isEqualTo("ok");
    }
}
