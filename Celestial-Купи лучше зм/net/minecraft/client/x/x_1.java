/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.x;

import net.minecraft.b.a;
import net.minecraft.client.D.t;
import net.minecraft.client.a.X;
import net.minecraft.client.j.j;
import net.minecraft.client.x.J;
import net.minecraft.client.x.P;
import net.minecraft.client.x.Y;
import net.minecraft.client.x.n;

public class x
implements net.minecraft.client.D.x {
    private final /* synthetic */ j b;
    private final /* synthetic */ X d;
    private /* synthetic */ a<n, Y> a;
    private /* synthetic */ Y c;

    public Y c() {
        return this.c;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public j a() {
        return this.b;
    }

    public Y a(n n2) {
        Y y2;
        String[] arrstring = P.o();
        Object object = n2;
        if (arrstring == null) {
            if (object == null) {
                return this.c;
            }
            object = this.a.a(n2);
        }
        Y y3 = y2 = (Y)object;
        if (arrstring == null) {
            y3 = y3 == null ? this.c : y2;
        }
        return y3;
    }

    public x(j j2) {
        this.b = j2;
        this.d = new X(this);
    }

    @Override
    public void b(t t2) {
        J j2 = new J(t2, this.b, this.d);
        this.a = j2.l();
        this.c = this.a.a(J.s);
        this.d.c();
    }

    public X b() {
        return this.d;
    }
}

