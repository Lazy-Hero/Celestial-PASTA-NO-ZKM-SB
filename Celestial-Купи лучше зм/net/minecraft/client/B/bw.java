/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.b;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.aw.c;
import net.minecraft.aw.z;
import net.minecraft.client.D.h;
import net.minecraft.client.O;
import net.minecraft.client.Q;
import net.minecraft.client.b.W;
import net.minecraft.client.b.aZ;
import net.minecraft.client.b.at;
import net.minecraft.client.b.bu;
import net.minecraft.client.b.q;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bw
extends bu {
    private /* synthetic */ int A;
    private static final /* synthetic */ Logger y;
    private final /* synthetic */ at z;
    private final /* synthetic */ List<aZ> x;

    @Override
    protected boolean a(int n2) {
        String[] arrstring = net.minecraft.client.b.q.b();
        int n3 = n2;
        if (arrstring != null) {
            n3 = n3 == this.A ? 1 : 0;
        }
        return n3 != 0;
    }

    @Override
    protected int h() {
        return super.h() + 20;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public aZ b() {
        bw bw2;
        block3: {
            int n2;
            block2: {
                String[] arrstring = net.minecraft.client.b.q.b();
                n2 = this.A;
                if (arrstring == null) break block2;
                if (n2 < 0) return null;
                bw2 = this;
                if (arrstring == null) break block3;
                n2 = bw2.A;
            }
            if (n2 >= this.d()) return null;
            bw2 = this;
        }
        aZ aZ2 = bw2.b(this.A);
        return aZ2;
    }

    public bw(at at2, Q q2, int n2, int n3, int n4, int n5, int n6) {
        super(q2, n2, n3, n4, n5, n6);
        this.x = Lists.newArrayList();
        this.A = -1;
        this.z = at2;
        this.d();
    }

    public aZ b(int n2) {
        return this.x.get(n2);
    }

    @Override
    protected int d() {
        return this.x.size();
    }

    @Override
    public int j() {
        return super.j() + 50;
    }

    public void d() {
        List<c> list;
        z z2 = this.u.e();
        String[] arrstring = net.minecraft.client.b.q.b();
        try {
            list = z2.b();
        }
        catch (O o2) {
            y.error("Couldn't load level list", (Throwable)o2);
            this.u.a(new W(h.a("selectWorld.unable_to_load", new Object[0]), o2.getMessage()));
            return;
        }
        Collections.sort(list);
        for (c c10 : list) {
            this.x.add(new aZ(this, c10, this.u.e()));
            if (arrstring != null) continue;
        }
    }

    public void a(int n2) {
        this.A = n2;
        this.z.a(this.b());
    }

    public at a() {
        return this.z;
    }

    static {
        y = LogManager.getLogger();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

