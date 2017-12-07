package xmu.crms.entity;

import java.util.ArrayList;
import java.util.List;

public class SeminarGrade {
    private List<Grade> presentationGrade;
    private int reportGrade;
    private int grade;

    public SeminarGrade() {
        presentationGrade = new ArrayList<Grade>();
    }

    public SeminarGrade(List<Grade> presentationGrade, int reportGrade, int grade) {
        this.presentationGrade = presentationGrade;
        this.reportGrade = reportGrade;
        this.grade = grade;
    }

    public List<Grade> getPresentationGrade() {
        return presentationGrade;
    }

    public void setPresentationGrade(List<Grade> presentationGrade) {
        this.presentationGrade = presentationGrade;
    }

    public int getReportGrade() {
        return reportGrade;
    }

    public void setReportGrade(int reportGrade) {
        this.reportGrade = reportGrade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
