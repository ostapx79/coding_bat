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

}