package edu.coding_bat.string_1.make_abba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeAbbaTest {
    MakeAbba makeAbba = new MakeAbba();

    @Test
    public void setMakeAbba1Test() {
        assertEquals(makeAbba.makeAbba("Hi", "Bye"), "HiByeByeHi");
    }

    @Test
    public void setMakeAbba2Test() {
        assertEquals(makeAbba.makeAbba("Yo", "Alice"), "YoAliceAliceYo");
    }

    @Test
    public void setMakeAbba3Test() {
        assertEquals(makeAbba.makeAbba("What", "Up"), "WhatUpUpWhat");
    }

    @Test
    public void setMakeAbba4Test() {
        assertEquals(makeAbba.makeAbba("aaa", "bbb"), "aaabbbbbbaaa");
    }

    @Test
    public void setMakeAbba5Test() {
        assertEquals(makeAbba.makeAbba("x", "y"), "xyyx");
    }

    @Test
    public void setMakeAbba6Test() {
        assertEquals(makeAbba.makeAbba("x", ""), "xx");
    }

    @Test
    public void setMakeAbba7Test() {
        assertEquals(makeAbba.makeAbba("", "y"), "yy");
    }

    @Test
    public void setMakeAbba8Test() {
        assertEquals(makeAbba.makeAbba("Bo", "Ya"), "BoYaYaBo");
    }

    @Test
    public void setMakeAbba9Test() {
        assertEquals(makeAbba.makeAbba("Ya", "Ya"), "YaYaYaYa");
    }
}