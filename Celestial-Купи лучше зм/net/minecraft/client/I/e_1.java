/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Ordering
 */
package net.minecraft.client.i;

import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import net.minecraft.ah.s;
import net.minecraft.at.k;
import net.minecraft.client.Q;
import net.minecraft.client.b.aR;
import net.minecraft.client.b.q;
import net.minecraft.client.g.a;
import net.minecraft.client.g.b;
import net.minecraft.client.g.h;
import net.minecraft.client.i.c;
import net.minecraft.client.i.d;

public class e
implements b,
h {
    private static final /* synthetic */ Ordering<net.minecraft.client.o.e> b;
    private final /* synthetic */ List<b> a;

    static {
        b = Ordering.from((Comparator)new d());
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public List<b> a() {
        return this.a;
    }

    @Override
    public void a(float f10, int n2) {
        Q.P().aN().b(aR.j);
        q.a(0.0f, 0.0f, 0.0f, 0.0f, 16.0f, 16.0f, 256.0f, 256.0f);
    }

    @Override
    public boolean a() {
        String string = c.b();
        boolean bl2 = this.a.isEmpty();
        if (string != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public e(Collection<net.minecraft.client.o.e> collection) {
        String string = c.b();
        String string2 = string;
        this.a = Lists.newArrayList();
        for (net.minecraft.client.o.e e10 : b.sortedCopy(collection)) {
            if (e10.l() != s.SPECTATOR) {
                this.a.add(new net.minecraft.client.g.c(e10.p()));
            }
            if (string2 != null) continue;
        }
    }

    public e() {
        this(b.sortedCopy(Q.P().ar().c()));
    }

    @Override
    public k c() {
        return new net.minecraft.at.h("spectatorMenu.teleport.prompt", new Object[0]);
    }

    @Override
    public k b() {
        return new net.minecraft.at.h("spectatorMenu.teleport", new Object[0]);
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }
}

