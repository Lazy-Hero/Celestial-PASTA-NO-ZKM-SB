/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.realmsclient.gui.ChatFormatting
 */
import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.client.Q;
import net.minecraft.k.l;

public class fE
extends e8 {
    private final /* synthetic */ bE l;
    /* synthetic */ float k;
    private /* synthetic */ int m;

    @Override
    public void b(int n2, int n3, int n4) {
        block6: {
            int n5;
            String string;
            block5: {
                string = net.minecraft.k.l.b();
                n5 = this.a(n2, n3);
                if (string == null) break block5;
                if (n5 == 0) break block6;
                n5 = n4;
            }
            if (n5 == 0) {
                boolean bl2 = this.l.g;
                if (string != null) {
                    bl2 = !bl2;
                }
                this.l.g = bl2;
            }
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    public void b(int n2, int n3) {
        int n4;
        int n5;
        int n6;
        block6: {
            fE fE2;
            block7: {
                int n7;
                block4: {
                    String string;
                    block5: {
                        eb eb2 = this.e();
                        n6 = eb2.d() + this.a();
                        n5 = eb2.e() + this.g();
                        n4 = this.a(n2, n3);
                        int n8 = this.b();
                        int n9 = this.c();
                        string = net.minecraft.k.l.b();
                        n7 = n4;
                        if (string == null) break block4;
                        if (n7 == 0) break block5;
                        fE2 = this;
                        if (string == null) break block6;
                        if (fE2.m >= 200) break block7;
                        this.m += 5;
                        if (string != null) break block7;
                    }
                    fE2 = this;
                    if (string == null) break block6;
                    n7 = fE2.m;
                }
                if (n7 > 120) {
                    this.m -= 5;
                }
            }
            fE2 = this;
        }
        fE2.k = n.a(this.k, n4 != 0 ? 2.3f : 2.0f, 0.01f);
        Q.P().aK.c("Visible: " + (Object)ChatFormatting.GRAY + this.l.g, (float)n6 + 2.0f, (float)n5 + (float)this.b() / this.k - 2.0f, -1);
        super.b(n2, n3);
    }

    public fE(bE bE2, eb eb2, int n2, int n3, int n4, int n5) {
        super(eb2, n2, n3, n4, n5);
        this.k = 0.0f;
        this.m = 120;
        this.l = bE2;
    }
}

