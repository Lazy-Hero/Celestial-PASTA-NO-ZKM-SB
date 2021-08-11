/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.G;

import java.nio.FloatBuffer;
import net.minecraft.client.G.c;
import net.minecraft.client.a.aZ;
import net.minecraft.client.a.v;
import net.minecraft.k.h;

public class d
extends c {
    private final /* synthetic */ FloatBuffer f;
    private final /* synthetic */ FloatBuffer g;
    private final /* synthetic */ FloatBuffer h;
    private static final /* synthetic */ d i;

    public void b() {
        this.h.clear();
        this.g.clear();
        this.f.clear();
        v.a(2983, this.h);
        v.a(2982, this.g);
        float[] arrf = this.e;
        float[] arrf2 = this.a;
        this.h.flip().limit(16);
        this.h.get(arrf);
        this.g.flip().limit(16);
        this.g.get(arrf2);
        this.b[0] = arrf2[0] * arrf[0] + arrf2[1] * arrf[4] + arrf2[2] * arrf[8] + arrf2[3] * arrf[12];
        this.b[1] = arrf2[0] * arrf[1] + arrf2[1] * arrf[5] + arrf2[2] * arrf[9] + arrf2[3] * arrf[13];
        this.b[2] = arrf2[0] * arrf[2] + arrf2[1] * arrf[6] + arrf2[2] * arrf[10] + arrf2[3] * arrf[14];
        this.b[3] = arrf2[0] * arrf[3] + arrf2[1] * arrf[7] + arrf2[2] * arrf[11] + arrf2[3] * arrf[15];
        this.b[4] = arrf2[4] * arrf[0] + arrf2[5] * arrf[4] + arrf2[6] * arrf[8] + arrf2[7] * arrf[12];
        this.b[5] = arrf2[4] * arrf[1] + arrf2[5] * arrf[5] + arrf2[6] * arrf[9] + arrf2[7] * arrf[13];
        this.b[6] = arrf2[4] * arrf[2] + arrf2[5] * arrf[6] + arrf2[6] * arrf[10] + arrf2[7] * arrf[14];
        this.b[7] = arrf2[4] * arrf[3] + arrf2[5] * arrf[7] + arrf2[6] * arrf[11] + arrf2[7] * arrf[15];
        this.b[8] = arrf2[8] * arrf[0] + arrf2[9] * arrf[4] + arrf2[10] * arrf[8] + arrf2[11] * arrf[12];
        this.b[9] = arrf2[8] * arrf[1] + arrf2[9] * arrf[5] + arrf2[10] * arrf[9] + arrf2[11] * arrf[13];
        this.b[10] = arrf2[8] * arrf[2] + arrf2[9] * arrf[6] + arrf2[10] * arrf[10] + arrf2[11] * arrf[14];
        this.b[11] = arrf2[8] * arrf[3] + arrf2[9] * arrf[7] + arrf2[10] * arrf[11] + arrf2[11] * arrf[15];
        this.b[12] = arrf2[12] * arrf[0] + arrf2[13] * arrf[4] + arrf2[14] * arrf[8] + arrf2[15] * arrf[12];
        this.b[13] = arrf2[12] * arrf[1] + arrf2[13] * arrf[5] + arrf2[14] * arrf[9] + arrf2[15] * arrf[13];
        this.b[14] = arrf2[12] * arrf[2] + arrf2[13] * arrf[6] + arrf2[14] * arrf[10] + arrf2[15] * arrf[14];
        this.b[15] = arrf2[12] * arrf[3] + arrf2[13] * arrf[7] + arrf2[14] * arrf[11] + arrf2[15] * arrf[15];
        float[] arrf3 = this.d[0];
        arrf3[0] = this.b[3] - this.b[0];
        arrf3[1] = this.b[7] - this.b[4];
        arrf3[2] = this.b[11] - this.b[8];
        arrf3[3] = this.b[15] - this.b[12];
        this.a(arrf3);
        float[] arrf4 = this.d[1];
        arrf4[0] = this.b[3] + this.b[0];
        arrf4[1] = this.b[7] + this.b[4];
        arrf4[2] = this.b[11] + this.b[8];
        arrf4[3] = this.b[15] + this.b[12];
        this.a(arrf4);
        float[] arrf5 = this.d[2];
        arrf5[0] = this.b[3] + this.b[1];
        arrf5[1] = this.b[7] + this.b[5];
        arrf5[2] = this.b[11] + this.b[9];
        arrf5[3] = this.b[15] + this.b[13];
        this.a(arrf5);
        float[] arrf6 = this.d[3];
        arrf6[0] = this.b[3] - this.b[1];
        arrf6[1] = this.b[7] - this.b[5];
        arrf6[2] = this.b[11] - this.b[9];
        arrf6[3] = this.b[15] - this.b[13];
        this.a(arrf6);
        float[] arrf7 = this.d[4];
        arrf7[0] = this.b[3] - this.b[2];
        arrf7[1] = this.b[7] - this.b[6];
        arrf7[2] = this.b[11] - this.b[10];
        arrf7[3] = this.b[15] - this.b[14];
        this.a(arrf7);
        float[] arrf8 = this.d[5];
        arrf8[0] = this.b[3] + this.b[2];
        arrf8[1] = this.b[7] + this.b[6];
        arrf8[2] = this.b[11] + this.b[10];
        arrf8[3] = this.b[15] + this.b[14];
        this.a(arrf8);
    }

    private void a(float[] arrf) {
        float f10 = net.minecraft.k.h.a(arrf[0] * arrf[0] + arrf[1] * arrf[1] + arrf[2] * arrf[2]);
        arrf[0] = arrf[0] / f10;
        arrf[1] = arrf[1] / f10;
        arrf[2] = arrf[2] / f10;
        arrf[3] = arrf[3] / f10;
    }

    public static c a() {
        i.b();
        return i;
    }

    public d() {
        this.h = aZ.e(16);
        this.g = aZ.e(16);
        this.f = aZ.e(16);
    }

    static {
        i = new d();
    }
}

