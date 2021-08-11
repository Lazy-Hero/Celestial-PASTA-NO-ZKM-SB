/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.ai;
import net.minecraft.U.C;
import net.minecraft.U.M;
import net.minecraft.ak.an;
import net.minecraft.ak.d;

class f
extends d {
    private final /* synthetic */ ai j;
    private /* synthetic */ float i;
    private /* synthetic */ boolean l;
    private /* synthetic */ int k;

    public void a(float f10, boolean bl2) {
        this.i = f10;
        this.l = bl2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public f(ai ai2) {
        super(ai2);
        this.j = ai2;
        this.i = 180.0f * ai2.e / (float)Math.PI;
    }

    public void a(double d10) {
        this.f = d10;
        this.a = an.MOVE_TO;
    }

    @Override
    public void a() {
        block6: {
            C c10;
            block7: {
                block8: {
                    f f10;
                    int[] arrn;
                    block9: {
                        block10: {
                            ai ai2;
                            block12: {
                                boolean bl2;
                                block11: {
                                    f f11;
                                    block4: {
                                        block5: {
                                            this.e.a1 = this.e.e = this.a(this.e.e, this.i, 90.0f);
                                            arrn = S.f();
                                            this.e.bf = this.e.e;
                                            f11 = this;
                                            if (arrn == null) break block4;
                                            if (f11.a == an.MOVE_TO) break block5;
                                            this.e.c(0.0f);
                                            if (arrn != null) break block6;
                                        }
                                        this.a = an.WAIT;
                                        f11 = this;
                                    }
                                    c10 = f11.e;
                                    if (arrn == null) break block7;
                                    if (!c10.A) break block8;
                                    this.e.g((float)(this.f * this.e.a(M.d).d()));
                                    f10 = this;
                                    if (arrn == null) break block9;
                                    if (f10.k-- > 0) break block10;
                                    this.k = this.j.b();
                                    bl2 = this.l;
                                    if (arrn == null) break block11;
                                    if (bl2) {
                                        this.k /= 3;
                                    }
                                    this.j.V().b();
                                    ai2 = this.j;
                                    if (arrn == null) break block12;
                                    bl2 = ai2.w();
                                }
                                if (!bl2) break block6;
                                ai2 = this.j;
                            }
                            ai2.a(this.j.a(), this.j.x(), ((this.j.f().nextFloat() - this.j.f().nextFloat()) * 0.2f + 1.0f) * 0.8f);
                            if (arrn != null) break block6;
                        }
                        this.j.bu = 0.0f;
                        this.j.bU = 0.0f;
                        f10 = this;
                    }
                    f10.e.g(0.0f);
                    if (arrn != null) break block6;
                }
                c10 = this.e;
            }
            c10.g((float)(this.f * this.e.a(M.d).d()));
        }
    }
}

