/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.B.h;
import net.minecraft.B.q;
import net.minecraft.client.I.j;
import net.minecraft.client.Q;
import net.minecraft.client.b.L;
import net.minecraft.k.k;
import net.minecraft.k.m;
import net.minecraft.w.N;
import net.minecraft.w.V;
import net.minecraft.w.a3;
import net.minecraft.w.a_;
import net.minecraft.w.ao;
import net.minecraft.w.aw;
import net.minecraft.w.d;
import net.minecraft.w.o;
import net.minecraft.w.s;

public class bj
extends bE {
    private final /* synthetic */ hH o;
    private final /* synthetic */ hH k;
    /* synthetic */ ef n;
    /* synthetic */ ef m;
    private final /* synthetic */ hH l;

    private boolean a(j j2) {
        boolean bl2;
        block4: {
            int n2 = 0;
            String string = net.minecraft.k.k.b();
            while (n2 < j2.a().e()) {
                d d10 = j2.a().a(n2);
                if (string != null) {
                    bl2 = this.a(d10);
                    if (string == null) break block4;
                    if (bl2) {
                        return false;
                    }
                    ++n2;
                }
                if (string != null) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public bj() {
        block0: {
            super("ChestStealer", a5.Player);
            this.n = new ef();
            this.m = new ef();
            String string = net.minecraft.k.k.b();
            this.o = new hH("Stealer Speed", this, 10.0, 0.0, 100.0, 1.0);
            cj.b.f.b(this.o);
            this.k = new hH("Drop Items", this, false);
            cj.b.f.b(this.k);
            this.l = new hH("No Move Swap", this, false);
            cj.b.f.b(this.l);
            if (net.minecraft.k.m.d()) break block0;
            net.minecraft.k.k.b("BZcP4");
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(d d10) {
        String string = net.minecraft.k.k.b();
        boolean bl2 = d10.w() instanceof net.minecraft.w.m;
        if (string == null) return bl2;
        if (bl2) return true;
        bl2 = d10.w() instanceof V;
        if (string == null) return bl2;
        if (bl2) return true;
        bl2 = d10.w() instanceof a_;
        if (string == null) return bl2;
        if (bl2) return true;
        bl2 = d10.w() instanceof a3;
        if (string == null) return bl2;
        if (bl2) return true;
        bl2 = d10.w() instanceof aw;
        if (string == null) return bl2;
        if (bl2) return true;
        bl2 = d10.w() instanceof ao;
        if (string == null) return bl2;
        if (bl2) return true;
        bl2 = d10.w() instanceof s;
        if (string == null) return bl2;
        if (bl2) return true;
        bl2 = d10.w() instanceof o;
        if (string == null) return bl2;
        if (bl2) return true;
        bl2 = d10.w() instanceof N;
        if (string == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @cL
    public void a(fy fy2) {
        block26: {
            L l2;
            block15: {
                block14: {
                    bj bj2;
                    block24: {
                        block25: {
                            boolean bl2;
                            String string;
                            block12: {
                                Q q2;
                                float f10;
                                block18: {
                                    block17: {
                                        boolean bl3;
                                        block16: {
                                            block13: {
                                                string = net.minecraft.k.k.b();
                                                if (string == null) break block13;
                                                if (!fy2.j()) break block14;
                                                this.b("" + cj.b.f.a("Stealer Speed").c());
                                            }
                                            f10 = this.o.r() * 10.0f;
                                            l2 = bj.c.aO;
                                            if (string == null) break block15;
                                            if (!(l2 instanceof j)) break block14;
                                            bl3 = this.l.l();
                                            if (string == null) break block16;
                                            if (!bl3) break block17;
                                            q2 = c;
                                            if (string == null) break block18;
                                            bl3 = q2.s.F();
                                        }
                                        if (bl3) {
                                            return;
                                        }
                                    }
                                    q2 = c;
                                }
                                j j2 = (j)q2.aO;
                                int n2 = 0;
                                while (n2 < j2.a().e()) {
                                    block19: {
                                        block20: {
                                            block23: {
                                                q q3;
                                                block22: {
                                                    boolean bl4;
                                                    block21: {
                                                        d d10 = j2.a().a(n2);
                                                        q3 = (q)bj.c.s.cm;
                                                        if (string == null) break block19;
                                                        bl2 = this.a(d10);
                                                        if (string == null) break block12;
                                                        if (!bl2) break block20;
                                                        bl4 = this.m.a(f10);
                                                        if (string == null) break block21;
                                                        if (!bl4) break block20;
                                                        bl4 = this.k.l();
                                                    }
                                                    if (bl4) break block22;
                                                    bj.c.aW.a(q3.b, n2, 0, h.QUICK_MOVE, bj.c.s);
                                                    if (string != null) break block23;
                                                }
                                                bj.c.aW.a(q3.b, n2, 1, h.THROW, bj.c.s);
                                            }
                                            this.m.d();
                                        }
                                        ++n2;
                                    }
                                    if (string != null) continue;
                                }
                                bj2 = this;
                                if (string == null) break block24;
                                bl2 = bj2.a(j2);
                            }
                            if (!bl2) break block25;
                            if (!this.n.a(aY.b(75, 150))) break block14;
                            bj.c.s.ag();
                            if (string != null) break block14;
                        }
                        bj2 = this;
                    }
                    bj2.n.d();
                }
                l2 = bj.c.aO;
            }
            if (l2 != null) break block26;
            this.n.d();
        }
    }
}

