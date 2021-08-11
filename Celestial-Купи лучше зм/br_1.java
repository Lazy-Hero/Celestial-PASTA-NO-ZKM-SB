/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.W.K;
import net.minecraft.k.k;
import net.minecraft.k.n;

public class br
extends bE {
    private final /* synthetic */ hH n;
    private final /* synthetic */ hH k;
    private final /* synthetic */ hH m;
    /* synthetic */ ef l;

    private static gP b(gP gP2) {
        return gP2;
    }

    public br() {
        super("AntiTrapka", a5.Player);
        this.l = new ef();
        this.k = new hH("Delay", this, 5.0, 0.0, 50.0, 1.0);
        cj.b.f.b(this.k);
        this.m = new hH("FallDistance", this, 3.3, 1.0, 30.0, 0.1);
        cj.b.f.b(this.m);
        this.n = new hH("SneakCheck", this, true);
        cj.b.f.b(this.n);
    }

    @cL
    public void a(fb fb2) {
        block19: {
            ef ef2;
            block20: {
                String string;
                block11: {
                    int n2;
                    int n3;
                    block18: {
                        K k2;
                        block17: {
                            block16: {
                                block15: {
                                    block14: {
                                        block13: {
                                            block12: {
                                                block10: {
                                                    hH hH2;
                                                    block9: {
                                                        block8: {
                                                            boolean bl2;
                                                            block7: {
                                                                string = net.minecraft.k.k.b();
                                                                bl2 = br.c.ac.bc.b();
                                                                if (string == null) break block7;
                                                                if (!bl2) break block8;
                                                                hH2 = this.n;
                                                                if (string == null) break block9;
                                                                bl2 = hH2.l();
                                                            }
                                                            if (bl2) {
                                                                return;
                                                            }
                                                        }
                                                        hH2 = this.m;
                                                    }
                                                    float f10 = hH2.r();
                                                    n n4 = new n(br.c.s.a, br.c.s.aF - (double)f10, br.c.s.ax);
                                                    k2 = br.c.e.d(n4).b();
                                                    n3 = K.b(k2);
                                                    n2 = 58;
                                                    if (string == null) break block10;
                                                    if (n3 == n2) break block11;
                                                    n3 = K.b(k2);
                                                    n2 = 154;
                                                }
                                                if (string == null) break block12;
                                                if (n3 == n2) break block11;
                                                n3 = K.b(k2);
                                                n2 = 107;
                                            }
                                            if (string == null) break block13;
                                            if (n3 == n2) break block11;
                                            n3 = K.b(k2);
                                            n2 = 23;
                                        }
                                        if (string == null) break block14;
                                        if (n3 == n2) break block11;
                                        n3 = K.b(k2);
                                        n2 = 30;
                                    }
                                    if (string == null) break block15;
                                    if (n3 == n2) break block11;
                                    n3 = K.b(k2);
                                    n2 = 61;
                                }
                                if (string == null) break block16;
                                if (n3 == n2) break block11;
                                n3 = K.b(k2);
                                n2 = 213;
                            }
                            if (string == null) break block17;
                            if (n3 == n2) break block11;
                            n3 = K.b(k2);
                            n2 = 131;
                        }
                        if (string == null) break block18;
                        if (n3 == n2) break block11;
                        n3 = K.b(k2);
                        n2 = 132;
                    }
                    if (n3 != n2) break block19;
                }
                float f11 = this.k.r();
                ef2 = this.l;
                if (string == null) break block20;
                if (!ef2.a(f11 * 100.0f)) break block19;
                br.c.s.aH();
                ef2 = this.l;
            }
            ef2.d();
        }
    }
}

