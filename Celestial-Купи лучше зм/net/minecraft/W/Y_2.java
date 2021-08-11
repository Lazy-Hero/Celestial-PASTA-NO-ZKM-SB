/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.w;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.J.s;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.ab.a;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aA;
import net.minecraft.ar.aX;
import net.minecraft.ar.t;
import net.minecraft.client.B.o;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.w.Z;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class Y
extends k {
    @Override
    public aX a(j j2, z z2, n n2, a3 a32, aA aA2, float f10, float f11, float f12) {
        block1: {
            if (z2.C) break block1;
            d d10 = j2.c(a32);
            s s2 = new s(z2, (float)n2.e() + f10, (float)n2.b() + f11, (float)n2.a() + f12, d10);
            z2.f(s2);
            if (!j2.cw.g) {
                d10.b(1);
            }
        }
        return aX.SUCCESS;
    }

    @Override
    public void a(d d10, @Nullable z z2, List<String> list, o o2) {
        block11: {
            int n2;
            u u2;
            int n3;
            block12: {
                r r2;
                r r3;
                block10: {
                    r3 = d10.c("Fireworks");
                    n3 = bl.c();
                    r2 = r3;
                    if (n3 != 0) break block10;
                    if (r2 == null) break block11;
                    r2 = r3;
                }
                String string = "Flight";
                int n4 = 99;
                if (n3 == 0) {
                    if (r2.a(string, n4)) {
                        list.add(net.minecraft.ab.a.a("item.fireworks.flight") + " " + r3.r("Flight"));
                    }
                    r2 = r3;
                    string = "Explosions";
                    n4 = 10;
                }
                u2 = r2.c(string, n4);
                int n5 = u2.c();
                if (n3 != 0) break block12;
                if (n5 != 0) break block11;
                n5 = n2 = 0;
            }
            while (n2 < u2.b()) {
                block9: {
                    r r4 = u2.d(n2);
                    ArrayList arrayList = Lists.newArrayList();
                    Z.a(r4, arrayList);
                    if (n3 == 0) {
                        if (!arrayList.isEmpty()) {
                            for (int i2 = 1; i2 < arrayList.size(); ++i2) {
                                arrayList.set(i2, "  " + (String)arrayList.get(i2));
                                if (n3 == 0) {
                                    if (n3 == 0) continue;
                                }
                                break block9;
                            }
                            list.addAll(arrayList);
                        }
                        ++n2;
                    }
                }
                if (n3 == 0) continue;
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public t<d> a(z z2, j j2, a3 a32) {
        block6: {
            j j3;
            block5: {
                int n2 = bl.g();
                j3 = j2;
                if (n2 == 0) break block5;
                if (!j3.aK()) break block6;
                j3 = j2;
            }
            d d10 = j3.c(a32);
            if (!z2.C) {
                s s2 = new s(z2, d10, j2);
                z2.f(s2);
                if (!j2.cw.g) {
                    d10.b(1);
                }
            }
            return new t<d>(aX.SUCCESS, j2.c(a32));
        }
        return new t<d>(aX.PASS, j2.c(a32));
    }
}

