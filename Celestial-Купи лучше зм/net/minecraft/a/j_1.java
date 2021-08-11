/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.A;

import java.util.Iterator;
import java.util.Random;
import net.minecraft.A.b;
import net.minecraft.A.d;
import net.minecraft.A.e;
import net.minecraft.A.h;
import net.minecraft.T.a4;
import net.minecraft.T.aO;
import net.minecraft.T.ag;
import net.minecraft.U.C;
import net.minecraft.ag.P;
import net.minecraft.ah.z;
import net.minecraft.k.n;
import net.minecraft.p.u;
import net.minecraft.u.g;

public class j
extends h {
    public j(e e10) {
        block3: {
            boolean bl2 = net.minecraft.A.b.c();
            super(e10);
            this.j.clear();
            boolean bl3 = bl2;
            this.B = g.aO.d();
            this.z = g.aO.d();
            this.a.I = -999;
            this.a.f = 2;
            this.a.d = 50;
            this.a.H = 10;
            this.j.clear();
            this.j.add(new d(P.class, 4, 2, 3));
            Iterator iterator = this.D.iterator();
            while (iterator.hasNext()) {
                block6: {
                    block5: {
                        Class<a4> class_;
                        Class<? extends C> class_2;
                        block4: {
                            d d10 = (d)iterator.next();
                            if (!bl3) break block3;
                            class_2 = d10.b;
                            class_ = a4.class;
                            if (!bl3) break block4;
                            if (class_2 == class_) break block5;
                            class_2 = d10.b;
                            class_ = ag.class;
                        }
                        if (class_2 != class_) break block6;
                    }
                    iterator.remove();
                }
                if (bl3) continue;
            }
            this.D.add(new d(a4.class, 19, 4, 4));
            this.D.add(new d(ag.class, 1, 1, 1));
            this.D.add(new d(aO.class, 80, 4, 4));
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public void a(z z2, Random random, n n2) {
        boolean bl2 = net.minecraft.A.b.c();
        super.a(z2, random, n2);
        boolean bl3 = bl2;
        int n3 = random.nextInt(1000);
        if (bl3) {
            if (n3 == 0) {
                int n4 = random.nextInt(16) + 8;
                int n5 = random.nextInt(16) + 8;
                n n6 = z2.C(n2.a(n4, 0, n5)).a();
                new u().a(z2, random, n6);
            }
            n3 = random.nextInt(64);
        }
        if (bl3 && n3 == 0) {
            n3 = new net.minecraft.p.C().a(z2, random, n2) ? 1 : 0;
        }
    }
}

