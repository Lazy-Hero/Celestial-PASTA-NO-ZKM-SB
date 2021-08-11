/*
 * Decompiled with CFR 0.150.
 */
import java.util.Properties;
import net.minecraft.ar.v;

public class ga {
    private /* synthetic */ int d;
    private /* synthetic */ int c;
    private /* synthetic */ int h;
    private /* synthetic */ int f;
    private final /* synthetic */ String i;
    private /* synthetic */ int b;
    private /* synthetic */ int e;
    private final /* synthetic */ v[] j;
    private /* synthetic */ int g;
    private /* synthetic */ int a;

    public int d() {
        return this.h;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int c() {
        return this.d;
    }

    public v[] b() {
        return this.j;
    }

    public int g() {
        return this.b;
    }

    public int h() {
        return this.c;
    }

    public ga(String string, Properties properties) {
        block2: {
            this.d = 1;
            this.f = 64;
            this.g = 3;
            this.a = 3;
            this.h = -2130706433;
            this.c = 0xFFFFFF;
            String string2 = K.d();
            this.b = 0;
            this.e = Integer.MIN_VALUE;
            ha ha2 = new ha("CustomPanorama");
            this.i = string;
            this.j = new v[6];
            for (int i2 = 0; i2 < this.j.length; ++i2) {
                this.j[i2] = new v(string + "/panorama_" + i2 + ".png");
                if (string2 == null) {
                    if (string2 == null) continue;
                }
                break block2;
            }
            this.d = ha2.b(properties.getProperty("weight"), 1);
            this.f = ha2.b(properties.getProperty("blur1"), 64);
            this.g = ha2.b(properties.getProperty("blur2"), 3);
            this.a = ha2.b(properties.getProperty("blur3"), 3);
            this.h = ha.c(properties.getProperty("overlay1.top"), -2130706433);
            this.c = ha.c(properties.getProperty("overlay1.bottom"), 0xFFFFFF);
            this.b = ha.c(properties.getProperty("overlay2.top"), 0);
            this.e = ha.c(properties.getProperty("overlay2.bottom"), Integer.MIN_VALUE);
        }
    }

    public int f() {
        return this.f;
    }

    public int i() {
        return this.g;
    }

    public String toString() {
        return "" + this.i + ", weight: " + this.d + ", blur: " + this.f + " " + this.g + " " + this.a + ", overlay: " + this.h + " " + this.c + " " + this.b + " " + this.e;
    }

    public int a() {
        return this.a;
    }

    public int e() {
        return this.e;
    }
}

