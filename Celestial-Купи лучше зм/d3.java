/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import java.awt.Color;
import java.io.IOException;
import net.minecraft.client.b.L;
import net.minecraft.client.b.a5;
import net.minecraft.client.b.aq;
import net.minecraft.client.b.s;
import net.minecraft.client.r.u;
import net.minecraft.k.m;
import org.lwjgl.input.Keyboard;

public class d3
extends L {
    private final /* synthetic */ dz y;
    private /* synthetic */ dX B;
    public /* synthetic */ String A;
    private /* synthetic */ aq z;

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        this.z.a(n2, n3, n4);
        super.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f10) {
        d3 d32;
        boolean bl2;
        block5: {
            block6: {
                boolean bl3 = u.b();
                dJ.b(0.0, 0.0, h, w, new Color(50, 45, 45, 255).getRGB());
                bl2 = bl3;
                this.m.ax.b("TheMaltening", (float)h / 2.0f, 6.0f, 0xFFFFFF);
                this.m.ax.b(this.A, (float)h / 2.0f, 18.0f, 0xFFFFFF);
                this.z.d();
                d32 = this;
                if (!bl2) break block5;
                if (!d32.z.n().isEmpty()) break block6;
                d32 = this;
                if (!bl2) break block5;
                if (!d32.z.b()) {
                    this.a(this.m.a6, "Token", h / 2 - 96, 156, -7829368);
                }
            }
            d32 = this;
        }
        super.a(n2, n3, f10);
        if (!net.minecraft.k.m.d()) {
            u.b(!bl2);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void a(s s2) throws IOException {
        boolean bl2 = u.a();
        int n2 = s2.h;
        if (!bl2) {
            if (n2 == 0) {
                return;
            }
            n2 = s2.g;
        }
        switch (n2) {
            case 0: {
                this.m.a(this.y);
                if (!bl2) break;
            }
            case 1: {
                this.A = cz.a(this.z.n());
                break;
            }
        }
        super.a(s2);
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        d3 d32;
        block6: {
            int n3;
            block5: {
                boolean bl2 = u.a();
                n3 = 1;
                if (bl2) break block5;
                if (n3 == n2) {
                    this.m.a(this.y);
                    return;
                }
                d32 = this;
                if (bl2) break block6;
                n3 = d32.z.h ? 1 : 0;
            }
            if (n3 != 0) {
                this.z.a(c10, n2);
            }
            d32 = this;
        }
        super.a(c10, n2);
    }

    @Override
    public void e() {
        this.z.i();
        super.e();
    }

    public d3(L l2) {
        this.A = "";
        this.y = (dz)l2;
    }

    @Override
    public void r() {
        a5 a52 = this.m.a6;
        Keyboard.enableRepeatEvents((boolean)true);
        boolean bl2 = u.b();
        this.B = new dX(1, h / 2 - 100, 175, "Generate");
        this.t.add(this.B);
        boolean bl3 = bl2;
        this.t.add(new dX(0, h / 2 - 100, w - 60, "Back"));
        this.z = new aq(666, a52, h / 2 - 100, 150, 200, 20);
        this.z.k = Integer.MAX_VALUE;
        super.r();
        if (!bl3) {
            net.minecraft.k.m.b(!net.minecraft.k.m.d());
        }
    }

    @Override
    public void h() {
        Keyboard.enableRepeatEvents((boolean)false);
        super.h();
    }
}

