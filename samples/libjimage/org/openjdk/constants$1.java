// Generated by jextract

package org.openjdk;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1() {}
    static final FunctionDescriptor JIMAGE_PackageToModule$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JIMAGE_PackageToModule$MH = RuntimeHelper.downcallHandle(
        "JIMAGE_PackageToModule",
        constants$1.JIMAGE_PackageToModule$FUNC
    );
    static final FunctionDescriptor JImagePackageToModule_t$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JImagePackageToModule_t$MH = RuntimeHelper.downcallHandle(
        constants$1.JImagePackageToModule_t$FUNC
    );
    static final FunctionDescriptor JIMAGE_FindResource$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JIMAGE_FindResource$MH = RuntimeHelper.downcallHandle(
        "JIMAGE_FindResource",
        constants$1.JIMAGE_FindResource$FUNC
    );
    static final FunctionDescriptor JImageFindResource_t$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JImageFindResource_t$MH = RuntimeHelper.downcallHandle(
        constants$1.JImageFindResource_t$FUNC
    );
}


