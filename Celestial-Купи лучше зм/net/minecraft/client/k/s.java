/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  javax.annotation.Nullable
 */
package net.minecraft.client.k;

import com.google.common.collect.Sets;
import java.nio.FloatBuffer;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import net.minecraft.N.y;
import net.minecraft.W.K;
import net.minecraft.W.aF;
import net.minecraft.W.bQ;
import net.minecraft.Z.i;
import net.minecraft.ah.T;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aW;
import net.minecraft.client.E.l;
import net.minecraft.client.F.b;
import net.minecraft.client.F.f;
import net.minecraft.client.Q;
import net.minecraft.client.a.I;
import net.minecraft.client.a.aC;
import net.minecraft.client.a.aZ;
import net.minecraft.client.a.as;
import net.minecraft.client.a.d;
import net.minecraft.client.a.v;
import net.minecraft.client.k.a;
import net.minecraft.client.k.c;
import net.minecraft.client.k.h;
import net.minecraft.client.k.m;
import net.minecraft.client.k.p;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.k.o;
import net.minecraft.o.j;

public class s {
    private /* synthetic */ boolean a;
    private /* synthetic */ int y;
    private /* synthetic */ z s;
    private /* synthetic */ boolean h;
    private final /* synthetic */ s[] i;
    private final /* synthetic */ int g;
    private static /* synthetic */ int[] k;
    private /* synthetic */ net.minecraft.o.a l;
    private /* synthetic */ h o;
    private final /* synthetic */ ReentrantLock p;
    private final /* synthetic */ net.minecraft.ar.aC[] u;
    private /* synthetic */ boolean q;
    private final /* synthetic */ FloatBuffer f;
    private final /* synthetic */ ReentrantLock n;
    private final /* synthetic */ boolean r;
    private final /* synthetic */ Set<y> t;
    private final /* synthetic */ o x;
    public /* synthetic */ m j;
    private final /* synthetic */ net.minecraft.client.a.aF m;
    private final /* synthetic */ boolean v;
    private final /* synthetic */ net.minecraft.client.y.c[] b;
    public /* synthetic */ k d;
    private final /* synthetic */ o[] c;
    public static /* synthetic */ int w;
    private static final /* synthetic */ net.minecraft.ar.aC[] e;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private net.minecraft.ar.aC a(K k2, net.minecraft.ar.aC aC2) {
        net.minecraft.ar.aC aC3;
        int[] arrn = net.minecraft.client.k.s.r();
        if (this.v) {
            aC3 = aC2;
            if (arrn == null) return aC3;
            if (aC3 == net.minecraft.ar.aC.CUTOUT) {
                boolean bl2 = k2 instanceof bQ;
                if (arrn != null) {
                    if (bl2) {
                        return aC2;
                    }
                    bl2 = k2 instanceof aF;
                }
                if (!bl2) return net.minecraft.ar.aC.CUTOUT_MIPPED;
                return aC2;
            }
        } else {
            aC3 = aC2;
            if (arrn == null) return aC3;
            if (aC3 == net.minecraft.ar.aC.CUTOUT_MIPPED) {
                return net.minecraft.ar.aC.CUTOUT;
            }
        }
        aC3 = aC2;
        return aC3;
    }

    public n a(aA aA2) {
        return this.c[aA2.ordinal()];
    }

    protected void a() {
        s s2;
        block5: {
            block6: {
                int[] arrn = net.minecraft.client.k.s.r();
                this.n.lock();
                int[] arrn2 = arrn;
                try {
                    s2 = this;
                    if (arrn2 == null) break block5;
                    if (s2.o == null) break block6;
                }
                catch (Throwable throwable) {
                    this.n.unlock();
                    throw throwable;
                }
                s2 = this;
                if (arrn2 == null) break block5;
                if (s2.o.a() == net.minecraft.client.k.a.DONE) break block6;
                this.o.f();
                this.o = null;
            }
            s2 = this;
        }
        s2.n.unlock();
    }

