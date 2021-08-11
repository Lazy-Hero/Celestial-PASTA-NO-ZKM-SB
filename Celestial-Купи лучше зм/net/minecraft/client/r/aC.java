/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.ab;
import net.minecraft.client.a.v;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.aA;

public class aC
extends aA<ab> {
    private static final /* synthetic */ net.minecraft.ar.v A;

    @Override
    protected net.minecraft.ar.v a(ab ab2) {
        return A;
    }

    protected void a(ab ab2, float f10) {
        net.minecraft.client.a.v.d(0.7f, 0.7f, 0.7f);
    }

    public aC(a4 a42) {
        super(a42);
        this.a *= 0.7f;
    }

    static {
        A = new net.minecraft.ar.v("textures/entity/spider/cave_spider.png");
    }
}

