/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ao;

import java.util.Random;
import net.minecraft.A.h;
import net.minecraft.ao.ac;
import net.minecraft.ao.u;
import net.minecraft.ao.v;
import net.minecraft.ao.w;
import net.minecraft.ao.x;
import net.minecraft.ao.y;
import net.minecraft.ao.z;
import net.minecraft.k.n;
import net.minecraft.u.d;

public class a8
extends ac {
    public a8(net.minecraft.ah.z z2, Random random, int n2, int n3, h h2) {
        block7: {
            v v2;
            block3: {
                String[] arrstring;
                block9: {
                    block12: {
                        h h3;
                        h h4;
                        block11: {
                            block10: {
                                block8: {
                                    block5: {
                                        block6: {
                                            block4: {
                                                block2: {
                                                    String[] arrstring2 = u.b();
                                                    super(n2, n3);
                                                    arrstring = arrstring2;
                                                    h4 = h2;
                                                    h3 = d.l;
                                                    if (arrstring == null) break block2;
                                                    if (h4 == h3) break block3;
                                                    h4 = h2;
                                                    h3 = d.r;
                                                }
                                                if (arrstring == null) break block4;
                                                if (h4 == h3) break block3;
                                                h4 = h2;
                                                h3 = d.n;
                                            }
                                            if (arrstring == null) break block5;
                                            if (h4 != h3) break block6;
                                            v2 = new z(random, n2 * 16, n3 * 16);
                                            this.c.add(v2);
                                            if (arrstring != null) break block7;
                                        }
                                        h4 = h2;
                                        h3 = d.ab;
                                    }
                                    if (arrstring == null) break block8;
                                    if (h4 == h3) break block9;
                                    h4 = h2;
                                    h3 = d.X;
                                }
                                if (arrstring == null) break block10;
                                if (h4 == h3) break block9;
                                h4 = h2;
                                h3 = d.S;
                            }
                            if (arrstring == null) break block11;
                            if (h4 == h3) break block12;
                            h4 = h2;
                            h3 = d.aa;
                        }
                        if (h4 != h3) break block7;
                    }
                    v2 = new x(random, n2 * 16, n3 * 16);
                    this.c.add(v2);
                    if (arrstring != null) break block7;
                }
                v2 = new w(random, n2 * 16, n3 * 16);
                this.c.add(v2);
                if (arrstring != null) break block7;
            }
            v2 = new y(random, n2 * 16, n3 * 16);
            this.c.add(v2);
        }
        this.c();
    }

    public a8() {
    }

    public a8(net.minecraft.ah.z z2, Random random, int n2, int n3) {
        this(z2, random, n2, n3, z2.c(new n(n2 * 16 + 8, 0, n3 * 16 + 8)));
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

