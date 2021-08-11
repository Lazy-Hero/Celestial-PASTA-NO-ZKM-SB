/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.k.h;

public class dG
extends de {
    private /* synthetic */ dB v;
    public /* synthetic */ boolean t;
    private /* synthetic */ float u;

    public dG(int n2, int n3, int n4, int n5, int n6, dB dB2, String string) {
        super(n2, n3, n4, n5, n6, dB2, string);
        this.u = 1.0f;
        this.v = null;
        this.v = dB2;
        this.u = dB2.p();
        this.m = dW.b(dB2, this.i);
    }

    @Override
    protected int a(boolean bl2) {
        return 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void b(Q q2, int n2, int n3) {
        block5: {
            dG dG2;
            block6: {
                boolean bl2;
                block4: {
                    String string = dB.i();
                    bl2 = this.l;
                    if (string == null) break block4;
                    if (!bl2) break block5;
                    dG2 = this;
                    if (string == null) break block6;
                    bl2 = dG2.t;
                }
                if (bl2) {
                    this.u = (float)(n2 - (this.o + 4)) / (float)(this.i - 8);
                    this.u = net.minecraft.k.h.c(this.u, 0.0f, 1.0f);
                    this.v.a(this.u);
                    this.u = this.v.p();
                    this.m = dW.b(this.v, this.i);
                }
                q2.aN().b(j);
                net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                this.a(this.o + (int)(this.u * (float)(this.i - 8)), this.r, 0, 66, 4, 20);
                dG2 = this;
            }
            dG2.a(this.o + (int)(this.u * (float)(this.i - 8)) + 4, this.r, 196, 66, 4, 20);
        }
    }

    @Override
    public boolean a(Q q2, int n2, int n3) {
        String string = dB.i();
        boolean bl2 = super.a(q2, n2, n3);
        if (string != null) {
            if (bl2) {
                this.u = (float)(n2 - (this.o + 4)) / (float)(this.i - 8);
                this.u = net.minecraft.k.h.c(this.u, 0.0f, 1.0f);
                this.v.a(this.u);
                this.m = dW.b(this.v, this.i);
                this.t = true;
                return true;
            }
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public void b() {
        this.u = this.v.p();
    }

    @Override
    public void b(int n2, int n3) {
        this.t = false;
    }
}

