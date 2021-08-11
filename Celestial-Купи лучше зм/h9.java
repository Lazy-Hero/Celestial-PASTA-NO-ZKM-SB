/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import net.minecraft.client.b.aL;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
class h9
extends aL {
    private /* synthetic */ int A;
    private /* synthetic */ long z;
    private /* synthetic */ ArrayList y;
    final /* synthetic */ dm x;

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        block5: {
            h9 h92;
            block4: {
                block2: {
                    block3: {
                        String string = dB.i();
                        if (string == null) break block2;
                        if (n2 != this.A) break block3;
                        h92 = this;
                        if (string == null) break block4;
                        if (h92.c == this.z) break block5;
                    }
                    this.A = n2;
                    this.z = this.c;
                    cS.d((String)this.y.get(n2));
                    cS.d();
                }
                h92 = this;
            }
            h92.x.a();
        }
    }

    public void a() {
        this.y = cS.ag();
        this.A = 0;
        String string = dB.i();
        int n2 = this.y.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            h9 h92 = this;
            if (string != null) {
                if (!h92.y.get(i2).equals(cS.aL)) continue;
                h92 = this;
            }
            h92.A = i2;
            if (string != null) break;
            if (string != null) continue;
            break;
        }
    }

    @Override
    protected void c() {
    }

    @Override
    protected int h() {
        return this.k - 6;
    }

    public h9(dm dm2, int n2, int n3, int n4, int n5, int n6) {
        block0: {
            super(dm2.b(), n2, n3, n4, n5, n6);
            this.z = 0L;
            this.x = dm2;
            this.a();
            this.f = 0.0f;
            int n7 = this.A * n6;
            int n8 = (n5 - n4) / 2;
            if (n7 <= n8) break block0;
            this.d(n7 - n8);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int b() {
        return this.A;
    }

    @Override
    public int j() {
        return this.k - 20;
    }

    @Override
    protected boolean a(int n2) {
        String string = dB.i();
        int n3 = n2;
        if (string != null) {
            n3 = n3 == this.A ? 1 : 0;
        }
        return n3 != 0;
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7, float f10) {
        String string;
        block4: {
            String string2;
            block5: {
                boolean bl2;
                block2: {
                    String string3;
                    block3: {
                        string = (String)this.y.get(n2);
                        string3 = dB.i();
                        bl2 = string.equals(cS.di);
                        if (string3 == null) break block2;
                        if (!bl2) break block3;
                        string = gl.a("of.options.shaders.packNone");
                        if (string3 != null) break block4;
                    }
                    string2 = string;
                    if (string3 == null) break block5;
                    bl2 = string2.equals(cS.dR);
                }
                if (!bl2) break block4;
                string2 = gl.a("of.options.shaders.packDefault");
            }
            string = string2;
        }
        this.x.a(string, this.k / 2, n4 + 1, 0xFFFFFF);
    }

    @Override
    protected int d() {
        return this.y.size();
    }

    @Override
    protected int a() {
        return this.d() * 18;
    }
}

