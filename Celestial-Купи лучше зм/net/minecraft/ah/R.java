/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ah;

import java.util.UUID;
import net.minecraft.ah.d;
import net.minecraft.ah.i;
import net.minecraft.at.k;

public abstract class R {
    protected /* synthetic */ d b;
    protected /* synthetic */ boolean h;
    protected /* synthetic */ boolean e;
    protected /* synthetic */ float d;
    protected /* synthetic */ boolean a;
    protected /* synthetic */ i f;
    protected /* synthetic */ k c;
    private final /* synthetic */ UUID g;

    public d d() {
        return this.b;
    }

    public boolean b() {
        return this.a;
    }

    public boolean c() {
        return this.e;
    }

    public void a(i i2) {
        this.f = i2;
    }

    public void a(d d10) {
        this.b = d10;
    }

    public UUID g() {
        return this.g;
    }

    public i h() {
        return this.f;
    }

    public boolean f() {
        return this.h;
    }

    public R c(boolean bl2) {
        this.h = bl2;
        return this;
    }

    public R b(boolean bl2) {
        this.a = bl2;
        return this;
    }

    public void a(k k2) {
        this.c = k2;
    }

    public void a(float f10) {
        this.d = f10;
    }

    public k a() {
        return this.c;
    }

    public R a(boolean bl2) {
        this.e = bl2;
        return this;
    }

    public float e() {
        return this.d;
    }

    public R(UUID uUID, k k2, d d10, i i2) {
        this.g = uUID;
        this.c = k2;
        this.b = d10;
        this.f = i2;
        this.d = 1.0f;
    }
}

