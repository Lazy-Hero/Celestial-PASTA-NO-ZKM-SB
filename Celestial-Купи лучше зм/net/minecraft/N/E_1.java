/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.N;

import java.util.Random;
import net.minecraft.B.n;
import net.minecraft.B.s;
import net.minecraft.N.j;
import net.minecraft.N.y;
import net.minecraft.P.r;
import net.minecraft.ah.o;
import net.minecraft.ar.ao;
import net.minecraft.at.g;
import net.minecraft.at.k;
import net.minecraft.k.h;
import net.minecraft.k.m;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class E
extends y
implements o,
ao {
    public /* synthetic */ float k;
    public /* synthetic */ float o;
    public /* synthetic */ float q;
    public /* synthetic */ float t;
    public /* synthetic */ float m;
    public /* synthetic */ float s;
    public /* synthetic */ float p;
    private static final /* synthetic */ Random l;
    private /* synthetic */ String n;
    public /* synthetic */ float r;
    public /* synthetic */ int j;
    public /* synthetic */ float i;

    public void a(String string) {
        this.n = string;
    }

    @Override
    public r a(r r2) {
        m[] arrm = net.minecraft.N.j.f();
        r r3 = super.a(r2);
        if (arrm == null) {
            if (this.g()) {
                r2.a("CustomName", this.n);
            }
            r3 = r2;
        }
        return r3;
    }

    @Override
    public void c(r r2) {
        block3: {
            r r3;
            block2: {
                m[] arrm = net.minecraft.N.j.f();
                E e10 = this;
                r3 = r2;
                if (arrm != null) break block2;
                super.c(r3);
                if (!r2.a("CustomName", 8)) break block3;
                e10 = this;
                r3 = r2;
            }
            e10.n = r3.j("CustomName");
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public String g() {
        m[] arrm = net.minecraft.N.j.f();
        E e10 = this;
        if (arrm == null) {
            if (!e10.g()) return "container.enchant";
            e10 = this;
        }
        String string = e10.n;
        return string;
    }

    static {
        l = new Random();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public n a(net.minecraft.i.h h2, net.minecraft.i.j j2) {
        return new s(h2, this.a, this.d);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean g() {
        m[] arrm = net.minecraft.N.j.f();
        String string = this.n;
        if (arrm == null) {
            if (string == null) return false;
            string = this.n;
        }
        boolean bl2 = string.isEmpty();
        if (arrm != null) return bl2;
        if (bl2) return false;
        return true;
    }

    @Override
    public void c() {
        block26: {
            float f10;
            m[] arrm;
            block25: {
                E e10;
                block24: {
                    block23: {
                        block22: {
                            block31: {
                                block27: {
                                    block28: {
                                        block30: {
                                            float f11;
                                            block29: {
                                                this.m = this.r;
                                                this.o = this.p;
                                                net.minecraft.i.j j2 = this.a.a((double)((float)this.d.e() + 0.5f), (double)((float)this.d.b() + 0.5f), (double)((float)this.d.a() + 0.5f), 3.0, false);
                                                arrm = net.minecraft.N.j.f();
                                                if (arrm != null) break block27;
                                                if (j2 == null) break block28;
                                                double d10 = j2.a - (double)((float)this.d.e() + 0.5f);
                                                double d11 = j2.ax - (double)((float)this.d.a() + 0.5f);
                                                this.q = (float)h.a(d11, d10);
                                                this.r += 0.1f;
                                                f11 = this.r;
                                                if (arrm != null) break block29;
                                                if (!(f11 < 0.5f) && l.nextInt(40) != 0) break block30;
                                                f11 = this.s;
                                            }
                                            float f12 = f11;
                                            block0: while (true) {
                                                this.s += (float)(l.nextInt(4) - l.nextInt(4));
                                                do {
                                                    if (f12 == this.s) continue block0;
                                                } while (arrm != null);
                                                break;
                                            }
                                        }
                                        if (arrm == null) break block31;
                                        net.minecraft.k.m.b(!net.minecraft.k.m.c());
                                    }
                                    this.q += 0.02f;
                                }
                                this.r -= 0.1f;
                            }
                            while (this.p >= (float)Math.PI) {
                                this.p -= (float)Math.PI * 2;
                                if (arrm == null) {
                                    if (arrm == null) continue;
                                }
                                break block22;
                            }
                            while (this.p < (float)(-Math.PI)) {
                                this.p += (float)Math.PI * 2;
                                if (arrm == null) {
                                    if (arrm == null) continue;
                                }
                                break block23;
                            }
                        }
                        while (this.q >= (float)Math.PI) {
                            this.q -= (float)Math.PI * 2;
                            if (arrm == null) {
                                if (arrm == null) continue;
                            }
                            break block24;
                        }
                    }
                    while (this.q < (float)(-Math.PI)) {
                        e10 = this;
                        if (arrm == null) {
                            e10.q += (float)Math.PI * 2;
                            if (arrm == null) continue;
                        }
                        break block25;
                    }
                }
                e10 = this;
            }
            for (f10 = (v2080098).q - this.p; f10 >= (float)Math.PI; f10 -= (float)Math.PI * 2) {
                if (arrm == null) {
                    if (arrm == null) continue;
                }
                break block26;
            }
            while (f10 < (float)(-Math.PI)) {
                f10 += (float)Math.PI * 2;
                if (arrm == null) {
                    if (arrm == null) continue;
                }
                break block26;
            }
            this.p += f10 * 0.4f;
            this.r = h.c(this.r, 0.0f, 1.0f);
            ++this.j;
            this.i = this.k;
        }
        float f13 = (this.s - this.k) * 0.4f;
        float f14 = 0.2f;
        f13 = h.c(f13, -0.2f, 0.2f);
        this.t += (f13 - this.t) * 0.9f;
        this.k += this.t;
    }

    @Override
    public k d() {
        return this.g() ? new g(this.g()) : new net.minecraft.at.h(this.g(), new Object[0]);
    }

    @Override
    public String a() {
        return "minecraft:enchanting_table";
    }
}

