/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package net.minecraft.ao;

import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import net.minecraft.P.r;
import net.minecraft.ah.z;
import net.minecraft.ao.aE;
import net.minecraft.ao.ac;
import net.minecraft.ao.b;
import net.minecraft.ao.u;
import net.minecraft.ar.aA;
import net.minecraft.ar.av;
import net.minecraft.k.f;

public class bv
extends ac {
    private /* synthetic */ boolean f;
    private final /* synthetic */ Set<f> e;

    @Override
    public void b(r r2) {
        block2: {
            super.b(r2);
            net.minecraft.P.u u2 = new net.minecraft.P.u();
            Iterator<f> iterator = this.e.iterator();
            String[] arrstring = u.b();
            while (iterator.hasNext()) {
                f f10 = iterator.next();
                r r3 = new r();
                r3.b("X", f10.c);
                r3.b("Z", f10.b);
                u2.a(r3);
                if (arrstring != null) {
                    if (arrstring != null) continue;
                }
                break block2;
            }
            r2.a("Processed", u2);
        }
    }

    private void b(z z2, Random random, int n2, int n3) {
        random.setSeed(z2.C());
        long l2 = random.nextLong();
        long l3 = random.nextLong();
        long l4 = (long)n2 * l2;
        long l5 = (long)n3 * l3;
        random.setSeed(l4 ^ l5 ^ z2.C());
        int n4 = n2 * 16 + 8 - 29;
        int n5 = n3 * 16 + 8 - 29;
        aA aA2 = av.HORIZONTAL.a(random);
        this.c.add(new aE(random, n4, n5, aA2));
        this.c();
        this.f = true;
    }

    @Override
    public void a(z z2, Random random, b b10) {
        String[] arrstring = u.b();
        bv bv2 = this;
        if (arrstring != null) {
            if (!bv2.f) {
                this.c.clear();
                this.b(z2, random, this.e(), this.b());
            }
            bv2 = this;
        }
        super.a(z2, random, b10);
    }

    @Override
    public void a(f f10) {
        super.a(f10);
        this.e.add(f10);
    }

    public bv() {
        this.e = Sets.newHashSet();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(f f10) {
        String[] arrstring = u.b();
        boolean bl2 = this.e.contains(f10);
        if (arrstring != null) {
            if (bl2) return false;
            bl2 = super.b(f10);
        }
        if (arrstring == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public void a(r r2) {
        block4: {
            int n2;
            String string;
            r r3;
            String[] arrstring;
            block3: {
                String[] arrstring2 = u.b();
                super.a(r2);
                arrstring = arrstring2;
                r3 = r2;
                string = "Processed";
                n2 = 9;
                if (arrstring == null) break block3;
                if (!r3.a(string, n2)) break block4;
                r3 = r2;
                string = "Processed";
                n2 = 10;
            }
            net.minecraft.P.u u2 = r3.c(string, n2);
            for (int i2 = 0; i2 < u2.b(); ++i2) {
                r r4 = u2.d(i2);
                this.e.add(new f(r4.m("X"), r4.m("Z")));
                if (arrstring != null) continue;
            }
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public bv(z z2, Random random, int n2, int n3) {
        super(n2, n3);
        this.e = Sets.newHashSet();
        this.b(z2, random, n2, n3);
    }
}

