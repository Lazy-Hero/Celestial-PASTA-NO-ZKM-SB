/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.W;

import net.minecraft.W.K;
import net.minecraft.W.bp;
import net.minecraft.W.cJ;
import net.minecraft.W.cK;
import net.minecraft.W.cL;
import net.minecraft.Z.i;
import net.minecraft.ae.a;
import net.minecraft.ae.c;
import net.minecraft.ae.d;
import net.minecraft.ah.z;
import net.minecraft.ar.ae;
import net.minecraft.ar.h;
import net.minecraft.k.n;

public class br
extends bp {
    public static final /* synthetic */ d<cL> D;
    public static final /* synthetic */ c C;

    @Override
    public a<cL> a() {
        return D;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected boolean a(z var1_1, n var2_2, i var3_3, boolean var4_4, int var5_5) {
        block27: {
            var6_6 = cL.b();
            v0 = var5_5;
            if (!var6_6) {
                if (v0 >= 8) {
                    return false;
                }
                v0 = var2_2.e();
            }
            var7_7 = v0;
            var8_8 = var2_2.b();
            var9_9 = var2_2.a();
            var10_10 = true;
            var11_11 = var3_3.b(br.D);
            v1 = cK.b[var11_11.ordinal()];
            if (var6_6) break block27;
            switch (v1) {
                case 1: {
                    if (var4_4) {
                        ++var9_9;
                        if (!var6_6) break;
                    }
                    --var9_9;
                    if (!var6_6) break;
                }
                case 2: {
                    if (var4_4) {
                        --var7_7;
                        if (!var6_6) break;
                    }
                    ++var7_7;
                    if (!var6_6) break;
                }
                case 3: {
                    v2 = var4_4;
                    if (var6_6) ** GOTO lbl36
                    if (!v2) ** GOTO lbl33
                    --var7_7;
                    if (!var6_6) ** GOTO lbl37
lbl33:
                    // 2 sources

                    ++var7_7;
                    ++var8_8;
                    v2 = false;
lbl36:
                    // 2 sources

                    var10_10 = (boolean)(v2 ? 1 : 0);
lbl37:
                    // 2 sources

                    var11_11 = cL.EAST_WEST;
                    if (!var6_6) break;
                }
                case 4: {
                    v3 = var4_4;
                    if (var6_6) ** GOTO lbl46
                    if (!v3) ** GOTO lbl48
                    --var7_7;
                    ++var8_8;
                    v3 = false;
lbl46:
                    // 2 sources

                    var10_10 = (boolean)(v3 ? 1 : 0);
                    if (!var6_6) ** GOTO lbl49
lbl48:
                    // 2 sources

                    ++var7_7;
lbl49:
                    // 2 sources

                    var11_11 = cL.EAST_WEST;
                    if (!var6_6) break;
                }
                case 5: {
                    v4 = var4_4;
                    if (var6_6) ** GOTO lbl60
                    if (!v4) ** GOTO lbl57
                    ++var9_9;
                    if (!var6_6) ** GOTO lbl61
lbl57:
                    // 2 sources

                    --var9_9;
                    ++var8_8;
                    v4 = false;
lbl60:
                    // 2 sources

                    var10_10 = (boolean)(v4 ? 1 : 0);
lbl61:
                    // 2 sources

                    var11_11 = cL.NORTH_SOUTH;
                    if (!var6_6) break;
                }
                case 6: {
                    v5 = var4_4;
                    if (var6_6) ** GOTO lbl70
                    if (!v5) ** GOTO lbl72
                    ++var9_9;
                    ++var8_8;
                    v5 = false;
lbl70:
                    // 2 sources

                    var10_10 = (boolean)(v5 ? 1 : 0);
                    if (!var6_6) ** GOTO lbl73
lbl72:
                    // 2 sources

                    --var9_9;
lbl73:
                    // 2 sources

                    var11_11 = cL.NORTH_SOUTH;
                    break;
                }
            }
            v1 = this.a(var1_1, new n(var7_7, var8_8, var9_9), var4_4, var5_5, var11_11);
        }
        if (!var6_6) {
            if (v1) {
                return true;
            }
            v1 = var10_10;
        }
        if (!var6_6) {
            if (v1 == false) return false;
            v1 = this.a(var1_1, new n(var7_7, var8_8 - 1, var9_9), var4_4, var5_5, var11_11);
        }
        if (var6_6 != false) return v1;
        if (v1 == false) return false;
        return true;
    }

    @Override
    protected net.minecraft.Z.c f() {
        return new net.minecraft.Z.c((K)this, D, C);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected void a(i var1_1, z var2_2, n var3_3, K var4_4) {
        block12: {
            block11: {
                block10: {
                    var6_5 = var1_1.b(br.C);
                    var5_6 = cL.b();
                    v0 = var2_2.x(var3_3);
                    if (var5_6) break block10;
                    if (v0) ** GOTO lbl-1000
                    v0 = this.a(var2_2, var3_3, var1_1, true, 0);
                    if (var5_6) break block10;
                    if (!v0) {
                        v0 = this.a(var2_2, var3_3, var1_1, false, 0);
                        if (!var5_6) {
                            ** if (!v0) goto lbl-1000
                        } else {
                            ** GOTO lbl13
                        }
                    }
                    ** GOTO lbl-1000
lbl13:
                    // 2 sources

                    break block10;
lbl-1000:
                    // 3 sources

                    {
                        v0 = true;
                        ** GOTO lbl17
                    }
lbl-1000:
                    // 1 sources

                    {
                        v0 = false;
                    }
                }
                v1 = var7_7 = v0;
                if (var5_6) break block11;
                if (v1 == var6_5) return;
                var2_2.a(var3_3, var1_1.a(br.C, var7_7), 3);
                v2 = var2_2;
                v3 = var3_3.k();
                v4 = this;
                v5 = false;
                if (var5_6) break block12;
                v2.a(v3, (K)v4, v5);
                v1 = var1_1.b(br.D).c();
            }
            if (v1 == false) return;
            v2 = var2_2;
            v3 = var3_3.a();
            v4 = this;
            v5 = false;
        }
        v2.a(v3, (K)v4, v5);
    }

    protected br() {
        super(true);
        this.h(this.e.a().a(D, cL.NORTH_SOUTH).a(C, false));
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public i a(i var1_1, ae var2_2) {
        var3_3 = cL.e();
        v0 = cK.a[var2_2.ordinal()];
        if (!var3_3) ** GOTO lbl7
        switch (v0) {
            case 1: {
                v0 = cK.b[var1_1.b(br.D).ordinal()];
lbl7:
                // 2 sources

                if (!var3_3) ** GOTO lbl27
                switch (v0) {
                    case 3: {
                        return var1_1.a(br.D, cL.ASCENDING_WEST);
                    }
                    case 4: {
                        return var1_1.a(br.D, cL.ASCENDING_EAST);
                    }
                    case 5: {
                        return var1_1.a(br.D, cL.ASCENDING_SOUTH);
                    }
                    case 6: {
                        return var1_1.a(br.D, cL.ASCENDING_NORTH);
                    }
                    case 7: {
                        return var1_1.a(br.D, cL.NORTH_WEST);
                    }
                    case 8: {
                        return var1_1.a(br.D, cL.NORTH_EAST);
                    }
                    case 9: {
                        return var1_1.a(br.D, cL.SOUTH_EAST);
                    }
                    case 10: {
                        return var1_1.a(br.D, cL.SOUTH_WEST);
                    }
                }
            }
            case 2: {
                v0 = cK.b[var1_1.b(br.D).ordinal()];
lbl27:
                // 2 sources

                if (!var3_3) ** GOTO lbl51
                switch (v0) {
                    case 1: {
                        return var1_1.a(br.D, cL.EAST_WEST);
                    }
                    case 2: {
                        return var1_1.a(br.D, cL.NORTH_SOUTH);
                    }
                    case 3: {
                        return var1_1.a(br.D, cL.ASCENDING_NORTH);
                    }
                    case 4: {
                        return var1_1.a(br.D, cL.ASCENDING_SOUTH);
                    }
                    case 5: {
                        return var1_1.a(br.D, cL.ASCENDING_WEST);
                    }
                    case 6: {
                        return var1_1.a(br.D, cL.ASCENDING_EAST);
                    }
                    case 7: {
                        return var1_1.a(br.D, cL.NORTH_EAST);
                    }
                    case 8: {
                        return var1_1.a(br.D, cL.SOUTH_EAST);
                    }
                    case 9: {
                        return var1_1.a(br.D, cL.SOUTH_WEST);
                    }
                    case 10: {
                        return var1_1.a(br.D, cL.NORTH_WEST);
                    }
                }
            }
            case 3: {
                v0 = cK.b[var1_1.b(br.D).ordinal()];
lbl51:
                // 2 sources

                switch (v0) {
                    case 1: {
                        return var1_1.a(br.D, cL.EAST_WEST);
                    }
                    case 2: {
                        return var1_1.a(br.D, cL.NORTH_SOUTH);
                    }
                    case 3: {
                        return var1_1.a(br.D, cL.ASCENDING_SOUTH);
                    }
                    case 4: {
                        return var1_1.a(br.D, cL.ASCENDING_NORTH);
                    }
                    case 5: {
                        return var1_1.a(br.D, cL.ASCENDING_EAST);
                    }
                    case 6: {
                        return var1_1.a(br.D, cL.ASCENDING_WEST);
                    }
                    case 7: {
                        return var1_1.a(br.D, cL.SOUTH_WEST);
                    }
                    case 8: {
                        return var1_1.a(br.D, cL.NORTH_WEST);
                    }
                    case 9: {
                        return var1_1.a(br.D, cL.NORTH_EAST);
                    }
                    case 10: {
                        return var1_1.a(br.D, cL.SOUTH_EAST);
                    }
                }
                return var1_1;
            }
        }
        return var1_1;
    }

    @Override
    public i c(int n2) {
        boolean bl2 = cL.e();
        i i2 = this.d().a(D, cL.a(n2 & 7));
        boolean bl3 = n2 & 8;
        if (bl2) {
            bl3 = bl3 > false;
        }
        return i2.a(C, bl3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean a(z z2, n n2, boolean bl2, int n3, cL cL2) {
        Object object;
        boolean bl3;
        i i2;
        block10: {
            block11: {
                cL cL3;
                block12: {
                    cL cL4;
                    cL cL5;
                    block8: {
                        block9: {
                            i2 = z2.d(n2);
                            bl3 = cL.e();
                            i i3 = i2;
                            if (bl3) {
                                if (i3.b() != this) {
                                    return false;
                                }
                                i3 = i2;
                            }
                            cL5 = i3.b(D);
                            object = cL2;
                            cL4 = cL.EAST_WEST;
                            if (!bl3) break block8;
                            if (object != cL4) break block9;
                            object = cL5;
                            cL4 = cL.NORTH_SOUTH;
                            if (bl3) {
                                if (object == cL4) return false;
                                object = cL5;
                                cL4 = cL.ASCENDING_NORTH;
                            }
                            if (bl3) {
                                if (object == cL4) return false;
                                object = cL5;
                                cL4 = cL.ASCENDING_SOUTH;
                            }
                            if (!bl3) break block8;
                            if (object == cL4) return false;
                        }
                        object = cL2;
                        if (!bl3) break block10;
                        cL4 = cL.NORTH_SOUTH;
                    }
                    if (object != cL4) break block11;
                    object = cL5;
                    cL3 = cL.EAST_WEST;
                    if (bl3) {
                        if (object == cL3) return false;
                        object = cL5;
                        cL3 = cL.ASCENDING_EAST;
                    }
                    if (!bl3) break block12;
                    if (object == cL3) return false;
                    object = cL5;
                    if (!bl3) break block10;
                    cL3 = cL.ASCENDING_WEST;
                }
                if (object == cL3) return false;
            }
            object = i2.b(C);
        }
        boolean bl4 = (Boolean)object;
        if (!bl3) return bl4;
        if (!bl4) return false;
        boolean bl5 = z2.x(n2);
        if (!bl3) return bl5;
        if (bl5) return true;
        bl5 = this.a(z2, n2, i2, bl2, n3 + 1);
        if (!bl3) return bl5;
        if (!bl5) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public i a(i var1_1, h var2_2) {
        var4_3 = var1_1.b(br.D);
        var3_4 = cL.b();
        v0 = cK.c[var2_2.ordinal()];
        if (var3_4) ** GOTO lbl8
        switch (v0) {
            case 1: {
                v0 = cK.b[var4_3.ordinal()];
lbl8:
                // 2 sources

                switch (v0) {
                    case 5: {
                        return var1_1.a(br.D, cL.ASCENDING_SOUTH);
                    }
                    case 6: {
                        return var1_1.a(br.D, cL.ASCENDING_NORTH);
                    }
                    case 7: {
                        return var1_1.a(br.D, cL.NORTH_EAST);
                    }
                    case 8: {
                        return var1_1.a(br.D, cL.NORTH_WEST);
                    }
                    case 9: {
                        return var1_1.a(br.D, cL.SOUTH_WEST);
                    }
                    case 10: {
                        return var1_1.a(br.D, cL.SOUTH_EAST);
                    }
                }
                return super.a(var1_1, var2_2);
            }
            case 2: {
                switch (cK.b[var4_3.ordinal()]) {
                    case 3: {
                        return var1_1.a(br.D, cL.ASCENDING_WEST);
                    }
                    case 4: {
                        return var1_1.a(br.D, cL.ASCENDING_EAST);
                    }
                    default: {
                        if (var3_4 == false) return super.a(var1_1, var2_2);
                    }
                    case 7: {
                        return var1_1.a(br.D, cL.SOUTH_WEST);
                    }
                    case 8: {
                        return var1_1.a(br.D, cL.SOUTH_EAST);
                    }
                    case 9: {
                        return var1_1.a(br.D, cL.NORTH_EAST);
                    }
                    case 10: 
                }
                return var1_1.a(br.D, cL.NORTH_WEST);
            }
        }
        return super.a(var1_1, var2_2);
    }

    @Override
    public int d(i i2) {
        int n2 = 0;
        n2 |= i2.b(D).d();
        boolean bl2 = cL.b();
        int n3 = i2.b(C).booleanValue();
        if (!bl2) {
            if (n3 != 0) {
                n2 |= 8;
            }
            n3 = n2;
        }
        return n3;
    }

    static {
        D = d.a("shape", cL.class, new cJ());
        C = net.minecraft.ae.c.a("powered");
    }
}

