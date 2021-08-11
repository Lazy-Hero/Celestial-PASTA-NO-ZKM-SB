/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.FilenameUtils
 */
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import net.minecraft.ar.v;
import net.minecraft.client.Q;
import net.minecraft.client.a.A;
import net.minecraft.client.a.al;
import net.minecraft.client.j.d;
import net.minecraft.client.j.u;
import net.minecraft.client.q.a;
import org.apache.commons.io.FilenameUtils;

public class d1 {
    public static void a(a a10) {
        block5: {
            Object object;
            u u2;
            v v2;
            String string;
            block8: {
                Boolean bl2;
                block10: {
                    d d10;
                    String string2;
                    block9: {
                        d d11;
                        block7: {
                            String string3;
                            block6: {
                                String string4;
                                block4: {
                                    string4 = a10.r();
                                    string2 = K.d();
                                    string3 = string4;
                                    if (string2 != null) break block4;
                                    if (string3 == null) break block5;
                                    string3 = string4;
                                }
                                if (string2 != null) break block6;
                                if (string3.isEmpty()) break block5;
                                string3 = "http://s.optifine.net/capes/" + string4 + ".png";
                            }
                            string = string3;
                            String string5 = FilenameUtils.getBaseName((String)string);
                            v2 = new v("capeof/" + string5);
                            u2 = Q.P().aN();
                            d10 = d11 = u2.a(v2);
                            if (string2 != null) break block7;
                            if (d10 == null) break block8;
                            d10 = d11;
                        }
                        if (string2 != null) break block9;
                        if (!(d10 instanceof A)) break block8;
                        d10 = d11;
                    }
                    object = (A)d10;
                    bl2 = ((A)object).n;
                    if (string2 != null) break block10;
                    if (bl2 == null) break block8;
                    bl2 = ((A)object).n;
                }
                if (bl2.booleanValue()) {
                    a10.a(v2);
                }
                return;
            }
            object = new hw(a10, v2);
            A a11 = new A(null, string, null, (al)object);
            a11.o = true;
            u2.a(v2, a11);
        }
    }

    public static BufferedImage a(BufferedImage bufferedImage) {
        int n2 = 64;
        String string = K.d();
        int n3 = 32;
        int n4 = bufferedImage.getWidth();
        int n5 = bufferedImage.getHeight();
        do {
            int n6;
            int n7;
            if (n2 >= n4) {
                n7 = n3;
                n6 = n5;
                if (string == null && string == null) {
                    if (n7 >= n6) break;
                }
            } else {
                n2 *= 2;
                n7 = n3;
                n6 = 2;
            }
            n3 = n7 * n6;
        } while (string == null);
        BufferedImage bufferedImage2 = new BufferedImage(n2, n3, 2);
        Graphics graphics = bufferedImage2.getGraphics();
        graphics.drawImage(bufferedImage, 0, 0, null);
        graphics.dispose();
        return bufferedImage2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

