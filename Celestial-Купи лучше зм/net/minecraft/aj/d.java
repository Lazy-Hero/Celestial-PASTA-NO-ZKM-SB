/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonSerializationContext
 */
package net.minecraft.aj;

import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.Collection;
import java.util.Random;
import net.minecraft.aj.k;
import net.minecraft.k.h;

public abstract class d {
    protected final /* synthetic */ net.minecraft.g.d[] a;
    protected final /* synthetic */ int c;
    protected final /* synthetic */ int b;

    public abstract void a(Collection<net.minecraft.w.d> var1, Random var2, k var3);

    protected abstract void a(JsonObject var1, JsonSerializationContext var2);

    protected d(int n2, int n3, net.minecraft.g.d[] arrd) {
        this.c = n2;
        this.b = n3;
        this.a = arrd;
    }

    public int a(float f10) {
        return Math.max(h.d((float)this.c + (float)this.b * f10), 0);
    }
}

