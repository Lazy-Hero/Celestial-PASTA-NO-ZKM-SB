/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.r;

import net.minecraft.ag.P;
import net.minecraft.ar.v;
import net.minecraft.at.l;
import net.minecraft.client.r.a4;
import net.minecraft.client.r.b;
import net.minecraft.client.r.u;
import net.minecraft.client.w.a1;

public class aw
extends u<P> {
    private static final /* synthetic */ v C;
    private static final /* synthetic */ v A;
    private static final /* synthetic */ v B;
    private static final /* synthetic */ v E;
    private static final /* synthetic */ v D;
    private static final /* synthetic */ v F;
    private static final /* synthetic */ v z;
    private static final /* synthetic */ v G;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected v a(P var1_1) {
        var3_2 = net.minecraft.at.l.c(var1_1.g());
        var2_3 = b.b();
        v0 = var3_2;
        if (var2_3 != null) ** GOTO lbl7
        if (v0 != null) {
            v0 = "Toast";
lbl7:
            // 2 sources

            v1 = v0.equals(var3_2);
            if (var2_3 == null) {
                if (v1 != 0) {
                    return aw.F;
                } else {
                    ** GOTO lbl-1000
                }
            }
        } else lbl-1000:
        // 3 sources

        {
            v1 = var1_1.H();
        }
        switch (v1) {
            default: {
                return aw.E;
            }
            case 1: {
                return aw.z;
            }
            case 2: {
                return aw.G;
            }
            case 3: {
                return aw.B;
            }
            case 4: {
                return aw.C;
            }
            case 5: {
                return aw.D;
            }
            case 99: 
        }
        return aw.A;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    static {
        E = new v("textures/entity/rabbit/brown.png");
        z = new v("textures/entity/rabbit/white.png");
        G = new v("textures/entity/rabbit/black.png");
        C = new v("textures/entity/rabbit/gold.png");
        D = new v("textures/entity/rabbit/salt.png");
        B = new v("textures/entity/rabbit/white_splotched.png");
        F = new v("textures/entity/rabbit/toast.png");
        A = new v("textures/entity/rabbit/caerbannog.png");
    }

    public aw(a4 a42) {
        super(a42, new a1(), 0.3f);
    }
}

