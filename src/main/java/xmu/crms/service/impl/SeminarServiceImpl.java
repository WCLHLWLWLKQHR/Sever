package xmu.crms.service.impl;

import xmu.crms.entity.Seminar;
import xmu.crms.exception.CourseNotFoundException;
import xmu.crms.exception.SeminarNotFoundException;
import xmu.crms.service.SeminarService;

import java.math.BigInteger;
import java.util.List;

public class SeminarServiceImpl implements SeminarService {
    @Override
    public List<Seminar> listSeminarByCourseId(BigInteger courseId) throws IllegalArgumentException, CourseNotFoundException {
        return null;
    }

    @Override
    public void deleteSeminarByCourseId(BigInteger courseId) throws IllegalArgumentException, CourseNotFoundException {

    }

    @Override
    public Seminar getSeminarBySeminarId(BigInteger seminarId) throws IllegalArgumentException, SeminarNotFoundException {
        return null;
    }

    @Override
    public void updateSeminarBySeminarId(BigInteger seminarId, Seminar seminar) throws IllegalArgumentException, SeminarNotFoundException {

    }

    @Override
    public void deleteSeminarBySeminarId(BigInteger seminarId) throws IllegalArgumentException, SeminarNotFoundException {

    }

    @Override
    public BigInteger insertSeminarByCourseId(BigInteger courseId, Seminar seminar) throws IllegalArgumentException, CourseNotFoundException {
        return null;
    }
}
