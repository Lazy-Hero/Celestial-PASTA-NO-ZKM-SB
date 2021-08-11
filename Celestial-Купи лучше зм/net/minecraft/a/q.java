/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import net.minecraft.Q.az;
import net.minecraft.a.k;
import net.minecraft.a.p;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.at.h;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.w.d;

public class q
extends p {
    private /* synthetic */ boolean l;
    private /* synthetic */ boolean o;
    private /* synthetic */ int m;
    private /* synthetic */ int n;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c(n n2) {
        boolean bl2 = k.q();
        boolean bl3 = this.o;
        if (!bl2) {
            if (bl3) return false;
            bl3 = super.c(n2);
        }
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public void a() {
        block14: {
            boolean bl2;
            block21: {
                boolean bl3;
                long l2;
                block15: {
                    long l3;
                    long l4;
                    block16: {
                        long l5;
                        block19: {
                            long l6;
                            block20: {
                                block17: {
                                    long l7;
                                    block18: {
                                        block12: {
                                            long l8;
                                            block13: {
                                                long l9;
                                                block10: {
                                                    q q2;
                                                    block11: {
                                                        boolean bl4 = k.q();
                                                        super.a();
                                                        ++this.m;
                                                        l2 = this.j.r();
                                                        l4 = l2 / 24000L + 1L;
                                                        bl3 = bl4;
                                                        q2 = this;
                                                        if (bl3) break block10;
                                                        if (q2.l) break block11;
                                                        q2 = this;
                                                        if (bl3) break block10;
                                                        if (q2.m > 20) {
                                                            this.l = true;
                                                            this.i.cD.a(new az(5, 0.0f));
                                                        }
                                                    }
                                                    q2 = this;
                                                }
                                                long l10 = (l9 = l2 - 120500L) == 0L ? 0 : (l9 < 0L ? -1 : 1);
                                                if (!bl3) {
                                                    l10 = l10 > 0 ? (long)1 : (long)0;
                                                }
                                                q2.o = l10;
                                                bl2 = this.o;
                                                if (!bl3) {
                                                    long l11;
                                                    if (bl2) {
                                                        ++this.n;
                                                    }
                                                    bl2 = (l11 = l2 % 24000L - 500L) == 0L ? 0 : (l11 < 0L ? -1 : 1);
                                                }
                                                if (bl3) break block12;
                                                if (bl2) break block13;
                                                if (l4 > 6L) break block14;
                                                this.i.a(new h("demo.day." + l4, new Object[0]));
                                                if (!bl3) break block14;
                                            }
                                            bl2 = (l8 = l4 - 1L) == 0L ? 0 : (l8 < 0L ? -1 : 1);
                                        }
                                        if (bl3) break block15;
                                        if (bl2) break block16;
                                        long l5 = l2 - 100L;
                                        l5 = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
                                        if (bl3) break block17;
                                        if (l5 != false) break block18;
                                        this.i.cD.a(new az(5, 101.0f));
                                        if (!bl3) break block14;
                                    }
                                    l5 = (l7 = l2 - 175L) == 0L ? 0 : (l7 < 0L ? -1 : 1);
                                }
                                if (bl3) break block19;
                                if (l5 != false) break block20;
                                this.i.cD.a(new az(5, 102.0f));
                                if (!bl3) break block14;
                            }
                            l5 = (l6 = l2 - 250L) == 0L ? 0 : (l6 < 0L ? -1 : 1);
                        }
                        if (l5 != false) break block14;
                        this.i.cD.a(new az(5, 103.0f));
                        if (!bl3) break block14;
                    }
                    bl2 = (l3 = l4 - 5L) == 0L ? 0 : (l3 < 0L ? -1 : 1);
                }
                if (bl3) break block21;
                if (bl2) break block14;
                long l13 = l2 % 24000L - 22000L;
                bl2 = l13 == 0L ? 0 : (l13 < 0L ? -1 : 1);
            }
            if (!bl2) {
                this.i.a(new h("demo.day.warning", new Object[0]));
            }
        }
    }

    @Override
    public aX a(j j2, z z2, d d10, a3 a32, n n2, aA aA2, float f10, float f11, float f12) {
        boolean bl2 = k.q();
        q q2 = this;
        if (!bl2) {
            if (q2.o) {
                this.c();
                return aX.PASS;
            }
            q2 = this;
        }
        return super.a(j2, z2, d10, a32, n2, aA2, f10, f11, f12);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public q(z z2) {
        super(z2);
    }

    @Override
    public void a(n n2, aA aA2) {
        block4: {
            q q2;
            block2: {
                block3: {
                    boolean bl2 = k.t();
                    q2 = this;
                    if (!bl2) break block2;
                    if (!q2.o) break block3;
                    this.c();
                    if (bl2) break block4;
                }
                q2 = this;
            }
            super.a(n2, aA2);
        }
    }

    @Override
    public aX a(j j2, z z2, d d10, a3 a32) {
        boolean bl2 = k.t();
        q q2 = this;
        if (bl2) {
            if (q2.o) {
                this.c();
                return aX.PASS;
            }
            q2 = this;
        }
        return super.a(j2, z2, d10, a32);
    }

    @Override
    public void a(n n2) {
        block3: {
            q q2;
            block2: {
                boolean bl2 = k.t();
                q2 = this;
                if (!bl2) break block2;
                if (q2.o) break block3;
                q2 = this;
            }
            super.a(n2);
        }
    }

    private void c() {
        block3: {
            block2: {
                boolean bl2 = k.q();
                q q2 = this;
                if (bl2) break block2;
                if (q2.n <= 100) break block3;
                this.i.a(new h("demo.reminder", new Object[0]));
                q2 = this;
            }
            q2.n = 0;
        }
    }
}

