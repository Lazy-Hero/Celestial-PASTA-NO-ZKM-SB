/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.ar.aA;
import net.minecraft.k.h;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fZ
extends n {
    private /* synthetic */ int v;
    private /* synthetic */ fZ[] t;
    private /* synthetic */ int r;
    private final /* synthetic */ int u;
    private /* synthetic */ boolean s;
    private /* synthetic */ int q;

    @Override
    public n a(aA aA2) {
        fZ fZ2;
        String string = K.d();
        fZ fZ3 = this;
        if (string == null) {
            if (fZ3.u <= 0) {
                return super.a(aA2, 1).l();
            }
            fZ3 = this;
        }
        if (string == null) {
            if (fZ3.t == null) {
                this.t = new fZ[aA.VALUES.length];
            }
            fZ3 = this;
        }
        int n2 = fZ3.s;
        if (string == null) {
            if (n2 != 0) {
                this.a();
            }
            n2 = aA2.f();
        }
        int n3 = n2;
        fZ fZ4 = fZ2 = this.t[n3];
        if (string == null) {
            if (fZ4 == null) {
                int n4 = this.q + aA2.r();
                int n5 = this.r + aA2.p();
                int n6 = this.v + aA2.i();
                this.t[n3] = fZ2 = new fZ(n4, n5, n6, this.u - 1);
            }
            fZ4 = fZ2;
        }
        return fZ4;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public fZ(int n2, int n3, int n4, int n5) {
        super(0, 0, 0);
        this.q = n2;
        this.r = n3;
        this.v = n4;
        this.u = n5;
    }

    public static Iterable c(n n2, n n3) {
        n n4 = new n(Math.min(n2.e(), n3.e()), Math.min(n2.b(), n3.b()), Math.min(n2.a(), n3.a()));
        n n5 = new n(Math.max(n2.e(), n3.e()), Math.max(n2.b(), n3.b()), Math.max(n2.a(), n3.a()));
        return new fd(n4, n5);
    }

    private void a() {
        block4: {
            fZ fZ2;
            int n2 = 0;
            String string = K.d();
            while (n2 < 6) {
                fZ fZ3 = this.t[n2];
                if (string == null) {
                    fZ2 = fZ3;
                    if (string != null) break block4;
                    if (fZ2 != null) {
                        aA aA2 = aA.VALUES[n2];
                        int n3 = this.q + aA2.r();
                        int n4 = this.r + aA2.p();
                        int n5 = this.v + aA2.i();
                        fZ3.a(n3, n4, n5);
                    }
                    ++n2;
                }
                if (string == null) continue;
            }
            fZ2 = this;
        }
        fZ2.s = false;
    }

    @Override
    public n l() {
        return new n(this.q, this.r, this.v);
    }

    public fZ(int n2, int n3, int n4) {
        this(n2, n3, n4, 0);
    }

    public void a(int n2, int n3, int n4) {
        this.q = n2;
        this.r = n3;
        this.v = n4;
        this.s = true;
    }

    @Override
    public n a(aA aA2, int n2) {
        return n2 == 1 ? this.a(aA2) : super.a(aA2, n2).l();
    }

    @Override
    public int e() {
        return this.q;
    }

    public fZ(double d10, double d11, double d12) {
        this(h.f(d10), h.f(d11), h.f(d12));
    }

    @Override
    public int a() {
        return this.v;
    }

    public void a(double d10, double d11, double d12) {
        this.a(h.f(d10), h.f(d11), h.f(d12));
    }

    @Override
    public int b() {
        return this.r;
    }
}

