/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.T.aF;
import net.minecraft.ar.v;
import net.minecraft.client.r.a;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.r.u;
import net.minecraft.client.w.av;
import net.minecraft.k.k;
import net.minecraft.k.l;
import net.minecraft.k.m;
import net.minecraft.k.n;

public class al
extends u<aF> {
    public static final /* synthetic */ v[] z;

    public av a() {
        return (av)super.b();
    }

    @Override
    public void a(aF aF2, double d10, double d11, double d12, float f10, float f11) {
        block3: {
            block1: {
                aF aF3;
                m[] arrm;
                int n2;
                block2: {
                    int n3;
                    block0: {
                        n2 = aF2.h();
                        arrm = b.b();
                        n3 = n2;
                        if (arrm != null) break block0;
                        if (n3 <= 0) break block1;
                        aF3 = aF2;
                        if (arrm != null) break block2;
                        n3 = aF3.y() ? 1 : 0;
                    }
                    if (n3 == 0) break block1;
                    aF3 = aF2;
                }
                n n4 = aF3.l();
                n n5 = aF2.d();
                double d13 = (double)((float)n2 - f11) / 6.0;
                d13 *= d13;
                double d14 = (double)(n4.e() - n5.e()) * d13;
                double d15 = (double)(n4.b() - n5.b()) * d13;
                double d16 = (double)(n4.a() - n5.a()) * d13;
                super.b(aF2, d10 - d14, d11 - d15, d12 - d16, f10, f11);
                if (arrm == null) break block3;
            }
            super.b(aF2, d10, d11, d12, f10, f11);
        }
    }

    protected v a(aF aF2) {
        return z[aF2.i().e()];
    }

    protected void a(aF aF2, float f10) {
        float f11 = 0.999f;
        net.minecraft.client.a.v.d(0.999f, 0.999f, 0.999f);
    }

    public al(a4 a42) {
        super(a42, new av(), 0.0f);
        this.a(new a(this, null));
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void a(aF aF2, float f10, float f11, float f12) {
        m[] arrm = b.b();
        super.a(aF2, f10, f11, f12);
        m[] arrm2 = arrm;
        if (arrm2 == null) {
            switch (aF2.c()) {
                default: {
                    if (arrm2 == null) return;
                }
                case EAST: {
                    net.minecraft.client.a.v.b(0.5f, 0.5f, 0.0f);
                    net.minecraft.client.a.v.a(90.0f, 1.0f, 0.0f, 0.0f);
                    net.minecraft.client.a.v.a(90.0f, 0.0f, 0.0f, 1.0f);
                    if (arrm2 == null) return;
                }
                case WEST: {
                    net.minecraft.client.a.v.b(-0.5f, 0.5f, 0.0f);
                    net.minecraft.client.a.v.a(90.0f, 1.0f, 0.0f, 0.0f);
                    net.minecraft.client.a.v.a(-90.0f, 0.0f, 0.0f, 1.0f);
                    if (arrm2 == null) return;
                }
                case NORTH: {
                    net.minecraft.client.a.v.b(0.0f, 0.5f, -0.5f);
                    net.minecraft.client.a.v.a(90.0f, 1.0f, 0.0f, 0.0f);
                    if (arrm2 == null) return;
                }
                case SOUTH: {
                    net.minecraft.client.a.v.b(0.0f, 0.5f, 0.5f);
                    net.minecraft.client.a.v.a(90.0f, 1.0f, 0.0f, 0.0f);
                    net.minecraft.client.a.v.a(180.0f, 0.0f, 0.0f, 1.0f);
                    if (arrm2 == null) return;
                }
                case UP: 
            }
            net.minecraft.client.a.v.b(0.0f, 1.0f, 0.0f);
        }
        net.minecraft.client.a.v.a(180.0f, 1.0f, 0.0f, 0.0f);
    }

    static {
        z = new v[]{new v("textures/entity/shulker/shulker_white.png"), new v("textures/entity/shulker/shulker_orange.png"), new v("textures/entity/shulker/shulker_magenta.png"), new v("textures/entity/shulker/shulker_light_blue.png"), new v("textures/entity/shulker/shulker_yellow.png"), new v("textures/entity/shulker/shulker_lime.png"), new v("textures/entity/shulker/shulker_pink.png"), new v("textures/entity/shulker/shulker_gray.png"), new v("textures/entity/shulker/shulker_silver.png"), new v("textures/entity/shulker/shulker_cyan.png"), new v("textures/entity/shulker/shulker_purple.png"), new v("textures/entity/shulker/shulker_blue.png"), new v("textures/entity/shulker/shulker_brown.png"), new v("textures/entity/shulker/shulker_green.png"), new v("textures/entity/shulker/shulker_red.png"), new v("textures/entity/shulker/shulker_black.png")};
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(aF aF2, net.minecraft.client.G.b b10, double d10, double d11, double d12) {
        m[] arrm = b.b();
        int n2 = super.a(aF2, b10, d10, d11, d12);
        if (arrm == null) {
            if (n2 != 0) {
                return true;
            }
            n2 = aF2.h();
        }
        if (arrm != null) return n2 != 0;
        if (n2 <= 0) return 0 != 0;
        n2 = aF2.y() ? 1 : 0;
        if (arrm != null) return n2 != 0;
        if (n2 == 0) return 0 != 0;
        n n3 = aF2.d();
        n n4 = aF2.l();
        l l2 = new l(n4.e(), n4.b(), n4.a());
        l l3 = new l(n3.e(), n3.b(), n3.a());
        return b10.a(new k(l3.e, l3.d, l3.b, l2.e, l2.d, l2.b));
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

