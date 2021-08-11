/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.at;

import java.util.Iterator;
import net.minecraft.at.c;
import net.minecraft.at.k;
import net.minecraft.k.m;

public class g
extends c {
    private final /* synthetic */ String d;

    public String c() {
        return this.d;
    }

    public g(String string) {
        this.d = string;
    }

    @Override
    public String toString() {
        return "TextComponent{text='" + this.d + '\'' + ", siblings=" + this.c + ", style=" + this.e() + '}';
    }

    @Override
    public String b() {
        return this.d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object object) {
        m[] arrm = net.minecraft.at.c.b();
        Object object2 = this;
        if (arrm == null) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        if (arrm == null) {
            if (!(object2 instanceof g)) {
                return false;
            }
            object2 = object;
        }
        g g10 = (g)object2;
        boolean bl2 = this.d.equals(g10.c());
        if (arrm == null) {
            if (!bl2) return false;
            bl2 = super.equals(object);
        }
        if (arrm != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public g d() {
        g g10;
        block2: {
            g g11 = new g(this.d);
            m[] arrm = net.minecraft.at.c.b();
            g11.a(this.e().g());
            Iterator<k> iterator = this.c().iterator();
            m[] arrm2 = arrm;
            while (iterator.hasNext()) {
                k k2 = iterator.next();
                g10 = g11;
                if (arrm2 == null) {
                    g10.a(k2.d());
                    if (arrm2 == null) continue;
                }
                break block2;
            }
            g10 = g11;
        }
        return g10;
    }
}

