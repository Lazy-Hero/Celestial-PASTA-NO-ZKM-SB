/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import net.minecraft.k.m;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class fC {
    private static final /* synthetic */ String a;
    private static final /* synthetic */ Logger c;
    private static /* synthetic */ boolean b;

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void b(String string) {
        c.info("[Shaders] " + string);
    }

    public static void c(String string, Object ... arrobject) {
        String string2 = String.format(string, arrobject);
        boolean bl2 = fC.c();
        c.debug("[Shaders] " + string2);
        if (bl2) {
            m.b(!m.c());
        }
    }

    public static void b(boolean bl2) {
        b = bl2;
    }

    public static void d(String string, Object ... arrobject) {
        String string2 = String.format(string, arrobject);
        c.error("[Shaders] " + string2);
    }

    public static boolean c() {
        boolean bl2 = fC.b();
        return !bl2;
    }

    public static void d(String string) {
        c.error("[Shaders] " + string);
    }

    public static void b(String string, Object ... arrobject) {
        String string2 = String.format(string, arrobject);
        boolean bl2 = fC.b();
        c.info("[Shaders] " + string2);
        if (m.c()) {
            fC.b(!bl2);
        }
    }

    public static void a(String string) {
        c.debug("[Shaders] " + string);
    }

    static {
        a = "[Shaders] ";
        c = LogManager.getLogger();
        fC.b(true);
    }

    public static void a(String string, Object ... arrobject) {
        String string2 = String.format(string, arrobject);
        c.warn("[Shaders] " + string2);
    }

    public static boolean b() {
        return b;
    }

    public static void c(String string) {
        c.warn("[Shaders] " + string);
    }
}

