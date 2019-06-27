package com.github.abstractkim.codinginterview.codinginterview.chap1arraysandstrings;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class UrlifyTest {

    @Test
    public void transfrom() {
        String input = "Mr John Smith     ";
        int length = 13;
        String output = "Mr%20John%20Smith";
        final UrlifyBruthForce urlifyBruthForce = new UrlifyBruthForce();
        final String transfromed = urlifyBruthForce.transfrom(input, length);
        assertThat(transfromed).isEqualTo(output);

    }

    @Test
    public void testGetSpaceCount(){
        String input = "Mr John Smith          ";
        assertThat(UrlifyBruthForce.getSpaceCount(input, 13)).isEqualTo(2);
    }
}