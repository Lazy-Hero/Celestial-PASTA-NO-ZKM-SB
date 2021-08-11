/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.minecraft.W.b2;
import net.minecraft.Z.i;
import net.minecraft.Z.l;
import net.minecraft.ah.t;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.client.a.aJ;
import net.minecraft.client.a.aW;
import net.minecraft.client.x.P;
import net.minecraft.client.x.Q;
import net.minecraft.k.n;

public class e9 {
    private final /* synthetic */ float[] o;
    private final /* synthetic */ BitSet z;
    private /* synthetic */ boolean[] l;
    private /* synthetic */ int a;
    private final /* synthetic */ P[] h;
    private final /* synthetic */ List<P> m;
    private /* synthetic */ i y;
    private final /* synthetic */ P[] e;
    private /* synthetic */ aA[] r;
    private static final /* synthetic */ int A;
    private /* synthetic */ boolean[] g;
    private final /* synthetic */ P[] i;
    private /* synthetic */ int c;
    private static final /* synthetic */ int w;
    private /* synthetic */ int f;
    private /* synthetic */ boolean[] x;
    private final /* synthetic */ gp[] n;
    private final /* synthetic */ P[] p;
    private /* synthetic */ n s;
    private /* synthetic */ int u;
    private /* synthetic */ boolean k;
    private /* synthetic */ fZ t;
    private /* synthetic */ t d;
    private final /* synthetic */ aJ b;
    private final /* synthetic */ List<P> q;
    private static final /* synthetic */ int v;
    private /* synthetic */ aW j;

    public List<P> a() {
        return this.q;
    }

    public boolean a(List list) {
        int n2;
        block8: {
            int n3;
            block4: {
                String string;
                block6: {
                    block5: {
                        block7: {
                            string = K.d();
                            n2 = this.u;
                            n3 = -1;
                            if (string != null) break block4;
                            if (n2 != n3) break block5;
                            n2 = list.size();
                            if (string != null) break block6;
                            if (n2 <= 0) break block5;
                            if (!(list.get(0) instanceof Q)) break block7;
                            this.u = 1;
                            if (string == null) break block5;
                        }
                        this.u = 0;
                    }
                    n2 = this.u;
                }
                if (string != null) break block8;
                n3 = 1;
            }
            n2 = n2 == n3 ? 1 : 0;
        }
        return n2 != 0;
    }

    public BitSet i() {
        return this.z;
    }

    public aJ c() {
        return this.b;
    }

    public aA[] a(aA aA2, aA aA3, aA aA4, aA aA5) {
        aA[] arraA = this.l();
        arraA[0] = aA2;
        arraA[1] = aA3;
        arraA[2] = aA4;
        arraA[3] = aA5;
        return arraA;
    }

    public aA[] l() {
        String string = K.d();
        aA[] arraA = this.r;
        if (string == null) {
            if (arraA == null) {
                this.r = new aA[4];
            }
            arraA = this.r;
        }
        return arraA;
    }

    public boolean o() {
        boolean bl2;
        block9: {
            boolean bl3;
            block4: {
                String string;
                block5: {
                    block8: {
                        e9 e92;
                        block7: {
                            boolean bl4;
                            block6: {
                                string = K.d();
                                boolean bl3 = this.f;
                                bl3 = BADBOOL -1;
                                if (string != null) break block4;
                                if (bl2 != bl3) break block5;
                                bl4 = fU.h();
                                if (string != null) break block6;
                                if (!bl4) break block7;
                                e92 = this;
                                if (string != null) break block8;
                                bl4 = e92.y.b() instanceof b2;
                            }
                            if (!bl4) break block7;
                            this.f = 1;
                            if (string == null) break block5;
                        }
                        e92 = this;
                    }
                    e92.f = 0;
                }
                bl2 = this.f;
                if (string != null) break block9;
                bl3 = true;
            }
            bl2 = bl2 == bl3;
        }
        return bl2;
    }

    public void a(aW aW2) {
        this.j = aW2;
    }

    public float[] b() {
        return this.o;
    }

    public List<P> a(P[] arrp) {
        String string = K.d();
        List<P> list = this.m;
        if (string == null) {
            list.clear();
            if (arrp != null) {
                for (int i2 = 0; i2 < arrp.length; ++i2) {
                    P p2 = arrp[i2];
                    list = this.m;
                    if (string == null) {
                        list.add(p2);
                        if (string == null) continue;
                    }
                    break;
                }
            } else {
                list = this.m;
            }
        }
        return list;
    }

    public boolean[] k() {
        String string = K.d();
        boolean[] arrbl = this.l;
        if (string == null) {
            if (arrbl == null) {
                this.l = new boolean[4];
            }
            arrbl = this.l;
        }
        return arrbl;
    }

    public aW e() {
        return this.j;
    }

