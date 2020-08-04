package stub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import stub.GradeService;
import stub.GradeSystem;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GradeServiceTestMockito {
    @Mock
    private GradeSystem gradeSystemMockito;
    @InjectMocks
    private GradeService gradeService;
    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        when(gradeSystemMockito.gradesFor(0)).thenReturn(Arrays.asList(80.0,90.0,100.0));
        double result = gradeService.calculateAverageGrades(0);
        assertEquals(90.0,result);
    }
}