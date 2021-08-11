/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ar;

import net.minecraft.ar.a6;
import net.minecraft.ar.v;
import net.minecraft.client.l.c;

public class a9
extends a6 {
    private final /* synthetic */ c i;

    @Override
    public void a() {
        block23: {
            block22: {
                int n2;
                block21: {
                    block19: {
                        a9 a92;
                        block20: {
                            block18: {
                                block16: {
                                    a9 a93;
                                    block17: {
                                        block15: {
                                            block13: {
                                                a9 a94;
                                                block14: {
                                                    block12: {
                                                        block10: {
                                                            a9 a95;
                                                            block11: {
                                                                e = 0.0f;
                                                                n2 = v.b();
                                                                a = 0.0f;
                                                                a95 = this;
                                                                if (n2 != 0) break block10;
                                                                if (!a95.i.aW.b()) break block11;
                                                                a += 1.0f;
                                                                this.g = true;
                                                                if (n2 == 0) break block12;
                                                            }
                                                            a95 = this;
                                                        }
                                                        a95.g = false;
                                                    }
                                                    a94 = this;
                                                    if (n2 != 0) break block13;
                                                    if (!a94.i.O.b()) break block14;
                                                    a -= 1.0f;
                                                    this.c = true;
                                                    if (n2 == 0) break block15;
                                                }
                                                a94 = this;
                                            }
                                            a94.c = false;
                                        }
                                        a93 = this;
                                        if (n2 != 0) break block16;
                                        if (!a93.i.C.b()) break block17;
                                        e += 1.0f;
                                        this.f = true;
                                        if (n2 == 0) break block18;
                                    }
                                    a93 = this;
                                }
                                a93.f = false;
                            }
                            a92 = this;
                            if (n2 != 0) break block19;
                            if (!a92.i.G.b()) break block20;
                            e -= 1.0f;
                            this.b = true;
                            if (n2 == 0) break block21;
                        }
                        a92 = this;
                    }
                    a92.b = false;
                }
                this.h = this.i.v.b();
                this.d = this.i.bc.b();
                if (n2 != 0) break block22;
                if (!this.d) break block23;
                e = (float)((double)e * 0.3);
            }
            a = (float)((double)a * 0.3);
        }
    }

    public a9(c c10) {
        this.i = c10;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

