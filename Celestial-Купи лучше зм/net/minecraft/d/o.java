/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.az.k;
import net.minecraft.az.t;
import net.minecraft.d.L;
import net.minecraft.d.z;
import net.minecraft.n.b;

public class o
implements K<b> {
    private /* synthetic */ boolean c;
    private /* synthetic */ boolean b;
    private /* synthetic */ L a;
    private /* synthetic */ k d;

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    public boolean b() {
        return this.c;
    }

    public k a() {
        return this.d;
    }

    public L c() {
        return this.a;
    }

    public o(boolean bl2, boolean bl3) {
        this.a = L.SETTINGS;
        this.c = bl2;
        this.b = bl3;
    }

    public boolean d() {
        return this.b;
    }

    @Override
    public void a(m m2) throws IOException {
        block4: {
            block5: {
                o o2;
                L l2;
                L l3;
                block2: {
                    int[] arrn;
                    block3: {
                        this.a = m2.a(L.class);
                        arrn = z.b();
                        l3 = this.a;
                        l2 = L.SHOWN;
                        if (arrn == null) break block2;
                        if (l3 != l2) break block3;
                        this.d = t.a(m2.readInt());
                        if (arrn != null) break block4;
                    }
                    o2 = this;
                    if (arrn == null) break block5;
                    l3 = o2.a;
                    l2 = L.SETTINGS;
                }
                if (l3 != l2) break block4;
                this.c = m2.readBoolean();
                o2 = this;
            }
            o2.b = m2.readBoolean();
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public o(k k2) {
        this.a = L.SHOWN;
        this.d = k2;
    }

    @Override
    public void b(m m2) throws IOException {
        block3: {
            L l2;
            L l3;
            block1: {
                block2: {
                    int[] arrn = z.b();
                    m2.a(this.a);
                    int[] arrn2 = arrn;
                    l3 = this.a;
                    l2 = L.SHOWN;
                    if (arrn2 == null) break block1;
                    if (l3 != l2) break block2;
                    m2.writeInt(t.a(this.d));
                    if (arrn2 != null) break block3;
                }
                l3 = this.a;
                l2 = L.SETTINGS;
            }
            if (l3 == l2) {
                m2.writeBoolean(this.c);
                m2.writeBoolean(this.b);
            }
        }
    }

    public o() {
    }
}

