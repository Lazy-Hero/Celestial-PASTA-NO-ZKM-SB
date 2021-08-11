/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 *  org.lwjgl.input.Mouse
 */
package net.minecraft.client.A;

import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.aN;
import net.minecraft.aS;
import net.minecraft.client.A.c;
import net.minecraft.client.A.d;
import net.minecraft.client.A.e;
import net.minecraft.client.D.h;
import net.minecraft.client.E.i;
import net.minecraft.client.a.G;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.b.L;
import net.minecraft.d.j;
import net.minecraft.k.m;
import org.lwjgl.input.Mouse;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class b
extends L
implements net.minecraft.client.E.b {
    private /* synthetic */ int E;
    private final /* synthetic */ Map<aN, d> B;
    private final /* synthetic */ i C;
    private static final /* synthetic */ net.minecraft.ar.v z;
    private static final /* synthetic */ net.minecraft.ar.v D;
    private /* synthetic */ d A;
    private /* synthetic */ int F;
    private /* synthetic */ boolean y;

    @Override
    public void c(aN aN2) {
        d d10 = net.minecraft.client.A.d.a(this.m, this, this.B.size(), aN2);
        m[] arrm = net.minecraft.client.A.e.b();
        d d11 = d10;
        if (arrm != null && d11 != null) {
            d11 = this.B.put(aN2, d10);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void r() {
        block6: {
            block7: {
                this.B.clear();
                v0 = net.minecraft.client.A.e.b();
                this.A = null;
                this.C.a(this);
                var1_1 = v0;
                v1 = this;
                if (var1_1 == null) break block6;
                if (v1.A != null) break block7;
                v1 = this;
                if (var1_1 == null) break block6;
                if (!v1.B.isEmpty()) {
                    this.C.a(this.B.values().iterator().next().a(), true);
                    if (var1_1 != null) return;
                }
            }
            v1 = this;
        }
        v2 = this.A;
        if (var1_1 == null) ** GOTO lbl23
        if (v2 == null) {
            v3 = null;
        } else {
            v2 = this.A;
lbl23:
            // 2 sources

            v3 = v2.a();
        }
        v1.C.a(v3, true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public c a(aN aN2) {
        d d10 = this.b(aN2);
        m[] arrm = net.minecraft.client.A.e.b();
        d d11 = d10;
        if (arrm != null) {
            if (d11 == null) {
                return null;
            }
            d11 = d10;
        }
        c c10 = d11.b(aN2);
        return c10;
    }

    @Override
    public void b(aN aN2) {
    }

    public b(i i2) {
        this.B = Maps.newLinkedHashMap();
        this.C = i2;
    }

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        block3: {
            block4: {
                m[] arrm = net.minecraft.client.A.e.b();
                if (arrm == null) break block3;
                if (n4 != 0) break block4;
                int n5 = (h - 252) / 2;
                int n6 = (w - 140) / 2;
                for (d d10 : this.B.values()) {
                    block6: {
                        block5: {
                            if (arrm == null) break block3;
                            if (arrm == null) break block5;
                            if (!d10.d(n5, n6, n2, n3)) break block6;
                            this.C.a(d10.a(), true);
                        }
                        if (arrm != null) break;
                    }
                    if (arrm != null) continue;
                }
            }
            super.a(n2, n3, n4);
        }
    }

    @Override
    public void a(int n2, int n3, float f10) {
        int n4;
        int n5;
        block13: {
            block8: {
                m[] arrm;
                block12: {
                    b b10;
                    block11: {
                        block9: {
                            block10: {
                                boolean bl2;
                                block7: {
                                    n5 = (h - 252) / 2;
                                    arrm = net.minecraft.client.A.e.b();
                                    n4 = (w - 140) / 2;
                                    bl2 = Mouse.isButtonDown((int)0);
                                    if (arrm == null) break block7;
                                    if (!bl2) break block8;
                                    b10 = this;
                                    if (arrm == null) break block9;
                                    bl2 = b10.y;
                                }
                                if (bl2) break block10;
                                this.y = true;
                                if (arrm != null) break block11;
                            }
                            b10 = this;
                        }
                        if (arrm == null) break block12;
                        if (b10.A != null) {
                            this.A.a(n2 - this.F, n3 - this.E);
                        }
                    }
                    this.F = n2;
                    b10 = this;
                }
                b10.E = n3;
                if (arrm != null) break block13;
            }
            this.y = false;
        }
        this.n();
        this.d(n2, n3, n5, n4);
        this.b(n5, n4);
        this.c(n2, n3, n5, n4);
    }

    @Override
    public void a() {
        this.B.clear();
        this.A = null;
    }

    static {
        z = new net.minecraft.ar.v("textures/gui/advancements/window.png");
        D = new net.minecraft.ar.v("textures/gui/advancements/tabs.png");
    }

    @Nullable
    private d b(aN object) {
        Object object2;
        block2: {
            m[] arrm = net.minecraft.client.A.e.b();
            while (((aN)object).b() != null) {
                object2 = ((aN)object).b();
                if (arrm != null) {
                    object = object2;
                    if (arrm != null) continue;
                }
                break block2;
            }
            object2 = this.B.get(object);
        }
        return (d)object2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void b(int var1_1, int var2_2) {
        block3: {
            net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
            net.minecraft.client.a.v.a();
            v0 = net.minecraft.client.A.e.b();
            a0.a();
            this.m.aN().b(b.z);
            var3_3 = v0;
            this.a(var1_1, var2_2, 0, 0, 252, 140);
            v1 = this.B.size();
            if (var3_3 == null) return;
            if (v1 <= 1) break block3;
            this.m.aN().b(b.D);
            var4_4 = this.B.values().iterator();
            while (var4_4.hasNext()) {
                v2 = var5_5 = var4_4.next();
                v3 = var1_1;
                v4 = var2_2;
                if (var3_3 != null) {
                    v2.a(v3, v4, var5_5 == this.A);
                    if (var3_3 != null) continue;
                }
                ** GOTO lbl29
            }
            net.minecraft.client.a.v.q();
            net.minecraft.client.a.v.a(o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, o.ONE, G.ZERO);
            a0.b();
            var4_4 = this.B.values().iterator();
            while (var4_4.hasNext()) {
                v2 = var5_5 = var4_4.next();
                v3 = var1_1;
                v4 = var2_2;
lbl29:
                // 2 sources

                v2.a(v3, v4, this.x);
                if (var3_3 == null) return;
                if (var3_3 != null) continue;
            }
            net.minecraft.client.a.v.f();
        }
        v1 = this.v.b(net.minecraft.client.D.h.a("gui.advancements", new Object[0]), var1_1 + 8, var2_2 + 6, 0x404040);
    }

    @Override
    public void a(aN aN2, aS aS2) {
        block3: {
            c c10;
            block2: {
                c c11 = this.a(aN2);
                m[] arrm = net.minecraft.client.A.e.b();
                c10 = c11;
                if (arrm == null) break block2;
                if (c10 == null) break block3;
                c10 = c11;
            }
            c10.a(aS2);
        }
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        block2: {
            block1: {
                m[] arrm;
                block0: {
                    arrm = net.minecraft.client.A.e.b();
                    if (arrm == null) break block0;
                    if (n2 != this.m.ac.bu.e()) break block1;
                    this.m.a((L)null);
                    this.m.i();
                }
                if (arrm != null) break block2;
            }
            super.a(c10, n2);
        }
    }

    @Override
    public void e(@Nullable aN aN2) {
        this.A = this.B.get(aN2);
    }

    @Override
    public void a(aN aN2) {
    }

    @Override
    public void d(aN aN2) {
        block3: {
            d d10;
            block2: {
                d d11 = this.b(aN2);
                m[] arrm = net.minecraft.client.A.e.b();
                d10 = d11;
                if (arrm == null) break block2;
                if (d10 == null) break block3;
                d10 = d11;
            }
            d10.a(aN2);
        }
    }

    private void c(int n2, int n3, int n4, int n5) {
        block8: {
            Map<aN, d> map;
            m[] arrm;
            block7: {
                m[] arrm2 = net.minecraft.client.A.e.b();
                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                arrm = arrm2;
                b b10 = this;
                if (arrm != null) {
                    if (b10.A != null) {
                        net.minecraft.client.a.v.M();
                        net.minecraft.client.a.v.t();
                        net.minecraft.client.a.v.b((float)(n4 + 9), (float)(n5 + 18), 400.0f);
                        this.A.c(n2 - n4 - 9, n3 - n5 - 18, n4, n5);
                        net.minecraft.client.a.v.n();
                        net.minecraft.client.a.v.B();
                    }
                    b10 = this;
                }
                map = b10.B;
                if (arrm == null) break block7;
                if (map.size() <= 1) break block8;
                map = this.B;
            }
            for (d d10 : map.values()) {
                if (d10.d(n4, n5, n2, n3)) {
                    this.a(d10.d(), n2, n3);
                }
                if (arrm != null) continue;
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void h() {
        block3: {
            net.minecraft.client.o.j j2;
            block2: {
                m[] arrm = net.minecraft.client.A.e.b();
                this.C.a((net.minecraft.client.E.b)null);
                net.minecraft.client.o.j j3 = this.m.ar();
                m[] arrm2 = arrm;
                j2 = j3;
                if (arrm2 == null) break block2;
                if (j2 == null) break block3;
                j2 = j3;
            }
            j2.a(j.b());
        }
    }

    private void d(int n2, int n3, int n4, int n5) {
        block4: {
            d d10;
            block2: {
                d d11;
                block3: {
                    d11 = this.A;
                    m[] arrm = net.minecraft.client.A.e.b();
                    d10 = d11;
                    if (arrm == null) break block2;
                    if (d10 != null) break block3;
                    b.a(n4 + 9, n5 + 18, n4 + 9 + 234, n5 + 18 + 113, -16777216);
                    String string = net.minecraft.client.D.h.a("advancements.empty", new Object[0]);
                    int n6 = this.v.e(string);
                    this.v.b(string, n4 + 9 + 117 - n6 / 2, n5 + 18 + 56 - this.v.p / 2, -1);
                    this.v.b(":(", n4 + 9 + 117 - this.v.e(":(") / 2, n5 + 18 + 113 - this.v.p, -1);
                    if (arrm != null) break block4;
                }
                net.minecraft.client.a.v.M();
                net.minecraft.client.a.v.b((float)(n4 + 9), (float)(n5 + 18), -400.0f);
                net.minecraft.client.a.v.t();
                d10 = d11;
            }
            d10.c();
            net.minecraft.client.a.v.B();
            net.minecraft.client.a.v.o(515);
            net.minecraft.client.a.v.n();
        }
    }
}

