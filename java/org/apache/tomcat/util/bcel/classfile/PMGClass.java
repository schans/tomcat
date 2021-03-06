/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.apache.tomcat.util.bcel.classfile;

import java.io.DataInput;
import java.io.IOException;

/**
 * This class is derived from <em>Attribute</em> and represents a reference
 * to a PMG attribute.
 *
 * @author  <A HREF="mailto:m.dahm@gmx.de">M. Dahm</A>
 * @see     Attribute
 */
public final class PMGClass extends Attribute {

    private static final long serialVersionUID = -1876065562391587509L;


    /**
     * Construct object from file stream.
     * @param name_index Index in constant pool to CONSTANT_Utf8
     * @param length Content length in bytes
     * @param file Input stream
     * @param constant_pool Array of constants
     * @throws IOException
     */
    PMGClass(int name_index, int length, DataInput file, ConstantPool constant_pool)
            throws IOException {
        super(name_index, length, constant_pool);
        file.readUnsignedShort();   // Unused pmg_index
        file.readUnsignedShort();   // Unused pmg_class_index
    }
}
