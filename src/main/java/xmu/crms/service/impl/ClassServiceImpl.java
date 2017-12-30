package xmu.crms.service.impl;

import xmu.crms.entity.ClassInfo;
import xmu.crms.entity.Location;
import xmu.crms.exception.ClassesNotFoundException;
import xmu.crms.exception.CourseNotFoundException;
import xmu.crms.exception.SeminarNotFoundException;
import xmu.crms.exception.UserNotFoundException;
import xmu.crms.service.ClassService;

import java.math.BigInteger;
import java.util.List;

public class ClassServiceImpl implements ClassService {
    @Override
    public void deleteClassSelectionByClassId(BigInteger classId) {

    }

    @Override
    public List<ClassInfo> listClassByCourseId(BigInteger courseId) throws CourseNotFoundException {
        return null;
    }

    @Override
    public ClassInfo getClassByClassId(BigInteger classId) throws ClassesNotFoundException {
        return null;
    }

    @Override
    public void updateClassByClassId(BigInteger classId, ClassInfo newClass) throws ClassesNotFoundException {

    }

    @Override
    public void deleteClassByClassId(BigInteger classId) throws ClassesNotFoundException {

    }

    @Override
    public BigInteger insertCourseSelectionById(BigInteger userId, BigInteger classId) throws UserNotFoundException, ClassesNotFoundException {
        return null;
    }

    @Override
    public void deleteCourseSelectionById(BigInteger userId, BigInteger classId) throws UserNotFoundException, ClassesNotFoundException {

    }

    @Override
    public Location getCallStatusById(BigInteger classId, BigInteger seminarId) throws SeminarNotFoundException {
        return null;
    }

    @Override
    public BigInteger insertClassById(BigInteger courseId, ClassInfo classInfo) throws CourseNotFoundException {
        return null;
    }

    @Override
    public void deleteClassByCourseId(BigInteger courseId) throws CourseNotFoundException {

    }

    @Override
    public BigInteger callInRollById(Location location) throws SeminarNotFoundException, ClassesNotFoundException {
        return null;
    }

    @Override
    public void endCallRollById(BigInteger seminarId, BigInteger classId) throws SeminarNotFoundException, ClassesNotFoundException {

    }

    @Override
    public List<ClassInfo> listClassByUserId(BigInteger userId) throws IllegalArgumentException, ClassesNotFoundException {
        return null;
    }
}
