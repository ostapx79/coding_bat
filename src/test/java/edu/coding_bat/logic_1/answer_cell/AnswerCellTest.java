package edu.coding_bat.logic_1.answer_cell;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnswerCellTest {
    AnswerCell answerCell = new AnswerCell();

    @Test
    public void setAnswerCell1Test() {
        assertTrue(answerCell.answerCell(false, false, false));
    }

    @Test
    public void setAnswerCell2Test() {
        assertFalse(answerCell.answerCell(false, false, true));
    }

    @Test
    public void setAnswerCell3Test() {
        assertFalse(answerCell.answerCell(true, false, false));
    }

    @Test
    public void setAnswerCell4Test() {
        assertTrue(answerCell.answerCell(true, true, false));
    }

    @Test
    public void setAnswerCell5Test() {
        assertTrue(answerCell.answerCell(false, true, false));
    }

    @Test
    public void setAnswerCell6Test() {
        assertFalse(answerCell.answerCell(true, true, true));
    }

}