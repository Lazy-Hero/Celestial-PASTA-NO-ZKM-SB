/*
 * Decompiled with CFR 0.150.
 */
import java.util.Iterator;
import net.minecraft.k.l;
import net.minecraft.k.n;

public class dd
implements Iterator<n> {
    private /* synthetic */ int e;
    private static final /* synthetic */ int h;
    private final /* synthetic */ int b;
    private final /* synthetic */ int a;
    private static final /* synthetic */ int i;
    private static final /* synthetic */ int g;
    private final /* synthetic */ aA c;
    private final /* synthetic */ fZ f;
    private final /* synthetic */ int d;

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    public static void main(String[] arrstring) {
        n n2 = new n(10, 20, 30);
        String string = dB.i();
        n n3 = new n(30, 40, 20);
        dd dd2 = new dd(n2, n3, 1, 1);
        while (dd2.hasNext()) {
            n n4 = dd2.a();
            System.out.println("" + n4);
            if (string != null) continue;
        }
    }

    @Override
    public boolean hasNext() {
        return this.c.hasNext();
    }

    @Override
    public void remove() {
        throw new RuntimeException("Not supported");
    }

    public dd(n n2, n n3, int n4, int n5) {
        block11: {
            double d10;
            double d11;
            int n6;
            n n7;
            n n8;
            block13: {
                double d12;
                String string;
                block12: {
                    double d13;
                    double d14;
                    block9: {
                        double d15;
                        block10: {
                            String string2 = dB.i();
                            string = string2;
                            this.f = new fZ(0, 0, 0);
                            this.e = 0;
                            int n9 = n2.e();
                            if (string != null) {
                                n9 = n9 > n3.e() ? 1 : 0;
                            }
                            int n10 = n9;
                            int n11 = n2.b();
                            if (string != null) {
                                n11 = n11 > n3.b() ? 1 : 0;
                            }
                            int n12 = n11;
                            int n13 = n2.a();
                            if (string != null) {
                                n13 = n13 > n3.a() ? 1 : 0;
                            }
                            int n14 = n13;
                            n2 = this.a(n2, n10 != 0, n12 != 0, n14 != 0);
                            n3 = this.a(n3, n10 != 0, n12 != 0, n14 != 0);
                            int n15 = n10;
                            if (string != null) {
                                n15 = n15 != 0 ? -1 : 1;
                            }
                            this.b = n15;
                            int n16 = n12;
                            if (string != null) {
                                n16 = n16 != 0 ? -1 : 1;
                            }
                            this.d = n16;
                            int n17 = n14;
                            if (string != null) {
                                n17 = n17 != 0 ? -1 : 1;
                            }
                            this.a = n17;
                            l l2 = new l(n3.e() - n2.e(), n3.b() - n2.b(), n3.a() - n2.a());
                            l l3 = l2.d();
                            l l4 = new l(1.0, 0.0, 0.0);
                            double d16 = l3.g(l4);
                            d15 = Math.abs(d16);
                            l l5 = new l(0.0, 1.0, 0.0);
                            double d17 = l3.g(l5);
                            d14 = Math.abs(d17);
                            l l6 = new l(0.0, 0.0, 1.0);
                            double d18 = l3.g(l6);
                            d13 = Math.abs(d18);
                            d12 = d13 == d14 ? 0 : (d13 > d14 ? 1 : -1);
                            if (string == null) break block9;
                            if (d12 < 0) break block10;
                            d12 = d13 == d15 ? 0 : (d13 > d15 ? 1 : -1);
                            if (string == null) break block9;
                            if (d12 < 0) break block10;
                            this.e = 2;
                            n8 = new n(n2.a(), n2.b() - n4, n2.e() - n5);
                            n7 = new n(n3.a(), n2.b() + n4 + 1, n2.e() + n5 + 1);
                            n6 = n3.a() - n2.a();
                            d11 = (double)(n3.b() - n2.b()) / (1.0 * (double)n6);
                            d10 = (double)(n3.e() - n2.e()) / (1.0 * (double)n6);
                            this.c = new aA(n8, n7, d11, d10);
                            if (string != null) break block11;
                        }
                        d12 = d14 == d15 ? 0 : (d14 > d15 ? 1 : -1);
                    }
                    if (string == null) break block12;
                    if (d12 < 0) break block13;
                    d12 = d14 == d13 ? 0 : (d14 > d13 ? 1 : -1);
                }
                if (d12 < 0) break block13;
                this.e = 1;
                n8 = new n(n2.b(), n2.e() - n4, n2.a() - n5);
                n7 = new n(n3.b(), n2.e() + n4 + 1, n2.a() + n5 + 1);
                n6 = n3.b() - n2.b();
                d11 = (double)(n3.e() - n2.e()) / (1.0 * (double)n6);
                d10 = (double)(n3.a() - n2.a()) / (1.0 * (double)n6);
                this.c = new aA(n8, n7, d11, d10);
                if (string != null) break block11;
            }
            this.e = 0;
            n8 = new n(n2.e(), n2.b() - n4, n2.a() - n5);
            n7 = new n(n3.e(), n2.b() + n4 + 1, n2.a() + n5 + 1);
            n6 = n3.e() - n2.e();
            d11 = (double)(n3.b() - n2.b()) / (1.0 * (double)n6);
            d10 = (double)(n3.a() - n2.a()) / (1.0 * (double)n6);
            this.c = new aA(n8, n7, d11, d10);
        }
    }

    private n a(n n2, boolean bl2, boolean bl3, boolean bl4) {
        String string = dB.i();
        boolean bl5 = bl2;
        if (string != null) {
            if (bl5) {
                n2 = new n(-n2.e(), n2.b(), n2.a());
            }
            bl5 = bl3;
        }
        if (string != null) {
            if (bl5) {
                n2 = new n(n2.e(), -n2.b(), n2.a());
            }
            bl5 = bl4;
        }
        if (bl5) {
            n2 = new n(n2.e(), n2.b(), -n2.a());
        }
        return n2;
    }

    static {
        g = 1;
        i = 0;
        h = 2;
    }

    public n a() {
        n n2 = this.c.b();
        String string = dB.i();
        dd dd2 = this;
        if (string != null) {
            switch (dd2.e) {
                case 0: {
                    this.f.a(n2.e() * this.b, n2.b() * this.d, n2.a() * this.a);
                    return this.f;
                }
                case 1: {
                    this.f.a(n2.b() * this.b, n2.e() * this.d, n2.a() * this.a);
                    return this.f;
                }
                case 2: {
                    this.f.a(n2.a() * this.b, n2.b() * this.d, n2.e() * this.a);
                    return this.f;
                }
            }
            this.f.a(n2.e() * this.b, n2.b() * this.d, n2.a() * this.a);
            dd2 = this;
        }
        return dd2.f;
    }
}

