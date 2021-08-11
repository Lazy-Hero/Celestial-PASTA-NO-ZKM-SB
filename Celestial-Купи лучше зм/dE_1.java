/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.nio.ByteBuffer;
import java.util.Properties;
import net.minecraft.ar.v;
import net.minecraft.client.a.aZ;
import net.minecraft.client.j.d;
import org.lwjgl.opengl.GL11;

public class dE {
    private /* synthetic */ ByteBuffer g;
    private /* synthetic */ int a;
    private /* synthetic */ int l;
    private /* synthetic */ int e;
    private /* synthetic */ int j;
    private /* synthetic */ String b;
    /* synthetic */ v h;
    private /* synthetic */ int k;
    private /* synthetic */ fY[] i;
    private /* synthetic */ String f;
    /* synthetic */ byte[] c;
    private /* synthetic */ int d;

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean e() {
        String string = K.d();
        dE dE2 = this;
        if (string == null) {
            if (dE2.d < 0) {
                d d10 = fp.a(this.h);
                if (d10 == null) {
                    return false;
                }
                this.d = d10.c();
            }
            dE2 = this;
        }
        if (string == null) {
            if (dE2.g == null) {
                this.g = aZ.d(this.c.length);
                this.g.put(this.c);
                this.c = null;
            }
            dE2 = this;
        }
        int n2 = dE2.d();
        if (string == null) {
            if (n2 == 0) {
                return false;
            }
            n2 = this.j * this.e * 4;
        }
        int n3 = n2;
        int n4 = this.g();
        int n5 = n3 * n4;
        int n7 = n5 + n3;
        n7 = this.g.capacity();
        if (string == null) {
            if (n6 > n7) {
                return false;
            }
            this.g.position(n5);
            net.minecraft.client.a.v.t(this.d);
            int n7 = 3553;
            n7 = 0;
        }
        GL11.glTexSubImage2D((int)n6, (int)n7, (int)this.l, (int)this.a, (int)this.j, (int)this.e, (int)6408, (int)5121, (ByteBuffer)this.g);
        return true;
    }

    public int g() {
        dE dE2;
        block6: {
            int n2;
            block5: {
                String string = K.d();
                n2 = this.i.length;
                if (string != null) break block5;
                if (n2 <= 0) {
                    return 0;
                }
                dE2 = this;
                if (string != null) break block6;
                n2 = dE2.k;
            }
            if (n2 >= this.i.length) {
                this.k = 0;
            }
            dE2 = this;
        }
        fY fY2 = dE2.i[this.k];
        return fY2.b;
    }

    public v f() {
        return this.h;
    }

    public dE(String string, byte[] arrby, String string2, v v2, int n2, int n3, int n4, int n5, Properties properties, int n6) {
        this.f = null;
        this.b = null;
        this.h = null;
        this.d = -1;
        this.l = 0;
        this.a = 0;
        this.j = 0;
        this.e = 0;
        this.i = null;
        this.k = 0;
        this.c = null;
        this.g = null;
        this.f = string;
        String string3 = K.d();
        this.b = string2;
        this.h = v2;
        this.l = n2;
        this.a = n3;
        this.j = n4;
        this.e = n5;
        int n7 = n4 * n5 * 4;
        int n8 = arrby.length % n7;
        if (string3 == null) {
            if (n8 != 0) {
                fU.h("Invalid animated texture length: " + arrby.length + ", frameWidth: " + n4 + ", frameHeight: " + n5);
            }
            this.c = arrby;
            n8 = arrby.length / n7;
        }
        int n9 = n8;
        Object object = properties.get("tile.0");
        if (string3 == null) {
            if (object != null) {
                int n10 = 0;
                while (properties.get("tile." + n10) != null) {
                    n9 = n10 + 1;
                    ++n10;
                    if (string3 == null) continue;
                }
            }
            object = properties.get("duration");
        }
        String string4 = (String)object;
        int n11 = fU.b(string4, n6);
        this.i = new fY[n9];
        for (int i2 = 0; i2 < this.i.length; ++i2) {
            fY fY2;
            String string5 = (String)properties.get("tile." + i2);
            int n12 = fU.b(string5, i2);
            String string6 = (String)properties.get("duration." + i2);
            int n13 = fU.b(string6, n11);
            this.i[i2] = fY2 = new fY(n12, n13);
            if (string3 == null) continue;
        }
    }

    public boolean d() {
        int n2;
        block13: {
            int n3;
            block12: {
                dE dE2;
                String string;
                block11: {
                    int n4;
                    block10: {
                        string = K.d();
                        n4 = this.i.length;
                        if (string != null) break block10;
                        if (n4 <= 0) {
                            return false;
                        }
                        dE2 = this;
                        if (string != null) break block11;
                        n4 = dE2.k;
                    }
                    if (n4 >= this.i.length) {
                        this.k = 0;
                    }
                    dE2 = this;
                }
                fY fY2 = dE2.i[this.k];
                n2 = ++fY2.a;
                n3 = fY2.c;
                if (string != null) break block12;
                if (n2 < n3) {
                    return false;
                }
                fY2.a = 0;
                n2 = ++this.k;
                if (string != null) break block13;
                n3 = this.i.length;
            }
            if (n2 >= n3) {
                this.k = 0;
            }
            n2 = 1;
        }
        return n2 != 0;
    }

    public int b() {
        return this.i.length;
    }

    public String a() {
        return this.f;
    }

    public String c() {
        return this.b;
    }
}

