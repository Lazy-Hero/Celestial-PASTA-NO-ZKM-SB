/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.g;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.at.k;
import net.minecraft.client.g.a;
import net.minecraft.client.g.b;
import net.minecraft.client.g.h;
import net.minecraft.client.i.c;
import net.minecraft.client.i.e;
import net.minecraft.k.m;

public class i
implements h {
    private final /* synthetic */ List<b> a;

    public i() {
        block0: {
            int n2 = net.minecraft.client.g.a.f();
            this.a = Lists.newArrayList();
            int n3 = n2;
            this.a.add(new e());
            this.a.add(new c());
            if (!m.c()) break block0;
            net.minecraft.client.g.a.c(++n3);
        }
    }

    @Override
    public List<b> a() {
        return this.a;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public k c() {
        return new net.minecraft.at.h("spectatorMenu.root.prompt", new Object[0]);
    }
}

