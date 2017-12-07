package xmu.crms.entity;

import java.util.ArrayList;
import java.util.List;

public class PresentationGrade {
    private List<Grade> presentationGrade;

    public PresentationGrade() {
        presentationGrade = new ArrayList<Grade>();
    }

    public PresentationGrade(List<Grade> presentationGrade) {
        this.presentationGrade = presentationGrade;
    }

    public List<Grade> getPresentationGrade() {
        return presentationGrade;
    }

    public void setPresentationGrade(List<Grade> presentationGrade) {
        this.presentationGrade = presentationGrade;
    }
}
