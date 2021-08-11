/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c;

import net.minecraft.c.l;

class h {
    private final /* synthetic */ String b;
    private final /* synthetic */ String a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public String b() {
        return this.b;
    }

    public String a() {
        return this.a;
    }

    public h(String string, Object object) {
        block2: {
            block4: {
                Object object2;
                String string2;
                block3: {
                    block0: {
                        block1: {
                            String string3 = l.b();
                            this.a = string;
                            string2 = string3;
                            object2 = object;
                            if (string2 != null) break block0;
                            if (object2 != null) break block1;
                            this.b = "~~NULL~~";
                            if (string2 == null) break block2;
                        }
                        object2 = object;
                    }
                    if (string2 != null) break block3;
                    if (!(object2 instanceof Throwable)) break block4;
                    object2 = object;
                }
                Throwable throwable = (Throwable)object2;
                this.b = "~~ERROR~~ " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage();
                if (string2 == null) break block2;
            }
            this.b = object.toString();
        }
    }
}