    public int n() {
        int n2;
        block2: {
            block3: {
                block4: {
                    e9 e92;
                    block5: {
                        String string = K.d();
                        n2 = this.a;
                        if (string != null) break block2;
                        if (n2 >= 0) break block3;
                        e92 = this;
                        if (string != null) break block4;
                        if (!(e92.y instanceof l)) break block5;
                        l l2 = (l)this.y;
                        this.a = l2.a();
                        if (string == null) break block3;
                    }
                    e92 = this;
                }
                e92.a = net.minecraft.W.K.b(this.y.b());
            }
            n2 = this.a;
        }
        return n2;
    }

    public i f() {
        return this.y;
    }

    public boolean h() {
        return this.k;
    }

    public boolean p() {
        String string = K.d();
        boolean bl2 = this.u;
        if (string == null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public boolean a(P p2) {
        boolean bl2;
        String string;
        block4: {
            block5: {
                block6: {
                    string = K.d();
                    bl2 = this.u;
                    if (string != null) break block4;
                    if (bl2 >= false) break block5;
                    if (!(p2 instanceof Q)) break block6;
                    this.u = 1;
                    if (string == null) break block5;
                }
                this.u = 0;
            }
            bl2 = this.u;
        }
        if (string == null) {
            bl2 = bl2;
        }
        return bl2;
    }

    public P[] a(P p2, P p3, P p4, P p5) {
        this.p[0] = p2;
        this.p[1] = p3;
        this.p[2] = p4;
        this.p[3] = p5;
        return this.p;
    }

    public gp a(aC aC2) {
        gp gp2 = this.n[aC2.ordinal()];
        String string = K.d();
        gp gp3 = gp2;
        if (string == null) {
            if (gp3 == null) {
                this.n[aC2.ordinal()] = gp2 = new gp();
            }
            gp3 = gp2;
        }
        return gp3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public P[] b(P p2) {
        this.i[0] = p2;
        return this.i;
    }

    public boolean[] j() {
        String string = K.d();
        boolean[] arrbl = this.g;
        if (string == null) {
            if (arrbl == null) {
                this.g = new boolean[4];
            }
            arrbl = this.g;
        }
        return arrbl;
    }

    public e9(t t2, i i2, n n2) {
        this.a = -1;
        this.c = -1;
        this.u = -1;
        this.f = -1;
        this.o = new float[aA.VALUES.length * 2];
        this.z = new BitSet(3);
        this.b = new aJ();
        this.t = null;
        this.l = null;
        this.x = null;
        this.g = null;
        this.r = null;
        this.q = new ArrayList<P>();
        this.m = new ArrayList<P>();
        this.i = new P[1];
        this.h = new P[2];
        this.e = new P[3];
        this.p = new P[4];
        this.j = null;
        this.n = new gp[aC.values().length];
        this.k = false;
        this.d = t2;
        this.y = i2;
        this.s = n2;
    }

    public P[] a(P p2, P p3, P p4) {
        this.e[0] = p2;
        this.e[1] = p3;
        this.e[2] = p4;
        return this.e;
    }

    public void a(boolean bl2) {
        this.k = bl2;
    }

    public P[] a(P p2, P p3) {
        this.h[0] = p2;
        this.h[1] = p3;
        return this.h;
    }

    public void a(t t2, i i2, n n2) {
        block4: {
            e9 e92;
            block2: {
                block3: {
                    String string = K.d();
                    e92 = this;
                    if (string != null) break block2;
                    if (e92.d != t2) break block3;
                    e92 = this;
                    if (string != null) break block2;
                    if (e92.y != i2) break block3;
                    e92 = this;
                    if (string != null) break block2;
                    if (e92.s == n2) break block4;
                }
                this.d = t2;
                this.y = i2;
                this.s = n2;
                this.a = -1;
                this.c = -1;
                this.u = -1;
                this.f = -1;
                e92 = this;
            }
            e92.z.clear();
        }
    }

    public boolean[] d() {
        String string = K.d();
        boolean[] arrbl = this.x;
        if (string == null) {
            if (arrbl == null) {
                this.x = new boolean[4];
            }
            arrbl = this.x;
        }
        return arrbl;
    }

    public fZ g() {
        String string = K.d();
        fZ fZ2 = this.t;
        if (string == null) {
            if (fZ2 == null) {
                this.t = new fZ(0, 0, 0);
            }
            fZ2 = this.t;
        }
        return fZ2;
    }

    static {
        w = 0;
        A = 1;
        v = -1;
    }

    public int m() {
        int n2;
        block2: {
            block3: {
                block4: {
                    e9 e92;
                    block5: {
                        String string = K.d();
                        n2 = this.c;
                        if (string != null) break block2;
                        if (n2 >= 0) break block3;
                        e92 = this;
                        if (string != null) break block4;
                        if (!(e92.y instanceof l)) break block5;
                        l l2 = (l)this.y;
                        this.c = l2.c();
                        if (string == null) break block3;
                    }
                    e92 = this;
                }
                e92.c = this.y.b().d(this.y);
            }
            n2 = this.c;
        }
        return n2;
    }
}

