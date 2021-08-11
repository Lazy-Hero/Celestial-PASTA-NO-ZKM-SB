/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.d;

import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.U.x;
import net.minecraft.ar.a3;
import net.minecraft.d.G;
import net.minecraft.d.z;
import net.minecraft.k.l;
import net.minecraft.n.b;

public class g
implements K<b> {
    private /* synthetic */ int c;
    private /* synthetic */ x b;
    private /* synthetic */ l e;
    public /* synthetic */ G d;
    private /* synthetic */ a3 a;

    public g(x x2) {
        this.c = x2.W();
        this.b = x2;
        this.d = G.ATTACK;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    @Nullable
    public x a(net.minecraft.ah.z z2) {
        return z2.a(this.c);
    }

    public a3 a() {
        return this.a;
    }

    public l d() {
        return this.e;
    }

    public g(x x2, G g10) {
        this.c = x2.W();
        this.b = x2;
        this.d = g10;
    }

    public G b() {
        return this.d;
    }

    public g(x x2, a3 a32) {
        this.c = x2.W();
        this.b = x2;
        this.d = G.INTERACT;
        this.a = a32;
    }

    @Override
    public void a(m m2) throws IOException {
        block7: {
            block5: {
                g g10;
                block6: {
                    G g11;
                    G g12;
                    int[] arrn;
                    block4: {
                        this.c = m2.a();
                        this.d = m2.a(G.class);
                        arrn = z.b();
                        g12 = this.d;
                        g11 = G.INTERACT_AT;
                        if (arrn == null) break block4;
                        if (g12 == g11) {
                            this.e = new l(m2.readFloat(), m2.readFloat(), m2.readFloat());
                        }
                        g10 = this;
                        if (arrn == null) break block5;
                        g12 = g10.d;
                        g11 = G.INTERACT;
                    }
                    if (g12 == g11) break block6;
                    g10 = this;
                    if (arrn == null) break block5;
                    if (g10.d != G.INTERACT_AT) break block7;
                }
                g10 = this;
            }
            g10.a = m2.a(a3.class);
        }
    }

    @Override
    public void b(m m2) throws IOException {
        block4: {
            block3: {
                G g10;
                G g11;
                block2: {
                    int[] arrn = z.b();
                    m2.d(this.c);
                    int[] arrn2 = arrn;
                    m2.a(this.d);
                    g11 = this.d;
                    g10 = G.INTERACT_AT;
                    if (arrn2 != null) {
                        if (g11 == g10) {
                            m2.writeFloat((float)this.e.e);
                            m2.writeFloat((float)this.e.d);
                            m2.writeFloat((float)this.e.b);
                        }
                        g11 = this.d;
                        g10 = G.INTERACT;
                    }
                    if (arrn2 == null) break block2;
                    if (g11 == g10) break block3;
                    g11 = this.d;
                    g10 = G.INTERACT_AT;
                }
                if (g11 != g10) break block4;
            }
            m2.a(this.a);
        }
    }

    public g(x x2, a3 a32, l l2) {
        this.c = x2.W();
        this.b = x2;
        this.d = G.INTERACT_AT;
        this.a = a32;
        this.e = l2;
    }

    public x c() {
        return this.b;
    }

    public g() {
    }
}

