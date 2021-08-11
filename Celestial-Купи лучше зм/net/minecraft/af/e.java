/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.af;

import net.minecraft.af.c;
import net.minecraft.c.k;
import net.minecraft.client.K;
import net.minecraft.client.Q;

class e
implements k<String> {
    final /* synthetic */ c a;

    public String a() throws Exception {
        block6: {
            String string;
            block5: {
                boolean bl2;
                String string2;
                block4: {
                    string2 = K.a();
                    int n2 = c.c();
                    bl2 = string2.equals("vanilla");
                    if (n2 == 0) break block4;
                    if (!bl2) {
                        return "Definitely; Client brand changed to '" + string2 + "'";
                    }
                    string2 = this.a.am();
                    string = "vanilla";
                    if (n2 == 0) break block5;
                    bl2 = string.equals(string2);
                }
                if (bl2) break block6;
                string = "Definitely; Server brand changed to '" + string2 + "'";
            }
            return string;
        }
        return Q.class.getSigners() == null ? "Very likely; Jar signature invalidated" : "Probably not. Jar signature remains and both client + server brands are untouched.";
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    e(c c10) {
        this.a = c10;
    }
}

