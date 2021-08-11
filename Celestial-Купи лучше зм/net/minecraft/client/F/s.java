/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  javax.annotation.Nullable
 */
package net.minecraft.client.F;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import javax.annotation.Nullable;
import net.minecraft.N.X;
import net.minecraft.ar.aA;
import net.minecraft.ar.v;
import net.minecraft.client.D.z;
import net.minecraft.client.F.b;
import net.minecraft.client.F.d;
import net.minecraft.client.F.f;
import net.minecraft.client.Q;
import net.minecraft.client.a.aV;
import net.minecraft.client.w.E;
import net.minecraft.client.w.a9;
import net.minecraft.i.j;

public class s
extends f<X> {
    private final /* synthetic */ a9 n;
    private static final /* synthetic */ v k;
    private static final /* synthetic */ v a;
    public static /* synthetic */ s j;
    private final /* synthetic */ E g;
    private final /* synthetic */ a9 m;
    private static final /* synthetic */ v h;
    private static final /* synthetic */ v l;
    private static final /* synthetic */ v i;

    public s() {
        this.g = new E(0.0f);
        this.n = new a9(0, 0, 64, 32);
        this.m = new net.minecraft.client.w.aA();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void a(float var1_1, float var2_2, float var3_3, aA var4_4, float var5_5, int var6_6, @Nullable GameProfile var7_7, int var8_8, float var9_9) {
        block26: {
            block25: {
                block24: {
                    block23: {
                        block21: {
                            block22: {
                                var11_10 = this.n;
                                var10_11 = net.minecraft.client.F.f.b();
                                v0 = var8_8;
                                if (var10_11 == null) break block21;
                                if (v0 < 0) break block22;
                                this.b(s.c[var8_8]);
                                net.minecraft.client.a.v.q(5890);
                                net.minecraft.client.a.v.M();
                                net.minecraft.client.a.v.d(4.0f, 2.0f, 1.0f);
                                net.minecraft.client.a.v.b(0.0625f, 0.0625f, 0.0625f);
                                net.minecraft.client.a.v.q(5888);
                                if (var10_11 != null) break block23;
                            }
                            v0 = var6_6;
                        }
                        switch (v0) {
                            default: {
                                this.b(s.k);
                                if (var10_11 != null) break;
                            }
                            case 1: {
                                this.b(s.l);
                                if (var10_11 != null) break;
                            }
                            case 2: {
                                this.b(s.h);
                                var11_10 = this.m;
                                if (var10_11 != null) break;
                            }
                            case 3: {
                                var11_10 = this.m;
                                var12_12 = z.a();
                                if (var10_11 == null) ** GOTO lbl41
                                if (var7_7 == null) ** GOTO lbl40
                                var13_14 = Q.P();
                                var14_15 = var13_14.F().a(var7_7);
                                if (var10_11 == null) ** GOTO lbl37
                                if (!var14_15.containsKey((Object)MinecraftProfileTexture.Type.SKIN)) ** GOTO lbl38
                                var12_12 = var13_14.F().a(var14_15.get((Object)MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN);
lbl37:
                                // 2 sources

                                if (var10_11 != null) ** GOTO lbl40
lbl38:
                                // 2 sources

                                var15_16 = net.minecraft.i.j.a(var7_7);
                                var12_12 = z.c(var15_16);
lbl40:
                                // 3 sources

                                this.b(var12_12);
lbl41:
                                // 2 sources

                                if (var10_11 != null) break;
                            }
                            case 4: {
                                this.b(s.a);
                                if (var10_11 != null) break;
                            }
                            case 5: {
                                this.b(s.i);
                                var11_10 = this.g;
                            }
                        }
                    }
                    net.minecraft.client.a.v.M();
                    net.minecraft.client.a.v.E();
                    if (var10_11 == null) break block24;
                    if (var4_4 != aA.UP) break block25;
                    net.minecraft.client.a.v.b(var1_1 + 0.5f, var2_2, var3_3 + 0.5f);
                }
                if (var10_11 != null) break block26;
            }
            switch (d.a[var4_4.ordinal()]) {
                case 1: {
                    net.minecraft.client.a.v.b(var1_1 + 0.5f, var2_2 + 0.25f, var3_3 + 0.74f);
                    if (var10_11 != null) break;
                }
                case 2: {
                    net.minecraft.client.a.v.b(var1_1 + 0.5f, var2_2 + 0.25f, var3_3 + 0.26f);
                    var5_5 = 180.0f;
                    if (var10_11 != null) break;
                }
                case 3: {
                    net.minecraft.client.a.v.b(var1_1 + 0.74f, var2_2 + 0.25f, var3_3 + 0.5f);
                    var5_5 = 270.0f;
                    if (var10_11 != null) break;
                }
                default: {
                    net.minecraft.client.a.v.b(var1_1 + 0.26f, var2_2 + 0.25f, var3_3 + 0.5f);
                    var5_5 = 90.0f;
                }
            }
        }
        var12_13 = 0.0625f;
        net.minecraft.client.a.v.q();
        net.minecraft.client.a.v.d(-1.0f, -1.0f, 1.0f);
        net.minecraft.client.a.v.e();
        v1 = var6_6;
        if (var10_11 != null) {
            if (v1 == 3) {
                net.minecraft.client.a.v.b(aV.PLAYER_SKIN);
            }
            var11_10.b(null, var9_9, 0.0f, 0.0f, var5_5, 0.0f, 0.0625f);
            net.minecraft.client.a.v.B();
            v1 = var8_8;
        }
        if (var10_11 != null) {
            if (v1 < 0) return;
            net.minecraft.client.a.v.q(5890);
            net.minecraft.client.a.v.B();
            v1 = 5888;
        }
        net.minecraft.client.a.v.q(v1);
    }

    @Override
    public void a(X x2, double d10, double d11, double d12, float f10, int n2, float f11) {
        aA aA2 = aA.a(x2.m() & 7);
        float f12 = x2.a(f10);
        this.a((float)d10, (float)d11, (float)d12, aA2, (float)(x2.c() * 360) / 16.0f, x2.a(), x2.b(), n2, f12);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(b b10) {
        super.a(b10);
        j = this;
    }

    static {
        k = new v("textures/entity/skeleton/skeleton.png");
        l = new v("textures/entity/skeleton/wither_skeleton.png");
        h = new v("textures/entity/zombie/zombie.png");
        a = new v("textures/entity/creeper/creeper.png");
        i = new v("textures/entity/enderdragon/dragon.png");
    }
}

