package com.example.student_library_management_system.requestdto;

import com.example.student_library_management_system.enums.CardStatus;

public class CardRequestDto {

    private CardStatus cardStatus;

    private int studentId;

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
