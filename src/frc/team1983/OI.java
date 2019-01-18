package frc.team1983;

import edu.wpi.first.wpilibj.Joystick;

import java.util.HashMap;

public class OI {
    private HashMap<JoyList, Joystick> joyMap;

    public static int Y_AXIS = 0;
    public static int X_AXIS = 1;

    public OI()
    {
        joyMap = new HashMap<>();
        joyMap.put(JoyList.LEFT, new Joystick(JoyList.LEFT.PORT));
        joyMap.put(JoyList.RIGHT, new Joystick(JoyList.RIGHT.PORT));
        joyMap.put(JoyList.PANEL, new Joystick(JoyList.PANEL.PORT));

    }

    public double getX(JoyList joystick)
    {
        return joyMap.get(joystick).getX();
    }

    public double getY(JoyList joystick)
    {
        return joyMap.get(joystick).getY();
    }

    public enum JoyList
    {
        LEFT(0),
        RIGHT(1),
        PANEL(2)
        ;

        public int PORT;
        JoyList(int port)
        {
            this.PORT = port;
        }
    }
}
