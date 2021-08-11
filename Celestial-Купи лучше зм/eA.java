/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import net.minecraft.k.m;

public class eA {
    public static /* synthetic */ ArrayList<h> a;

    static {
        a = new ArrayList();
    }

    public void a() {
        a.add(new h("NeverHook Release", M.NONE));
        a.add(new h("MainMenu", M.NEW));
        a.add(new h("Visuals", M.NEW));
        a.add(new h("Strong Bypasses", M.NEW));
        a.add(new h("Build: #08", M.NONE));
        boolean bl2 = M.b();
        a.add(new h("StreamerMode Feature", M.ADD));
        a.add(new h("Build: #09", M.NONE));
        a.add(new h("DiscordRPC Feature", M.ADD));
        a.add(new h("DeathCords", M.FIXED));
        a.add(new h("NoInteract", M.IMPROVED));
        a.add(new h("Some Change-Logs", M.DELETE));
        boolean bl3 = bl2;
        a.add(new h("Main Menu", M.NEW));
        a.add(new h("Logo", M.NEW));
        a.add(new h("Build: #1.0", M.NONE));
        a.add(new h("Spammer \"Custom\"", M.FIXED));
        a.add(new h("KillAura detection with TargetStrafe", M.FIXED));
        a.add(new h("InventoryWalk in Sign Editor", M.FIXED));
        a.add(new h("Jesus \"MotionUp\" setting", M.IMPROVED));
        a.add(new h("AntiAFK", M.RECODE));
        a.add(new h("ClickGUI Blur Setting", M.ADD));
        a.add(new h("Cape", M.NEW));
        a.add(new h("Build: #1.1", M.NONE));
        a.add(new h("Fixed Killaura miss", M.FIXED));
        if (!bl3) {
            m.b(!m.d());
        }
    }

    public ArrayList<h> b() {
        return a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

