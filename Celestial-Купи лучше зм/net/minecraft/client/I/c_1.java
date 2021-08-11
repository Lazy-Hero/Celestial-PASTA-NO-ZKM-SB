/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.i;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import net.minecraft.D.m;
import net.minecraft.at.k;
import net.minecraft.client.Q;
import net.minecraft.client.b.aR;
import net.minecraft.client.b.q;
import net.minecraft.client.g.a;
import net.minecraft.client.g.h;
import net.minecraft.client.i.b;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c
implements net.minecraft.client.g.b,
h {
    private static /* synthetic */ String b;
    private final /* synthetic */ List<net.minecraft.client.g.b> c;

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Override
    public k b() {
        return new net.minecraft.at.h("spectatorMenu.team_teleport", new Object[0]);
    }

    @Override
    public List<net.minecraft.client.g.b> a() {
        return this.c;
    }

    static {
        if (net.minecraft.client.i.c.b() == null) {
            net.minecraft.client.i.c.b("Lj8QRb");
        }
    }

    public c() {
        String string = net.minecraft.client.i.c.b();
        this.c = Lists.newArrayList();
        Q q2 = Q.P();
        Iterator<m> iterator = q2.e.c().a().iterator();
        String string2 = string;
        while (iterator.hasNext()) {
            m m2 = iterator.next();
            this.c.add(new b(this, m2));
            if (string2 != null) continue;
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void b(String string) {
        b = string;
    }

    @Override
    public k c() {
        return new net.minecraft.at.h("spectatorMenu.team_teleport.prompt", new Object[0]);
    }

    @Override
    public void a(float f10, int n2) {
        Q.P().aN().b(aR.j);
        q.a(0.0f, 0.0f, 16.0f, 0.0f, 16.0f, 16.0f, 256.0f, 256.0f);
    }

    public static String b() {
        return b;
    }

    @Override
    public boolean a() {
        boolean bl2;
        block3: {
            Iterator<net.minecraft.client.g.b> iterator = this.c.iterator();
            String string = net.minecraft.client.i.c.b();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl3;
                    block4: {
                        net.minecraft.client.g.b b10 = iterator.next();
                        bl2 = b10.a();
                        if (string == null) break block3;
                        if (string == null) break block4;
                        if (!bl2) break block5;
                        bl3 = true;
                    }
                    return bl3;
                }
                if (string != null) continue;
            }
            bl2 = false;
        }
        return bl2;
    }
}

