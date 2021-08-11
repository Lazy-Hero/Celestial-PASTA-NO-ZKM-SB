/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import net.minecraft.client.D.h;
import net.minecraft.client.b.B;
import net.minecraft.client.b.L;
import net.minecraft.client.b.s;

public class dT
extends L {
    private /* synthetic */ int A;
    private final /* synthetic */ String y;
    private final /* synthetic */ L D;
    private final /* synthetic */ String C;
    private final /* synthetic */ List z;
    protected /* synthetic */ String B;

    @Override
    protected void a(s s2) throws IOException {
        fU.aX().a(this.D);
    }

    public void a(int n2) {
        this.A = n2;
        String string = K.d();
        for (s s2 : this.t) {
            s2.h = false;
            if (string == null) continue;
        }
    }

    @Override
    public void r() {
        this.t.add(new B(0, h / 2 - 74, w / 6 + 96, this.B));
        this.z.clear();
        this.z.addAll(this.v.c(this.y, h - 50));
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block2: {
            String string = K.d();
            this.n();
            this.b(this.v, this.C, h / 2, 70, 0xFFFFFF);
            int n4 = 90;
            String string2 = string;
            for (Object e10 : this.z) {
                this.b(this.v, (String)e10, h / 2, n4, 0xFFFFFF);
                n4 += this.v.p;
                if (string2 == null) {
                    if (string2 == null) continue;
                }
                break block2;
            }
            super.a(n2, n3, f10);
        }
    }

    @Override
    public void e() {
        block4: {
            dT dT2;
            String string;
            block3: {
                String string2 = K.d();
                super.e();
                string = string2;
                dT2 = this;
                if (string != null) break block3;
                if (--dT2.A != 0) break block4;
                dT2 = this;
            }
            for (s s2 : dT2.t) {
                s2.h = true;
                if (string == null) continue;
            }
        }
    }

    public dT(L l2, String string, String string2) {
        this.z = Lists.newArrayList();
        this.D = l2;
        this.C = string;
        this.y = string2;
        this.B = net.minecraft.client.D.h.a("gui.done", new Object[0]);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

