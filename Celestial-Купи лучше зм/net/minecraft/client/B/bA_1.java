/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.b;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import net.minecraft.client.E.p;
import net.minecraft.client.Q;
import net.minecraft.client.b.aJ;
import net.minecraft.client.b.aN;
import net.minecraft.client.b.ad;
import net.minecraft.client.b.av;
import net.minecraft.client.b.az;
import net.minecraft.client.b.bu;
import net.minecraft.client.b.q;
import net.minecraft.client.o.l;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bA
extends bu {
    private final /* synthetic */ av y;
    private final /* synthetic */ List<aN> B;
    private /* synthetic */ int x;
    private final /* synthetic */ List<ad> A;
    private final /* synthetic */ aJ z;

    @Override
    protected boolean a(int n2) {
        String[] arrstring = net.minecraft.client.b.q.b();
        int n3 = n2;
        if (arrstring != null) {
            n3 = n3 == this.x ? 1 : 0;
        }
        return n3 != 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int b() {
        return this.x;
    }

    public void a(int n2) {
        this.x = n2;
    }

    @Override
    public aJ a(int n2) {
        String[] arrstring = net.minecraft.client.b.q.b();
        int n3 = n2;
        int n4 = this.B.size();
        if (arrstring != null) {
            if (n3 < n4) {
                return this.B.get(n2);
            }
            n3 = n2;
            n4 = this.B.size();
        }
        n2 = n3 - n4;
        if (arrstring != null) {
            if (n2 == 0) {
                return this.z;
            }
            --n2;
        }
        return this.A.get(n2);
    }

    @Override
    public int j() {
        return super.j() + 85;
    }

    @Override
    protected int d() {
        return this.B.size() + 1 + this.A.size();
    }

    public void a(p p2) {
        String[] arrstring = net.minecraft.client.b.q.b();
        this.B.clear();
        String[] arrstring2 = arrstring;
        for (int i2 = 0; i2 < p2.a(); ++i2) {
            this.B.add(new aN(this.y, p2.a(i2)));
            if (arrstring2 != null) continue;
        }
    }

    public bA(av av2, Q q2, int n2, int n3, int n4, int n5, int n6) {
        super(q2, n2, n3, n4, n5, n6);
        this.B = Lists.newArrayList();
        this.A = Lists.newArrayList();
        this.z = new az();
        this.x = -1;
        this.y = av2;
    }

    public void a(List<l> list) {
        this.A.clear();
        Iterator<l> iterator = list.iterator();
        String[] arrstring = net.minecraft.client.b.q.b();
        while (iterator.hasNext()) {
            l l2 = iterator.next();
            this.A.add(new ad(this.y, l2));
            if (arrstring != null) continue;
        }
    }

    @Override
    protected int h() {
        return super.h() + 30;
    }
}

