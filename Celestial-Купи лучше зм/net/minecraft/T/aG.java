/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.a9;
import net.minecraft.T.ae;
import net.minecraft.U.g;
import net.minecraft.ah.z;
import net.minecraft.q.h;
import net.minecraft.q.m;
import net.minecraft.q.r;

public abstract class aG
extends ae {
    protected static final /* synthetic */ r<Byte> cx;

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cx, (byte)0);
    }

    @Override
    public g ag() {
        return net.minecraft.U.g.ILLAGER;
    }

    protected boolean a(int n2) {
        byte by2 = this.ap.b(cx);
        int[] arrn = net.minecraft.T.S.f();
        boolean bl2 = by2 & n2;
        if (arrn != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    protected void b(int n2, boolean n3) {
        int n4;
        block4: {
            int n5;
            block2: {
                block3: {
                    n4 = this.ap.b(cx).byteValue();
                    int[] arrn = net.minecraft.T.S.f();
                    n5 = n3;
                    if (arrn == null) break block2;
                    if (n5 == 0) break block3;
                    n4 |= n2;
                    if (arrn != null) break block4;
                }
                n5 = n4 & ~n2;
            }
            n4 = n5;
        }
        this.ap.b(cx, (byte)(n4 & 0xFF));
    }

    public aG(z z2) {
        super(z2);
    }

    static {
        cx = net.minecraft.q.m.a(aG.class, h.m);
    }

    public a9 a() {
        return net.minecraft.T.a9.CROSSED;
    }
}

