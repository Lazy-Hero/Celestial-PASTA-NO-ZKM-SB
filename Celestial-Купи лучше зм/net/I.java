/*
 * Decompiled with CFR 0.150.
 */
package net;

import net.minecraft.client.w.c;
import net.minecraft.client.w.j;
import net.q;

public abstract class I {
    private final /* synthetic */ String c;
    private static /* synthetic */ String[] d;
    private final /* synthetic */ float a;
    private final /* synthetic */ Class b;

    public String a() {
        return this.c;
    }

    static {
        if (I.c() == null) {
            I.b(new String[1]);
        }
    }

    public abstract c a(j var1, String var2);

    public float d() {
        return this.a;
    }

    public static String[] c() {
        return d;
    }

    public Class b() {
        return this.b;
    }

    public static void b(String[] arrstring) {
        d = arrstring;
    }

    public I(Class class_, String string, float f10) {
        this.b = class_;
        this.c = string;
        this.a = f10;
    }

    public abstract q a(j var1, float var2);

    public abstract j e();
}

