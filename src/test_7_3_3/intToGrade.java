package test_7_3_3;

public class intToGrade {
    public static void main(String[] args) {

    }

    static Grade intToGrade(int grade) {
        switch (grade) {
            case 1:
                return Grade.VERYBAD;
            case 2:
                return Grade.BAD;
            case 3:
                return Grade.SATISFACTORILY;
            case 4:
                return Grade.GOOD;
            case 5:
                return Grade.EXCELLENT;
            default:
                return Grade.NOTDEFINED;
        }

    }

    enum Grade {
        VERYBAD, BAD, SATISFACTORILY, GOOD, EXCELLENT, NOTDEFINED
    }

}