    public void a(int n2, int n3, int n4) {
        block7: {
            block3: {
                int[] arrn;
                block4: {
                    block5: {
                        int n5;
                        int n6;
                        block6: {
                            arrn = net.minecraft.client.k.s.r();
                            if (arrn == null) break block4;
                            if (n2 != this.x.e()) break block5;
                            n6 = n3;
                            n5 = this.x.b();
                            if (arrn == null) break block6;
                            if (n6 != n5) break block5;
                            n6 = n4;
                            n5 = this.x.a();
                        }
                        if (n6 == n5) break block7;
                    }
                    this.d();
                    this.x.a(n2, n3, n4);
                    this.d = new k(n2, n3, n4, n2 + 16, n3 + 16, n4 + 16);
                }
                for (aA aA2 : aA.VALUES) {
                    this.c[aA2.ordinal()].a(this.x).a(aA2, 16);
                    this.i[aA2.ordinal()] = null;
                    if (arrn != null) {
                        if (arrn != null) continue;
                    }
                    break block3;
                }
                this.l = null;
            }
            this.t();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public net.minecraft.o.a a(z z2) {
        int[] arrn = net.minecraft.client.k.s.r();
        net.minecraft.o.a a10 = this.l;
        if (arrn == null) return a10;
        if (a10 != null) {
            a10 = this.l;
            if (arrn == null) return a10;
            if (a10.x()) {
                return this.l;
            }
        }
        a10 = this.l = z2.b(this.g());
        return a10;
    }

    public net.minecraft.client.y.c a(int n2) {
        return this.b[n2];
    }

    public m b() {
        return this.j;
    }

    public n g() {
        return this.x;
    }

    public s(z z2, net.minecraft.client.a.aF aF2, int n2) {
        block10: {
            int n3;
            int[] arrn;
            block9: {
                block8: {
                    this.j = net.minecraft.client.k.m.b;
                    this.n = new ReentrantLock();
                    this.p = new ReentrantLock();
                    this.t = Sets.newHashSet();
                    this.f = aZ.e(16);
                    this.b = new net.minecraft.client.y.c[net.minecraft.ar.aC.values().length];
                    this.y = -1;
                    this.q = true;
                    arrn = net.minecraft.client.k.s.r();
                    this.x = new o(-1, -1, -1);
                    this.c = new o[6];
                    this.u = new net.minecraft.ar.aC[1];
                    this.v = fU.bo();
                    boolean bl2 = cq.cE.c();
                    if (arrn != null) {
                        bl2 = !bl2;
                    }
                    this.r = bl2;
                    this.a = false;
                    this.i = new s[6];
                    for (n3 = 0; n3 < this.c.length; ++n3) {
                        this.c[n3] = new o();
                        if (arrn != null) {
                            if (arrn != null) continue;
                            net.minecraft.k.m.b(!net.minecraft.k.m.d());
                            break;
                        }
                        break block8;
                    }
                    this.s = z2;
                    this.m = aF2;
                    this.g = n2;
                }
                boolean bl3 = as.f();
                if (arrn == null) break block9;
                if (!bl3) break block10;
                bl3 = false;
            }
            for (n3 = (int)((v434816) ? 1 : 0); n3 < net.minecraft.ar.aC.values().length; ++n3) {
                this.b[n3] = new net.minecraft.client.y.c(net.minecraft.client.y.b.s);
                if (arrn != null) continue;
            }
        }
    }

    public static void b(int[] arrn) {
        k = arrn;
    }

    public void a(float f10, float f11, float f12, h h2) {
        block5: {
            m m2;
            m m3;
            block4: {
                m3 = h2.h();
                int[] arrn = net.minecraft.client.k.s.r();
                m2 = m3;
                if (arrn == null) break block4;
                if (m2.c() == null) break block5;
                m2 = m3;
            }
            if (!m2.d(net.minecraft.ar.aC.TRANSLUCENT)) {
                I i2 = h2.g().a(net.minecraft.ar.aC.TRANSLUCENT);
                this.a(i2, this.x);
                i2.a(m3.c());
                this.a(net.minecraft.ar.aC.TRANSLUCENT, f10, f11, f12, i2, m3);
            }
        }
    }

    public void e() {
        int[] arrn = net.minecraft.client.k.s.r();
        this.d();
        this.s = null;
        int[] arrn2 = arrn;
        for (int i2 = 0; i2 < net.minecraft.ar.aC.values().length; ++i2) {
            net.minecraft.client.y.c c10 = this.b[i2];
            if (arrn2 != null) {
                if (c10 == null) continue;
                c10 = this.b[i2];
            }
            c10.a();
            if (arrn2 != null) continue;
        }
    }

    public void a(m m2) {
        this.p.lock();
        try {
            this.j = m2;
        }
        finally {
            this.p.unlock();
        }
    }

    private void t() {
        net.minecraft.client.a.v.M();
        net.minecraft.client.a.v.l();
        float f10 = 1.000001f;
        net.minecraft.client.a.v.b(-8.0f, -8.0f, -8.0f);
        net.minecraft.client.a.v.d(1.000001f, 1.000001f, 1.000001f);
        net.minecraft.client.a.v.b(8.0f, 8.0f, 8.0f);
        net.minecraft.client.a.v.a(2982, this.f);
        net.minecraft.client.a.v.B();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean j() {
        int[] arrn = net.minecraft.client.k.s.r();
        boolean bl2 = this.q;
        if (arrn != null) {
            if (!bl2) return false;
            bl2 = this.h;
        }
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private boolean f() {
        int[] arrn = net.minecraft.client.k.s.r();
        boolean bl2 = this.s instanceof l;
        if (arrn != null) {
            if (bl2) {
                l l2 = (l)this.s;
                return l2.a();
            }
            bl2 = false;
        }
        return bl2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Nullable
    public h l() {
        v0 = net.minecraft.client.k.s.r();
        this.n.lock();
        var1_1 = v0;
        try {
            block21: {
                block22: {
                    v1 = this.o;
                    if (var1_1 != null) {
                        if (v1 != null) {
                            v1 = this.o;
                            if (var1_1 != null) {
                                if (v1.a() == net.minecraft.client.k.a.PENDING) {
                                    var4_4 = var3_2 = null;
                                    return var4_4;
                                } else {
                                    ** GOTO lbl-1000
                                }
                            }
                        } else lbl-1000:
                        // 3 sources

                        {
                            v1 = this.o;
                        }
                    }
                    if (var1_1 == null) break block21;
                    if (v1 == null) break block22;
                    v1 = this.o;
                    if (var1_1 == null) break block21;
                    if (v1.a() != net.minecraft.client.k.a.DONE) {
                        this.o.f();
                        this.o = null;
                    }
                }
                this.o = new h(this, net.minecraft.client.k.c.RESORT_TRANSPARENCY, this.m());
                this.o.a(this.j);
                v1 = this.o;
            }
            var2_5 = var3_3 = v1;
            return var2_5;
        }
        finally {
            this.n.unlock();
        }
    }

    public z s() {
        return this.s;
    }

    public void n() {
        net.minecraft.client.a.v.a(this.f);
    }

    protected double m() {
        net.minecraft.client.q.c c10 = Q.P().s;
        double d10 = this.d.e + 8.0 - c10.a;
        double d11 = this.d.b + 8.0 - c10.aF;
        double d12 = this.d.d + 8.0 - c10.ax;
        return d10 * d10 + d11 * d11 + d12 * d12;
    }

    private void a(net.minecraft.client.a.aW aW2, m m2, boolean[] arrbl) {
        this.a(net.minecraft.ar.aC.CUTOUT, aW2, m2, arrbl);
        this.a(net.minecraft.ar.aC.CUTOUT_MIPPED, aW2, m2, arrbl);
        this.a(net.minecraft.ar.aC.TRANSLUCENT, aW2, m2, arrbl);
    }

    private void a(net.minecraft.ar.aC aC2, float f10, float f11, float f12, I i2, m m2) {
        block2: {
            block3: {
                m m3;
                block4: {
                    int[] arrn = net.minecraft.client.k.s.r();
                    if (arrn == null) break block2;
                    if (aC2 != net.minecraft.ar.aC.TRANSLUCENT) break block3;
                    m3 = m2;
                    if (arrn == null) break block4;
                    if (m3.d(aC2)) break block3;
                    i2.a(f10, f11, f12);
                    m3 = m2;
                }
                m3.a(i2.r());
            }
            i2.p();
        }
    }

    public void d() {
        this.a();
        this.j = net.minecraft.client.k.m.b;
    }

    protected T a(z z2, n n2, n n3, int n4) {
        return new T(z2, n2, n3, n4);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    static {
        e = net.minecraft.ar.aC.values();
        net.minecraft.client.k.s.b(new int[1]);
    }

    public void a(boolean bl2) {
        block6: {
            block5: {
                s s2;
                boolean bl3;
                block4: {
                    int[] arrn = net.minecraft.client.k.s.r();
                    bl3 = this.q;
                    if (arrn == null) break block4;
                    if (bl3) {
                        bl2 |= this.h;
                    }
                    this.q = true;
                    this.h = bl2;
                    s2 = this;
                    if (arrn == null) break block5;
                    bl3 = s2.f();
                }
                if (!bl3) break block6;
                s2 = this;
            }
            s2.a = true;
        }
    }

    private void a(net.minecraft.ar.aC aC2, net.minecraft.client.a.aW aW2, m m2, boolean[] arrbl) {
        block3: {
            block2: {
                I i2 = aW2.a(aC2);
                int[] arrn = net.minecraft.client.k.s.r();
                if (arrn == null) break block2;
                if (!i2.e()) break block3;
                m2.b(aC2);
            }
            arrbl[aC2.ordinal()] = true;
        }
    }

    private void a(I i2, n n2) {
        i2.a(7, net.minecraft.client.y.b.s);
        i2.a((double)(-n2.e()), (double)(-n2.b()), (double)(-n2.a()));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(float f10, float f11, float f12, h h2) {
        block39: {
            Object object;
            Object object2;
            HashSet hashSet;
            block37: {
                p p2;
                m m2;
                block41: {
                    s s2;
                    n n2;
                    o o2;
                    int[] arrn;
                    block40: {
                        h h3;
                        block35: {
                            block36: {
                                m2 = new m();
                                arrn = net.minecraft.client.k.s.r();
                                boolean bl2 = true;
                                o2 = this.x;
                                n2 = ((n)o2).a(15, 15, 15);
                                h2.b().lock();
                                try {
                                    h3 = h2;
                                    if (arrn == null) break block35;
                                    if (h3.a() == net.minecraft.client.k.a.COMPILING) break block36;
                                    h2.b().unlock();
                                    return;
                                }
                                catch (Throwable throwable) {
                                    h2.b().unlock();
                                    throw throwable;
                                }
                            }
                            h2.a(m2);
                            h3 = h2;
                        }
                        h3.b().unlock();
                        p2 = new p();
                        hashSet = Sets.newHashSet();
                        s2 = this;
                        if (arrn == null) break block40;
                        if (s2.s == null) break block39;
                        s2 = this;
                    }
                    en en2 = s2.h();
                    if (arrn == null) break block37;
                    if (en2.c()) break block41;
                    ++w;
                    en2.a();
                    object2 = new boolean[e.length];
                    object = Q.P().W();
                    int n3 = cq.ay.b();
                    int n4 = cq.z.b();
                    for (Object t2 : fZ.c(o2, n2)) {
                        int n5;
                        block38: {
                            Object object3;
                            K k2;
                            i object4;
                            fZ fZ2;
                            block48: {
                                block47: {
                                    int n6;
                                    block42: {
                                        block43: {
                                            block46: {
                                                block45: {
                                                    f<net.minecraft.ar.aC[]> f13;
                                                    block44: {
                                                        f<net.minecraft.ar.aC[]> f14;
                                                        fZ2 = (fZ)t2;
                                                        object4 = en2.d(fZ2);
                                                        k2 = object4.b();
                                                        if (arrn == null) break block37;
                                                        n6 = object4.i();
                                                        if (arrn != null) {
                                                            if (n6 != 0) {
                                                                p2.c(fZ2);
                                                            }
                                                            n6 = ea.a(object4);
                                                        }
                                                        if (arrn == null) break block42;
                                                        if (n6 == 0 || (object3 = en2.a((n)fZ2, net.minecraft.o.j.CHECK)) == null) break block43;
                                                        f13 = f14 = net.minecraft.client.F.b.e.a((y)object3);
                                                        if (arrn == null) break block44;
                                                        if (f13 == null) break block43;
                                                        f13 = f14;
                                                    }
                                                    boolean bl2 = f13.a((net.minecraft.ar.aC[])object3);
                                                    if (arrn == null) break block45;
                                                    if (!bl2) break block46;
                                                    bl2 = hashSet.add(object3);
                                                }
                                                if (arrn != null) break block43;
                                            }
                                            m2.a((y)object3);
                                        }
                                        n6 = n3;
                                    }
                                    if (n6 == 0) break block47;
                                    object3 = e;
                                    if (arrn != null) break block48;
                                }
                                object3 = this.u;
                                object3[0] = k2.p();
                            }
                            int n7 = 0;
                            while (n7 < ((net.minecraft.ar.aC[])object3).length) {
                                block52: {
                                    block51: {
                                        boolean bl3;
                                        e9 e92;
                                        block53: {
                                            int n8;
                                            int n9;
                                            net.minecraft.ar.aC aC2;
                                            block49: {
                                                block50: {
                                                    aC2 = object3[n7];
                                                    n5 = n3;
                                                    if (arrn == null) break block38;
                                                    if (arrn == null) break block49;
                                                    if (n5 == 0) break block50;
                                                    n8 = n9 = (int)(cq.g(k2, cq.ay, new Object[]{object4, aC2}) ? 1 : 0);
                                                    if (arrn == null) break block49;
                                                    if (n8 == 0 && arrn != null) break block51;
                                                }
                                                n8 = n4;
                                            }
                                            if (arrn != null) {
                                                if (n8 != 0) {
                                                    cq.e(cq.z, new Object[]{aC2});
                                                }
                                                n8 = this.r;
                                            }
                                            if (arrn != null) {
                                                if (n8 != 0) {
                                                    aC2 = this.a(k2, aC2);
                                                }
                                                n8 = n9 = aC2.ordinal();
                                            }
                                            if (arrn == null) break block52;
                                            if (k2.d().n() == aW.INVISIBLE) break block51;
                                            I i2 = h2.g().a(n9);
                                            i2.a(aC2);
                                            e92 = i2.a(en2, object4, fZ2);
                                            e92.a(h2.g());
                                            bl3 = m2.c(aC2);
                                            if (arrn == null) break block53;
                                            if (!bl3) {
                                                m2.b(aC2);
                                                this.a(i2, o2);
                                            }
                                            Object object5 = object2;
                                            int n10 = n9;
                                            object5[n10] = object5[n10] | ((d)object).a(object4, (n)fZ2, en2, i2);
                                            if (arrn == null) break block52;
                                            bl3 = e92.h();
                                        }
                                        if (bl3) {
                                            this.a(h2.g(), m2, (boolean[])object2);
                                            e92.a(false);
                                        }
                                    }
                                    ++n7;
                                }
                                if (arrn != null) continue;
                            }
                            n5 = n4;
                        }
                        if (n5 != 0) {
                            cq.e(cq.z, null);
                        }
                        if (arrn != null) continue;
                    }
                    for (net.minecraft.ar.aC aC3 : e) {
                        if (arrn != null) {
                            Object object6 = object2[aC3.ordinal()];
                            if (arrn != null) {
                                if (object6 != false) {
                                    m2.a(aC3);
                                }
                                object6 = m2.c(aC3);
                            }
                            if (arrn != null) {
                                if (object6 == false) continue;
                                object6 = fU.ag();
                            }
                            if (object6 != false) {
                                fX.a(h2.g().a(aC3));
                            }
                            this.a(aC3, f10, f11, f12, h2.g().a(aC3), m2);
                            if (arrn != null) continue;
                        }
                        break block37;
                    }
                    en2.b();
                }
                m2.a(p2.a());
                this.n.lock();
            }
            try {
                object2 = Sets.newHashSet((Iterable)hashSet);
                object = Sets.newHashSet(this.t);
                object2.removeAll(this.t);
                object.removeAll(hashSet);
                this.t.clear();
                this.t.addAll(hashSet);
                this.m.a((Collection<y>)object, (Collection<y>)object2);
            }
            finally {
                this.n.unlock();
            }
        }
    }

    public boolean p() {
        return this.a;
    }

    private void i() {
        boolean bl2 = true;
    }

    private en h() {
        n n2 = this.x.a(-1, -1, -1);
        int[] arrn = net.minecraft.client.k.s.r();
        T t2 = this.a(this.s, n2, this.x.a(16, 16, 16), 1);
        Object object = cq.bj;
        if (arrn != null && ((ak)object).b()) {
            object = cq.d(cq.bj, this.s, this.x, t2);
        }
        en en2 = new en(t2, n2, 1);
        return en2;
    }

    public boolean c() {
        return this.q;
    }

    public h o() {
        h h2;
        this.n.lock();
        try {
            this.a();
            this.o = new h(this, net.minecraft.client.k.c.REBUILD_CHUNK, this.m());
            this.i();
            h2 = this.o;
        }
        finally {
            this.n.unlock();
        }
        return h2;
    }

    public void k() {
        this.q = false;
        this.h = false;
        this.a = false;
    }

    public static int[] r() {
        return k;
    }

    public s a(aC aC2, aA aA2) {
        s s2 = this.i[aA2.ordinal()];
        int[] arrn = net.minecraft.client.k.s.r();
        s s3 = s2;
        if (arrn != null) {
            if (s3 == null) {
                n n2 = this.a(aA2);
                this.i[aA2.ordinal()] = s2 = aC2.a(n2);
            }
            s3 = s2;
        }
        return s3;
    }

    public ReentrantLock q() {
        return this.n;
    }

    public boolean b(int n2) {
        int[] arrn = net.minecraft.client.k.s.r();
        int n3 = this.y;
        if (arrn != null) {
            if (n3 == n2) {
                return false;
            }
            this.y = n2;
            n3 = 1;
        }
        return n3 != 0;
    }
}

