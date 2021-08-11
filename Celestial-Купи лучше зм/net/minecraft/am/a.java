/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.am;

import java.util.List;
import net.minecraft.J.p;
import net.minecraft.ah.A;
import net.minecraft.am.b;
import net.minecraft.am.c;
import net.minecraft.am.d;
import net.minecraft.am.e;
import net.minecraft.am.f;
import net.minecraft.am.g;
import net.minecraft.k.n;

public abstract class a
extends Enum<a> {
    public static final /* synthetic */ /* enum */ a SUMMONING_DRAGON;
    public static final /* synthetic */ /* enum */ a SUMMONING_PILLARS;
    public static final /* synthetic */ /* enum */ a START;
    private static final /* synthetic */ a[] a;
    public static final /* synthetic */ /* enum */ a END;
    public static final /* synthetic */ /* enum */ a PREPARING_TO_SUMMON_PILLARS;

    public static a[] values() {
        return (a[])a.clone();
    }

    a(b b10) {
        this();
    }

    static {
        START = new b();
        PREPARING_TO_SUMMON_PILLARS = new c();
        SUMMONING_PILLARS = new d();
        SUMMONING_DRAGON = new e();
        END = new f();
        a = new a[]{START, PREPARING_TO_SUMMON_PILLARS, SUMMONING_PILLARS, SUMMONING_DRAGON, END};
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    private a() {
    }

    public abstract void a(A var1, g var2, List<p> var3, int var4, n var5);
}

