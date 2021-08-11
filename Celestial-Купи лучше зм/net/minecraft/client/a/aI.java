/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.client.a;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import javax.annotation.Nullable;
import net.minecraft.client.a.I;
import net.minecraft.client.a.al;

public class aI
implements al {
    private /* synthetic */ int a;
    private /* synthetic */ int b;
    private /* synthetic */ int[] c;

    @Override
    @Nullable
    public BufferedImage a(BufferedImage bufferedImage) {
        BufferedImage bufferedImage2;
        block14: {
            int n2;
            int n3;
            block13: {
                int n4;
                String string = I.j();
                BufferedImage bufferedImage3 = bufferedImage;
                if (string == null) {
                    if (bufferedImage3 == null) {
                        return null;
                    }
                    this.a = 64;
                    this.b = 64;
                    bufferedImage3 = bufferedImage;
                }
                int n5 = bufferedImage3.getWidth();
                int n6 = bufferedImage.getHeight();
                n3 = 1;
                do {
                    int n7;
                    int n8;
                    if (this.a >= n5) {
                        n8 = this.b;
                        n7 = n6;
                        if (string == null && string == null) {
                            if (n8 >= n7) break;
                        }
                    } else {
                        this.a *= 2;
                        this.b *= 2;
                        n8 = n3;
                        n7 = 2;
                    }
                    n3 = n8 * n7;
                } while (string == null);
                bufferedImage2 = new BufferedImage(this.a, this.b, 2);
                Graphics graphics = bufferedImage2.getGraphics();
                graphics.drawImage(bufferedImage, 0, 0, null);
                int n9 = bufferedImage.getHeight();
                if (string == null) {
                    n9 = n9 == 32 * n3 ? 1 : 0;
                }
                n2 = n4 = n9;
                if (string != null) break block13;
                if (n2 != 0) {
                    graphics.setColor(new Color(0, 0, 0, 0));
                    graphics.fillRect(0 * n3, 32 * n3, 64 * n3, 32 * n3);
                    graphics.drawImage(bufferedImage2, 24 * n3, 48 * n3, 20 * n3, 52 * n3, 4 * n3, 16 * n3, 8 * n3, 20 * n3, null);
                    graphics.drawImage(bufferedImage2, 28 * n3, 48 * n3, 24 * n3, 52 * n3, 8 * n3, 16 * n3, 12 * n3, 20 * n3, null);
                    graphics.drawImage(bufferedImage2, 20 * n3, 52 * n3, 16 * n3, 64 * n3, 8 * n3, 20 * n3, 12 * n3, 32 * n3, null);
                    graphics.drawImage(bufferedImage2, 24 * n3, 52 * n3, 20 * n3, 64 * n3, 4 * n3, 20 * n3, 8 * n3, 32 * n3, null);
                    graphics.drawImage(bufferedImage2, 28 * n3, 52 * n3, 24 * n3, 64 * n3, 0 * n3, 20 * n3, 4 * n3, 32 * n3, null);
                    graphics.drawImage(bufferedImage2, 32 * n3, 52 * n3, 28 * n3, 64 * n3, 12 * n3, 20 * n3, 16 * n3, 32 * n3, null);
                    graphics.drawImage(bufferedImage2, 40 * n3, 48 * n3, 36 * n3, 52 * n3, 44 * n3, 16 * n3, 48 * n3, 20 * n3, null);
                    graphics.drawImage(bufferedImage2, 44 * n3, 48 * n3, 40 * n3, 52 * n3, 48 * n3, 16 * n3, 52 * n3, 20 * n3, null);
                    graphics.drawImage(bufferedImage2, 36 * n3, 52 * n3, 32 * n3, 64 * n3, 48 * n3, 20 * n3, 52 * n3, 32 * n3, null);
                    graphics.drawImage(bufferedImage2, 40 * n3, 52 * n3, 36 * n3, 64 * n3, 44 * n3, 20 * n3, 48 * n3, 32 * n3, null);
                    graphics.drawImage(bufferedImage2, 44 * n3, 52 * n3, 40 * n3, 64 * n3, 40 * n3, 20 * n3, 44 * n3, 32 * n3, null);
                    graphics.drawImage(bufferedImage2, 48 * n3, 52 * n3, 44 * n3, 64 * n3, 52 * n3, 20 * n3, 56 * n3, 32 * n3, null);
                }
                graphics.dispose();
                this.c = ((DataBufferInt)bufferedImage2.getRaster().getDataBuffer()).getData();
                this.a(0 * n3, 0 * n3, 32 * n3, 16 * n3);
                if (string != null) break block14;
                n2 = n4;
            }
            if (n2 != 0) {
                this.b(32 * n3, 0 * n3, 64 * n3, 32 * n3);
            }
            this.a(0 * n3, 16 * n3, 64 * n3, 32 * n3);
            this.a(16 * n3, 48 * n3, 48 * n3, 64 * n3);
        }
        return bufferedImage2;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    private void a(int n2, int n3, int n4, int n5) {
        int n6 = n2;
        String string = I.j();
        while (n6 < n4) {
            block3: {
                for (int i2 = n3; i2 < n5; ++i2) {
                    int n7 = n6 + i2 * this.a;
                    this.c[n7] = this.c[n7] | 0xFF000000;
                    if (string == null) {
                        if (string == null) continue;
                    }
                    break block3;
                }
                ++n6;
            }
            if (string == null) continue;
        }
    }

    @Override
    public void a() {
    }

    private void b(int n2, int n3, int n4, int n5) {
        int n6;
        String string;
        int n7;
        block8: {
            int n8;
            n7 = n2;
            string = I.j();
            block0: while (true) {
                int n9 = n7;
                int n10 = n4;
                block1: while (n9 < n10) {
                    n8 = n3;
                    if (string != null) break block8;
                    n6 = n8;
                    while (n6 < n5) {
                        int n11 = this.c[n7 + n6 * this.a];
                        if (string == null) {
                            n9 = n11 >> 24 & 0xFF;
                            n10 = 128;
                            if (string != null) continue block1;
                            if (n9 < n10) {
                                return;
                            }
                            ++n6;
                        }
                        if (string == null) continue;
                    }
                    ++n7;
                    if (string == null) continue block0;
                }
                break;
            }
            n8 = n7 = n2;
        }
        while (n7 < n4) {
            block9: {
                for (n6 = n3; n6 < n5; ++n6) {
                    int n12 = n7 + n6 * this.a;
                    this.c[n12] = this.c[n12] & 0xFFFFFF;
                    if (string == null) {
                        if (string == null) continue;
                    }
                    break block9;
                }
                ++n7;
            }
            if (string == null) continue;
        }
    }
}

