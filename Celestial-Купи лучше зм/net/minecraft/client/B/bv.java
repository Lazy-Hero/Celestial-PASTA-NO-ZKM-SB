/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.b;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.Q;
import net.minecraft.client.b.B;
import net.minecraft.client.b.C;
import net.minecraft.client.b.aP;
import net.minecraft.client.b.bu;
import net.minecraft.client.b.q;
import net.minecraft.client.b.s;
import net.minecraft.client.l.f;

public class bv
extends bu {
    private final /* synthetic */ List<aP> x;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected int h() {
        return super.h() + 32;
    }

    private s a(Q q2, int n2, int n3, f f10) {
        String[] arrstring = net.minecraft.client.b.q.b();
        f f11 = f10;
        if (arrstring != null) {
            if (f11 == null) {
                return null;
            }
            f11 = f10;
        }
        int n4 = f11.e();
        return f10.f() ? new C(n4, n2, n3, f10) : new B(n4, n2, n3, f10, q2.ac.c(f10));
    }

    public bv(Q q2, int n2, int n3, int n4, int n5, int n6, f ... arrf) {
        super(q2, n2, n3, n4, n5, n6);
        this.x = Lists.newArrayList();
        String[] arrstring = net.minecraft.client.b.q.b();
        this.b = false;
        for (int i2 = 0; i2 < arrf.length; i2 += 2) {
            f f10 = arrf[i2];
            f f11 = i2 < arrf.length - 1 ? arrf[i2 + 1] : null;
            s s2 = this.a(q2, n2 / 2 - 155, 0, f10);
            s s3 = this.a(q2, n2 / 2 - 155 + 160, 0, f11);
            this.x.add(new aP(s2, s3));
            if (arrstring != null) continue;
        }
    }

    @Override
    public aP a(int n2) {
        return this.x.get(n2);
    }

    @Override
    protected int d() {
        return this.x.size();
    }

    @Override
    public int j() {
        return 400;
    }
}

