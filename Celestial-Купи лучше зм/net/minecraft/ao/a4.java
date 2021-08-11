/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.ao;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.A.A;
import net.minecraft.A.b;
import net.minecraft.A.h;
import net.minecraft.A.j;
import net.minecraft.A.v;
import net.minecraft.ao.a5;
import net.minecraft.ao.ad;
import net.minecraft.ao.u;
import net.minecraft.k.n;
import net.minecraft.u.d;

public class a4
extends a5 {
    public /* synthetic */ int p;
    public /* synthetic */ List<ad> n;
    public /* synthetic */ List<u> o;
    public /* synthetic */ List<u> k;
    public /* synthetic */ ad l;
    public /* synthetic */ b m;

    private static gP a(gP gP2) {
        return gP2;
    }

    public a4() {
        this.k = Lists.newArrayList();
        this.o = Lists.newArrayList();
    }

    public a4(b b10, int n2, Random random, int n3, int n4, List<ad> list, int n5) {
        String[] arrstring;
        block7: {
            boolean bl2;
            block8: {
                h h2;
                block9: {
                    block5: {
                        block6: {
                            String[] arrstring2 = u.b();
                            super(null, 0, random, n3, n4);
                            arrstring = arrstring2;
                            this.k = Lists.newArrayList();
                            this.o = Lists.newArrayList();
                            this.m = b10;
                            this.n = list;
                            this.p = n5;
                            h2 = b10.a(new n(n3, 0, n4), d.ai);
                            bl2 = h2 instanceof j;
                            if (arrstring == null) break block5;
                            if (!bl2) break block6;
                            this.h = 1;
                            if (arrstring != null) break block7;
                        }
                        bl2 = h2 instanceof v;
                    }
                    if (arrstring == null) break block8;
                    if (!bl2) break block9;
                    this.h = 2;
                    if (arrstring != null) break block7;
                }
                bl2 = h2 instanceof A;
            }
            if (bl2) {
                this.h = 3;
            }
        }
        this.a(this.h);
        int n6 = random.nextInt(50);
        if (arrstring != null) {
            n6 = n6 == 0 ? 1 : 0;
        }
        this.j = n6;
    }
}

