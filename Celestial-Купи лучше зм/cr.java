/*
 * Decompiled with CFR 0.150.
 */
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import net.minecraft.c.f;
import net.minecraft.c.l;
import net.minecraft.client.l.c;

public class cr {
    public static void a(f f10, l l2) {
        String string = K.d();
        try {
            Throwable throwable;
            c c10;
            c c11 = c10 = fU.a();
            if (string == null) {
                if (c11 == null) {
                    return;
                }
                c11 = c10;
            }
            if (!c11.a8) {
                return;
            }
            Throwable throwable2 = throwable = f10.d();
            if (string == null) {
                if (throwable2 == null) {
                    return;
                }
                throwable2 = throwable;
            }
            Class<?> class_ = throwable2.getClass();
            if (string == null) {
                if (class_ == Throwable.class) {
                    return;
                }
                class_ = throwable.getClass();
            }
            String string2 = class_.getName();
            if (string == null) {
                if (string2.contains(".fml.client.SplashProgress")) {
                    return;
                }
                cr.a(l2);
                string2 = "http://optifine.net/crashReport";
            }
            String string3 = string2;
            String string4 = cr.b(f10);
            byte[] arrby = string4.getBytes(StandardCharsets.US_ASCII);
            aE aE2 = new aE();
            HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put("OF-Version", fU.z());
            hashMap.put("OF-Summary", cr.a(f10));
            ey ey2 = new ey(string3, hashMap, arrby, aE2);
            ey2.setPriority(10);
            ey2.start();
            Thread.sleep(1000L);
        }
        catch (Exception exception) {
            fU.b(exception.getClass().getName() + ": " + exception.getMessage());
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(f f10) {
        String string;
        Throwable throwable;
        block6: {
            StackTraceElement[] arrstackTraceElement;
            block5: {
                throwable = f10.d();
                String string2 = K.d();
                Throwable throwable2 = throwable;
                if (string2 == null) {
                    if (throwable2 == null) {
                        return "Unknown";
                    }
                    throwable2 = throwable;
                }
                StackTraceElement[] arrstackTraceElement2 = throwable2.getStackTrace();
                string = "unknown";
                arrstackTraceElement = arrstackTraceElement2;
                if (string2 != null) break block5;
                if (arrstackTraceElement.length <= 0) break block6;
                arrstackTraceElement = arrstackTraceElement2;
            }
            string = arrstackTraceElement[0].toString().trim();
        }
        String string3 = throwable.getClass().getName() + ": " + throwable.getMessage() + " (" + f10.h() + ") [" + string + "]";
        return string3;
    }

    public static void a(l l2) {
        String string = K.d();
        l2.a("OptiFine Version", fU.z());
        String string2 = string;
        if (string2 == null) {
            if (fU.a() != null) {
                l2.a("Render Distance Chunks", "" + fU.a9());
                l2.a("Mipmaps", "" + fU.Q());
                l2.a("Anisotropic Filtering", "" + fU.bh());
                l2.a("Antialiasing", "" + fU.ak());
                l2.a("Multitexture", "" + fU.aR());
            }
            l2.a("Shaders", "" + cS.w());
            l2.a("OpenGlVersion", "" + fU.r);
            l2.a("OpenGlRenderer", "" + fU.D);
            l2.a("OpenGlVendor", "" + fU.m);
            l2.a("CpuCount", "" + fU.a0());
        }
    }

    private static String b(f f10) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("OptiFineVersion: " + fU.z() + "\n");
        stringBuffer.append("Summary: " + cr.a(f10) + "\n");
        stringBuffer.append("\n");
        stringBuffer.append(f10.f());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }
}

