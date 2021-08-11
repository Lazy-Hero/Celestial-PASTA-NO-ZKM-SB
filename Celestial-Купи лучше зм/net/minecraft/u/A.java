/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net.minecraft.u;

import com.mojang.authlib.GameProfile;
import net.minecraft.N.X;
import net.minecraft.N.y;
import net.minecraft.O.i;
import net.minecraft.P.c;
import net.minecraft.P.r;
import net.minecraft.W.a3;
import net.minecraft.W.aY;
import net.minecraft.ah.z;
import net.minecraft.ar.aA;
import net.minecraft.ar.aD;
import net.minecraft.k.n;
import net.minecraft.u.f;
import net.minecraft.u.g;
import net.minecraft.u.x;
import net.minecraft.w.d;
import net.minecraft.w.m;

final class A
extends x {
    @Override
    protected d b(i i2, d d10) {
        d d11;
        block24: {
            block14: {
                boolean bl2;
                block11: {
                    boolean bl3;
                    block12: {
                        block15: {
                            block16: {
                                y y2;
                                n n2;
                                aA aA2;
                                z z2;
                                block23: {
                                    block17: {
                                        GameProfile gameProfile;
                                        block19: {
                                            String string;
                                            String string2;
                                            r r2;
                                            block22: {
                                                boolean bl4;
                                                r r3;
                                                block20: {
                                                    block21: {
                                                        d d12;
                                                        block18: {
                                                            block13: {
                                                                z2 = i2.a();
                                                                aA2 = i2.b().b(a3.C);
                                                                bl3 = f.f();
                                                                n2 = i2.e().a(aA2);
                                                                aY aY2 = g.bY;
                                                                this.c = true;
                                                                bl2 = z2.a(n2);
                                                                if (bl3) break block11;
                                                                if (!bl2) break block12;
                                                                bl2 = aY2.a(z2, n2, d10);
                                                                if (bl3) break block11;
                                                                if (!bl2) break block12;
                                                                boolean bl5 = z2.C;
                                                                if (bl3) break block13;
                                                                if (bl5) break block14;
                                                                bl5 = z2.a(n2, aY2.d().a(aY.I, aA.UP), 3);
                                                            }
                                                            y2 = z2.b(n2);
                                                            if (bl3) break block15;
                                                            if (!(y2 instanceof X)) break block16;
                                                            if (d10.d() != 3) break block17;
                                                            gameProfile = null;
                                                            d12 = d10;
                                                            if (bl3) break block18;
                                                            if (!d12.x()) break block19;
                                                            d12 = d10;
                                                        }
                                                        r3 = d12.v();
                                                        bl4 = r3.a("SkullOwner", 10);
                                                        if (bl3) break block20;
                                                        if (!bl4) break block21;
                                                        gameProfile = net.minecraft.P.c.a(r3.h("SkullOwner"));
                                                        break block19;
                                                    }
                                                    r2 = r3;
                                                    string2 = "SkullOwner";
                                                    if (bl3) break block22;
                                                    bl4 = r2.a(string2, 8);
                                                }
                                                if (!bl4) break block19;
                                                r2 = r3;
                                                string2 = "SkullOwner";
                                            }
                                            if (!aD.a(string = r2.j(string2))) {
                                                gameProfile = new GameProfile(null, string);
                                            }
                                        }
                                        ((X)y2).a(gameProfile);
                                        if (!bl3) break block23;
                                    }
                                    ((X)y2).b(d10.d());
                                }
                                ((X)y2).a(aA2.h().k() * 4);
                                g.bY.a(z2, n2, (X)y2);
                            }
                            d10.b(1);
                        }
                        if (!bl3) break block14;
                    }
                    d11 = m.a(i2, d10);
                    if (bl3) break block24;
                    bl2 = d11.G();
                }
                if (bl2) {
                    this.c = false;
                }
            }
            d11 = d10;
        }
        return d11;
    }

    A() {
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

