/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;
import net.minecraft.k.m;

public class cI {
    private static /* synthetic */ int b;
    private final /* synthetic */ List<dx> c;

    public List<dx> a() {
        return this.c;
    }

    private static boolean lambda$isFriend$0(String string, dx dx2) {
        return dx2.a().equals(string);
    }

    public static void b(int n2) {
        b = n2;
    }

    private static boolean lambda$getFriend$2(String string, dx dx2) {
        return dx2.a().equals(string);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void d(String string) {
        this.c.removeIf(arg_0 -> cI.lambda$removeFriend$1(string, arg_0));
    }

    public void b(String string) {
        block0: {
            int n2 = cI.c();
            this.c.add(new dx(string));
            int n3 = n2;
            if (m.d()) break block0;
            cI.b(++n3);
        }
    }

    public cI() {
        this.c = new ArrayList<dx>();
    }

    public static int b() {
        return b;
    }

    public dx a(String string) {
        int n2 = cI.c();
        if (n2 == 0) {
            m.b(!m.d());
        }
        return this.c.stream().filter(arg_0 -> cI.lambda$getFriend$2(string, arg_0)).findFirst().get();
    }

    public void a(dx dx2) {
        this.c.add(dx2);
    }

    public static int c() {
        int n2 = cI.b();
        if (n2 == 0) {
            return 101;
        }
        return 0;
    }

    static {
        if (cI.b() != 0) {
            cI.b(10);
        }
    }

    public boolean c(String string) {
        return this.c.stream().anyMatch(arg_0 -> cI.lambda$isFriend$0(string, arg_0));
    }

    private static boolean lambda$removeFriend$1(String string, dx dx2) {
        return dx2.a().equalsIgnoreCase(string);
    }
}

