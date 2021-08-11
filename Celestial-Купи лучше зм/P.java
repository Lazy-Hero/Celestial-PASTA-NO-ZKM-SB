/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.E.a;
import net.minecraft.k.m;

public class P {
    public static /* synthetic */ a a;

    public static int a() {
        String string = System.getProperty("os.name").toLowerCase();
        m[] arrm = ef.b();
        int n2 = string.contains("win");
        if (arrm != null) {
            if (n2 != 0) {
                return 2;
            }
            n2 = string.contains("mac");
        }
        if (arrm != null) {
            if (n2 != 0) {
                return 3;
            }
            n2 = string.contains("solaris");
        }
        if (arrm != null) {
            if (n2 != 0) {
                return 1;
            }
            n2 = string.contains("sunos");
        }
        if (arrm != null) {
            if (n2 != 0) {
                return 1;
            }
            n2 = string.contains("linux");
        }
        if (arrm != null) {
            if (n2 != 0) {
                return 0;
            }
            n2 = string.contains("unix") ? 1 : 0;
        }
        if (arrm != null) {
            if (n2 != 0) {
                return 0;
            }
            n2 = 4;
        }
        return n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

