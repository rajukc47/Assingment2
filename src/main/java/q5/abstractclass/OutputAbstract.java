package q5.abstractclass;

public class OutputAbstract {

    public static void main(String[] args) {

        //for phd student
        PhdStudent phd = new PhdStudent();

        phd.takeExam();

        //for graduate student
        GraStudent gra = new GraStudent();

        gra.takeExam();
    }
}
