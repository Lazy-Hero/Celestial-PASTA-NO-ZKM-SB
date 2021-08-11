/*
 * Decompiled with CFR 0.150.
 */
import java.util.Arrays;
import net.minecraft.A.h;
import net.minecraft.N.y;
import net.minecraft.Z.i;
import net.minecraft.ah.L;
import net.minecraft.ah.T;
import net.minecraft.ah.t;
import net.minecraft.ar.aA;
import net.minecraft.k.n;
import net.minecraft.o.j;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class en
implements t {
    private final /* synthetic */ T b;
    private static final /* synthetic */ int d;
    private /* synthetic */ int[] g;
    private final /* synthetic */ int i;
    private final /* synthetic */ int c;
    private final /* synthetic */ int a;
    private static final /* synthetic */ cd h;
    private static final /* synthetic */ cd e;
    private /* synthetic */ i[] f;

    public boolean c() {
        return this.b.a();
    }

    public void b() {
        e.a(this.g);
        this.g = null;
        h.a(this.f);
        this.f = null;
    }

    @Override
    public i d(n n2) {
        block9: {
            int n3;
            int n4;
            String string;
            block8: {
                string = K.d();
                en en2 = this;
                if (string == null) {
                    if (en2.f == null) {
                        return this.b.d(n2);
                    }
                    en2 = this;
                }
                n3 = n4 = en2.a(n2);
                if (string != null) break block8;
                if (n3 < 0) break block9;
                n3 = n4;
            }
            if (n3 < this.f.length) {
                i i2;
                i i3 = i2 = this.f[n4];
                if (string == null) {
                    if (i3 == null) {
                        this.f[n4] = i2 = this.b.d(n2);
                    }
                    i3 = i2;
                }
                return i3;
            }
        }
        return this.b.d(n2);
    }

    @Override
    public int a(n n2, int n3) {
        int n4;
        block12: {
            block13: {
                int n5;
                block14: {
                    int n6;
                    block15: {
                        block16: {
                            en en2;
                            block17: {
                                int n7;
                                en en3;
                                String string;
                                block8: {
                                    block9: {
                                        int n8;
                                        block10: {
                                            int n9;
                                            block11: {
                                                string = K.d();
                                                en3 = this;
                                                if (string != null) break block8;
                                                if (en3.g != null) break block9;
                                                n9 = this.b.a(n2, n3);
                                                n8 = fU.bi();
                                                if (string != null) break block10;
                                                if (n8 == 0) break block11;
                                                n8 = this.d(n2).i() ? 1 : 0;
                                                if (string != null) break block10;
                                                if (n8 == 0) {
                                                    n9 = gk.a(n2, n9);
                                                }
                                            }
                                            n8 = n9;
                                        }
                                        return n8;
                                    }
                                    en3 = this;
                                }
                                n4 = n7 = en3.a(n2);
                                if (string != null) break block12;
                                if (n4 < 0) break block13;
                                n4 = n7;
                                if (string != null) break block12;
                                if (n4 >= this.g.length) break block13;
                                n5 = n6 = this.g[n7];
                                if (string != null) break block14;
                                if (n5 != -1) break block15;
                                en2 = this;
                                if (string != null) break block16;
                                n6 = en2.b.a(n2, n3);
                                if (!fU.bi()) break block17;
                                en2 = this;
                                if (string != null) break block16;
                                if (!en2.d(n2).i()) {
                                    n6 = gk.a(n2, n6);
                                }
                            }
                            en2 = this;
                        }
                        en2.g[n7] = n6;
                    }
                    n5 = n6;
                }
                return n5;
            }
            n4 = this.b.a(n2, n3);
        }
        return n4;
    }

    public void a() {
        String string = K.d();
        int[] arrn = this.g;
        if (string == null) {
            if (arrn == null) {
                this.g = (int[])e.a(8000);
            }
            arrn = this.g;
        }
        Arrays.fill(arrn, -1);
        Object[] arrobject = this.f;
        if (string == null) {
            if (arrobject == null) {
                this.f = (i[])h.a(8000);
            }
            arrobject = this.f;
        }
        Arrays.fill(arrobject, null);
    }

    @Override
    public int a(n n2, aA aA2) {
        return this.b.a(n2, aA2);
    }

    @Override
    public y b(n n2) {
        return this.b.a(n2, j.CHECK);
    }

    private int a(n n2) {
        int n3 = n2.e() - this.a;
        int n4 = n2.b() - this.c;
        int n5 = n2.a() - this.i;
        return n3 * 400 + n5 * 20 + n4;
    }

    static {
        d = 8000;
        e = new cd(Integer.TYPE, 16);
        h = new cd(i.class, 16);
    }

    public boolean a(n n2, aA aA2, boolean bl2) {
        return cq.g(this.b, cq.ba, n2, aA2, bl2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public en(T t2, n n2, int n3) {
        this.b = t2;
        this.a = n2.e() - n3;
        this.c = n2.b() - n3;
        this.i = n2.a() - n3;
    }

    @Override
    public h c(n n2) {
        return this.b.c(n2);
    }

    @Override
    public L a() {
        return this.b.a();
    }

    @Override
    public boolean a(n n2) {
        return this.b.a(n2);
    }

    public y a(n n2, j j2) {
        return this.b.a(n2, j2);
    }
}

