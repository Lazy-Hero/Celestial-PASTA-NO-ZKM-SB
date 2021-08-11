/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.at;

import net.minecraft.at.c;
import net.minecraft.at.k;
import net.minecraft.k.m;

public class f
extends c {
    private final /* synthetic */ String d;

    public f(String string) {
        this.d = string;
    }

    public String c() {
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
            if (!(object2 instanceof f)) {
                return false;
            }
            object2 = object;
        }
        f f10 = (f)object2;
        boolean bl2 = this.d.equals(f10.d);
        if (arrm == null) {
            if (!bl2) return false;
            bl2 = super.equals(object);
        }
        if (arrm != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public String b() {
        return this.d;
    }

    @Override
    public f d() {
        f f10;
        block2: {
            f f11 = new f(this.d);
            m[] arrm = net.minecraft.at.c.b();
            f11.a(this.e().g());
            for (k k2 : this.c()) {
                f10 = f11;
                if (arrm == null) {
                    f10.a(k2.d());
                    if (arrm == null) continue;
                }
                break block2;
            }
            f10 = f11;
        }
        return f10;
    }

    @Override
    public String toString() {
        return "SelectorComponent{pattern='" + this.d + '\'' + ", siblings=" + this.c + ", style=" + this.e() + '}';
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

