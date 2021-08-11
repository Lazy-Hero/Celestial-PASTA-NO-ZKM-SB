/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
package net.minecraft.client.b;

import java.util.Arrays;
import net.minecraft.client.D.h;
import net.minecraft.client.Q;
import net.minecraft.client.b.L;
import net.minecraft.client.b.P;
import net.minecraft.client.b.a0;
import net.minecraft.client.b.a3;
import net.minecraft.client.b.aJ;
import net.minecraft.client.b.bu;
import net.minecraft.client.b.q;
import net.minecraft.client.l.d;
import org.apache.commons.lang3.ArrayUtils;

public class b1
extends bu {
    private final /* synthetic */ P z;
    private final /* synthetic */ aJ[] x;
    private /* synthetic */ int A;
    private final /* synthetic */ Q y;

    @Override
    public int j() {
        return super.j() + 32;
    }

    static P a(b1 b12) {
        return b12.z;
    }

    @Override
    protected int h() {
        return super.h() + 15;
    }

    public b1(P p2, Q q2) {
        super(q2, L.h + 45, L.w, 63, L.w - 32, 20);
        this.z = p2;
        this.y = q2;
        Object[] arrobject = (d[])ArrayUtils.clone((Object[])q2.ac.ad);
        this.x = new aJ[arrobject.length + net.minecraft.client.l.d.c().size()];
        String[] arrstring = net.minecraft.client.b.q.b();
        Arrays.sort(arrobject);
        int n2 = 0;
        String[] arrstring2 = arrstring;
        String string = null;
        Object[] arrobject2 = arrobject;
        int n3 = arrobject2.length;
        int n4 = 0;
        while (n4 < n3) {
            int n5;
            Object object = arrobject2[n4];
            String string2 = ((d)object).g();
            int n6 = string2.equals(string);
            if (arrstring2 != null) {
                if (n6 == 0) {
                    string = string2;
                    this.x[n2++] = new a3(this, string2);
                }
                n6 = n5 = q2.a6.e(h.a(((d)object).f(), new Object[0]));
            }
            if (arrstring2 != null) {
                if (n5 > this.A) {
                    this.A = n5;
                }
                this.x[n2++] = new a0(this, (d)object, null);
                ++n4;
            }
            if (arrstring2 != null) continue;
        }
    }

    static int c(b1 b12) {
        return b12.A;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static Q b(b1 b12) {
        return b12.y;
    }

    @Override
    protected int d() {
        return this.x.length;
    }

    @Override
    public aJ a(int n2) {
        return this.x[n2];
    }
}

