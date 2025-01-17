/*
 *  Copyright (c) 2022, Oracle and/or its affiliates. All rights reserved.
 *  DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 *  This code is free software; you can redistribute it and/or modify it
 *  under the terms of the GNU General Public License version 2 only, as
 *  published by the Free Software Foundation.  Oracle designates this
 *  particular file as subject to the "Classpath" exception as provided
 *  by Oracle in the LICENSE file that accompanied this code.
 *
 *  This code is distributed in the hope that it will be useful, but WITHOUT
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 *  FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 *  version 2 for more details (a copy is included in the LICENSE file that
 *  accompanied this code).
 *
 *  You should have received a copy of the GNU General Public License version
 *  2 along with this work; if not, write to the Free Software Foundation,
 *  Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 *   Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 *  or visit www.oracle.com if you need additional information or have any
 *  questions.
 */

// Generated by jextract

package org.openjdk.jextract.clang.libclang;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2() {}
    static final FunctionDescriptor clang_getExpansionLocation$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_POINTER$LAYOUT).withName("ptr_data"),
            Constants$root.C_INT$LAYOUT.withName("int_data"),
            MemoryLayout.paddingLayout(32)
        ),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clang_getExpansionLocation$MH = RuntimeHelper.downcallHandle(
        "clang_getExpansionLocation",
        constants$2.clang_getExpansionLocation$FUNC
    );
    static final FunctionDescriptor clang_getSpellingLocation$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_POINTER$LAYOUT).withName("ptr_data"),
            Constants$root.C_INT$LAYOUT.withName("int_data"),
            MemoryLayout.paddingLayout(32)
        ),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clang_getSpellingLocation$MH = RuntimeHelper.downcallHandle(
        "clang_getSpellingLocation",
        constants$2.clang_getSpellingLocation$FUNC
    );
    static final FunctionDescriptor clang_getFileLocation$FUNC = FunctionDescriptor.ofVoid(
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_POINTER$LAYOUT).withName("ptr_data"),
            Constants$root.C_INT$LAYOUT.withName("int_data"),
            MemoryLayout.paddingLayout(32)
        ),
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clang_getFileLocation$MH = RuntimeHelper.downcallHandle(
        "clang_getFileLocation",
        constants$2.clang_getFileLocation$FUNC
    );
    static final FunctionDescriptor clang_getRangeStart$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(2, Constants$root.C_POINTER$LAYOUT).withName("ptr_data"),
        Constants$root.C_INT$LAYOUT.withName("int_data"),
        MemoryLayout.paddingLayout(32)
    ),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_POINTER$LAYOUT).withName("ptr_data"),
            Constants$root.C_INT$LAYOUT.withName("begin_int_data"),
            Constants$root.C_INT$LAYOUT.withName("end_int_data")
        )
    );
    static final MethodHandle clang_getRangeStart$MH = RuntimeHelper.downcallHandle(
        "clang_getRangeStart",
        constants$2.clang_getRangeStart$FUNC
    );
    static final FunctionDescriptor clang_getRangeEnd$FUNC = FunctionDescriptor.of(MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(2, Constants$root.C_POINTER$LAYOUT).withName("ptr_data"),
        Constants$root.C_INT$LAYOUT.withName("int_data"),
        MemoryLayout.paddingLayout(32)
    ),
        MemoryLayout.structLayout(
            MemoryLayout.sequenceLayout(2, Constants$root.C_POINTER$LAYOUT).withName("ptr_data"),
            Constants$root.C_INT$LAYOUT.withName("begin_int_data"),
            Constants$root.C_INT$LAYOUT.withName("end_int_data")
        )
    );
    static final MethodHandle clang_getRangeEnd$MH = RuntimeHelper.downcallHandle(
        "clang_getRangeEnd",
        constants$2.clang_getRangeEnd$FUNC
    );
    static final FunctionDescriptor clang_getChildDiagnostics$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clang_getChildDiagnostics$MH = RuntimeHelper.downcallHandle(
        "clang_getChildDiagnostics",
        constants$2.clang_getChildDiagnostics$FUNC
    );
}


