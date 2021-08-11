/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.w;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.P.i;
import net.minecraft.P.r;
import net.minecraft.ab.a;
import net.minecraft.ah.z;
import net.minecraft.client.B.o;
import net.minecraft.w.P;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class Z
extends k {
    public static i a(d d10, String string) {
        block3: {
            i i2;
            block4: {
                r r2;
                d d11;
                int n2;
                block2: {
                    n2 = bl.c();
                    d11 = d10;
                    if (n2 != 0) break block2;
                    if (!d11.x()) break block3;
                    d11 = d10;
                }
                i2 = r2 = d11.v().h("Explosion");
                if (n2 != 0) break block4;
                if (i2 == null) break block3;
                i2 = r2.g(string);
            }
            return i2;
        }
        return null;
    }

    @Override
    public void a(d d10, @Nullable z z2, List<String> list, o o2) {
        block3: {
            r r2;
            block4: {
                r r3;
                d d11;
                int n2;
                block2: {
                    n2 = bl.c();
                    d11 = d10;
                    if (n2 != 0) break block2;
                    if (!d11.x()) break block3;
                    d11 = d10;
                }
                r2 = r3 = d11.v().h("Explosion");
                if (n2 != 0) break block4;
                if (r2 == null) break block3;
                r2 = r3;
            }
            Z.a(r2, list);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void a(r r2, List<String> list) {
        int n2;
        int n3;
        int n6;
        int n7;
        Object object;
        int[] arrn;
        int n8;
        block27: {
            byte by2;
            block28: {
                byte by3 = r2.r("Type");
                n8 = bl.c();
                by2 = by3;
                if (n8 != 0) break block27;
                if (by2 < 0) break block28;
                by2 = by3;
                if (n8 != 0) break block27;
                if (by2 > 4) break block28;
                list.add(net.minecraft.ab.a.a("item.fireworksCharge.type." + by3).trim());
                if (n8 == 0) break block27;
            }
            by2 = (byte)(list.add(net.minecraft.ab.a.a("item.fireworksCharge.type").trim()) ? 1 : 0);
        }
        int[] arrn2 = arrn = r2.n("Colors");
        if (n8 == 0) {
            block25: {
                if (arrn2.length > 0) {
                    boolean bl2;
                    boolean bl3 = true;
                    String string = "";
                    object = arrn;
                    int n9 = ((int[])object).length;
                    n7 = 0;
                    block0: while (true) {
                        int n4 = n7;
                        int n5 = n9;
                        block1: while (n4 < n5) {
                            boolean bl4;
                            n6 = object[n7];
                            bl2 = bl3;
                            if (n8 != 0) break block25;
                            if (n8 == 0) {
                                if (!bl2) {
                                    string = string + ", ";
                                }
                                bl3 = false;
                                bl4 = false;
                            }
                            int n52 = bl4;
                            for (int i2 = 0; i2 < P.s.length; ++i2) {
                                int n10 = n6;
                                if (n8 == 0) {
                                    n5 = P.s[i2];
                                    if (n8 != 0) continue block1;
                                    if (n10 != n5) continue;
                                    n10 = 1;
                                }
                                n52 = n10;
                                string = string + net.minecraft.ab.a.a("item.fireworksCharge." + bl.d(i2).d());
                                if (n8 == 0) break;
                                if (n8 == 0) continue;
                            }
                            if (n52 == 0) {
                                string = string + net.minecraft.ab.a.a("item.fireworksCharge.customColor");
                            }
                            ++n7;
                            if (n8 == 0) continue block0;
                        }
                        break;
                    }
                    bl2 = list.add(string);
                }
            }
            arrn2 = r2.n("FadeColors");
        }
        int[] arrn3 = arrn2;
        int n11 = arrn3.length;
        if (n8 == 0) {
            block26: {
                if (n11 > 0) {
                    boolean bl5;
                    boolean bl6 = true;
                    object = net.minecraft.ab.a.a("item.fireworksCharge.fadeTo") + " ";
                    int[] arrn4 = arrn3;
                    n7 = arrn4.length;
                    n6 = 0;
                    block3: while (true) {
                        int n12 = n6;
                        int n13 = n7;
                        block4: while (n12 < n13) {
                            boolean bl7;
                            int n14 = arrn4[n6];
                            bl5 = bl6;
                            if (n8 != 0) break block26;
                            if (n8 == 0) {
                                if (!bl5) {
                                    object = (String)object + ", ";
                                }
                                bl6 = false;
                                bl7 = false;
                            }
                            int n15 = bl7;
                            for (int i3 = 0; i3 < 16; ++i3) {
                                int n16 = n14;
                                if (n8 == 0) {
                                    n13 = P.s[i3];
                                    if (n8 != 0) continue block4;
                                    if (n16 != n13) continue;
                                    n16 = 1;
                                }
                                n15 = n16;
                                object = (String)object + net.minecraft.ab.a.a("item.fireworksCharge." + bl.d(i3).d());
                                if (n8 == 0) break;
                                if (n8 == 0) continue;
                            }
                            if (n15 == 0) {
                                object = (String)object + net.minecraft.ab.a.a("item.fireworksCharge.customColor");
                            }
                            ++n6;
                            if (n8 == 0) continue block3;
                        }
                        break;
                    }
                    bl5 = list.add((String)object);
                }
            }
            n11 = r2.f("Trail") ? 1 : 0;
        }
        int n17 = n3 = n11;
        if (n8 == 0) {
            if (n17 != 0) {
                list.add(net.minecraft.ab.a.a("item.fireworksCharge.trail"));
            }
            n17 = r2.f("Flicker") ? 1 : 0;
        }
        int n18 = n2 = n17;
        if (n8 == 0 && n18 != 0) {
            n18 = list.add(net.minecraft.ab.a.a("item.fireworksCharge.flicker")) ? 1 : 0;
        }
    }
}

