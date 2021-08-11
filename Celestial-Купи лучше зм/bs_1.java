/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import net.minecraft.k.k;
import net.minecraft.k.m;

public class bs
extends bE {
    public /* synthetic */ float k;

    public float a(float f10) {
        this.k += f10;
        return this.k;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public bs() {
        super("AntiAim", a5.Player);
        this.k = 0.0f;
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Spin");
        String string = net.minecraft.k.k.b();
        arrayList.add("OneTap");
        String string2 = string;
        cj.b.f.b(new hH("AntiAim Mode", (bE)this, "Spin", arrayList));
        cj.b.f.b(new hH("Spin Speed", this, 1.0, 0.0, 10.0, 1.0));
        cj.b.f.b(new hH("Custom Pitch", this, true));
        cj.b.f.b(new hH("Custom Pitch Value", this, 90.0, -90.0, 90.0, 5.0));
        if (string2 == null) {
            m.b(!m.d());
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @cL
    public void a(fR var1_1) {
        block9: {
            block8: {
                block7: {
                    block5: {
                        block6: {
                            var3_2 = cj.b.f.a("AntiAim Mode").m();
                            var4_3 = cj.b.f.a("Spin Speed").r() * 10.0f;
                            var2_4 = net.minecraft.k.k.b();
                            v0 = var3_2.equalsIgnoreCase("Spin");
                            if (var2_4 == null) break block5;
                            if (!v0) break block6;
                            var5_5 = (float)Math.floor(this.a(var4_3)) + (float)aY.b(1, -3);
                            var1_1.a(gs.a(var5_5));
                            if (var2_4 != null) break block7;
                        }
                        v0 = var3_2.equalsIgnoreCase("OneTap");
                    }
                    if (var2_4 == null) break block8;
                    if (!v0) break block7;
                    v1 = bs.c.s.H % 8;
                    v2 = 4;
                    if (var2_4 == null) ** GOTO lbl23
                    if (v1 < v2) {
                        v3 = aY.b(23, 33);
                    } else {
                        v1 = 23;
                        v2 = 33;
lbl23:
                        // 2 sources

                        v3 = -aY.b(v1, v2);
                    }
                    var5_5 = bs.c.s.e + 180.0f + (float)v3;
                    var1_1.a(gs.a(var5_5));
                }
                v4 = cj.b.f.a("Custom Pitch");
                if (var2_4 == null) break block9;
                v0 = v4.l();
            }
            if (v0 == false) return;
            v4 = cj.b.f.a("Custom Pitch Value");
        }
        var5_5 = v4.r();
        var1_1.b(var5_5);
    }
}

