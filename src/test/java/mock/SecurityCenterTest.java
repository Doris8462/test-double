package mock;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SecurityCenterTest {
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */

    public class DoorPanelMock extends DoorPanel{
        private Boolean hasCalled=false;
        void close(){
            hasCalled=true;
        }

        public Boolean getHasCalled() {
            return hasCalled;
        }
    }
    private  SecurityCenter securityCenter;
    private DoorPanelMock doorPanelMock;

    @BeforeEach
    public void setUp() {
        doorPanelMock=new DoorPanelMock();
        securityCenter=new SecurityCenter(doorPanelMock);
    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        securityCenter.switchOn ();
       // assertTrue()
    }
}
