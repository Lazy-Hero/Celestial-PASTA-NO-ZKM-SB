/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.k.m;

public class hA {
    private static /* synthetic */ int d;
    private /* synthetic */ String e;
    private /* synthetic */ v f;
    private /* synthetic */ String b;
    private /* synthetic */ boolean c;
    private /* synthetic */ String a;

    public String d() {
        return this.a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static int g() {
        return d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        int n2 = hA.g();
        Object object2 = object;
        if (n2 != 0) {
            if (!(object2 instanceof hA)) {
                return false;
            }
            object2 = object;
        }
        hA hA2 = (hA)object2;
        boolean bl2 = hA2.a().equals(this.e);
        if (n2 != 0) {
            if (!bl2) return false;
            bl2 = hA2.b().equals(this.b);
        }
        if (n2 == 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    static {
        if (hA.g() == 0) {
            hA.b(125);
        }
    }

    public static void b(int n2) {
        d = n2;
    }

    public String toString() {
        String string;
        block0: {
            int n2 = hA.e();
            string = String.format("AccountData[%s:%s:%s:%s]", this.b, this.e, this.a, this.c);
            if (m.d()) break block0;
            hA.b(++n2);
        }
        return string;
    }

    public static int e() {
        int n2 = hA.g();
        if (n2 == 0) {
            return 75;
        }
        return 0;
    }

    public boolean f() {
        return this.c;
    }

    public String a() {
        return this.e;
    }

    public String b() {
        return this.b;
    }

    public v c() {
        return this.f;
    }
}

