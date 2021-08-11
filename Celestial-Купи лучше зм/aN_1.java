/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.q.c;
import net.minecraft.k.m;

public class aN
implements ag {
    public /* synthetic */ String f;
    private static /* synthetic */ int e;
    public /* synthetic */ int g;

    public int e() {
        return this.g;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public String c() {
        return this.f;
    }

    static {
        if (aN.a() != 0) {
            aN.b(59);
        }
    }

    public static int a() {
        int n2 = aN.d();
        if (n2 == 0) {
            return 36;
        }
        return 0;
    }

    public aN(int n2, String string) {
        int n3 = aN.d();
        int n4 = n3;
        this.g = n2;
        this.f = string;
        if (n4 == 0) {
            m.b(!m.c());
        }
    }

    public static void b(int n2) {
        e = n2;
    }

    public void b() {
        block6: {
            c c10;
            block5: {
                int n2 = aN.a();
                c10 = aN.b.s;
                if (n2 == 0) {
                    if (c10 == null) {
                        return;
                    }
                    c10 = aN.b.s;
                }
                if (n2 != 0) break block5;
                if (!(c10.V() > 0.0f)) break block6;
                c10 = aN.b.s;
            }
            c10.b(this.f);
        }
    }

    public static int d() {
        return e;
    }
}

