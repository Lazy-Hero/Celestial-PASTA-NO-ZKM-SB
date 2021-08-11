/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.util.vector.Matrix4f
 */
package net.minecraft.client.a;

import org.lwjgl.util.vector.Matrix4f;

public class Y
extends Matrix4f {
    public Y() {
        this.m00 = 0.0f;
        this.m01 = 0.0f;
        this.m02 = 0.0f;
        this.m03 = 0.0f;
        this.m10 = 0.0f;
        this.m11 = 0.0f;
        this.m12 = 0.0f;
        this.m13 = 0.0f;
        this.m20 = 0.0f;
        this.m21 = 0.0f;
        this.m22 = 0.0f;
        this.m23 = 0.0f;
        this.m30 = 0.0f;
        this.m31 = 0.0f;
        this.m32 = 0.0f;
        this.m33 = 0.0f;
    }

    public Y(float[] arrf) {
        this.m00 = arrf[0];
        this.m01 = arrf[1];
        this.m02 = arrf[2];
        this.m03 = arrf[3];
        this.m10 = arrf[4];
        this.m11 = arrf[5];
        this.m12 = arrf[6];
        this.m13 = arrf[7];
        this.m20 = arrf[8];
        this.m21 = arrf[9];
        this.m22 = arrf[10];
        this.m23 = arrf[11];
        this.m30 = arrf[12];
        this.m31 = arrf[13];
        this.m32 = arrf[14];
        this.m33 = arrf[15];
    }
}

