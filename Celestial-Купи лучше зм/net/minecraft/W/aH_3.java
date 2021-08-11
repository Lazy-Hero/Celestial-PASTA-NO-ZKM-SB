/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.w;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import net.minecraft.P.r;
import net.minecraft.P.u;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aX;
import net.minecraft.ar.t;
import net.minecraft.ar.v;
import net.minecraft.i.j;
import net.minecraft.l.m;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class aH
extends k {
    private static final /* synthetic */ Logger s;

    @Override
    public t<d> a(z z2, j j2, a3 a32) {
        r r2;
        d d10;
        block16: {
            boolean bl2;
            int n2;
            block17: {
                r r3;
                block15: {
                    block14: {
                        j j3;
                        block13: {
                            d10 = j2.c(a32);
                            n2 = bl.c();
                            r2 = d10.v();
                            j3 = j2;
                            if (n2 != 0) break block13;
                            if (j3.cw.g) break block14;
                            j3 = j2;
                        }
                        j3.a(a32, d.m);
                    }
                    r3 = r2;
                    if (n2 != 0) break block15;
                    if (r3 == null) break block16;
                    r3 = r2;
                }
                bl2 = r3.a("Recipes", 9);
                if (n2 != 0) break block17;
                if (!bl2) break block16;
                bl2 = z2.C;
            }
            if (!bl2) {
                block12: {
                    u u2 = r2.c("Recipes", 8);
                    ArrayList arrayList = Lists.newArrayList();
                    int n3 = 0;
                    while (n3 < u2.b()) {
                        String string = u2.c(n3);
                        net.minecraft.az.k k2 = net.minecraft.az.t.a(new v(string));
                        if (n2 == 0) {
                            if (n2 == 0) {
                                if (k2 == null) {
                                    s.error("Invalid recipe: " + string);
                                    return new t<d>(aX.FAIL, d10);
                                }
                                arrayList.add(k2);
                                ++n3;
                            }
                            if (n2 == 0) continue;
                        }
                        break block12;
                    }
                    j2.b(arrayList);
                }
                j2.b(m.b(this));
            }
            return new t<d>(aX.SUCCESS, d10);
        }
        s.error("Tag not valid: " + r2);
        return new t<d>(aX.FAIL, d10);
    }

    static {
        s = LogManager.getLogger();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public aH() {
        this.b(1);
    }
}

