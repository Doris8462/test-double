package stub;


import mock.SecurityCenter;
import mock.SecurityCenterTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    private GradeService gradeService;
    private GradeSystemTub gradeSystemTub;


    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        //Assertions.assertEquals(90.0, result);
        gradeSystemTub=new GradeSystemTub();
        gradeService=new GradeService(gradeSystemTub);
        double result=gradeService.calculateAverageGrades(1);
        assertEquals(90.0,result);
    }
}

