/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.w;

import net.minecraft.U.x;
import net.minecraft.client.a.v;
import net.minecraft.client.w.c;
import net.minecraft.client.w.j;

public class E
extends j {
    private final /* synthetic */ c j;
    private final /* synthetic */ c i;

    @Override
    public void b(x x2, float f10, float f11, float f12, float f13, float f14, float f15) {
        this.j.y = (float)(Math.sin(f10 * (float)Math.PI * 0.2f) + 1.0) * 0.2f;
        this.i.e = f13 * ((float)Math.PI / 180);
        this.i.y = f14 * ((float)Math.PI / 180);
        v.b(0.0f, -0.374375f, 0.0f);
        v.d(0.75f, 0.75f, 0.75f);
        this.i.b(f15);
    }

    public E(float f10) {
        this.g = 256;
        this.f = 256;
        this.a("body.body", 0, 0);
        this.a("wing.skin", -56, 88);
        this.a("wingtip.skin", -56, 144);
        this.a("rearleg.main", 0, 0);
        this.a("rearfoot.main", 112, 0);
        this.a("rearlegtip.main", 196, 0);
        this.a("head.upperhead", 112, 30);
        this.a("wing.bone", 112, 88);
        this.a("head.upperlip", 176, 44);
        this.a("jaw.jaw", 176, 65);
        this.a("frontleg.main", 112, 104);
        this.a("wingtip.bone", 112, 136);
        this.a("frontfoot.main", 144, 104);
        this.a("neck.box", 192, 104);
        this.a("frontlegtip.main", 226, 138);
        this.a("body.scale", 220, 53);
        this.a("head.scale", 0, 0);
        this.a("neck.scale", 48, 0);
        this.a("head.nostril", 112, 0);
        float f11 = -16.0f;
        this.i = new c(this, "head");
        this.i.a("upperlip", -6.0f, -1.0f, -24.0f, 12, 5, 16);
        this.i.a("upperhead", -8.0f, -8.0f, -10.0f, 16, 16, 16);
        this.i.A = true;
        this.i.a("scale", -5.0f, -12.0f, -4.0f, 2, 4, 6);
        this.i.a("nostril", -5.0f, -3.0f, -22.0f, 2, 2, 4);
        this.i.A = false;
        this.i.a("scale", 3.0f, -12.0f, -4.0f, 2, 4, 6);
        this.i.a("nostril", 3.0f, -3.0f, -22.0f, 2, 2, 4);
        this.j = new c(this, "jaw");
        this.j.a(0.0f, 4.0f, -8.0f);
        this.j.a("jaw", -6.0f, 0.0f, -16.0f, 12, 4, 16);
        this.i.a(this.j);
    }
}

