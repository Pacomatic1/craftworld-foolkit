// This file launches the program; this is the main entry point, and the entire thing is pure Java + some OpenGL shenanigans; if you run this file you can debug the whole thing.
// That said! I am running VS Code, notably with the Java and Maven extensions. So, if you want a way to debug this thing, that's your ticket...? 
package toolkit;

import com.github.weisj.darklaf.LafManager;
import com.github.weisj.darklaf.theme.DarculaTheme;
import configurations.Config;
import cwlib.singleton.ResourceSystem;
import toolkit.windows.Toolkit;
import java.awt.*;


public class Launcher
{
    public static void main(String[] args)
    {
        Config.initialize();
        LafManager.install(new DarculaTheme());
        ResourceSystem.GUI_MODE = true;
        EventQueue.invokeLater(() ->
        {
            new Toolkit().run(args).setVisible(true); // Tookit() is pulling from toolkit.windows.Toolkit. 
            // Upon shallow inspection, you CAN copy this twice and there will be scarce problems.
            // Keyword: Scarce. 30 seconds of testing and apparently they... share a console?
            // Also note that the this seems to be designed to never open two Toolkit()s at once, so I think the program is only built like this so that they can do stuff like: The reboot function.

        });
    }
}

