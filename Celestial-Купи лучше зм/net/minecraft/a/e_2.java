/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.A;

import javax.annotation.Nullable;
import net.minecraft.A.b;

public class e {
    private /* synthetic */ boolean c;
    private /* synthetic */ float e;
    private final /* synthetic */ String h;
    private /* synthetic */ float a;
    private /* synthetic */ float g;
    private /* synthetic */ float b;
    @Nullable
    private /* synthetic */ String d;
    private /* synthetic */ boolean i;
    private /* synthetic */ int f;

    static float b(e e10) {
        return e10.e;
    }

    protected e a() {
        this.c = false;
        return this;
    }

    public e(String string) {
        this.a = 0.1f;
        this.g = 0.2f;
        this.b = 0.5f;
        this.e = 0.5f;
        this.f = 0xFFFFFF;
        this.c = true;
        this.h = string;
    }

    static boolean e(e e10) {
        return e10.i;
    }

    protected e d(float f10) {
        boolean bl2 = net.minecraft.A.b.f();
        if (!bl2) {
            if (f10 > 0.1f && f10 < 0.2f) {
                throw new IllegalArgumentException("Please avoid temperatures in the range 0.1 - 0.2 because of snow");
            }
            this.b = f10;
        }
        return this;
    }

    static float i(e e10) {
        return e10.a;
    }

    static float a(e e10) {
        return e10.g;
    }

    static String d(e e10) {
        return e10.d;
    }

    static int c(e e10) {
        return e10.f;
    }

    protected e b() {
        this.i = true;
        return this;
    }

    static float g(e e10) {
        return e10.b;
    }

    protected e a(String string) {
        this.d = string;
        return this;
    }

    protected e a(float f10) {
        this.e = f10;
        return this;
    }

    protected e c(float f10) {
        this.a = f10;
        return this;
    }

    protected e a(int n2) {
        this.f = n2;
        return this;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    protected e b(float f10) {
        this.g = f10;
        return this;
    }

    static String h(e e10) {
        return e10.h;
    }

    static boolean f(e e10) {
        return e10.c;
    }
}

