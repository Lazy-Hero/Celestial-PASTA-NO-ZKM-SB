/*
 * Decompiled with CFR 0.150.
 */
import java.util.Arrays;
import net.minecraft.client.main.Main;
import net.minecraft.k.m;

public class fL {
    private static /* synthetic */ boolean b;

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void main(String[] arrstring) {
        boolean bl2 = fL.b();
        String string = System.getenv().containsKey("assetDirectory") ? System.getenv("assetDirectory") : "assets";
        String[] arrstring2 = new String[]{"--version", "mcp", "--accessToken", "0", "--assetsDir", string, "--assetIndex", "1.12.2", "--userProperties", "{}"};
        Main.main(fL.a(arrstring2, arrstring));
        if (!bl2) {
            m.b(!m.d());
        }
    }

    public static boolean c() {
        boolean bl2 = fL.b();
        return !bl2;
    }

    public static <T> T[] a(T[] arrT, T[] arrT2) {
        T[] arrT3 = Arrays.copyOf(arrT, arrT.length + arrT2.length);
        boolean bl2 = fL.c();
        System.arraycopy(arrT2, 0, arrT3, arrT.length, arrT2.length);
        if (!m.d()) {
            fL.b(!bl2);
        }
        return arrT3;
    }

    public static void b(boolean bl2) {
        b = bl2;
    }

    static {
        if (!fL.b()) {
            fL.b(true);
        }
    }

    public static boolean b() {
        return b;
    }
}

