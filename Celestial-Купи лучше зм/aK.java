/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.k.m;
import net.minecraft.u.h;
import net.minecraft.w.a_;
import net.minecraft.w.am;
import net.minecraft.w.d;

public class aK
implements ag {
    private static /* synthetic */ boolean e;

    public static int f() {
        int n2 = 0;
        boolean bl2 = aK.c();
        while (n2 < 9) {
            aK.b.s.cB.a(n2);
            if (bl2) {
                if (aK.b.s.cB.a(n2).w() == h.b3) {
                    return n2;
                }
                ++n2;
            }
            if (bl2) continue;
        }
        return 0;
    }

    static {
        if (!aK.c()) {
            aK.b(true);
        }
    }

    public static int b() {
        int n2 = 0;
        boolean bl2 = aK.c();
        while (n2 < 45) {
            d d10 = aK.b.s.cu.a(n2).d();
            if (bl2) {
                if (d10.w() == h.A) {
                    return n2;
                }
                ++n2;
            }
            if (bl2) continue;
        }
        if (!m.d()) {
            aK.b(!bl2);
        }
        return -1;
    }

    public static void b(boolean bl2) {
        e = bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static int d() {
        int n2;
        block4: {
            int n3 = 0;
            boolean bl2 = aK.c();
            while (n3 < 9) {
                d d10 = aK.b.s.cB.a(n3);
                if (bl2) {
                    n2 = d10.w() instanceof am;
                    if (!bl2) break block4;
                    if (n2 != 0) {
                        return n3;
                    }
                    ++n3;
                }
                if (bl2) continue;
            }
            n2 = 1;
        }
        return n2;
    }

    public static boolean e() {
        boolean bl2;
        block4: {
            int n2 = 0;
            boolean bl3 = aK.c();
            while (n2 < 9) {
                aK.b.s.cB.a(n2);
                if (bl3) {
                    bl2 = aK.b.s.cB.a(n2).w() instanceof am;
                    if (!bl3) break block4;
                    if (bl2) {
                        return true;
                    }
                    ++n2;
                }
                if (bl3) continue;
                m.b(!m.c());
                break;
            }
            bl2 = false;
        }
        return bl2;
    }

    public static int a() {
        int n2;
        block4: {
            int n3 = 0;
            boolean bl2 = aK.g();
            while (n3 < 9) {
                d d10 = aK.b.s.cB.a(n3);
                if (!bl2) {
                    n2 = d10.w() instanceof a_;
                    if (bl2) break block4;
                    if (n2 != 0) {
                        return n3;
                    }
                    ++n3;
                }
                if (!bl2) continue;
            }
            n2 = 1;
        }
        return n2;
    }

    public static boolean c() {
        boolean bl2 = aK.g();
        return !bl2;
    }

    public static boolean g() {
        return e;
    }
}

