/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.at;

import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Supplier;
import net.minecraft.at.c;
import net.minecraft.at.k;
import net.minecraft.k.m;

public class d
extends c {
    private final /* synthetic */ String d;
    private /* synthetic */ Supplier<String> f;
    public static /* synthetic */ Function<String, Supplier<String>> e;

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
            if (!(object2 instanceof d)) {
                return false;
            }
            object2 = object;
        }
        d d10 = (d)object2;
        boolean bl2 = this.d.equals(d10.d);
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
    public String toString() {
        return "KeybindComponent{keybind='" + this.d + '\'' + ", siblings=" + this.c + ", style=" + this.e() + '}';
    }

    @Override
    public String b() {
        m[] arrm = net.minecraft.at.c.b();
        Object object = this.f;
        if (arrm == null) {
            if (object == null) {
                this.f = e.apply(this.d);
            }
            object = this.f.get();
        }
        return (String)object;
    }

    private static Supplier lambda$static$1(String string) {
        return () -> d.lambda$null$0(string);
    }

    public String c() {
        return this.d;
    }

    static {
        e = d::lambda$static$1;
    }

    public d a() {
        d d10;
        block2: {
            d d11 = new d(this.d);
            m[] arrm = net.minecraft.at.c.b();
            d11.a(this.e().g());
            Iterator<k> iterator = this.c().iterator();
            m[] arrm2 = arrm;
            while (iterator.hasNext()) {
                k k2 = iterator.next();
                d10 = d11;
                if (arrm2 == null) {
                    d10.a(k2.d());
                    if (arrm2 == null) continue;
                }
                break block2;
            }
            d10 = d11;
        }
        return d10;
    }

    public d(String string) {
        this.d = string;
    }

    private static String lambda$null$0(String string) {
        return string;
    }
}

