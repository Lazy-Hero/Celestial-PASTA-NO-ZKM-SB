/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.k.m;

public class cz {
    private static /* synthetic */ int[] b;

    static {
        if (cz.b() == null) {
            cz.b(new int[4]);
        }
    }

    public static int[] b() {
        return b;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void b(int[] arrn) {
        b = arrn;
    }

    public static String a(String string) {
        int[] arrn = cz.b();
        String string2 = string + " looks like tasty nigga!!";
        if (arrn == null) {
            m.b(!m.c());
        }
        return string2;
    }
}

