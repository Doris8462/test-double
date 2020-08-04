package mockito;
import mock.DoorPanel;
import mock.SecurityCenter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;

public class SecurityCenterTestMockito {
    @Mock
    DoorPanel doorPanelMockito;
    @InjectMocks
    SecurityCenter securityCenter;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        securityCenter = new SecurityCenter(doorPanelMockito);
    }
    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn();
        verify(doorPanelMockito).close();
    }
}
